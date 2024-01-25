import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class123 {

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
	public int anInt3417;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Lclient!fc;")
	private final Class77 aClass77_23 = new Class77(64);

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "Lclient!fc;")
	public final Class77 aClass77_24 = new Class77(30);

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "Lclient!oi;")
	public final Class185 aClass185_51;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "Lclient!oi;")
	private final Class185 aClass185_50;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;Lclient!oi;)V")
	public Class123(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) Class185 arg3) {
		this.aClass185_51 = arg3;
		this.aClass185_50 = arg2;
		@Pc(26) int local26 = this.aClass185_50.method4010() - 1;
		this.aClass185_50.method4011(local26);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	public void method2675() {
		@Pc(12) Class77 local12 = this.aClass77_23;
		synchronized (this.aClass77_23) {
			this.aClass77_23.method1395();
		}
		local12 = this.aClass77_24;
		synchronized (this.aClass77_24) {
			this.aClass77_24.method1395();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)V")
	public void method2676(@OriginalArg(1) int arg0) {
		this.anInt3417 = arg0;
		@Pc(9) Class77 local9 = this.aClass77_24;
		synchronized (this.aClass77_24) {
			this.aClass77_24.method1395();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)Lclient!ip;")
	public Class121 method2677(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_23;
		@Pc(16) Class121 local16;
		synchronized (this.aClass77_23) {
			local16 = (Class121) this.aClass77_23.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class185 local36 = this.aClass185_50;
		@Pc(49) byte[] local49;
		synchronized (this.aClass185_50) {
			local49 = this.aClass185_50.method4002(Static257.method3602(arg0), Static300.method4012(arg0));
		}
		local16 = new Class121();
		local16.aClass123_4 = this;
		local16.anInt3209 = arg0;
		if (local49 != null) {
			local16.method2600(new Class1_Sub19(local49));
		}
		@Pc(77) Class77 local77 = this.aClass77_23;
		synchronized (this.aClass77_23) {
			this.aClass77_23.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	public void method2678() {
		@Pc(6) Class77 local6 = this.aClass77_23;
		synchronized (this.aClass77_23) {
			this.aClass77_23.method1394();
		}
		local6 = this.aClass77_24;
		synchronized (this.aClass77_24) {
			this.aClass77_24.method1394();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZ)V")
	public void method2681() {
		@Pc(6) Class77 local6 = this.aClass77_23;
		synchronized (this.aClass77_23) {
			this.aClass77_23.method1386(5);
		}
		local6 = this.aClass77_24;
		synchronized (this.aClass77_24) {
			this.aClass77_24.method1386(5);
		}
	}
}
