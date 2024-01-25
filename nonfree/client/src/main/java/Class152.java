import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class152 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!bu;")
	public Class30_Sub2 aClass30_Sub2_1 = null;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!bu;")
	public Class30_Sub2 aClass30_Sub2_2 = null;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[Lclient!kh;")
	public Class30_Sub3[] aClass30_Sub3Array3 = null;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[Lclient!kh;")
	public Class30_Sub3[] aClass30_Sub3Array2 = null;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Z")
	public final boolean aBoolean269;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class152(@OriginalArg(0) Class155_Sub1 arg0) {
		this.aBoolean269 = arg0.aBoolean292;
		Static211.method3282();
		@Pc(24) byte[] local24;
		if (this.aBoolean269) {
			local24 = new byte[524288];
			Static211.aByteBuffer5.get(local24);
			Static211.aByteBuffer5.position(0);
			this.aClass30_Sub2_1 = new Class30_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
			Static211.aByteBuffer4.get(local24);
			Static211.aByteBuffer4.position(0);
			this.aClass30_Sub2_2 = new Class30_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass30_Sub3Array2 = new Class30_Sub3[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static211.aByteBuffer5.get(local24, 0, 32768);
				this.aClass30_Sub3Array2[local30] = new Class30_Sub3(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static211.aByteBuffer5.position(0);
			this.aClass30_Sub3Array3 = new Class30_Sub3[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static211.aByteBuffer4.get(local24, 0, 32768);
				this.aClass30_Sub3Array3[local30] = new Class30_Sub3(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static211.aByteBuffer4.position(0);
		}
	}
}
