import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class140 {

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "Lclient!tb;")
	private final Class313 aClass313_22 = new Class313(64);

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Lclient!tb;")
	private final Class313 aClass313_23 = new Class313(100);

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!pl;")
	private final Class259 aClass259_60;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;Lclient!pl;Lclient!pl;)V")
	public Class140(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) Class259 arg4) {
		this.aClass259_60 = arg2;
		if (this.aClass259_60 != null) {
			@Pc(26) int local26 = this.aClass259_60.method5962() - 1;
			this.aClass259_60.method5969(local26);
		}
		Static388.method5710(arg4, arg3);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method3282() {
		@Pc(12) Class313 local12 = this.aClass313_22;
		synchronized (this.aClass313_22) {
			this.aClass313_22.method6983();
		}
		local12 = this.aClass313_23;
		synchronized (this.aClass313_23) {
			this.aClass313_23.method6983();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
	public void method3283() {
		@Pc(6) Class313 local6 = this.aClass313_22;
		synchronized (this.aClass313_22) {
			this.aClass313_22.method6982(5);
		}
		local6 = this.aClass313_23;
		synchronized (this.aClass313_23) {
			this.aClass313_23.method6982(5);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	public void method3284() {
		@Pc(6) Class313 local6 = this.aClass313_22;
		synchronized (this.aClass313_22) {
			this.aClass313_22.method6977();
		}
		local6 = this.aClass313_23;
		synchronized (this.aClass313_23) {
			this.aClass313_23.method6977();
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)Lclient!wa;")
	public Class2_Sub3_Sub19 method3286(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_23;
		synchronized (this.aClass313_23) {
			@Pc(16) Class2_Sub3_Sub19 local16 = (Class2_Sub3_Sub19) this.aClass313_23.method6989((long) arg0);
			if (local16 == null) {
				local16 = new Class2_Sub3_Sub19(arg0);
				this.aClass313_23.method6980((long) arg0, local16);
			}
			return local16.method7772() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)Lclient!dr;")
	public Class84 method3287(@OriginalArg(1) int arg0) {
		@Pc(11) Class313 local11 = this.aClass313_22;
		@Pc(21) Class84 local21;
		synchronized (this.aClass313_22) {
			local21 = (Class84) this.aClass313_22.method6989((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class259 local34 = this.aClass259_60;
		@Pc(49) byte[] local49;
		synchronized (this.aClass259_60) {
			local49 = this.aClass259_60.method5985(Static535.method7311(arg0), Static67.method1099(arg0));
		}
		local21 = new Class84();
		local21.anInt2053 = arg0;
		local21.aClass140_1 = this;
		if (local49 != null) {
			local21.method1506(new Class2_Sub15(local49));
		}
		local21.method1507();
		@Pc(84) Class313 local84 = this.aClass313_22;
		synchronized (this.aClass313_22) {
			this.aClass313_22.method6980((long) arg0, local21);
			return local21;
		}
	}
}
