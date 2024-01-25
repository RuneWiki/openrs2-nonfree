import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class31 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Lclient!ni;")
	public Class81_Sub3 aClass81_Sub3_2 = null;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "[Lclient!pq;")
	public Class81_Sub4[] aClass81_Sub4Array1 = null;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!ni;")
	public Class81_Sub3 aClass81_Sub3_1 = null;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "[Lclient!pq;")
	public Class81_Sub4[] aClass81_Sub4Array2 = null;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public final boolean aBoolean45;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class31(@OriginalArg(0) Class37_Sub1 arg0) {
		this.aBoolean45 = arg0.aBoolean57;
		Static37.method472();
		@Pc(24) byte[] local24;
		if (this.aBoolean45) {
			local24 = new byte[524288];
			Static37.aByteBuffer1.get(local24);
			Static37.aByteBuffer1.position(0);
			this.aClass81_Sub3_2 = new Class81_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static37.aByteBuffer2.get(local24);
			Static37.aByteBuffer2.position(0);
			this.aClass81_Sub3_1 = new Class81_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass81_Sub4Array2 = new Class81_Sub4[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static37.aByteBuffer1.get(local24, 0, 32768);
				this.aClass81_Sub4Array2[local30] = new Class81_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static37.aByteBuffer1.position(0);
			this.aClass81_Sub4Array1 = new Class81_Sub4[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static37.aByteBuffer2.get(local24, 0, 32768);
				this.aClass81_Sub4Array1[local30] = new Class81_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static37.aByteBuffer2.position(0);
		}
	}
}
