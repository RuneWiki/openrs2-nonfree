import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class170 {

	@OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
	public int anInt4376;

	@OriginalMember(owner = "client!jha", name = "g", descriptor = "Lclient!qr;")
	private final Class293 aClass293_34 = new Class293(64);

	@OriginalMember(owner = "client!jha", name = "k", descriptor = "Lclient!qr;")
	public final Class293 aClass293_35 = new Class293(60);

	@OriginalMember(owner = "client!jha", name = "h", descriptor = "Lclient!wu;")
	public final Class384 aClass384_64;

	@OriginalMember(owner = "client!jha", name = "j", descriptor = "Lclient!wu;")
	private final Class384 aClass384_65;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;Lclient!wu;)V")
	public Class170(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Class384 arg3) {
		this.aClass384_64 = arg3;
		this.aClass384_65 = arg2;
		@Pc(26) int local26 = this.aClass384_65.method8865() - 1;
		this.aClass384_65.method8862(local26);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)V")
	public void method3997() {
		@Pc(2) Class293 local2 = this.aClass293_34;
		synchronized (this.aClass293_34) {
			this.aClass293_34.method6927();
		}
		local2 = this.aClass293_35;
		synchronized (this.aClass293_35) {
			this.aClass293_35.method6927();
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
	public void method3998() {
		@Pc(6) Class293 local6 = this.aClass293_34;
		synchronized (this.aClass293_34) {
			this.aClass293_34.method6930();
		}
		local6 = this.aClass293_35;
		synchronized (this.aClass293_35) {
			this.aClass293_35.method6930();
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)V")
	public void method4000(@OriginalArg(0) int arg0) {
		this.anInt4376 = arg0;
		@Pc(9) Class293 local9 = this.aClass293_35;
		synchronized (this.aClass293_35) {
			this.aClass293_35.method6930();
		}
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(II)Lclient!dba;")
	public Class68 method4001(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_34;
		@Pc(16) Class68 local16;
		synchronized (this.aClass293_34) {
			local16 = (Class68) this.aClass293_34.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_65;
		@Pc(42) byte[] local42;
		synchronized (this.aClass384_65) {
			local42 = this.aClass384_65.method8885(Static601.method8386(arg0), Static601.method8404(arg0));
		}
		local16 = new Class68();
		local16.anInt1410 = arg0;
		local16.aClass170_1 = this;
		if (local42 != null) {
			local16.method1356(new Class5_Sub12(local42));
		}
		@Pc(80) Class293 local80 = this.aClass293_34;
		synchronized (this.aClass293_34) {
			this.aClass293_34.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IZ)V")
	public void method4002() {
		@Pc(13) Class293 local13 = this.aClass293_34;
		synchronized (this.aClass293_34) {
			this.aClass293_34.method6922(5);
		}
		local13 = this.aClass293_35;
		synchronized (this.aClass293_35) {
			this.aClass293_35.method6922(5);
		}
	}
}
