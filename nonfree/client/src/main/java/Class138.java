import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class138 {

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Lclient!er;")
	private final Class69 aClass69_37 = new Class69(64);

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "Lclient!er;")
	public final Class69 aClass69_38 = new Class69(2);

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!ns;")
	public final Class166 aClass166_154;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "Lclient!ns;")
	private final Class166 aClass166_155;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;Lclient!ns;)V")
	public Class138(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Class166 arg3) {
		this.aClass166_154 = arg3;
		this.aClass166_155 = arg2;
		this.aClass166_155.method3691(33);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)Lclient!dp;")
	public Class52 method2988(@OriginalArg(1) int arg0) {
		@Pc(11) Class69 local11 = this.aClass69_37;
		@Pc(21) Class52 local21;
		synchronized (this.aClass69_37) {
			local21 = (Class52) this.aClass69_37.method1591((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass166_155.method3696(arg0, 33);
		local21 = new Class52();
		local21.aClass138_1 = this;
		if (local38 != null) {
			local21.method1392(new Class4_Sub30(local38));
		}
		@Pc(57) Class69 local57 = this.aClass69_37;
		synchronized (this.aClass69_37) {
			this.aClass69_37.method1590((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public void method2989() {
		@Pc(2) Class69 local2 = this.aClass69_37;
		synchronized (this.aClass69_37) {
			this.aClass69_37.method1600();
		}
		local2 = this.aClass69_38;
		synchronized (this.aClass69_38) {
			this.aClass69_38.method1600();
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(BI)V")
	public void method2990() {
		@Pc(6) Class69 local6 = this.aClass69_37;
		synchronized (this.aClass69_37) {
			this.aClass69_37.method1594(5);
		}
		@Pc(30) Class69 local30 = this.aClass69_38;
		synchronized (this.aClass69_38) {
			this.aClass69_38.method1594(5);
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
	public void method2992() {
		@Pc(2) Class69 local2 = this.aClass69_37;
		synchronized (this.aClass69_37) {
			this.aClass69_37.method1593();
		}
		local2 = this.aClass69_38;
		synchronized (this.aClass69_38) {
			this.aClass69_38.method1593();
		}
	}
}
