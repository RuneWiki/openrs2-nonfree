import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class120 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[Lclient!qb;")
	public Class19_Sub3[] aClass19_Sub3Array1 = null;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!bq;")
	public Class19_Sub1 aClass19_Sub1_1 = null;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[Lclient!qb;")
	public Class19_Sub3[] aClass19_Sub3Array2 = null;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!bq;")
	public Class19_Sub1 aClass19_Sub1_2 = null;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
	public final boolean aBoolean276;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class120(@OriginalArg(0) Class63_Sub1 arg0) {
		this.aBoolean276 = arg0.aBoolean268;
		Static179.method3449();
		@Pc(24) byte[] local24;
		if (this.aBoolean276) {
			local24 = new byte[524288];
			Static179.aByteBuffer7.get(local24);
			Static179.aByteBuffer7.position(0);
			this.aClass19_Sub1_1 = new Class19_Sub1(arg0, 6410, 128, 128, 16, local24, 6410);
			Static179.aByteBuffer6.get(local24);
			Static179.aByteBuffer6.position(0);
			this.aClass19_Sub1_2 = new Class19_Sub1(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass19_Sub3Array1 = new Class19_Sub3[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static179.aByteBuffer7.get(local24, 0, 32768);
				this.aClass19_Sub3Array1[local30] = new Class19_Sub3(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static179.aByteBuffer7.position(0);
			this.aClass19_Sub3Array2 = new Class19_Sub3[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static179.aByteBuffer6.get(local24, 0, 32768);
				this.aClass19_Sub3Array2[local30] = new Class19_Sub3(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static179.aByteBuffer6.position(0);
		}
	}
}
