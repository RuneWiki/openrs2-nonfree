import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class273 {

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Lclient!tb;")
	private final Class313 aClass313_44 = new Class313(64);

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "Lclient!tb;")
	public final Class313 aClass313_45 = new Class313(2);

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "Lclient!pl;")
	public final Class259 aClass259_138;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "Lclient!pl;")
	private final Class259 aClass259_137;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;Lclient!pl;)V")
	public Class273(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3) {
		this.aClass259_138 = arg3;
		this.aClass259_137 = arg2;
		this.aClass259_137.method5969(33);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public void method6374() {
		@Pc(6) Class313 local6 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method6977();
		}
		local6 = this.aClass313_45;
		synchronized (this.aClass313_45) {
			this.aClass313_45.method6977();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	public void method6375() {
		@Pc(7) Class313 local7 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method6983();
		}
		local7 = this.aClass313_45;
		synchronized (this.aClass313_45) {
			this.aClass313_45.method6983();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public void method6377() {
		@Pc(7) Class313 local7 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method6982(5);
		}
		local7 = this.aClass313_45;
		synchronized (this.aClass313_45) {
			this.aClass313_45.method6982(5);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Lclient!ag;")
	public Class12 method6378(@OriginalArg(0) int arg0) {
		@Pc(11) Class313 local11 = this.aClass313_44;
		@Pc(21) Class12 local21;
		synchronized (this.aClass313_44) {
			local21 = (Class12) this.aClass313_44.method6989((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class259 local34 = this.aClass259_137;
		@Pc(43) byte[] local43;
		synchronized (this.aClass259_137) {
			local43 = this.aClass259_137.method5985(arg0, 33);
		}
		local21 = new Class12();
		local21.aClass273_1 = this;
		if (local43 != null) {
			local21.method242(new Class2_Sub15(local43));
		}
		@Pc(68) Class313 local68 = this.aClass313_44;
		synchronized (this.aClass313_44) {
			this.aClass313_44.method6980((long) arg0, local21);
			return local21;
		}
	}
}
