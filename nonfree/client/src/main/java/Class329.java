import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class329 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[Lclient!cw;")
	public Class46_Sub2[] aClass46_Sub2Array3 = null;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!fba;")
	public Class46_Sub3 aClass46_Sub3_1 = null;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!fba;")
	public Class46_Sub3 aClass46_Sub3_2 = null;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "[Lclient!cw;")
	public Class46_Sub2[] aClass46_Sub2Array4 = null;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!fba;")
	public Class46_Sub3 aClass46_Sub3_3 = null;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Z")
	public final boolean aBoolean670;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class329(@OriginalArg(0) Class78_Sub3 arg0) {
		this.aBoolean670 = arg0.aBoolean432;
		Static71.method1171(arg0);
		if (this.aBoolean670) {
			@Pc(116) byte[] local116 = Static42.method745(false, Static203.anObject9);
			this.aClass46_Sub3_2 = new Class46_Sub3(arg0, 6410, 128, 128, 16, local116, 6410);
			@Pc(133) byte[] local133 = Static42.method745(false, Static8.anObject16);
			this.aClass46_Sub3_3 = new Class46_Sub3(arg0, 6410, 128, 128, 16, local133, 6410);
			@Pc(148) Class250 local148 = arg0.aClass250_1;
			if (local148.method5427()) {
				local116 = Static42.method745(false, Static41.anObject22);
				this.aClass46_Sub3_1 = new Class46_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(178) Class46_Sub3 local178 = new Class46_Sub3(arg0, 6409, 128, 128, 16, local116, 6409);
				if (local148.method5423(this.aClass46_Sub3_1, local178, 2.0F)) {
					this.aClass46_Sub3_1.method5138();
				} else {
					this.aClass46_Sub3_1.method5139();
					this.aClass46_Sub3_1 = null;
				}
				local178.method5139();
			}
		} else {
			this.aClass46_Sub2Array3 = new Class46_Sub2[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static412.method5872(2 * 128 * local34 * 128, Static203.anObject9);
				this.aClass46_Sub2Array3[local34] = new Class46_Sub2(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass46_Sub2Array4 = new Class46_Sub2[16];
			for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
				@Pc(88) byte[] local88 = Static412.method5872(local76 * 128 * 256, Static8.anObject16);
				this.aClass46_Sub2Array4[local76] = new Class46_Sub2(arg0, 3553, 6410, 128, 128, true, local88, 6410, false);
			}
		}
	}
}
