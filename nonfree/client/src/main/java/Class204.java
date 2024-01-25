import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class204 {

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "Lclient!fc;")
	private final Class77 aClass77_42 = new Class77(64);

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
	public int anInt5439 = 0;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Lclient!oi;")
	private final Class185 aClass185_86;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
	public final int anInt5432;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class204(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_86 = arg2;
		this.anInt5432 = this.aClass185_86.method4011(4);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public void method4342() {
		@Pc(6) Class77 local6 = this.aClass77_42;
		synchronized (this.aClass77_42) {
			this.aClass77_42.method1395();
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
	public void method4346() {
		@Pc(6) Class77 local6 = this.aClass77_42;
		synchronized (this.aClass77_42) {
			this.aClass77_42.method1394();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)Lclient!d;")
	public Class49 method4347(@OriginalArg(1) int arg0) {
		@Pc(11) Class77 local11 = this.aClass77_42;
		@Pc(21) Class49 local21;
		synchronized (this.aClass77_42) {
			local21 = (Class49) this.aClass77_42.method1387((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class185 local34 = this.aClass185_86;
		@Pc(43) byte[] local43;
		synchronized (this.aClass185_86) {
			local43 = this.aClass185_86.method4002(4, arg0);
		}
		local21 = new Class49();
		local21.anInt1000 = arg0;
		local21.aClass204_2 = this;
		if (local43 != null) {
			local21.method875(new Class1_Sub19(local43));
		}
		local21.method874();
		@Pc(74) Class77 local74 = this.aClass77_42;
		synchronized (this.aClass77_42) {
			this.aClass77_42.method1396(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)V")
	public void method4348() {
		@Pc(2) Class77 local2 = this.aClass77_42;
		synchronized (this.aClass77_42) {
			this.aClass77_42.method1386(5);
		}
	}
}
