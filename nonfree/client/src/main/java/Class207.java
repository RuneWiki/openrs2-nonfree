import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class207 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!ad;")
	private Class6 aClass6_37 = new Class6(64);

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!tf;")
	private final Class322 aClass322_100;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class207(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_100 = arg2;
		if (this.aClass322_100 != null) {
			@Pc(20) int local20 = this.aClass322_100.method6825() - 1;
			this.aClass322_100.method6831(local20);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	public void method4718(@OriginalArg(0) int arg0) {
		@Pc(2) Class6 local2 = this.aClass6_37;
		synchronized (this.aClass6_37) {
			this.aClass6_37.method102();
			this.aClass6_37 = new Class6(arg0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method4719() {
		@Pc(2) Class6 local2 = this.aClass6_37;
		synchronized (this.aClass6_37) {
			this.aClass6_37.method94();
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Lclient!jt;")
	public Class167 method4720(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_37;
		@Pc(16) Class167 local16;
		synchronized (this.aClass6_37) {
			local16 = (Class167) this.aClass6_37.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_100;
		@Pc(44) byte[] local44;
		synchronized (this.aClass322_100) {
			local44 = this.aClass322_100.method6802(Static342.method5073(arg0), Static247.method3809(arg0));
		}
		local16 = new Class167();
		if (local44 != null) {
			local16.method3997(new Class3_Sub11(local44));
		}
		@Pc(74) Class6 local74 = this.aClass6_37;
		synchronized (this.aClass6_37) {
			this.aClass6_37.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V")
	public void method4721() {
		@Pc(10) Class6 local10 = this.aClass6_37;
		synchronized (this.aClass6_37) {
			this.aClass6_37.method97(5);
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method4722() {
		@Pc(6) Class6 local6 = this.aClass6_37;
		synchronized (this.aClass6_37) {
			this.aClass6_37.method102();
		}
	}
}
