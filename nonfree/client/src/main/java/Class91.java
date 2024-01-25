import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class91 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!nm;")
	public Class124_Sub1 aClass124_Sub1_1 = null;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "[Lclient!rj;")
	public Class124_Sub2[] aClass124_Sub2Array2 = null;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "[Lclient!rj;")
	public Class124_Sub2[] aClass124_Sub2Array3 = null;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!nm;")
	public Class124_Sub1 aClass124_Sub1_2 = null;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
	public final boolean aBoolean249;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class91(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aBoolean249 = arg0.aBoolean29;
		Static140.method2760();
		@Pc(24) byte[] local24;
		if (this.aBoolean249) {
			local24 = new byte[524288];
			Static140.aByteBuffer4.get(local24);
			Static140.aByteBuffer4.position(0);
			this.aClass124_Sub1_2 = new Class124_Sub1(arg0, 6410, 128, 128, 16, local24, 6410);
			Static140.aByteBuffer5.get(local24);
			Static140.aByteBuffer5.position(0);
			this.aClass124_Sub1_1 = new Class124_Sub1(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass124_Sub2Array2 = new Class124_Sub2[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static140.aByteBuffer4.get(local24, 0, 32768);
				this.aClass124_Sub2Array2[local30] = new Class124_Sub2(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static140.aByteBuffer4.position(0);
			this.aClass124_Sub2Array3 = new Class124_Sub2[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static140.aByteBuffer5.get(local24, 0, 32768);
				this.aClass124_Sub2Array3[local30] = new Class124_Sub2(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static140.aByteBuffer5.position(0);
		}
	}
}
