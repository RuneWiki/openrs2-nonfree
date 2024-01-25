import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class211 {

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
	public int anInt6340;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "Lclient!er;")
	private final Class69 aClass69_61 = new Class69(64);

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "Lclient!er;")
	public final Class69 aClass69_62 = new Class69(50);

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "Lclient!er;")
	public final Class69 aClass69_63 = new Class69(5);

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!ns;")
	public final Class166 aClass166_243;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "Z")
	public boolean aBoolean433;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "Lclient!ns;")
	private final Class166 aClass166_244;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!go;IZLclient!ns;Lclient!ns;)V")
	public Class211(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class166 arg3, @OriginalArg(4) Class166 arg4) {
		this.aClass166_243 = arg4;
		this.aBoolean433 = arg2;
		this.aClass166_244 = arg3;
		if (this.aClass166_244 != null) {
			@Pc(38) int local38 = this.aClass166_244.method3695() - 1;
			this.aClass166_244.method3691(local38);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZB)V")
	public void method4925(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean433 != arg0) {
			this.aBoolean433 = arg0;
			this.method4934();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)V")
	public void method4928() {
		@Pc(2) Class69 local2 = this.aClass69_61;
		synchronized (this.aClass69_61) {
			this.aClass69_61.method1594(5);
		}
		local2 = this.aClass69_62;
		synchronized (this.aClass69_62) {
			this.aClass69_62.method1594(5);
		}
		local2 = this.aClass69_63;
		synchronized (this.aClass69_63) {
			this.aClass69_63.method1594(5);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	public void method4930() {
		@Pc(6) Class69 local6 = this.aClass69_62;
		synchronized (this.aClass69_62) {
			this.aClass69_62.method1593();
		}
		local6 = this.aClass69_63;
		synchronized (this.aClass69_63) {
			this.aClass69_63.method1593();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)Lclient!ul;")
	public Class243 method4931(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_61;
		@Pc(16) Class243 local16;
		synchronized (this.aClass69_61) {
			local16 = (Class243) this.aClass69_61.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass166_244.method3696(Static124.method1881(arg0), Static234.method3238(arg0));
		local16 = new Class243();
		local16.aClass211_2 = this;
		local16.anInt6911 = arg0;
		if (local37 != null) {
			local16.method5333(new Class4_Sub30(local37));
		}
		local16.method5334();
		@Pc(66) Class69 local66 = this.aClass69_61;
		synchronized (this.aClass69_61) {
			this.aClass69_61.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
	public void method4933() {
		@Pc(6) Class69 local6 = this.aClass69_61;
		synchronized (this.aClass69_61) {
			this.aClass69_61.method1600();
		}
		local6 = this.aClass69_62;
		synchronized (this.aClass69_62) {
			this.aClass69_62.method1600();
		}
		local6 = this.aClass69_63;
		synchronized (this.aClass69_63) {
			this.aClass69_63.method1600();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
	public void method4934() {
		@Pc(2) Class69 local2 = this.aClass69_61;
		synchronized (this.aClass69_61) {
			this.aClass69_61.method1593();
		}
		local2 = this.aClass69_62;
		synchronized (this.aClass69_62) {
			this.aClass69_62.method1593();
		}
		local2 = this.aClass69_63;
		synchronized (this.aClass69_63) {
			this.aClass69_63.method1593();
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(IB)V")
	public void method4935(@OriginalArg(0) int arg0) {
		this.anInt6340 = arg0;
		@Pc(9) Class69 local9 = this.aClass69_62;
		synchronized (this.aClass69_62) {
			this.aClass69_62.method1593();
		}
		local9 = this.aClass69_63;
		synchronized (this.aClass69_63) {
			this.aClass69_63.method1593();
		}
	}
}
