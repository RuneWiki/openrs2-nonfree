import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class3_Sub1_Sub22 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kg", name = "T", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!kg", name = "U", descriptor = "[I")
	private int[] anIntArray368;

	@OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
	private int anInt3239 = 0;

	@OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
	private int anInt3246 = 10;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
	private int anInt3243 = 2048;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	private void method2871() {
		this.anIntArray368 = new int[this.anInt3246 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray367 = new int[this.anInt3246 + 1];
		@Pc(26) int local26 = 4096 / this.anInt3246;
		@Pc(33) int local33 = this.anInt3243 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3246; local35++) {
			this.anIntArray367[local35] = local14;
			this.anIntArray368[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray367[this.anInt3246] = 4096;
		this.anIntArray368[this.anInt3246] = this.anIntArray368[0] + 4096;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(19) int local19 = Static351.anIntArray371[arg0];
			@Pc(26) int local26;
			if (this.anInt3239 == 0) {
				@Pc(24) short local24 = 0;
				for (local26 = 0; local26 < this.anInt3246; local26++) {
					if (local19 >= this.anIntArray367[local26] && local19 < this.anIntArray367[local26 + 1]) {
						if (local19 < this.anIntArray368[local26]) {
							local24 = 4096;
						}
						break;
					}
				}
				Static400.method1875(local11, 0, Static238.anInt4221, local24);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static238.anInt4221; local78++) {
					local26 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static187.anIntArray379[local78];
					@Pc(91) int local91 = this.anInt3239;
					if (local91 == 1) {
						local26 = local88;
					} else if (local91 == 2) {
						local26 = (local88 + local19 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local26 = (local88 - local19 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt3246; local91++) {
						if (this.anIntArray367[local91] <= local26 && this.anIntArray367[local91 + 1] > local26) {
							if (local26 < this.anIntArray368[local91]) {
								local84 = 4096;
							}
							break;
						}
					}
					local11[local78] = local84;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		this.method2871();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3246 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt3243 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt3239 = arg0.method2739();
		}
	}
}
