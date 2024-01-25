import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class315 {

	@OriginalMember(owner = "client!st", name = "e", descriptor = "Lclient!tea;")
	public Interface21 anInterface21_2 = null;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Lclient!tea;")
	public Interface21 anInterface21_1 = null;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "[Lclient!cm;")
	public Interface5[] anInterface5Array1 = null;

	@OriginalMember(owner = "client!st", name = "j", descriptor = "[Lclient!cm;")
	private Interface5[] anInterface5Array2 = null;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_17;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "Z")
	public boolean aBoolean619;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class315(@OriginalArg(0) Class78_Sub1 arg0) {
		this.aClass78_Sub1_17 = arg0;
		this.aBoolean619 = this.aClass78_Sub1_17.aBoolean635;
		if (this.aBoolean619 && !this.aClass78_Sub1_17.method6875(Static243.aClass172_9, Static560.aClass271_14)) {
			this.aBoolean619 = false;
		}
		if (this.aBoolean619 || this.aClass78_Sub1_17.method6869(Static243.aClass172_9, Static560.aClass271_14)) {
			Static351.method5247();
			if (this.aBoolean619) {
				@Pc(130) byte[] local130 = Static42.method745(false, Static398.anObject17);
				this.anInterface21_2 = this.aClass78_Sub1_17.method6972(local130, Static560.aClass271_14);
				@Pc(146) byte[] local146 = Static42.method745(false, Static465.anObject21);
				this.aClass78_Sub1_17.method6972(local146, Static560.aClass271_14);
			} else {
				this.anInterface5Array1 = new Interface5[16];
				for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
					@Pc(72) byte[] local72 = Static412.method5872(local58 * 2 * 128 * 128, Static398.anObject17);
					this.anInterface5Array1[local58] = this.aClass78_Sub1_17.method6923(Static560.aClass271_14, local72, 128, true, 128);
				}
				this.anInterface5Array2 = new Interface5[16];
				for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
					@Pc(105) byte[] local105 = Static412.method5872(local95 * 32768, Static465.anObject21);
					this.anInterface5Array2[local95] = this.aClass78_Sub1_17.method6923(Static560.aClass271_14, local105, 128, true, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Z")
	public boolean method6724() {
		if (this.aBoolean619) {
			return this.anInterface21_2 != null;
		} else {
			return this.anInterface5Array1 != null;
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)Z")
	public boolean method6725() {
		if (this.anInterface21_1 == null) {
			@Pc(30) byte[] local30;
			if (Static303.anObject15 == null) {
				local30 = Static426.method6095(4.0F, 16.0F, 0.6F, new Class119_Sub1(419684), 4.0F, 0.5F);
				Static303.anObject15 = Static161.method2652(local30);
			}
			local30 = Static42.method745(false, Static303.anObject15);
			@Pc(46) byte[] local46 = new byte[local30.length * 4];
			@Pc(48) int local48 = 0;
			for (@Pc(50) int local50 = 0; local50 < 16; local50++) {
				@Pc(56) int local56 = local50 * 16384;
				@Pc(58) int local58 = local56;
				for (@Pc(60) int local60 = 0; local60 < 128; local60++) {
					@Pc(69) int local69 = local58 + local60 * 128;
					@Pc(79) int local79 = (local60 - 1 & 0x7F) * 128 + local58;
					@Pc(89) int local89 = (local60 + 1 & 0x7F) * 128 + local58;
					for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
						@Pc(111) float local111 = (float) ((local30[local91 + local79] & 0xFF) - (local30[local89 + local91] & 0xFF));
						@Pc(137) float local137 = (float) ((local30[local69 + (local91 - 1 & 0x7F)] & 0xFF) - (local30[local69 + (local91 + 1 & 0x7F)] & 0xFF));
						@Pc(152) float local152 = (float) (128.0D / Math.sqrt((double) (local111 * local111 + local137 * local137 + 16384.0F)));
						local46[local48++] = (byte) (local137 * local152 + 127.0F);
						local46[local48++] = (byte) (local152 * 128.0F + 127.0F);
						local46[local48++] = (byte) (local152 * local111 + 127.0F);
						local46[local48++] = local30[local56++];
					}
				}
			}
			this.anInterface21_1 = this.aClass78_Sub1_17.method6972(local46, Static429.aClass271_12);
		}
		return this.anInterface21_1 != null;
	}
}
