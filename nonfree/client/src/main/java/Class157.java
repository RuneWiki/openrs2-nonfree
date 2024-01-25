import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class157 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!ad;")
	private final Class6 aClass6_24 = new Class6(64);

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!tf;")
	private final Class322 aClass322_83;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class157(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_83 = arg2;
		this.aClass322_83.method6831(5);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!fm;")
	public Class3_Sub7_Sub9 method3677(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_24;
		@Pc(16) Class3_Sub7_Sub9 local16;
		synchronized (this.aClass6_24) {
			local16 = (Class3_Sub7_Sub9) this.aClass6_24.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_83) {
			local38 = this.aClass322_83.method6802(5, arg0);
		}
		local16 = new Class3_Sub7_Sub9();
		if (local38 != null) {
			local16.method2863(new Class3_Sub11(local38));
		}
		@Pc(60) Class6 local60 = this.aClass6_24;
		synchronized (this.aClass6_24) {
			this.aClass6_24.method106((long) arg0, local16);
			return local16;
		}
	}
}
