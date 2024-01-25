import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class67 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "[Lclient!hf;")
	public Class52_Sub1[] aClass52_Sub1Array2 = null;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "[Lclient!hf;")
	public Class52_Sub1[] aClass52_Sub1Array3 = null;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!tr;")
	public Class52_Sub2 aClass52_Sub2_1 = null;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!tr;")
	public Class52_Sub2 aClass52_Sub2_2 = null;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Z")
	public final boolean aBoolean172;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class67(@OriginalArg(0) Class47_Sub2 arg0) {
		this.aBoolean172 = arg0.aBoolean226;
		Static87.method2119();
		@Pc(24) byte[] local24;
		if (this.aBoolean172) {
			local24 = new byte[524288];
			Static87.aByteBuffer3.get(local24);
			Static87.aByteBuffer3.position(0);
			this.aClass52_Sub2_1 = new Class52_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
			Static87.aByteBuffer4.get(local24);
			Static87.aByteBuffer4.position(0);
			this.aClass52_Sub2_2 = new Class52_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass52_Sub1Array2 = new Class52_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static87.aByteBuffer3.get(local24, 0, 32768);
				this.aClass52_Sub1Array2[local30] = new Class52_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static87.aByteBuffer3.position(0);
			this.aClass52_Sub1Array3 = new Class52_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static87.aByteBuffer4.get(local24, 0, 32768);
				this.aClass52_Sub1Array3[local30] = new Class52_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static87.aByteBuffer4.position(0);
		}
	}
}
