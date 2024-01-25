import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class157 {

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!er;")
	private final Class69 aClass69_43 = new Class69(64);

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!ns;")
	private final Class166 aClass166_175;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class157(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_175 = arg2;
		if (this.aClass166_175 != null) {
			this.aClass166_175.method3691(35);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
	public void method3420() {
		@Pc(6) Class69 local6 = this.aClass69_43;
		synchronized (this.aClass69_43) {
			this.aClass69_43.method1593();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Lclient!qr;")
	public Class199 method3422(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_43;
		@Pc(16) Class199 local16;
		synchronized (this.aClass69_43) {
			local16 = (Class199) this.aClass69_43.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass166_175.method3696(arg0, 35);
		local16 = new Class199();
		if (local33 != null) {
			local16.method4496(new Class4_Sub30(local33));
		}
		local16.method4498();
		@Pc(58) Class69 local58 = this.aClass69_43;
		synchronized (this.aClass69_43) {
			this.aClass69_43.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public void method3423() {
		@Pc(6) Class69 local6 = this.aClass69_43;
		synchronized (this.aClass69_43) {
			this.aClass69_43.method1600();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)V")
	public void method3424() {
		@Pc(11) Class69 local11 = this.aClass69_43;
		synchronized (this.aClass69_43) {
			this.aClass69_43.method1594(5);
		}
	}
}
