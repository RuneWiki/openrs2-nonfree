import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class197 {

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "Lclient!kh;")
	private final Class134 aClass134_42 = new Class134(64);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!ul;")
	private final Class246 aClass246_169;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "Lclient!ul;")
	private final Class246 aClass246_170;

	static {
		new Class7("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(ILclient!ul;Lclient!ul;)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_169 = arg2;
		this.aClass246_170 = arg1;
		if (this.aClass246_170 != null) {
			this.aClass246_170.method5492(0);
		}
		if (this.aClass246_169 != null) {
			this.aClass246_169.method5492(0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Lclient!rc;")
	public Class1_Sub2_Sub14 method4463(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub2_Sub14 local16 = (Class1_Sub2_Sub14) this.aClass134_42.method3266((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = this.aClass246_170.method5477(0, arg0);
		} else {
			local32 = this.aClass246_169.method5477(0, arg0 & 0x7FFF);
		}
		local16 = new Class1_Sub2_Sub14();
		if (local32 != null) {
			local16.method4805(new Class1_Sub5(local32));
		}
		if (arg0 >= 32768) {
			local16.method4803();
		}
		this.aClass134_42.method3263((long) arg0, local16);
		return local16;
	}
}
