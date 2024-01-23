import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class4_Sub6_Sub14 extends Class4_Sub6 {

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
	private int anInt2218 = 2048;

	@OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
	private int anInt2220 = 0;

	@OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
	private int anInt2221 = 10;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(25) int local25 = Static273.anIntArray127[arg0];
			@Pc(42) int local42;
			if (this.anInt2220 == 0) {
				@Pc(139) short local139 = 0;
				for (local42 = 0; local42 < this.anInt2221; local42++) {
					if (this.anIntArray227[local42] <= local25 && local25 < this.anIntArray227[local42 + 1]) {
						if (local25 < this.anIntArray226[local42]) {
							local139 = 4096;
						}
						break;
					}
				}
				Static307.method3249(local17, 0, Static2.anInt19, local139);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static2.anInt19; local33++) {
					local42 = 0;
					@Pc(46) int local46 = Static192.anIntArray318[local33];
					@Pc(48) short local48 = 0;
					@Pc(51) int local51 = this.anInt2220;
					if (local51 == 1) {
						local42 = local46;
					} else if (local51 == 2) {
						local42 = (local25 + local46 - 4096 >> 1) + 2048;
					} else if (local51 == 3) {
						local42 = (local46 - local25 >> 1) + 2048;
					}
					for (local51 = 0; local51 < this.anInt2221; local51++) {
						if (this.anIntArray227[local51] <= local42 && local42 < this.anIntArray227[local51 + 1]) {
							if (local42 < this.anIntArray226[local51]) {
								local48 = 4096;
							}
							break;
						}
					}
					local17[local33] = local48;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V")
	private void method1698() {
		this.anIntArray227 = new int[this.anInt2221 + 1];
		this.anIntArray226 = new int[this.anInt2221 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2221;
		@Pc(33) int local33 = this.anInt2218 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2221; local35++) {
			this.anIntArray227[local35] = local21;
			this.anIntArray226[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray227[this.anInt2221] = 4096;
		this.anIntArray226[this.anInt2221] = this.anIntArray226[0] + 4096;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2221 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt2218 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt2220 = arg0.method1874();
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		this.method1698();
	}
}
