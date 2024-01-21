import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class3_Sub5_Sub3 extends Class3_Sub5 {

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!nd;")
	private final Class59 aClass59_10 = new Class59();

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Lclient!nd;")
	private final Class59 aClass59_11 = new Class59();

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	private int anInt3368 = 0;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	private int anInt3369 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ee;Lclient!ff;)V")
	private void method2449(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		while (arg0 != this.aClass59_11.aClass3_119 && ((Class3_Sub8) arg0).anInt1270 <= arg1.anInt1270) {
			arg0 = arg0.aClass3_209;
		}
		this.aClass59_11.method1729(arg0, arg1);
		this.anInt3369 = ((Class3_Sub8) this.aClass59_11.aClass3_119.aClass3_209).anInt1270;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	private void method2450(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub5 local5 = (Class3_Sub5) this.aClass59_10.method1731(); local5 != null; local5 = (Class3_Sub5) this.aClass59_10.method1734()) {
			local5.method2769(arg0);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2773(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3369 < 0) {
				this.method2453(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3368 + arg2 < this.anInt3369) {
				this.anInt3368 += arg2;
				this.method2453(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3369 - this.anInt3368;
			this.method2453(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3368 += local33;
			this.method2452();
			@Pc(60) Class3_Sub8 local60 = (Class3_Sub8) this.aClass59_11.method1731();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method922(this);
				if (local68 < 0) {
					local60.anInt1270 = 0;
					this.method2454(local60);
				} else {
					local60.anInt1270 = local68;
					this.method2449(local60.aClass3_209, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!le;)V")
	public synchronized void method2451(@OriginalArg(0) Class3_Sub5 arg0) {
		arg0.method2900();
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()Lclient!le;")
	@Override
	public Class3_Sub5 method2774() {
		return (Class3_Sub5) this.aClass59_10.method1731();
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "()V")
	private void method2452() {
		if (this.anInt3368 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub8 local8 = (Class3_Sub8) this.aClass59_11.method1731(); local8 != null; local8 = (Class3_Sub8) this.aClass59_11.method1734()) {
			local8.anInt1270 -= this.anInt3368;
		}
		this.anInt3369 -= this.anInt3368;
		this.anInt3368 = 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method2770() {
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "([III)V")
	private void method2453(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub5 local5 = (Class3_Sub5) this.aClass59_10.method1731(); local5 != null; local5 = (Class3_Sub5) this.aClass59_10.method1734()) {
			local5.method2771(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ff;)V")
	private void method2454(@OriginalArg(0) Class3_Sub8 arg0) {
		arg0.method2900();
		arg0.method921();
		@Pc(9) Class3 local9 = this.aClass59_11.aClass3_119.aClass3_209;
		if (local9 == this.aClass59_11.aClass3_119) {
			this.anInt3369 = -1;
		} else {
			this.anInt3369 = ((Class3_Sub8) local9).anInt1270;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!le;)V")
	public synchronized void method2455(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aClass59_10.method1738(arg0);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2769(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3369 < 0) {
				this.method2450(arg0);
				return;
			}
			if (this.anInt3368 + arg0 < this.anInt3369) {
				this.anInt3368 += arg0;
				this.method2450(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3369 - this.anInt3368;
			this.method2450(local29);
			arg0 -= local29;
			this.anInt3368 += local29;
			this.method2452();
			@Pc(50) Class3_Sub8 local50 = (Class3_Sub8) this.aClass59_11.method1731();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method922(this);
				if (local58 < 0) {
					local50.anInt1270 = 0;
					this.method2454(local50);
				} else {
					local50.anInt1270 = local58;
					this.method2449(local50.aClass3_209, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()Lclient!le;")
	@Override
	public Class3_Sub5 method2775() {
		return (Class3_Sub5) this.aClass59_10.method1734();
	}
}
