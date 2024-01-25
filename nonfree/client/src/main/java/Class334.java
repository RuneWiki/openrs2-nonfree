import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class334 {

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "[Lclient!wk;")
	private Interface27[] anInterface27Array1 = null;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[Lclient!wk;")
	public Interface27[] anInterface27Array2 = null;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Lclient!aga;")
	public Interface1 anInterface1_2 = null;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!aga;")
	public Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_20;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "Z")
	public boolean aBoolean659;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class334(@OriginalArg(0) Class13_Sub3 arg0) {
		this.aClass13_Sub3_20 = arg0;
		this.aBoolean659 = this.aClass13_Sub3_20.aBoolean695;
		if (this.aBoolean659 && !this.aClass13_Sub3_20.method8196(Static219.aClass104_7, Static638.aClass381_15)) {
			this.aBoolean659 = false;
		}
		if (this.aBoolean659 || this.aClass13_Sub3_20.method8293(Static219.aClass104_7, Static638.aClass381_15)) {
			Static642.method8835();
			if (this.aBoolean659) {
				@Pc(130) byte[] local130 = Static448.method6401(false, Static70.anObject4);
				this.anInterface1_1 = this.aClass13_Sub3_20.method8229(local130, Static219.aClass104_7);
				@Pc(146) byte[] local146 = Static448.method6401(false, Static612.anObject18);
				this.aClass13_Sub3_20.method8229(local146, Static219.aClass104_7);
			} else {
				this.anInterface27Array2 = new Interface27[16];
				for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
					@Pc(69) byte[] local69 = Static570.method7934(Static70.anObject4, local56 * 128 * 128 * 2);
					this.anInterface27Array2[local56] = this.aClass13_Sub3_20.method8198(local69, Static219.aClass104_7, 128, 128, true);
				}
				this.anInterface27Array1 = new Interface27[16];
				for (@Pc(94) int local94 = 0; local94 < 16; local94++) {
					@Pc(107) byte[] local107 = Static570.method7934(Static612.anObject18, 2 * 128 * 128 * local94);
					this.anInterface27Array1[local94] = this.aClass13_Sub3_20.method8198(local107, Static219.aClass104_7, 128, 128, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Z")
	public boolean method7835() {
		if (this.aBoolean659) {
			return this.anInterface1_1 != null;
		} else {
			return this.anInterface27Array2 != null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Z")
	public boolean method7836() {
		if (this.anInterface1_2 == null) {
			@Pc(27) byte[] local27;
			if (Static431.anObject16 == null) {
				local27 = Static415.method6259(0.6F, 0.5F, 4.0F, 16.0F, new Class310_Sub1(419684), 4.0F);
				Static431.anObject16 = Static325.method4947(local27);
			}
			local27 = Static448.method6401(false, Static431.anObject16);
			@Pc(43) byte[] local43 = new byte[local27.length * 4];
			@Pc(45) int local45 = 0;
			for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
				@Pc(55) int local55 = local47 * 128 * 128;
				@Pc(57) int local57 = local55;
				for (@Pc(59) int local59 = 0; local59 < 128; local59++) {
					@Pc(67) int local67 = local59 * 128 + local57;
					@Pc(77) int local77 = (local59 - 1 & 0x7F) * 128 + local57;
					@Pc(87) int local87 = (local59 + 1 & 0x7F) * 128 + local57;
					for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
						@Pc(110) float local110 = (float) ((local27[local77 + local89] & 0xFF) - (local27[local87 + local89] & 0xFF));
						@Pc(135) float local135 = (float) ((local27[local67 + (local89 - 1 & 0x7F)] & 0xFF) - (local27[(local89 + 1 & 0x7F) + local67] & 0xFF));
						@Pc(150) float local150 = (float) (128.0D / Math.sqrt((double) (local135 * local135 + local110 * local110 + 16384.0F)));
						local43[local45++] = (byte) (int) (local150 * local135 + 127.0F);
						local43[local45++] = (byte) (int) (local150 * 128.0F + 127.0F);
						local43[local45++] = (byte) (int) (local150 * local110 + 127.0F);
						local43[local45++] = local27[local55++];
					}
				}
			}
			this.anInterface1_2 = this.aClass13_Sub3_20.method8229(local43, Static78.aClass104_3);
		}
		return this.anInterface1_2 != null;
	}
}
