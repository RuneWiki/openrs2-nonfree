import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class194 {

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
	public int anInt5632;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!wg;")
	private final Class313 aClass313_34 = new Class313(64);

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!wg;")
	public final Class313 aClass313_36 = new Class313(30);

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "Lclient!kr;")
	private final Class171 aClass171_86;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "Lclient!kr;")
	public final Class171 aClass171_85;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;Lclient!kr;)V")
	public Class194(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_86 = arg2;
		this.aClass171_85 = arg3;
		@Pc(26) int local26 = this.aClass171_86.method4331() - 1;
		this.aClass171_86.method4349(local26);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)V")
	public void method4806() {
		@Pc(2) Class313 local2 = this.aClass313_34;
		synchronized (this.aClass313_34) {
			this.aClass313_34.method7403(5);
		}
		local2 = this.aClass313_36;
		synchronized (this.aClass313_36) {
			this.aClass313_36.method7403(5);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)V")
	public void method4807(@OriginalArg(0) int arg0) {
		this.anInt5632 = arg0;
		@Pc(9) Class313 local9 = this.aClass313_36;
		synchronized (this.aClass313_36) {
			this.aClass313_36.method7398();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)Lclient!cp;")
	public Class52 method4810(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_34;
		@Pc(16) Class52 local16;
		synchronized (this.aClass313_34) {
			local16 = (Class52) this.aClass313_34.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_86;
		@Pc(42) byte[] local42;
		synchronized (this.aClass171_86) {
			local42 = this.aClass171_86.method4339(Static356.method5329(arg0), Static192.method2968(arg0));
		}
		local16 = new Class52();
		local16.aClass194_1 = this;
		local16.anInt1346 = arg0;
		if (local42 != null) {
			local16.method1271(new Class1_Sub6(local42));
		}
		@Pc(76) Class313 local76 = this.aClass313_34;
		synchronized (this.aClass313_34) {
			this.aClass313_34.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public void method4811() {
		@Pc(21) Class313 local21 = this.aClass313_34;
		synchronized (this.aClass313_34) {
			this.aClass313_34.method7398();
		}
		local21 = this.aClass313_36;
		synchronized (this.aClass313_36) {
			this.aClass313_36.method7398();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public void method4813() {
		@Pc(11) Class313 local11 = this.aClass313_34;
		synchronized (this.aClass313_34) {
			this.aClass313_34.method7400();
		}
		local11 = this.aClass313_36;
		synchronized (this.aClass313_36) {
			this.aClass313_36.method7400();
		}
	}
}
