import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub5_Sub3 extends Class2_Sub5 {

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!cf;")
	private final Class12 aClass12_14 = new Class12();

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Lclient!cf;")
	private final Class12 aClass12_15 = new Class12();

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	private int anInt3678 = -1;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	private int anInt3677 = 0;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	private void method2610(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub5 local5 = (Class2_Sub5) this.aClass12_14.method384(); local5 != null; local5 = (Class2_Sub5) this.aClass12_14.method381()) {
			local5.method2653(arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
	private void method2611() {
		if (this.anInt3677 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub13 local8 = (Class2_Sub13) this.aClass12_15.method384(); local8 != null; local8 = (Class2_Sub13) this.aClass12_15.method381()) {
			local8.anInt2260 -= this.anInt3677;
		}
		this.anInt3678 -= this.anInt3677;
		this.anInt3677 = 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!nb;)V")
	public synchronized void method2612(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aClass12_14.method388(arg0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!se;Lclient!lh;)V")
	private void method2613(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		while (arg0 != this.aClass12_15.aClass2_35 && ((Class2_Sub13) arg0).anInt2260 <= arg1.anInt2260) {
			arg0 = arg0.aClass2_207;
		}
		this.aClass12_15.method378(arg0, arg1);
		this.anInt3678 = ((Class2_Sub13) this.aClass12_15.aClass2_35.aClass2_207).anInt2260;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!lh;)V")
	private void method2614(@OriginalArg(0) Class2_Sub13 arg0) {
		arg0.method2705();
		arg0.method1594();
		@Pc(9) Class2 local9 = this.aClass12_15.aClass2_35.aClass2_207;
		if (local9 == this.aClass12_15.aClass2_35) {
			this.anInt3678 = -1;
		} else {
			this.anInt3678 = ((Class2_Sub13) local9).anInt2260;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lclient!nb;)V")
	public synchronized void method2615(@OriginalArg(0) Class2_Sub5 arg0) {
		arg0.method2705();
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()I")
	@Override
	public int method2657() {
		return 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2651(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3678 < 0) {
				this.method2616(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3677 + arg2 < this.anInt3678) {
				this.anInt3677 += arg2;
				this.method2616(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3678 - this.anInt3677;
			this.method2616(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3677 += local33;
			this.method2611();
			@Pc(60) Class2_Sub13 local60 = (Class2_Sub13) this.aClass12_15.method384();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1595(this);
				if (local68 < 0) {
					local60.anInt2260 = 0;
					this.method2614(local60);
				} else {
					local60.anInt2260 = local68;
					this.method2613(local60.aClass2_207, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()Lclient!nb;")
	@Override
	public Class2_Sub5 method2652() {
		return (Class2_Sub5) this.aClass12_14.method384();
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "([III)V")
	private void method2616(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub5 local5 = (Class2_Sub5) this.aClass12_14.method384(); local5 != null; local5 = (Class2_Sub5) this.aClass12_14.method381()) {
			local5.method2654(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()Lclient!nb;")
	@Override
	public Class2_Sub5 method2655() {
		return (Class2_Sub5) this.aClass12_14.method381();
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2653(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3678 < 0) {
				this.method2610(arg0);
				return;
			}
			if (this.anInt3677 + arg0 < this.anInt3678) {
				this.anInt3677 += arg0;
				this.method2610(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3678 - this.anInt3677;
			this.method2610(local29);
			arg0 -= local29;
			this.anInt3677 += local29;
			this.method2611();
			@Pc(50) Class2_Sub13 local50 = (Class2_Sub13) this.aClass12_15.method384();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1595(this);
				if (local58 < 0) {
					local50.anInt2260 = 0;
					this.method2614(local50);
				} else {
					local50.anInt2260 = local58;
					this.method2613(local50.aClass2_207, local50);
				}
			}
		} while (arg0 != 0);
	}
}
