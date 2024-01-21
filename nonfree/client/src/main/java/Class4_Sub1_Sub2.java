import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Lclient!pb;")
	private final Class61 aClass61_3 = new Class61();

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Lclient!pb;")
	private final Class61 aClass61_4 = new Class61();

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	private int anInt539 = -1;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	private int anInt538 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!sa;)V")
	private void method359(@OriginalArg(0) Class4_Sub18 arg0) {
		arg0.method2189();
		arg0.method1871();
		@Pc(9) Class4 local9 = this.aClass61_4.aClass4_85.aClass4_123;
		if (local9 == this.aClass61_4.aClass4_85) {
			this.anInt539 = -1;
		} else {
			this.anInt539 = ((Class4_Sub18) local9).anInt2591;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1533(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt539 < 0) {
				this.method365(arg0, arg1, arg2);
				return;
			}
			if (this.anInt538 + arg2 < this.anInt539) {
				this.anInt538 += arg2;
				this.method365(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt539 - this.anInt538;
			this.method365(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt538 += local33;
			this.method364();
			@Pc(60) Class4_Sub18 local60 = (Class4_Sub18) this.aClass61_4.method1628();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1872(this);
				if (local68 < 0) {
					local60.anInt2591 = 0;
					this.method359(local60);
				} else {
					local60.anInt2591 = local68;
					this.method361(local60.aClass4_123, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()Lclient!md;")
	@Override
	public Class4_Sub1 method1536() {
		return (Class4_Sub1) this.aClass61_3.method1629();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!md;)V")
	public synchronized void method360(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass61_3.method1632(arg0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!vd;Lclient!sa;)V")
	private void method361(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub18 arg1) {
		while (arg0 != this.aClass61_4.aClass4_85 && ((Class4_Sub18) arg0).anInt2591 <= arg1.anInt2591) {
			arg0 = arg0.aClass4_123;
		}
		this.aClass61_4.method1637(arg1, arg0);
		this.anInt539 = ((Class4_Sub18) this.aClass61_4.aClass4_85.aClass4_123).anInt2591;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
	@Override
	public int method1535() {
		return 0;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1534(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt539 < 0) {
				this.method362(arg0);
				return;
			}
			if (this.anInt538 + arg0 < this.anInt539) {
				this.anInt538 += arg0;
				this.method362(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt539 - this.anInt538;
			this.method362(local29);
			arg0 -= local29;
			this.anInt538 += local29;
			this.method364();
			@Pc(50) Class4_Sub18 local50 = (Class4_Sub18) this.aClass61_4.method1628();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1872(this);
				if (local58 < 0) {
					local50.anInt2591 = 0;
					this.method359(local50);
				} else {
					local50.anInt2591 = local58;
					this.method361(local50.aClass4_123, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	private void method362(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass61_3.method1628(); local5 != null; local5 = (Class4_Sub1) this.aClass61_3.method1629()) {
			local5.method1534(arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Lclient!md;)V")
	public synchronized void method363(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.method2189();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()Lclient!md;")
	@Override
	public Class4_Sub1 method1532() {
		return (Class4_Sub1) this.aClass61_3.method1628();
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "()V")
	private void method364() {
		if (this.anInt538 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub18 local8 = (Class4_Sub18) this.aClass61_4.method1628(); local8 != null; local8 = (Class4_Sub18) this.aClass61_4.method1629()) {
			local8.anInt2591 -= this.anInt538;
		}
		this.anInt539 -= this.anInt538;
		this.anInt538 = 0;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "([III)V")
	private void method365(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass61_3.method1628(); local5 != null; local5 = (Class4_Sub1) this.aClass61_3.method1629()) {
			local5.method1538(arg0, arg1, arg2);
		}
	}
}
