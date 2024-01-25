import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class110 {

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
	public int anInt3343;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "Lclient!h;")
	private final Class125 aClass125_18 = new Class125(64);

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "Lclient!h;")
	public final Class125 aClass125_19 = new Class125(50);

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Lclient!h;")
	public final Class125 aClass125_20 = new Class125(5);

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "Lclient!hu;")
	public final Class138 aClass138_3;

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "Lclient!an;")
	public final Class16 aClass16_42;

	@OriginalMember(owner = "client!gba", name = "g", descriptor = "Lclient!an;")
	private final Class16 aClass16_43;

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "Z")
	public boolean aBoolean275;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!hu;IZLclient!an;Lclient!an;)V")
	public Class110(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) Class16 arg4) {
		this.aClass138_3 = arg0;
		this.aClass16_42 = arg4;
		this.aClass16_43 = arg3;
		this.aBoolean275 = arg2;
		if (this.aClass16_43 != null) {
			@Pc(41) int local41 = this.aClass16_43.method407() - 1;
			this.aClass16_43.method399(local41);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	public void method3017() {
		@Pc(2) Class125 local2 = this.aClass125_18;
		synchronized (this.aClass125_18) {
			this.aClass125_18.method3440();
		}
		local2 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3440();
		}
		local2 = this.aClass125_20;
		synchronized (this.aClass125_20) {
			this.aClass125_20.method3440();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)Lclient!hg;")
	public Class130 method3018(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_18;
		@Pc(16) Class130 local16;
		synchronized (this.aClass125_18) {
			local16 = (Class130) this.aClass125_18.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_43;
		@Pc(42) byte[] local42;
		synchronized (this.aClass16_43) {
			local42 = this.aClass16_43.method408(Static290.method4722(arg0), Static23.method7568(arg0));
		}
		local16 = new Class130();
		local16.anInt4110 = arg0;
		local16.aClass110_2 = this;
		if (local42 != null) {
			local16.method3561(new Class12_Sub8(local42));
		}
		local16.method3564();
		@Pc(80) Class125 local80 = this.aClass125_18;
		synchronized (this.aClass125_18) {
			this.aClass125_18.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)V")
	public void method3019(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean275 != arg0) {
			this.aBoolean275 = arg0;
			this.method3017();
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	public void method3021() {
		@Pc(2) Class125 local2 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3440();
		}
		local2 = this.aClass125_20;
		synchronized (this.aClass125_20) {
			this.aClass125_20.method3440();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)V")
	public void method3022() {
		@Pc(2) Class125 local2 = this.aClass125_18;
		synchronized (this.aClass125_18) {
			this.aClass125_18.method3447(5);
		}
		local2 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3447(5);
		}
		local2 = this.aClass125_20;
		synchronized (this.aClass125_20) {
			this.aClass125_20.method3447(5);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BI)V")
	public void method3023(@OriginalArg(1) int arg0) {
		this.anInt3343 = arg0;
		@Pc(9) Class125 local9 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3440();
		}
		local9 = this.aClass125_20;
		synchronized (this.aClass125_20) {
			this.aClass125_20.method3440();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
	public void method3024() {
		@Pc(6) Class125 local6 = this.aClass125_18;
		synchronized (this.aClass125_18) {
			this.aClass125_18.method3442();
		}
		local6 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3442();
		}
		local6 = this.aClass125_20;
		synchronized (this.aClass125_20) {
			this.aClass125_20.method3442();
		}
	}
}
