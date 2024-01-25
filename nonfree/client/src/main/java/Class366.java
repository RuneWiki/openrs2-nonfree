import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class366 {

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "Lclient!ad;")
	private final Class6 aClass6_64 = new Class6(64);

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "Lclient!ad;")
	public final Class6 aClass6_65 = new Class6(2);

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Lclient!tf;")
	public final Class322 aClass322_158;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Lclient!tf;")
	private final Class322 aClass322_159;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;Lclient!tf;)V")
	public Class366(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Class322 arg3) {
		this.aClass322_158 = arg3;
		this.aClass322_159 = arg2;
		this.aClass322_159.method6831(33);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BI)V")
	public void method7944() {
		@Pc(2) Class6 local2 = this.aClass6_64;
		synchronized (this.aClass6_64) {
			this.aClass6_64.method97(5);
		}
		local2 = this.aClass6_65;
		synchronized (this.aClass6_65) {
			this.aClass6_65.method97(5);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public void method7945() {
		@Pc(6) Class6 local6 = this.aClass6_64;
		synchronized (this.aClass6_64) {
			this.aClass6_64.method102();
		}
		local6 = this.aClass6_65;
		synchronized (this.aClass6_65) {
			this.aClass6_65.method102();
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
	public void method7946() {
		@Pc(2) Class6 local2 = this.aClass6_64;
		synchronized (this.aClass6_64) {
			this.aClass6_64.method94();
		}
		local2 = this.aClass6_65;
		synchronized (this.aClass6_65) {
			this.aClass6_65.method94();
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)Lclient!qba;")
	public Class266 method7949(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_64;
		@Pc(16) Class266 local16;
		synchronized (this.aClass6_64) {
			local16 = (Class266) this.aClass6_64.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_159;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_159) {
			local38 = this.aClass322_159.method6802(33, arg0);
		}
		local16 = new Class266();
		local16.aClass366_2 = this;
		if (local38 != null) {
			local16.method6026(new Class3_Sub11(local38));
		}
		@Pc(63) Class6 local63 = this.aClass6_64;
		synchronized (this.aClass6_64) {
			this.aClass6_64.method106((long) arg0, local16);
			return local16;
		}
	}
}
