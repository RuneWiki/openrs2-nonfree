import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub12_Sub2 extends Class2_Sub12 {

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Lclient!ld;")
	private final Class135 aClass135_16 = new Class135();

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Lclient!ld;")
	private final Class135 aClass135_17 = new Class135();

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
	private int anInt1998 = 0;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
	private int anInt1997 = -1;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([III)V", line = 8)
	@Override
	public synchronized void method4974(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1997 < 0) {
				this.method2084(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1998 + arg2 < this.anInt1997) {
				this.anInt1998 += arg2;
				this.method2084(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1997 - this.anInt1998;
			this.method2084(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1998 += local33;
			this.method2079();
			@Pc(60) Class2_Sub30 local60 = (Class2_Sub30) this.aClass135_17.method3552();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4697(this);
				if (local68 < 0) {
					local60.anInt5117 = 0;
					this.method2080(local60);
				} else {
					local60.anInt5117 = local68;
					this.method2082(local60.aClass2_243, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lclient!ll;", line = 55)
	@Override
	public Class2_Sub12 method4979() {
		return (Class2_Sub12) this.aClass135_16.method3552();
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "()V", line = 60)
	private void method2079() {
		if (this.anInt1998 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub30 local8 = (Class2_Sub30) this.aClass135_17.method3552(); local8 != null; local8 = (Class2_Sub30) this.aClass135_17.method3553()) {
			local8.anInt5117 -= this.anInt1998;
		}
		this.anInt1997 -= this.anInt1998;
		this.anInt1998 = 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qa;)V", line = 84)
	private void method2080(@OriginalArg(0) Class2_Sub30 arg0) {
		arg0.method6469();
		arg0.method4696();
		@Pc(9) Class2 local9 = this.aClass135_17.aClass2_130.aClass2_243;
		if (local9 == this.aClass135_17.aClass2_130) {
			this.anInt1997 = -1;
		} else {
			this.anInt1997 = ((Class2_Sub30) local9).anInt5117;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 100)
	@Override
	public synchronized void method4975(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1997 < 0) {
				this.method2081(arg0);
				return;
			}
			if (this.anInt1998 + arg0 < this.anInt1997) {
				this.anInt1998 += arg0;
				this.method2081(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1997 - this.anInt1998;
			this.method2081(local29);
			arg0 -= local29;
			this.anInt1998 += local29;
			this.method2079();
			@Pc(50) Class2_Sub30 local50 = (Class2_Sub30) this.aClass135_17.method3552();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4697(this);
				if (local58 < 0) {
					local50.anInt5117 = 0;
					this.method2080(local50);
				} else {
					local50.anInt5117 = local58;
					this.method2082(local50.aClass2_243, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 146)
	private void method2081(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub12 local5 = (Class2_Sub12) this.aClass135_16.method3552(); local5 != null; local5 = (Class2_Sub12) this.aClass135_16.method3553()) {
			local5.method4975(arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "()I", line = 156)
	@Override
	public int method4978() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ag;Lclient!qa;)V", line = 159)
	private void method2082(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		while (arg0 != this.aClass135_17.aClass2_130 && ((Class2_Sub30) arg0).anInt5117 <= arg1.anInt5117) {
			arg0 = arg0.aClass2_243;
		}
		Static90.method2102(arg1, arg0);
		this.anInt1997 = ((Class2_Sub30) this.aClass135_17.aClass2_130.aClass2_243).anInt5117;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ll;)V", line = 167)
	public synchronized void method2083(@OriginalArg(0) Class2_Sub12 arg0) {
		arg0.method6469();
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "([III)V", line = 172)
	private void method2084(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub12 local5 = (Class2_Sub12) this.aClass135_16.method3552(); local5 != null; local5 = (Class2_Sub12) this.aClass135_16.method3553()) {
			local5.method4976(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()Lclient!ll;", line = 184)
	@Override
	public Class2_Sub12 method4973() {
		return (Class2_Sub12) this.aClass135_16.method3553();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!ll;)V", line = 189)
	public synchronized void method2085(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aClass135_16.method3546(arg0);
	}
}
