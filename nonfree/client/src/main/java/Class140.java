import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class140 {

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!dc;")
	private final Class44 aClass44_27 = new Class44(128);

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!he;")
	private final Class100 aClass100_36;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class140(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_36 = arg2;
		this.aClass100_36.method2523(1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public void method3142() {
		@Pc(6) Class44 local6 = this.aClass44_27;
		synchronized (this.aClass44_27) {
			this.aClass44_27.method1352(5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method3143() {
		@Pc(6) Class44 local6 = this.aClass44_27;
		synchronized (this.aClass44_27) {
			this.aClass44_27.method1348();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)Lclient!gr;")
	public Class95 method3145(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_27;
		@Pc(23) Class95 local23;
		synchronized (this.aClass44_27) {
			local23 = (Class95) this.aClass44_27.method1353((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(40) byte[] local40 = this.aClass100_36.method2520(arg0, 1);
		local23 = new Class95();
		if (local40 != null) {
			local23.method2411(new Class6_Sub1(local40));
		}
		@Pc(56) Class44 local56 = this.aClass44_27;
		synchronized (this.aClass44_27) {
			this.aClass44_27.method1349(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method3148() {
		@Pc(2) Class44 local2 = this.aClass44_27;
		synchronized (this.aClass44_27) {
			this.aClass44_27.method1351();
		}
	}
}
