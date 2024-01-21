import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Lclient!ac;")
	private final Class3 aClass3_9 = new Class3();

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "Lclient!ac;")
	private final Class3 aClass3_10 = new Class3();

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
	private int anInt1714 = -1;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
	private int anInt1715 = 0;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	private void method1133(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub5 local5 = (Class2_Sub5) this.aClass3_9.method82(); local5 != null; local5 = (Class2_Sub5) this.aClass3_9.method74()) {
			local5.method1959(arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()V")
	private void method1134() {
		if (this.anInt1715 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub2 local8 = (Class2_Sub2) this.aClass3_10.method82(); local8 != null; local8 = (Class2_Sub2) this.aClass3_10.method74()) {
			local8.anInt169 -= this.anInt1715;
		}
		this.anInt1714 -= this.anInt1715;
		this.anInt1715 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!af;)V")
	private void method1135(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method2209();
		arg0.method139();
		@Pc(9) Class2 local9 = this.aClass3_10.aClass2_9.aClass2_128;
		if (local9 == this.aClass3_10.aClass2_9) {
			this.anInt1714 = -1;
		} else {
			this.anInt1714 = ((Class2_Sub2) local9).anInt169;
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "([III)V")
	private void method1136(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub5 local5 = (Class2_Sub5) this.aClass3_9.method82(); local5 != null; local5 = (Class2_Sub5) this.aClass3_9.method74()) {
			local5.method1956(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!d;)V")
	public synchronized void method1137(@OriginalArg(0) Class2_Sub5 arg0) {
		arg0.method2209();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()Lclient!d;")
	@Override
	public Class2_Sub5 method1954() {
		return (Class2_Sub5) this.aClass3_9.method74();
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1959(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1714 < 0) {
				this.method1133(arg0);
				return;
			}
			if (this.anInt1715 + arg0 < this.anInt1714) {
				this.anInt1715 += arg0;
				this.method1133(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1714 - this.anInt1715;
			this.method1133(local29);
			arg0 -= local29;
			this.anInt1715 += local29;
			this.method1134();
			@Pc(50) Class2_Sub2 local50 = (Class2_Sub2) this.aClass3_10.method82();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method138(this);
				if (local58 < 0) {
					local50.anInt169 = 0;
					this.method1135(local50);
				} else {
					local50.anInt169 = local58;
					this.method1139(local50.aClass2_128, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Lclient!d;)V")
	public synchronized void method1138(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aClass3_9.method84(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()I")
	@Override
	public int method1955() {
		return 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1957(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1714 < 0) {
				this.method1136(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1715 + arg2 < this.anInt1714) {
				this.anInt1715 += arg2;
				this.method1136(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1714 - this.anInt1715;
			this.method1136(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1715 += local33;
			this.method1134();
			@Pc(60) Class2_Sub2 local60 = (Class2_Sub2) this.aClass3_10.method82();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method138(this);
				if (local68 < 0) {
					local60.anInt169 = 0;
					this.method1135(local60);
				} else {
					local60.anInt169 = local68;
					this.method1139(local60.aClass2_128, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ca;Lclient!af;)V")
	private void method1139(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		while (arg0 != this.aClass3_10.aClass2_9 && ((Class2_Sub2) arg0).anInt169 <= arg1.anInt169) {
			arg0 = arg0.aClass2_128;
		}
		this.aClass3_10.method79(arg1, arg0);
		this.anInt1714 = ((Class2_Sub2) this.aClass3_10.aClass2_9.aClass2_128).anInt169;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()Lclient!d;")
	@Override
	public Class2_Sub5 method1960() {
		return (Class2_Sub5) this.aClass3_9.method82();
	}
}
