import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class54 {

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "Lclient!er;")
	private final Class69 aClass69_15 = new Class69(64);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "Lclient!ns;")
	private final Class166 aClass166_67;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	public final int anInt1890;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class54(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_67 = arg2;
		if (this.aClass166_67 == null) {
			this.anInt1890 = 0;
		} else {
			this.anInt1890 = this.aClass166_67.method3691(16);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	public void method1420() {
		@Pc(11) Class69 local11 = this.aClass69_15;
		synchronized (this.aClass69_15) {
			this.aClass69_15.method1600();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
	public void method1421() {
		@Pc(6) Class69 local6 = this.aClass69_15;
		synchronized (this.aClass69_15) {
			this.aClass69_15.method1594(5);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Lclient!dj;")
	public Class48 method1422(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_15;
		@Pc(16) Class48 local16;
		synchronized (this.aClass69_15) {
			local16 = (Class48) this.aClass69_15.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass166_67.method3696(arg0, 16);
		local16 = new Class48();
		if (local33 != null) {
			local16.method1368(new Class4_Sub30(local33));
		}
		@Pc(51) Class69 local51 = this.aClass69_15;
		synchronized (this.aClass69_15) {
			this.aClass69_15.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V")
	public void method1424() {
		@Pc(9) Class69 local9 = this.aClass69_15;
		synchronized (this.aClass69_15) {
			this.aClass69_15.method1593();
		}
	}
}
