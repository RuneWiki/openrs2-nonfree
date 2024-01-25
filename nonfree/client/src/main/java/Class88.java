import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class88 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!er;")
	private final Class69 aClass69_31 = new Class69(16);

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!ns;")
	private final Class166 aClass166_96;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class88(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_96 = arg2;
		this.aClass166_96.method3691(30);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public void method1907() {
		@Pc(6) Class69 local6 = this.aClass69_31;
		synchronized (this.aClass69_31) {
			this.aClass69_31.method1600();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public void method1908() {
		@Pc(6) Class69 local6 = this.aClass69_31;
		synchronized (this.aClass69_31) {
			this.aClass69_31.method1593();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	public void method1913() {
		@Pc(6) Class69 local6 = this.aClass69_31;
		synchronized (this.aClass69_31) {
			this.aClass69_31.method1594(5);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lclient!hm;")
	public Class110 method1914(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_31;
		@Pc(16) Class110 local16;
		synchronized (this.aClass69_31) {
			local16 = (Class110) this.aClass69_31.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass166_96.method3696(arg0, 30);
		local16 = new Class110();
		if (local41 != null) {
			local16.method2253(new Class4_Sub30(local41));
		}
		@Pc(57) Class69 local57 = this.aClass69_31;
		synchronized (this.aClass69_31) {
			this.aClass69_31.method1590((long) arg0, local16);
			return local16;
		}
	}
}
