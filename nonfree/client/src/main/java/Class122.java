import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class122 {

	@OriginalMember(owner = "client!h", name = "f", descriptor = "[Lclient!waa;")
	public Class16_Sub1[] aClass16_Sub1Array2 = null;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!rb;")
	public Class16_Sub2 aClass16_Sub2_1 = null;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[Lclient!waa;")
	public Class16_Sub1[] aClass16_Sub1Array1 = null;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!rb;")
	public Class16_Sub2 aClass16_Sub2_3 = null;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!rb;")
	public Class16_Sub2 aClass16_Sub2_2 = null;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Z")
	public final boolean aBoolean288;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class122(@OriginalArg(0) Class90_Sub1 arg0) {
		this.aBoolean288 = arg0.aBoolean171;
		Static558.method7765(arg0);
		if (this.aBoolean288) {
			@Pc(33) byte[] local33 = Static210.method3435(Static311.anObject10, false);
			this.aClass16_Sub2_3 = new Class16_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static210.method3435(Static25.anObject2, false);
			this.aClass16_Sub2_2 = new Class16_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class142 local65 = arg0.aClass142_1;
			if (local65.method3509()) {
				local33 = Static210.method3435(Static23.anObject1, false);
				this.aClass16_Sub2_1 = new Class16_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class16_Sub2 local95 = new Class16_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method3511(2.0F, this.aClass16_Sub2_1, local95)) {
					this.aClass16_Sub2_1.method7842();
				} else {
					this.aClass16_Sub2_1.method7847();
					this.aClass16_Sub2_1 = null;
				}
				local95.method7847();
				return;
			}
		} else {
			this.aClass16_Sub1Array2 = new Class16_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static367.method5427(Static311.anObject10, 2 * 128 * local127 * 128);
				this.aClass16_Sub1Array2[local127] = new Class16_Sub1(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass16_Sub1Array1 = new Class16_Sub1[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(183) byte[] local183 = Static367.method5427(Static25.anObject2, local169 * 2 * 128 * 128);
				this.aClass16_Sub1Array1[local169] = new Class16_Sub1(arg0, 3553, 6410, 128, 128, true, local183, 6410, false);
			}
		}
	}
}
