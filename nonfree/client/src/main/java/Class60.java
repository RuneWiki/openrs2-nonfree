import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class60 {

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!fc;")
	private final Class77 aClass77_14 = new Class77(128);

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!oi;")
	private final Class185 aClass185_25;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class60(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_25 = arg2;
		this.aClass185_25.method4011(1);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)V")
	public void method967() {
		@Pc(6) Class77 local6 = this.aClass77_14;
		synchronized (this.aClass77_14) {
			this.aClass77_14.method1386(5);
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public void method969() {
		@Pc(14) Class77 local14 = this.aClass77_14;
		synchronized (this.aClass77_14) {
			this.aClass77_14.method1395();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZ)Lclient!ae;")
	public Class6 method970(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_14;
		@Pc(22) Class6 local22;
		synchronized (this.aClass77_14) {
			local22 = (Class6) this.aClass77_14.method1387((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class185 local35 = this.aClass185_25;
		@Pc(44) byte[] local44;
		synchronized (this.aClass185_25) {
			local44 = this.aClass185_25.method4002(1, arg0);
		}
		local22 = new Class6();
		if (local44 != null) {
			local22.method48(new Class1_Sub19(local44));
		}
		@Pc(66) Class77 local66 = this.aClass77_14;
		synchronized (this.aClass77_14) {
			this.aClass77_14.method1396(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
	public void method971() {
		@Pc(14) Class77 local14 = this.aClass77_14;
		synchronized (this.aClass77_14) {
			this.aClass77_14.method1394();
		}
	}
}
