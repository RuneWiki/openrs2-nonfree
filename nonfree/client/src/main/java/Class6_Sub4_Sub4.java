import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class6_Sub4_Sub4 extends Class6_Sub4 {

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!um;")
	private final Class244 aClass244_41 = new Class244();

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "Lclient!um;")
	private final Class244 aClass244_42 = new Class244();

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
	private int anInt7168 = 0;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
	private int anInt7167 = -1;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!cb;)V")
	public synchronized void method5905(@OriginalArg(0) Class6_Sub4 arg0) {
		this.aClass244_41.method5972(arg0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!cg;Lclient!od;)V")
	private void method5906(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub28 arg1) {
		while (arg0 != this.aClass244_42.aClass6_220 && ((Class6_Sub28) arg0).anInt5098 <= arg1.anInt5098) {
			arg0 = arg0.aClass6_252;
		}
		Static202.method3124(arg1, arg0);
		this.anInt7167 = ((Class6_Sub28) this.aClass244_42.aClass6_220.aClass6_252).anInt5098;
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "()Lclient!cb;")
	@Override
	public Class6_Sub4 method5904() {
		return (Class6_Sub4) this.aClass244_41.method5976();
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lclient!cb;)V")
	public synchronized void method5907(@OriginalArg(0) Class6_Sub4 arg0) {
		arg0.method6525();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "()I")
	@Override
	public int method5900() {
		return 0;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "()Lclient!cb;")
	@Override
	public Class6_Sub4 method5901() {
		return (Class6_Sub4) this.aClass244_41.method5964();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!od;)V")
	private void method5908(@OriginalArg(0) Class6_Sub28 arg0) {
		arg0.method6525();
		arg0.method4271();
		@Pc(9) Class6 local9 = this.aClass244_42.aClass6_220.aClass6_252;
		if (local9 == this.aClass244_42.aClass6_220) {
			this.anInt7167 = -1;
		} else {
			this.anInt7167 = ((Class6_Sub28) local9).anInt5098;
		}
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "()I")
	public synchronized int method5909() {
		return this.aClass244_41.method5965();
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "([III)V")
	private void method5910(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub4 local5 = (Class6_Sub4) this.aClass244_41.method5976(); local5 != null; local5 = (Class6_Sub4) this.aClass244_41.method5964()) {
			local5.method5903(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
	private void method5911(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub4 local5 = (Class6_Sub4) this.aClass244_41.method5976(); local5 != null; local5 = (Class6_Sub4) this.aClass244_41.method5964()) {
			local5.method5899(arg0);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5899(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7167 < 0) {
				this.method5911(arg0);
				return;
			}
			if (this.anInt7168 + arg0 < this.anInt7167) {
				this.anInt7168 += arg0;
				this.method5911(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7167 - this.anInt7168;
			this.method5911(local29);
			arg0 -= local29;
			this.anInt7168 += local29;
			this.method5912();
			@Pc(50) Class6_Sub28 local50 = (Class6_Sub28) this.aClass244_42.method5976();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4270(this);
				if (local58 < 0) {
					local50.anInt5098 = 0;
					this.method5908(local50);
				} else {
					local50.anInt5098 = local58;
					this.method5906(local50.aClass6_252, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5898(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7167 < 0) {
				this.method5910(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7168 + arg2 < this.anInt7167) {
				this.anInt7168 += arg2;
				this.method5910(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7167 - this.anInt7168;
			this.method5910(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7168 += local33;
			this.method5912();
			@Pc(60) Class6_Sub28 local60 = (Class6_Sub28) this.aClass244_42.method5976();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4270(this);
				if (local68 < 0) {
					local60.anInt5098 = 0;
					this.method5908(local60);
				} else {
					local60.anInt5098 = local68;
					this.method5906(local60.aClass6_252, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "()V")
	private void method5912() {
		if (this.anInt7168 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub28 local8 = (Class6_Sub28) this.aClass244_42.method5976(); local8 != null; local8 = (Class6_Sub28) this.aClass244_42.method5964()) {
			local8.anInt5098 -= this.anInt7168;
		}
		this.anInt7167 -= this.anInt7168;
		this.anInt7168 = 0;
	}
}
