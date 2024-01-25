import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class26 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "Lclient!hn;")
	private final Class102 aClass102_7 = new Class102(64);

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!fo;")
	private final Class82 aClass82_7;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class26(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_7 = arg2;
		this.aClass82_7.method1823(31);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Lclient!oh;")
	public Class176 method569(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_7;
		@Pc(16) Class176 local16;
		synchronized (this.aClass102_7) {
			local16 = (Class176) this.aClass102_7.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_7;
		@Pc(47) byte[] local47;
		synchronized (this.aClass82_7) {
			local47 = this.aClass82_7.method1817(31, arg0);
		}
		local16 = new Class176();
		if (local47 != null) {
			local16.method3946(new Class1_Sub28(local47));
		}
		@Pc(71) Class102 local71 = this.aClass102_7;
		synchronized (this.aClass102_7) {
			this.aClass102_7.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public void method570() {
		@Pc(14) Class102 local14 = this.aClass102_7;
		synchronized (this.aClass102_7) {
			this.aClass102_7.method2260();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public void method571() {
		@Pc(2) Class102 local2 = this.aClass102_7;
		synchronized (this.aClass102_7) {
			this.aClass102_7.method2271();
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)V")
	public void method573() {
		@Pc(11) Class102 local11 = this.aClass102_7;
		synchronized (this.aClass102_7) {
			this.aClass102_7.method2262(5);
		}
	}
}
