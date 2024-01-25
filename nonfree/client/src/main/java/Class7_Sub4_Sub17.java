import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class7_Sub4_Sub17 extends Class7_Sub4 {

	@OriginalMember(owner = "client!kn", name = "N", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!kn", name = "Q", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "I")
	private int anInt3602 = 0;

	@OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
	private int anInt3601 = 2048;

	@OriginalMember(owner = "client!kn", name = "G", descriptor = "I")
	private int anInt3600 = 10;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(27) int local27 = Static314.anIntArray756[arg0];
			@Pc(36) int local36;
			if (this.anInt3602 == 0) {
				@Pc(139) short local139 = 0;
				for (local36 = 0; local36 < this.anInt3600; local36++) {
					if (this.anIntArray485[local36] <= local27 && local27 < this.anIntArray485[local36 + 1]) {
						if (local27 < this.anIntArray486[local36]) {
							local139 = 4096;
						}
						break;
					}
				}
				Static366.method4203(local19, 0, Static201.anInt4174, local139);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static201.anInt4174; local32++) {
					local36 = 0;
					@Pc(38) short local38 = 0;
					@Pc(42) int local42 = Static129.anIntArray375[local32];
					@Pc(45) int local45 = this.anInt3602;
					if (local45 == 1) {
						local36 = local42;
					} else if (local45 == 2) {
						local36 = (local42 + local27 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local42 - local27 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt3600; local45++) {
						if (this.anIntArray485[local45] <= local36 && this.anIntArray485[local45 + 1] > local36) {
							if (this.anIntArray486[local45] > local36) {
								local38 = 4096;
							}
							break;
						}
					}
					local19[local32] = local38;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3600 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt3601 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt3602 = arg0.method2772();
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		this.method3265();
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)V")
	private void method3265() {
		@Pc(7) int local7 = 0;
		this.anIntArray485 = new int[this.anInt3600 + 1];
		this.anIntArray486 = new int[this.anInt3600 + 1];
		@Pc(26) int local26 = 4096 / this.anInt3600;
		@Pc(33) int local33 = local26 * this.anInt3601 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3600; local35++) {
			this.anIntArray485[local35] = local7;
			this.anIntArray486[local35] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray485[this.anInt3600] = 4096;
		this.anIntArray486[this.anInt3600] = this.anIntArray486[0] + 4096;
	}
}
