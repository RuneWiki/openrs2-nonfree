import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub10_Sub4 extends Class2_Sub10 {

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "Lclient!vb;")
	private final Class84 aClass84_15 = new Class84();

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "Lclient!vb;")
	private final Class84 aClass84_16 = new Class84();

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
	private int anInt4054 = 0;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
	private int anInt4055 = -1;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!be;)V")
	private void method2744(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.method2808();
		arg0.method217();
		@Pc(9) Class2 local9 = this.aClass84_16.aClass2_201.aClass2_209;
		if (local9 == this.aClass84_16.aClass2_201) {
			this.anInt4055 = -1;
		} else {
			this.anInt4055 = ((Class2_Sub6) local9).anInt343;
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "()I")
	@Override
	public int method2743() {
		return 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!tf;)V")
	public synchronized void method2745(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aClass84_15.method2702(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2742(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4055 < 0) {
				this.method2748(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4054 + arg2 < this.anInt4055) {
				this.anInt4054 += arg2;
				this.method2748(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4055 - this.anInt4054;
			this.method2748(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4054 += local33;
			this.method2750();
			@Pc(60) Class2_Sub6 local60 = (Class2_Sub6) this.aClass84_16.method2694();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method216(this);
				if (local68 < 0) {
					local60.anInt343 = 0;
					this.method2744(local60);
				} else {
					local60.anInt343 = local68;
					this.method2749(local60.aClass2_209, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
	private void method2746(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub10 local5 = (Class2_Sub10) this.aClass84_15.method2694(); local5 != null; local5 = (Class2_Sub10) this.aClass84_15.method2697()) {
			local5.method2741(arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Lclient!tf;)V")
	public synchronized void method2747(@OriginalArg(0) Class2_Sub10 arg0) {
		arg0.method2808();
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "()Lclient!tf;")
	@Override
	public Class2_Sub10 method2738() {
		return (Class2_Sub10) this.aClass84_15.method2697();
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "([III)V")
	private void method2748(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub10 local5 = (Class2_Sub10) this.aClass84_15.method2694(); local5 != null; local5 = (Class2_Sub10) this.aClass84_15.method2697()) {
			local5.method2740(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!na;Lclient!be;)V")
	private void method2749(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		while (arg0 != this.aClass84_16.aClass2_201 && ((Class2_Sub6) arg0).anInt343 <= arg1.anInt343) {
			arg0 = arg0.aClass2_209;
		}
		this.aClass84_16.method2693(arg0, arg1);
		this.anInt4055 = ((Class2_Sub6) this.aClass84_16.aClass2_201.aClass2_209).anInt343;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "()Lclient!tf;")
	@Override
	public Class2_Sub10 method2737() {
		return (Class2_Sub10) this.aClass84_15.method2694();
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2741(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4055 < 0) {
				this.method2746(arg0);
				return;
			}
			if (this.anInt4054 + arg0 < this.anInt4055) {
				this.anInt4054 += arg0;
				this.method2746(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4055 - this.anInt4054;
			this.method2746(local29);
			arg0 -= local29;
			this.anInt4054 += local29;
			this.method2750();
			@Pc(50) Class2_Sub6 local50 = (Class2_Sub6) this.aClass84_16.method2694();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method216(this);
				if (local58 < 0) {
					local50.anInt343 = 0;
					this.method2744(local50);
				} else {
					local50.anInt343 = local58;
					this.method2749(local50.aClass2_209, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "()V")
	private void method2750() {
		if (this.anInt4054 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub6 local8 = (Class2_Sub6) this.aClass84_16.method2694(); local8 != null; local8 = (Class2_Sub6) this.aClass84_16.method2697()) {
			local8.anInt343 -= this.anInt4054;
		}
		this.anInt4055 -= this.anInt4054;
		this.anInt4054 = 0;
	}
}
