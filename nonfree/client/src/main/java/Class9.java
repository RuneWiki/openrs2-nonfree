import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class9 {

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!qr;")
	public final Class293 aClass293_2 = new Class293(20);

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!qr;")
	private final Class293 aClass293_3 = new Class293(64);

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!wu;")
	private final Class384 aClass384_6;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!wu;")
	public final Class384 aClass384_4;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;Lclient!wu;)V")
	public Class9(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Class384 arg3) {
		this.aClass384_6 = arg2;
		this.aClass384_4 = arg3;
		this.aClass384_6.method8862(46);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lclient!ec;")
	public Class86 method169(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_3;
		@Pc(16) Class86 local16;
		synchronized (this.aClass293_3) {
			local16 = (Class86) this.aClass293_3.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_6;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_6) {
			local38 = this.aClass384_6.method8885(46, arg0);
		}
		local16 = new Class86();
		local16.aClass9_2 = this;
		if (local38 != null) {
			local16.method1660(new Class5_Sub12(local38));
		}
		@Pc(68) Class293 local68 = this.aClass293_3;
		synchronized (this.aClass293_3) {
			this.aClass293_3.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	public void method170() {
		@Pc(6) Class293 local6 = this.aClass293_3;
		synchronized (this.aClass293_3) {
			this.aClass293_3.method6922(5);
		}
		local6 = this.aClass293_2;
		synchronized (this.aClass293_2) {
			this.aClass293_2.method6922(5);
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public void method172() {
		@Pc(11) Class293 local11 = this.aClass293_3;
		synchronized (this.aClass293_3) {
			this.aClass293_3.method6930();
		}
		local11 = this.aClass293_2;
		synchronized (this.aClass293_2) {
			this.aClass293_2.method6930();
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
	public void method173() {
		@Pc(2) Class293 local2 = this.aClass293_3;
		synchronized (this.aClass293_3) {
			this.aClass293_3.method6927();
		}
		local2 = this.aClass293_2;
		synchronized (this.aClass293_2) {
			this.aClass293_2.method6927();
		}
	}
}
