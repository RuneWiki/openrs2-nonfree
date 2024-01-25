import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class3_Sub8_Sub2 extends Class3_Sub8 {

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Lclient!kr;")
	private final Class138 aClass138_11 = new Class138();

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "Lclient!kr;")
	private final Class138 aClass138_12 = new Class138();

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
	private int anInt2057 = 0;

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
	private int anInt2056 = -1;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ah;Lclient!jp;)V")
	private void method1706(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub24 arg1) {
		while (arg0 != this.aClass138_12.aClass3_137 && ((Class3_Sub24) arg0).anInt3047 <= arg1.anInt3047) {
			arg0 = arg0.aClass3_243;
		}
		Static191.method3041(arg1, arg0);
		this.anInt2056 = ((Class3_Sub24) this.aClass138_12.aClass3_137.aClass3_243).anInt3047;
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "()V")
	private void method1707() {
		if (this.anInt2057 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub24 local8 = (Class3_Sub24) this.aClass138_12.method3051(); local8 != null; local8 = (Class3_Sub24) this.aClass138_12.method3050()) {
			local8.anInt3047 -= this.anInt2057;
		}
		this.anInt2056 -= this.anInt2057;
		this.anInt2057 = 0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!jp;)V")
	private void method1708(@OriginalArg(0) Class3_Sub24 arg0) {
		arg0.method5700();
		arg0.method2689();
		@Pc(9) Class3 local9 = this.aClass138_12.aClass3_137.aClass3_243;
		if (local9 == this.aClass138_12.aClass3_137) {
			this.anInt2056 = -1;
		} else {
			this.anInt2056 = ((Class3_Sub24) local9).anInt3047;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2131(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2056 < 0) {
				this.method1709(arg0);
				return;
			}
			if (this.anInt2057 + arg0 < this.anInt2056) {
				this.anInt2057 += arg0;
				this.method1709(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2056 - this.anInt2057;
			this.method1709(local29);
			arg0 -= local29;
			this.anInt2057 += local29;
			this.method1707();
			@Pc(50) Class3_Sub24 local50 = (Class3_Sub24) this.aClass138_12.method3051();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2690(this);
				if (local58 < 0) {
					local50.anInt3047 = 0;
					this.method1708(local50);
				} else {
					local50.anInt3047 = local58;
					this.method1706(local50.aClass3_243, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
	private void method1709(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub8 local5 = (Class3_Sub8) this.aClass138_11.method3051(); local5 != null; local5 = (Class3_Sub8) this.aClass138_11.method3050()) {
			local5.method2131(arg0);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()I")
	@Override
	public int method2125() {
		return 0;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2056 < 0) {
				this.method1711(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2057 + arg2 < this.anInt2056) {
				this.anInt2057 += arg2;
				this.method1711(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2056 - this.anInt2057;
			this.method1711(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2057 += local33;
			this.method1707();
			@Pc(60) Class3_Sub24 local60 = (Class3_Sub24) this.aClass138_12.method3051();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2690(this);
				if (local68 < 0) {
					local60.anInt3047 = 0;
					this.method1708(local60);
				} else {
					local60.anInt3047 = local68;
					this.method1706(local60.aClass3_243, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "()Lclient!me;")
	@Override
	public Class3_Sub8 method2128() {
		return (Class3_Sub8) this.aClass138_11.method3051();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!me;)V")
	public synchronized void method1710(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aClass138_11.method3054(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "([III)V")
	private void method1711(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub8 local5 = (Class3_Sub8) this.aClass138_11.method3051(); local5 != null; local5 = (Class3_Sub8) this.aClass138_11.method3050()) {
			local5.method2127(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "()Lclient!me;")
	@Override
	public Class3_Sub8 method2126() {
		return (Class3_Sub8) this.aClass138_11.method3050();
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lclient!me;)V")
	public synchronized void method1712(@OriginalArg(0) Class3_Sub8 arg0) {
		arg0.method5700();
	}
}
