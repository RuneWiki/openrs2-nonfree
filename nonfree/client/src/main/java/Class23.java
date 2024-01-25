import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class23 {

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!ad;")
	private final Class6 aClass6_2 = new Class6(64);

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Lclient!tf;")
	public final Class322 aClass322_6;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "Lclient!tf;")
	private final Class322 aClass322_7;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;Lclient!tf;)V")
	public Class23(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Class322 arg3) {
		this.aClass322_6 = arg3;
		this.aClass322_7 = arg2;
		this.aClass322_7.method6831(3);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
	public void method442() {
		@Pc(12) Class6 local12 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			this.aClass6_2.method94();
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
	public void method443() {
		@Pc(6) Class6 local6 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			this.aClass6_2.method102();
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BI)Lclient!he;")
	public Class125 method445(@OriginalArg(1) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_2;
		@Pc(16) Class125 local16;
		synchronized (this.aClass6_2) {
			local16 = (Class125) this.aClass6_2.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_7;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_7) {
			local38 = this.aClass322_7.method6802(3, arg0);
		}
		local16 = new Class125();
		local16.aClass23_2 = this;
		if (local38 != null) {
			local16.method3262(new Class3_Sub11(local38));
		}
		@Pc(69) Class6 local69 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			this.aClass6_2.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
	public void method446() {
		@Pc(2) Class6 local2 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			this.aClass6_2.method97(5);
		}
	}
}
