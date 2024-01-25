import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class69 {

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "Lclient!ad;")
	private final Class6 aClass6_8 = new Class6(64);

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "Lclient!tf;")
	private final Class322 aClass322_33;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "Lclient!tf;")
	private final Class322 aClass322_32;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(ILclient!tf;Lclient!tf;)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_33 = arg1;
		this.aClass322_32 = arg2;
		if (this.aClass322_33 != null) {
			this.aClass322_33.method6831(0);
		}
		if (this.aClass322_32 != null) {
			this.aClass322_32.method6831(0);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)Lclient!vr;")
	public Class3_Sub7_Sub19 method1746(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub7_Sub19 local11 = (Class3_Sub7_Sub19) this.aClass6_8.method92((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass322_33.method6802(0, arg0);
		} else {
			local25 = this.aClass322_32.method6802(0, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub7_Sub19();
		if (local25 != null) {
			local11.method7618(new Class3_Sub11(local25));
		}
		if (arg0 >= 32768) {
			local11.method7623();
		}
		this.aClass6_8.method106((long) arg0, local11);
		return local11;
	}
}
