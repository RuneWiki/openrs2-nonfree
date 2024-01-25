import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class114 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!ft;")
	public Class81_Sub1 aClass81_Sub1_1 = null;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "[Lclient!tr;")
	public Class81_Sub2[] aClass81_Sub2Array1 = null;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "[Lclient!tr;")
	public Class81_Sub2[] aClass81_Sub2Array2 = null;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!ft;")
	public Class81_Sub1 aClass81_Sub1_2 = null;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Z")
	public final boolean aBoolean250;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class114(@OriginalArg(0) Class48_Sub2 arg0) {
		this.aBoolean250 = arg0.aBoolean236;
		Static156.method2773();
		@Pc(24) byte[] local24;
		if (this.aBoolean250) {
			local24 = new byte[524288];
			Static156.aByteBuffer4.get(local24);
			Static156.aByteBuffer4.position(0);
			this.aClass81_Sub1_2 = new Class81_Sub1(arg0, 6410, 128, 128, 16, local24, 6410);
			Static156.aByteBuffer5.get(local24);
			Static156.aByteBuffer5.position(0);
			this.aClass81_Sub1_1 = new Class81_Sub1(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass81_Sub2Array2 = new Class81_Sub2[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static156.aByteBuffer4.get(local24, 0, 32768);
				this.aClass81_Sub2Array2[local30] = new Class81_Sub2(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static156.aByteBuffer4.position(0);
			this.aClass81_Sub2Array1 = new Class81_Sub2[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static156.aByteBuffer5.get(local24, 0, 32768);
				this.aClass81_Sub2Array1[local30] = new Class81_Sub2(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static156.aByteBuffer5.position(0);
		}
	}
}
