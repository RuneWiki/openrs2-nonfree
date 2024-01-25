import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class44 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "[Lclient!fc;")
	public Class11_Sub1[] aClass11_Sub1Array2 = null;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!jg;")
	public Class11_Sub3 aClass11_Sub3_1 = null;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!jg;")
	public Class11_Sub3 aClass11_Sub3_2 = null;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[Lclient!fc;")
	public Class11_Sub1[] aClass11_Sub1Array3 = null;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Z")
	public final boolean aBoolean89;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class44(@OriginalArg(0) Class59_Sub1 arg0) {
		this.aBoolean89 = arg0.aBoolean352;
		Static53.method1174();
		@Pc(24) byte[] local24;
		if (this.aBoolean89) {
			local24 = new byte[524288];
			Static53.aByteBuffer2.get(local24);
			Static53.aByteBuffer2.position(0);
			this.aClass11_Sub3_2 = new Class11_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static53.aByteBuffer3.get(local24);
			Static53.aByteBuffer3.position(0);
			this.aClass11_Sub3_1 = new Class11_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass11_Sub1Array2 = new Class11_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static53.aByteBuffer2.get(local24, 0, 32768);
				this.aClass11_Sub1Array2[local30] = new Class11_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static53.aByteBuffer2.position(0);
			this.aClass11_Sub1Array3 = new Class11_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static53.aByteBuffer3.get(local24, 0, 32768);
				this.aClass11_Sub1Array3[local30] = new Class11_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static53.aByteBuffer3.position(0);
		}
	}
}
