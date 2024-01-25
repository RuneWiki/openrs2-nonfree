import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class50 {

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "Lclient!er;")
	private final Class69 aClass69_14 = new Class69(64);

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!ns;")
	public final Class166 aClass166_62;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Lclient!ns;")
	private final Class166 aClass166_63;

	static {
		new Class242("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;Lclient!ns;)V")
	public Class50(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Class166 arg3) {
		this.aClass166_62 = arg3;
		this.aClass166_63 = arg2;
		this.aClass166_63.method3691(3);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V")
	public void method1383() {
		@Pc(2) Class69 local2 = this.aClass69_14;
		synchronized (this.aClass69_14) {
			this.aClass69_14.method1594(5);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lclient!lm;")
	public Class148 method1384(@OriginalArg(1) int arg0) {
		@Pc(11) Class69 local11 = this.aClass69_14;
		@Pc(21) Class148 local21;
		synchronized (this.aClass69_14) {
			local21 = (Class148) this.aClass69_14.method1591((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass166_63.method3696(arg0, 3);
		local21 = new Class148();
		local21.aClass50_2 = this;
		if (local38 != null) {
			local21.method3204(new Class4_Sub30(local38));
		}
		@Pc(57) Class69 local57 = this.aClass69_14;
		synchronized (this.aClass69_14) {
			this.aClass69_14.method1590((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public void method1386() {
		@Pc(6) Class69 local6 = this.aClass69_14;
		synchronized (this.aClass69_14) {
			this.aClass69_14.method1593();
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public void method1387() {
		@Pc(6) Class69 local6 = this.aClass69_14;
		synchronized (this.aClass69_14) {
			this.aClass69_14.method1600();
		}
	}
}
