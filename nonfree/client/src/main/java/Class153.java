import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class153 {

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "Lclient!fc;")
	private final Class77 aClass77_34 = new Class77(256);

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "Lclient!oi;")
	private final Class185 aClass185_70;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class153(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_70 = arg2;
		this.aClass185_70.method4011(26);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Lclient!gt;")
	public Class1_Sub3_Sub9 method3523(@OriginalArg(1) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_34;
		@Pc(16) Class1_Sub3_Sub9 local16;
		synchronized (this.aClass77_34) {
			local16 = (Class1_Sub3_Sub9) this.aClass77_34.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class185 local34 = this.aClass185_70;
		@Pc(43) byte[] local43;
		synchronized (this.aClass185_70) {
			local43 = this.aClass185_70.method4002(26, arg0);
		}
		local16 = new Class1_Sub3_Sub9();
		if (local43 != null) {
			local16.method1799(new Class1_Sub19(local43));
		}
		@Pc(65) Class77 local65 = this.aClass77_34;
		synchronized (this.aClass77_34) {
			this.aClass77_34.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public void method3524() {
		@Pc(9) Class77 local9 = this.aClass77_34;
		synchronized (this.aClass77_34) {
			this.aClass77_34.method1394();
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)V")
	public void method3526() {
		@Pc(14) Class77 local14 = this.aClass77_34;
		synchronized (this.aClass77_34) {
			this.aClass77_34.method1386(5);
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V")
	public void method3527() {
		@Pc(2) Class77 local2 = this.aClass77_34;
		synchronized (this.aClass77_34) {
			this.aClass77_34.method1395();
		}
	}
}
