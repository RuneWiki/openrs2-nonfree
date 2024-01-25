import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class166 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!mf;")
	public Class44_Sub2 aClass44_Sub2_1 = null;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!mf;")
	public Class44_Sub2 aClass44_Sub2_2 = null;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "[Lclient!ir;")
	public Class44_Sub1[] aClass44_Sub1Array4 = null;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "[Lclient!ir;")
	public Class44_Sub1[] aClass44_Sub1Array3 = null;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Z")
	public final boolean aBoolean424;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class166(@OriginalArg(0) Class105_Sub1 arg0) {
		this.aBoolean424 = arg0.aBoolean336;
		Static243.method4449();
		@Pc(24) byte[] local24;
		if (this.aBoolean424) {
			local24 = new byte[524288];
			Static243.aByteBuffer7.get(local24);
			Static243.aByteBuffer7.position(0);
			this.aClass44_Sub2_2 = new Class44_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
			Static243.aByteBuffer6.get(local24);
			Static243.aByteBuffer6.position(0);
			this.aClass44_Sub2_1 = new Class44_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass44_Sub1Array3 = new Class44_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static243.aByteBuffer7.get(local24, 0, 32768);
				this.aClass44_Sub1Array3[local30] = new Class44_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static243.aByteBuffer7.position(0);
			this.aClass44_Sub1Array4 = new Class44_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static243.aByteBuffer6.get(local24, 0, 32768);
				this.aClass44_Sub1Array4[local30] = new Class44_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static243.aByteBuffer6.position(0);
		}
	}
}
