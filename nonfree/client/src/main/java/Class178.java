import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class178 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Lclient!hn;")
	private Class102 aClass102_37 = new Class102(128);

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "Lclient!hn;")
	public Class102 aClass102_38 = new Class102(64);

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "Lclient!fo;")
	public final Class82 aClass82_70;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!fo;")
	private final Class82 aClass82_69;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;Lclient!fo;)V")
	public Class178(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class82 arg3) {
		this.aClass82_70 = arg3;
		this.aClass82_69 = arg2;
		this.aClass82_69.method1823(36);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public void method3961() {
		@Pc(6) Class102 local6 = this.aClass102_37;
		synchronized (this.aClass102_37) {
			this.aClass102_37.method2271();
		}
		local6 = this.aClass102_38;
		synchronized (this.aClass102_38) {
			this.aClass102_38.method2271();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lclient!qr;")
	public Class205 method3963(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_37;
		@Pc(16) Class205 local16;
		synchronized (this.aClass102_37) {
			local16 = (Class205) this.aClass102_37.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class82 local34 = this.aClass82_69;
		@Pc(43) byte[] local43;
		synchronized (this.aClass82_69) {
			local43 = this.aClass82_69.method1817(36, arg0);
		}
		local16 = new Class205();
		local16.anInt5742 = arg0;
		local16.aClass178_3 = this;
		if (local43 != null) {
			local16.method4520(new Class1_Sub28(local43));
		}
		local16.method4517();
		@Pc(74) Class102 local74 = this.aClass102_37;
		synchronized (this.aClass102_37) {
			this.aClass102_37.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
	public void method3964() {
		@Pc(14) Class102 local14 = this.aClass102_37;
		synchronized (this.aClass102_37) {
			this.aClass102_37.method2262(5);
		}
		local14 = this.aClass102_38;
		synchronized (this.aClass102_38) {
			this.aClass102_38.method2262(5);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
	public void method3965() {
		@Pc(6) Class102 local6 = this.aClass102_37;
		synchronized (this.aClass102_37) {
			this.aClass102_37.method2260();
		}
		local6 = this.aClass102_38;
		synchronized (this.aClass102_38) {
			this.aClass102_38.method2260();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)V")
	public void method3967(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass102_37 = new Class102(arg1);
		this.aClass102_38 = new Class102(arg0);
	}
}
