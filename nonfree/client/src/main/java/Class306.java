import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class306 {

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "Lclient!tb;")
	private Class313 aClass313_50 = new Class313(64);

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "Lclient!tb;")
	public Class313 aClass313_51 = new Class313(64);

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!pl;")
	public final Class259 aClass259_152;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!pl;")
	private final Class259 aClass259_151;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;Lclient!pl;)V")
	public Class306(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3) {
		this.aClass259_152 = arg3;
		this.aClass259_151 = arg2;
		this.aClass259_151.method5969(34);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public void method6828() {
		@Pc(2) Class313 local2 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method6983();
		}
		local2 = this.aClass313_51;
		synchronized (this.aClass313_51) {
			this.aClass313_51.method6983();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public void method6829() {
		@Pc(9) Class313 local9 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method6977();
		}
		local9 = this.aClass313_51;
		synchronized (this.aClass313_51) {
			this.aClass313_51.method6977();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Lclient!wi;")
	public Class358 method6830(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_50;
		@Pc(16) Class358 local16;
		synchronized (this.aClass313_50) {
			local16 = (Class358) this.aClass313_50.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class259 local29 = this.aClass259_151;
		@Pc(38) byte[] local38;
		synchronized (this.aClass259_151) {
			local38 = this.aClass259_151.method5985(arg0, 34);
		}
		local16 = new Class358();
		local16.aClass306_4 = this;
		if (local38 != null) {
			local16.method7912(new Class2_Sub15(local38));
		}
		@Pc(63) Class313 local63 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)V")
	public void method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass313_50 = new Class313(arg0);
		this.aClass313_51 = new Class313(arg1);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	public void method6833() {
		@Pc(2) Class313 local2 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method6982(5);
		}
		local2 = this.aClass313_51;
		synchronized (this.aClass313_51) {
			this.aClass313_51.method6982(5);
		}
	}
}
