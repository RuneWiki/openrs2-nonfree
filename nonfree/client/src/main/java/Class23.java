import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class23 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!fb;")
	public Class8_Sub2 aClass8_Sub2_1 = null;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Lclient!fb;")
	public Class8_Sub2 aClass8_Sub2_2 = null;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "[Lclient!ai;")
	public Class8_Sub1[] aClass8_Sub1Array3 = null;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "[Lclient!ai;")
	public Class8_Sub1[] aClass8_Sub1Array2 = null;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Z")
	public final boolean aBoolean28;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class23(@OriginalArg(0) Class46_Sub2 arg0) {
		this.aBoolean28 = arg0.aBoolean380;
		Static25.method658();
		@Pc(24) byte[] local24;
		if (this.aBoolean28) {
			local24 = new byte[524288];
			Static25.aByteBuffer2.get(local24);
			Static25.aByteBuffer2.position(0);
			this.aClass8_Sub2_2 = new Class8_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
			Static25.aByteBuffer1.get(local24);
			Static25.aByteBuffer1.position(0);
			this.aClass8_Sub2_1 = new Class8_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass8_Sub1Array3 = new Class8_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static25.aByteBuffer2.get(local24, 0, 32768);
				this.aClass8_Sub1Array3[local30] = new Class8_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static25.aByteBuffer2.position(0);
			this.aClass8_Sub1Array2 = new Class8_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static25.aByteBuffer1.get(local24, 0, 32768);
				this.aClass8_Sub1Array2[local30] = new Class8_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static25.aByteBuffer1.position(0);
		}
	}
}
