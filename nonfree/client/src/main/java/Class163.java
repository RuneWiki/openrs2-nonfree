import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class163 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[Lclient!rq;")
	public Class18_Sub1[] aClass18_Sub1Array1 = null;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!sd;")
	public Class18_Sub4 aClass18_Sub4_1 = null;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!sd;")
	public Class18_Sub4 aClass18_Sub4_2 = null;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[Lclient!rq;")
	public Class18_Sub1[] aClass18_Sub1Array2 = null;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Z")
	public final boolean aBoolean408;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class163(@OriginalArg(0) Class2_Sub1 arg0) {
		this.aBoolean408 = arg0.aBoolean215;
		Static250.method4468();
		@Pc(24) byte[] local24;
		if (this.aBoolean408) {
			local24 = new byte[524288];
			Static250.aByteBuffer6.get(local24);
			Static250.aByteBuffer6.position(0);
			this.aClass18_Sub4_2 = new Class18_Sub4(arg0, 6410, 128, 128, 16, local24, 6410);
			Static250.aByteBuffer7.get(local24);
			Static250.aByteBuffer7.position(0);
			this.aClass18_Sub4_1 = new Class18_Sub4(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass18_Sub1Array2 = new Class18_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static250.aByteBuffer6.get(local24, 0, 32768);
				this.aClass18_Sub1Array2[local30] = new Class18_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static250.aByteBuffer6.position(0);
			this.aClass18_Sub1Array1 = new Class18_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static250.aByteBuffer7.get(local24, 0, 32768);
				this.aClass18_Sub1Array1[local30] = new Class18_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static250.aByteBuffer7.position(0);
		}
	}
}
