import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "Lclient!mr;")
	private final Class223 aClass223_8 = new Class223();

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "Lclient!mr;")
	private final Class223 aClass223_9 = new Class223();

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
	private int anInt1597 = 0;

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
	private int anInt1598 = -1;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "()Lclient!os;")
	@Override
	public Class3_Sub7 method8760() {
		return (Class3_Sub7) this.aClass223_8.method5870();
	}

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "()I")
	@Override
	public int method8763() {
		return 0;
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "()Lclient!os;")
	@Override
	public Class3_Sub7 method8761() {
		return (Class3_Sub7) this.aClass223_8.method5874();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!os;)V")
	public synchronized void method1621(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.method8769();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8758(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1598 < 0) {
				this.method1627(arg0);
				return;
			}
			if (this.anInt1597 + arg0 < this.anInt1598) {
				this.anInt1597 += arg0;
				this.method1627(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1598 - this.anInt1597;
			this.method1627(local29);
			arg0 -= local29;
			this.anInt1597 += local29;
			this.method1625();
			@Pc(50) Class3_Sub35 local50 = (Class3_Sub35) this.aClass223_9.method5874();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4793(this);
				if (local58 < 0) {
					local50.anInt5343 = 0;
					this.method1628(local50);
				} else {
					local50.anInt5343 = local58;
					this.method1624(local50.aClass3_300, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "([III)V")
	private void method1622(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub7 local5 = (Class3_Sub7) this.aClass223_8.method5874(); local5 != null; local5 = (Class3_Sub7) this.aClass223_8.method5870()) {
			local5.method8759(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "()I")
	public synchronized int method1623() {
		return this.aClass223_8.method5866();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!qm;Lclient!kp;)V")
	private void method1624(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub35 arg1) {
		while (arg0 != this.aClass223_9.aClass3_188 && ((Class3_Sub35) arg0).anInt5343 <= arg1.anInt5343) {
			arg0 = arg0.aClass3_300;
		}
		Static123.method2427(arg1, arg0);
		this.anInt1598 = ((Class3_Sub35) this.aClass223_9.aClass3_188.aClass3_300).anInt5343;
	}

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "()V")
	private void method1625() {
		if (this.anInt1597 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub35 local8 = (Class3_Sub35) this.aClass223_9.method5874(); local8 != null; local8 = (Class3_Sub35) this.aClass223_9.method5870()) {
			local8.anInt5343 -= this.anInt1597;
		}
		this.anInt1598 -= this.anInt1597;
		this.anInt1597 = 0;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8757(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1598 < 0) {
				this.method1622(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1597 + arg2 < this.anInt1598) {
				this.anInt1597 += arg2;
				this.method1622(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1598 - this.anInt1597;
			this.method1622(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1597 += local33;
			this.method1625();
			@Pc(60) Class3_Sub35 local60 = (Class3_Sub35) this.aClass223_9.method5874();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4793(this);
				if (local68 < 0) {
					local60.anInt5343 = 0;
					this.method1628(local60);
				} else {
					local60.anInt5343 = local68;
					this.method1624(local60.aClass3_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(Lclient!os;)V")
	public synchronized void method1626(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aClass223_8.method5867(arg0);
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	private void method1627(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub7 local5 = (Class3_Sub7) this.aClass223_8.method5874(); local5 != null; local5 = (Class3_Sub7) this.aClass223_8.method5870()) {
			local5.method8758(arg0);
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!kp;)V")
	private void method1628(@OriginalArg(0) Class3_Sub35 arg0) {
		arg0.method8769();
		arg0.method4794();
		@Pc(9) Class3 local9 = this.aClass223_9.aClass3_188.aClass3_300;
		if (local9 == this.aClass223_9.aClass3_188) {
			this.anInt1598 = -1;
		} else {
			this.anInt1598 = ((Class3_Sub35) local9).anInt5343;
		}
	}
}
