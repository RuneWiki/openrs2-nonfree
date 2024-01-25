import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class30 {

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "[Lclient!bca;")
	public Class32_Sub1[] aClass32_Sub1Array1 = null;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!bv;")
	public Class32_Sub2 aClass32_Sub2_2 = null;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "[Lclient!bca;")
	public Class32_Sub1[] aClass32_Sub1Array2 = null;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!bv;")
	public Class32_Sub2 aClass32_Sub2_1 = null;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!bv;")
	public Class32_Sub2 aClass32_Sub2_3 = null;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Z")
	public final boolean aBoolean47;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class30(@OriginalArg(0) Class57_Sub2 arg0) {
		this.aBoolean47 = arg0.aBoolean213;
		Static347.method5233(arg0);
		if (this.aBoolean47) {
			@Pc(121) byte[] local121 = Static355.method5319(false, Static601.anObject17);
			this.aClass32_Sub2_1 = new Class32_Sub2(arg0, 6410, 128, 128, 16, local121, 6410);
			@Pc(138) byte[] local138 = Static355.method5319(false, Static272.anObject6);
			this.aClass32_Sub2_3 = new Class32_Sub2(arg0, 6410, 128, 128, 16, local138, 6410);
			@Pc(153) Class346 local153 = arg0.aClass346_1;
			if (local153.method8625()) {
				local121 = Static355.method5319(false, Static329.anObject9);
				this.aClass32_Sub2_2 = new Class32_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(183) Class32_Sub2 local183 = new Class32_Sub2(arg0, 6409, 128, 128, 16, local121, 6409);
				if (local153.method8622(this.aClass32_Sub2_2, local183, 2.0F)) {
					this.aClass32_Sub2_2.method8435();
				} else {
					this.aClass32_Sub2_2.method8429();
					this.aClass32_Sub2_2 = null;
				}
				local183.method8429();
			}
		} else {
			this.aClass32_Sub1Array2 = new Class32_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static556.method8031(local34 * 256 * 128, Static601.anObject17);
				this.aClass32_Sub1Array2[local34] = new Class32_Sub1(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass32_Sub1Array1 = new Class32_Sub1[16];
			for (@Pc(80) int local80 = 0; local80 < 16; local80++) {
				@Pc(92) byte[] local92 = Static556.method8031(local80 * 128 * 256, Static272.anObject6);
				this.aClass32_Sub1Array1[local80] = new Class32_Sub1(arg0, 3553, 6410, 128, 128, true, local92, 6410, false);
			}
		}
	}
}
