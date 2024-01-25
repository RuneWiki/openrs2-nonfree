import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class151 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!hn;")
	private final Class102 aClass102_29 = new Class102(64);

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!fo;")
	private final Class82 aClass82_56;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public final int anInt4434;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class151(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_56 = arg2;
		if (this.aClass82_56 == null) {
			this.anInt4434 = 0;
		} else {
			this.anInt4434 = this.aClass82_56.method1823(16);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public void method3510() {
		@Pc(2) Class102 local2 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2262(5);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method3511() {
		@Pc(2) Class102 local2 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2271();
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)Lclient!qo;")
	public Class203 method3512(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_29;
		@Pc(18) Class203 local18;
		synchronized (this.aClass102_29) {
			local18 = (Class203) this.aClass102_29.method2258((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class82 local31 = this.aClass82_56;
		@Pc(42) byte[] local42;
		synchronized (this.aClass82_56) {
			local42 = this.aClass82_56.method1817(16, arg0);
		}
		local18 = new Class203();
		if (local42 != null) {
			local18.method4491(new Class1_Sub28(local42));
		}
		@Pc(64) Class102 local64 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2272((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public void method3514() {
		@Pc(6) Class102 local6 = this.aClass102_29;
		synchronized (this.aClass102_29) {
			this.aClass102_29.method2260();
		}
	}
}
