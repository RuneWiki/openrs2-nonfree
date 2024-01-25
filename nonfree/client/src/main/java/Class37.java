import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class37 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Lclient!mg;")
	public Class7_Sub3 aClass7_Sub3_1 = null;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "Lclient!mg;")
	public Class7_Sub3 aClass7_Sub3_2 = null;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "[Lclient!ai;")
	public Class7_Sub1[] aClass7_Sub1Array1 = null;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "[Lclient!ai;")
	public Class7_Sub1[] aClass7_Sub1Array2 = null;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "Z")
	public final boolean aBoolean82;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class37(@OriginalArg(0) Class82_Sub2 arg0) {
		this.aBoolean82 = arg0.aBoolean402;
		Static44.method903();
		@Pc(24) byte[] local24;
		if (this.aBoolean82) {
			local24 = new byte[524288];
			Static44.aByteBuffer1.get(local24);
			Static44.aByteBuffer1.position(0);
			this.aClass7_Sub3_1 = new Class7_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static44.aByteBuffer2.get(local24);
			Static44.aByteBuffer2.position(0);
			this.aClass7_Sub3_2 = new Class7_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass7_Sub1Array2 = new Class7_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static44.aByteBuffer1.get(local24, 0, 32768);
				this.aClass7_Sub1Array2[local30] = new Class7_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static44.aByteBuffer1.position(0);
			this.aClass7_Sub1Array1 = new Class7_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static44.aByteBuffer2.get(local24, 0, 32768);
				this.aClass7_Sub1Array1[local30] = new Class7_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static44.aByteBuffer2.position(0);
		}
	}
}
