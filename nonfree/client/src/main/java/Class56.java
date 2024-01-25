import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class56 {

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!qr;")
	private Class293 aClass293_7 = new Class293(64);

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Lclient!qr;")
	public Class293 aClass293_8 = new Class293(64);

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Lclient!wu;")
	public final Class384 aClass384_28;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Lclient!wu;")
	private final Class384 aClass384_27;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;Lclient!wu;)V")
	public Class56(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Class384 arg3) {
		this.aClass384_28 = arg3;
		this.aClass384_27 = arg2;
		this.aClass384_27.method8862(34);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	public void method1170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass293_7 = new Class293(arg1);
		this.aClass293_8 = new Class293(arg0);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method1171() {
		@Pc(2) Class293 local2 = this.aClass293_7;
		synchronized (this.aClass293_7) {
			this.aClass293_7.method6930();
		}
		local2 = this.aClass293_8;
		synchronized (this.aClass293_8) {
			this.aClass293_8.method6930();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	public void method1172() {
		@Pc(10) Class293 local10 = this.aClass293_7;
		synchronized (this.aClass293_7) {
			this.aClass293_7.method6927();
		}
		local10 = this.aClass293_8;
		synchronized (this.aClass293_8) {
			this.aClass293_8.method6927();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lclient!dk;")
	public Class77 method1173(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_7;
		@Pc(16) Class77 local16;
		synchronized (this.aClass293_7) {
			local16 = (Class77) this.aClass293_7.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_27;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_27) {
			local38 = this.aClass384_27.method8885(34, arg0);
		}
		local16 = new Class77();
		local16.aClass56_4 = this;
		if (local38 != null) {
			local16.method1481(new Class5_Sub12(local38));
		}
		@Pc(63) Class293 local63 = this.aClass293_7;
		synchronized (this.aClass293_7) {
			this.aClass293_7.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
	public void method1175() {
		@Pc(2) Class293 local2 = this.aClass293_7;
		synchronized (this.aClass293_7) {
			this.aClass293_7.method6922(5);
		}
		local2 = this.aClass293_8;
		synchronized (this.aClass293_8) {
			this.aClass293_8.method6922(5);
		}
	}
}
