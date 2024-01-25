import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class190 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!rv;")
	public Class11_Sub2 aClass11_Sub2_1 = null;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "[Lclient!cs;")
	public Class11_Sub1[] aClass11_Sub1Array4 = null;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[Lclient!cs;")
	public Class11_Sub1[] aClass11_Sub1Array3 = null;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!rv;")
	public Class11_Sub2 aClass11_Sub2_2 = null;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!rv;")
	public Class11_Sub2 aClass11_Sub2_3 = null;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Z")
	public final boolean aBoolean385;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class190(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aBoolean385 = arg0.aBoolean33;
		Static537.method7691(arg0);
		if (this.aBoolean385) {
			@Pc(112) byte[] local112 = Static242.method4205(false, Static424.anObject16);
			this.aClass11_Sub2_2 = new Class11_Sub2(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static242.method4205(false, Static508.anObject21);
			this.aClass11_Sub2_3 = new Class11_Sub2(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class293 local144 = arg0.aClass293_1;
			if (local144.method7165()) {
				local112 = Static242.method4205(false, Static186.anObject8);
				this.aClass11_Sub2_1 = new Class11_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(174) Class11_Sub2 local174 = new Class11_Sub2(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method7171(this.aClass11_Sub2_1, 2.0F, local174)) {
					this.aClass11_Sub2_1.method7309();
				} else {
					this.aClass11_Sub2_1.method7306();
					this.aClass11_Sub2_1 = null;
				}
				local174.method7306();
			}
		} else {
			this.aClass11_Sub1Array4 = new Class11_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static124.method7290(Static424.anObject16, local34 * 128 * 128 * 2);
				this.aClass11_Sub1Array4[local34] = new Class11_Sub1(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass11_Sub1Array3 = new Class11_Sub1[16];
			for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
				@Pc(86) byte[] local86 = Static124.method7290(Static508.anObject21, local76 * 32768);
				this.aClass11_Sub1Array3[local76] = new Class11_Sub1(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
