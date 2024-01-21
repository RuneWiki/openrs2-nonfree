import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class2_Sub9_Sub4 extends Class2_Sub9 {

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!cb;")
	private final Class10 aClass10_112 = new Class10();

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Lclient!cb;")
	private final Class10 aClass10_113 = new Class10();

	@OriginalMember(owner = "client!w", name = "B", descriptor = "I")
	private int anInt4442 = -1;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	private int anInt4443 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4442 < 0) {
				this.method2933(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4443 + arg2 < this.anInt4442) {
				this.anInt4443 += arg2;
				this.method2933(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4442 - this.anInt4443;
			this.method2933(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4443 += local33;
			this.method2937();
			@Pc(60) Class2_Sub20 local60 = (Class2_Sub20) this.aClass10_113.method444();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2499(this);
				if (local68 < 0) {
					local60.anInt3599 = 0;
					this.method2934(local60);
				} else {
					local60.anInt3599 = local68;
					this.method2936(local60.aClass2_210, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ig;)V")
	public synchronized void method2932(@OriginalArg(0) Class2_Sub9 arg0) {
		this.aClass10_112.method447(arg0);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "([III)V")
	private void method2933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub9 local5 = (Class2_Sub9) this.aClass10_112.method444(); local5 != null; local5 = (Class2_Sub9) this.aClass10_112.method451()) {
			local5.method2929(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!sf;)V")
	private void method2934(@OriginalArg(0) Class2_Sub20 arg0) {
		arg0.method3004();
		arg0.method2498();
		@Pc(9) Class2 local9 = this.aClass10_113.aClass2_37.aClass2_210;
		if (local9 == this.aClass10_113.aClass2_37) {
			this.anInt4442 = -1;
		} else {
			this.anInt4442 = ((Class2_Sub20) local9).anInt3599;
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	private void method2935(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub9 local5 = (Class2_Sub9) this.aClass10_112.method444(); local5 != null; local5 = (Class2_Sub9) this.aClass10_112.method451()) {
			local5.method2930(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ub;Lclient!sf;)V")
	private void method2936(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		while (arg0 != this.aClass10_113.aClass2_37 && ((Class2_Sub20) arg0).anInt3599 <= arg1.anInt3599) {
			arg0 = arg0.aClass2_210;
		}
		this.aClass10_113.method450(arg0, arg1);
		this.anInt4442 = ((Class2_Sub20) this.aClass10_113.aClass2_37.aClass2_210).anInt3599;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()I")
	@Override
	public int method2931() {
		return 0;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Lclient!ig;")
	@Override
	public Class2_Sub9 method2926() {
		return (Class2_Sub9) this.aClass10_112.method451();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Lclient!ig;")
	@Override
	public Class2_Sub9 method2925() {
		return (Class2_Sub9) this.aClass10_112.method444();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2930(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4442 < 0) {
				this.method2935(arg0);
				return;
			}
			if (this.anInt4443 + arg0 < this.anInt4442) {
				this.anInt4443 += arg0;
				this.method2935(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4442 - this.anInt4443;
			this.method2935(local29);
			arg0 -= local29;
			this.anInt4443 += local29;
			this.method2937();
			@Pc(50) Class2_Sub20 local50 = (Class2_Sub20) this.aClass10_113.method444();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2499(this);
				if (local58 < 0) {
					local50.anInt3599 = 0;
					this.method2934(local50);
				} else {
					local50.anInt3599 = local58;
					this.method2936(local50.aClass2_210, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
	private void method2937() {
		if (this.anInt4443 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub20 local8 = (Class2_Sub20) this.aClass10_113.method444(); local8 != null; local8 = (Class2_Sub20) this.aClass10_113.method451()) {
			local8.anInt3599 -= this.anInt4443;
		}
		this.anInt4442 -= this.anInt4443;
		this.anInt4443 = 0;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Lclient!ig;)V")
	public synchronized void method2938(@OriginalArg(0) Class2_Sub9 arg0) {
		arg0.method3004();
	}
}
