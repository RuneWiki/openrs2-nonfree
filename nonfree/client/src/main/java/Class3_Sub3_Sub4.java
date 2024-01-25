import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!cp", name = "H", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!cp", name = "S", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
	private int anInt1099 = 10;

	@OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
	private int anInt1098 = 2048;

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
	private int anInt1102 = 0;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1099 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt1098 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt1102 = arg0.method3643();
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(19) int local19 = Static269.anIntArray433[arg0];
			@Pc(28) int local28;
			if (this.anInt1102 == 0) {
				@Pc(129) short local129 = 0;
				for (local28 = 0; local28 < this.anInt1099; local28++) {
					if (this.anIntArray65[local28] <= local19 && local19 < this.anIntArray65[local28 + 1]) {
						if (local19 < this.anIntArray68[local28]) {
							local129 = 4096;
						}
						break;
					}
				}
				Static367.method4031(local11, 0, Static131.anInt2755, local129);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static131.anInt2755; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static151.anIntArray211[local24];
					@Pc(37) int local37 = this.anInt1102;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local34 + local19 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt1099; local37++) {
						if (this.anIntArray65[local37] <= local28 && local28 < this.anIntArray65[local37 + 1]) {
							if (this.anIntArray68[local37] > local28) {
								local30 = 4096;
							}
							break;
						}
					}
					local11[local24] = local30;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		this.method872();
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)V")
	private void method872() {
		@Pc(7) int local7 = 0;
		this.anIntArray68 = new int[this.anInt1099 + 1];
		this.anIntArray65 = new int[this.anInt1099 + 1];
		@Pc(26) int local26 = 4096 / this.anInt1099;
		@Pc(33) int local33 = local26 * this.anInt1098 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1099; local35++) {
			this.anIntArray65[local35] = local7;
			this.anIntArray68[local35] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray65[this.anInt1099] = 4096;
		this.anIntArray68[this.anInt1099] = this.anIntArray68[0] + 4096;
	}
}
