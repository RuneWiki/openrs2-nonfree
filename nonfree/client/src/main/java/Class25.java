import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class25 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[Lclient!ho;")
	public Class44_Sub1[] aClass44_Sub1Array1 = null;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!kga;")
	public Class44_Sub2 aClass44_Sub2_1 = null;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!kga;")
	public Class44_Sub2 aClass44_Sub2_2 = null;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!kga;")
	public Class44_Sub2 aClass44_Sub2_3 = null;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "[Lclient!ho;")
	public Class44_Sub1[] aClass44_Sub1Array2 = null;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
	public final boolean aBoolean17;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class25(@OriginalArg(0) Class143_Sub2 arg0) {
		this.aBoolean17 = arg0.aBoolean413;
		Static552.method8571(arg0);
		if (this.aBoolean17) {
			@Pc(110) byte[] local110 = Static120.method1911(false, Static242.anObject21);
			this.aClass44_Sub2_1 = new Class44_Sub2(arg0, 6410, 128, 128, 16, local110, 6410);
			@Pc(127) byte[] local127 = Static120.method1911(false, Static533.anObject17);
			this.aClass44_Sub2_2 = new Class44_Sub2(arg0, 6410, 128, 128, 16, local127, 6410);
			@Pc(142) Class151 local142 = arg0.aClass151_1;
			if (local142.method3103()) {
				local110 = Static120.method1911(false, Static19.anObject1);
				this.aClass44_Sub2_3 = new Class44_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(172) Class44_Sub2 local172 = new Class44_Sub2(arg0, 6409, 128, 128, 16, local110, 6409);
				if (local142.method3105(2.0F, local172, this.aClass44_Sub2_3)) {
					this.aClass44_Sub2_3.method6700();
				} else {
					this.aClass44_Sub2_3.method6703();
					this.aClass44_Sub2_3 = null;
				}
				local172.method6703();
			}
		} else {
			this.aClass44_Sub1Array2 = new Class44_Sub1[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(43) byte[] local43 = Static507.method7310(Static242.anObject21, local32 * 128 * 256);
				this.aClass44_Sub1Array2[local32] = new Class44_Sub1(arg0, 3553, 6410, 128, 128, true, local43, 6410, false);
			}
			this.aClass44_Sub1Array1 = new Class44_Sub1[16];
			for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
				@Pc(82) byte[] local82 = Static507.method7310(Static533.anObject17, local71 * 128 * 256);
				this.aClass44_Sub1Array1[local71] = new Class44_Sub1(arg0, 3553, 6410, 128, 128, true, local82, 6410, false);
			}
		}
	}
}
