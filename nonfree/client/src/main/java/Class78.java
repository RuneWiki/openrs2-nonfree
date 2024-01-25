import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class78 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!hg;")
	public Class60_Sub3 aClass60_Sub3_1 = null;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "[Lclient!hn;")
	public Class60_Sub4[] aClass60_Sub4Array2 = null;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "[Lclient!hn;")
	public Class60_Sub4[] aClass60_Sub4Array3 = null;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!hg;")
	public Class60_Sub3 aClass60_Sub3_2 = null;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Z")
	public final boolean aBoolean145;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class78(@OriginalArg(0) Class55_Sub1 arg0) {
		this.aBoolean145 = arg0.aBoolean325;
		Static106.method1883();
		@Pc(24) byte[] local24;
		if (this.aBoolean145) {
			local24 = new byte[524288];
			Static106.aByteBuffer5.get(local24);
			Static106.aByteBuffer5.position(0);
			this.aClass60_Sub3_1 = new Class60_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static106.aByteBuffer4.get(local24);
			Static106.aByteBuffer4.position(0);
			this.aClass60_Sub3_2 = new Class60_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass60_Sub4Array2 = new Class60_Sub4[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static106.aByteBuffer5.get(local24, 0, 32768);
				this.aClass60_Sub4Array2[local30] = new Class60_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static106.aByteBuffer5.position(0);
			this.aClass60_Sub4Array3 = new Class60_Sub4[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static106.aByteBuffer4.get(local24, 0, 32768);
				this.aClass60_Sub4Array3[local30] = new Class60_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static106.aByteBuffer4.position(0);
		}
	}
}
