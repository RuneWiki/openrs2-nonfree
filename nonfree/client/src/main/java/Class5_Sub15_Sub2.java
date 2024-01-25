import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class5_Sub15_Sub2 extends Class5_Sub15 {

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "Lclient!fea;")
	private final Class99 aClass99_50 = new Class99();

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Lclient!fea;")
	private final Class99 aClass99_51 = new Class99();

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	private int anInt5869 = 0;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	private int anInt5870 = -1;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "()Lclient!ps;")
	@Override
	public Class5_Sub15 method6511() {
		return (Class5_Sub15) this.aClass99_50.method2519();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ps;)V")
	public synchronized void method4866(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aClass99_50.method2514(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6510(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5870 < 0) {
				this.method4869(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5869 + arg2 < this.anInt5870) {
				this.anInt5869 += arg2;
				this.method4869(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5870 - this.anInt5869;
			this.method4869(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5869 += local33;
			this.method4870();
			@Pc(60) Class5_Sub6 local60 = (Class5_Sub6) this.aClass99_51.method2526();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method636(this);
				if (local68 < 0) {
					local60.anInt502 = 0;
					this.method4867(local60);
				} else {
					local60.anInt502 = local68;
					this.method4868(local60.aClass5_284, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "()I")
	@Override
	public int method6508() {
		return 0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!av;)V")
	private void method4867(@OriginalArg(0) Class5_Sub6 arg0) {
		arg0.method7425();
		arg0.method637();
		@Pc(9) Class5 local9 = this.aClass99_51.aClass5_102.aClass5_284;
		if (local9 == this.aClass99_51.aClass5_102) {
			this.anInt5870 = -1;
		} else {
			this.anInt5870 = ((Class5_Sub6) local9).anInt502;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!um;Lclient!av;)V")
	private void method4868(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub6 arg1) {
		while (arg0 != this.aClass99_51.aClass5_102 && ((Class5_Sub6) arg0).anInt502 <= arg1.anInt502) {
			arg0 = arg0.aClass5_284;
		}
		Static135.method2553(arg0, arg1);
		this.anInt5870 = ((Class5_Sub6) this.aClass99_51.aClass5_102.aClass5_284).anInt502;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "([III)V")
	private void method4869(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub15 local5 = (Class5_Sub15) this.aClass99_50.method2526(); local5 != null; local5 = (Class5_Sub15) this.aClass99_50.method2519()) {
			local5.method6507(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "()V")
	private void method4870() {
		if (this.anInt5869 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub6 local8 = (Class5_Sub6) this.aClass99_51.method2526(); local8 != null; local8 = (Class5_Sub6) this.aClass99_51.method2519()) {
			local8.anInt502 -= this.anInt5869;
		}
		this.anInt5870 -= this.anInt5869;
		this.anInt5869 = 0;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lclient!ps;)V")
	public synchronized void method4871(@OriginalArg(0) Class5_Sub15 arg0) {
		arg0.method7425();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "()Lclient!ps;")
	@Override
	public Class5_Sub15 method6506() {
		return (Class5_Sub15) this.aClass99_50.method2526();
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "()I")
	public synchronized int method4872() {
		return this.aClass99_50.method2518();
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	private void method4873(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub15 local5 = (Class5_Sub15) this.aClass99_50.method2526(); local5 != null; local5 = (Class5_Sub15) this.aClass99_50.method2519()) {
			local5.method6505(arg0);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6505(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5870 < 0) {
				this.method4873(arg0);
				return;
			}
			if (this.anInt5869 + arg0 < this.anInt5870) {
				this.anInt5869 += arg0;
				this.method4873(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5870 - this.anInt5869;
			this.method4873(local29);
			arg0 -= local29;
			this.anInt5869 += local29;
			this.method4870();
			@Pc(50) Class5_Sub6 local50 = (Class5_Sub6) this.aClass99_51.method2526();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method636(this);
				if (local58 < 0) {
					local50.anInt502 = 0;
					this.method4867(local50);
				} else {
					local50.anInt502 = local58;
					this.method4868(local50.aClass5_284, local50);
				}
			}
		} while (arg0 != 0);
	}
}
