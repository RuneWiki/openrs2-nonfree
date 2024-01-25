import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class97 {

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Lclient!fc;")
	private final Class77 aClass77_22 = new Class77(64);

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!oi;")
	public final Class185 aClass185_38;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "Lclient!oi;")
	private final Class185 aClass185_39;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;Lclient!oi;)V")
	public Class97(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) Class185 arg3) {
		this.aClass185_38 = arg3;
		this.aClass185_39 = arg2;
		this.aClass185_39.method4011(3);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)V")
	public void method1754() {
		@Pc(12) Class77 local12 = this.aClass77_22;
		synchronized (this.aClass77_22) {
			this.aClass77_22.method1386(5);
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public void method1756() {
		@Pc(10) Class77 local10 = this.aClass77_22;
		synchronized (this.aClass77_22) {
			this.aClass77_22.method1394();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lclient!uq;")
	public Class255 method1757(@OriginalArg(1) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_22;
		@Pc(16) Class255 local16;
		synchronized (this.aClass77_22) {
			local16 = (Class255) this.aClass77_22.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_39;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_39) {
			local38 = this.aClass185_39.method4002(3, arg0);
		}
		local16 = new Class255();
		local16.aClass97_2 = this;
		if (local38 != null) {
			local16.method5353(new Class1_Sub19(local38));
		}
		@Pc(63) Class77 local63 = this.aClass77_22;
		synchronized (this.aClass77_22) {
			this.aClass77_22.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V")
	public void method1758() {
		@Pc(6) Class77 local6 = this.aClass77_22;
		synchronized (this.aClass77_22) {
			this.aClass77_22.method1395();
		}
	}
}
