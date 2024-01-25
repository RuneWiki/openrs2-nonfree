import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class164 {

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!hn;")
	private final Class102 aClass102_35 = new Class102(16);

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!fo;")
	private final Class82 aClass82_63;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class164(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_63 = arg2;
		this.aClass82_63.method1823(30);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public void method3756() {
		@Pc(2) Class102 local2 = this.aClass102_35;
		synchronized (this.aClass102_35) {
			this.aClass102_35.method2271();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
	public void method3757() {
		@Pc(14) Class102 local14 = this.aClass102_35;
		synchronized (this.aClass102_35) {
			this.aClass102_35.method2262(5);
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Lclient!fm;")
	public Class80 method3758(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_35;
		@Pc(16) Class80 local16;
		synchronized (this.aClass102_35) {
			local16 = (Class80) this.aClass102_35.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class82 local35 = this.aClass82_63;
		@Pc(44) byte[] local44;
		synchronized (this.aClass82_63) {
			local44 = this.aClass82_63.method1817(30, arg0);
		}
		local16 = new Class80();
		if (local44 != null) {
			local16.method1802(new Class1_Sub28(local44));
		}
		@Pc(66) Class102 local66 = this.aClass102_35;
		synchronized (this.aClass102_35) {
			this.aClass102_35.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	public void method3759() {
		@Pc(2) Class102 local2 = this.aClass102_35;
		synchronized (this.aClass102_35) {
			this.aClass102_35.method2260();
		}
	}
}
