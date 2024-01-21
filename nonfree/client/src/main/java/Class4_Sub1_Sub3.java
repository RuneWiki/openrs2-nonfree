import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!lb;")
	private final Class45 aClass45_9 = new Class45();

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!lb;")
	private final Class45 aClass45_10 = new Class45();

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	private int anInt1558 = 0;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
	private int anInt1559 = -1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1559 < 0) {
				this.method966(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1558 + arg2 < this.anInt1559) {
				this.anInt1558 += arg2;
				this.method966(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1559 - this.anInt1558;
			this.method966(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1558 += local33;
			this.method970();
			@Pc(60) Class4_Sub2 local60 = (Class4_Sub2) this.aClass45_10.method982();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method73(this);
				if (local68 < 0) {
					local60.anInt91 = 0;
					this.method969(local60);
				} else {
					local60.anInt91 = local68;
					this.method971(local60.aClass4_128, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()I")
	@Override
	public int method1816() {
		return 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lclient!ac;")
	@Override
	public Class4_Sub1 method1811() {
		return (Class4_Sub1) this.aClass45_9.method986();
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "([III)V")
	private void method966(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass45_9.method982(); local5 != null; local5 = (Class4_Sub1) this.aClass45_9.method986()) {
			local5.method1815(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1817(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1559 < 0) {
				this.method968(arg0);
				return;
			}
			if (this.anInt1558 + arg0 < this.anInt1559) {
				this.anInt1558 += arg0;
				this.method968(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1559 - this.anInt1558;
			this.method968(local29);
			arg0 -= local29;
			this.anInt1558 += local29;
			this.method970();
			@Pc(50) Class4_Sub2 local50 = (Class4_Sub2) this.aClass45_10.method982();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method73(this);
				if (local58 < 0) {
					local50.anInt91 = 0;
					this.method969(local50);
				} else {
					local50.anInt91 = local58;
					this.method971(local50.aClass4_128, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lclient!ac;")
	@Override
	public Class4_Sub1 method1814() {
		return (Class4_Sub1) this.aClass45_9.method982();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ac;)V")
	public synchronized void method967(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass45_9.method990(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
	private void method968(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass45_9.method982(); local5 != null; local5 = (Class4_Sub1) this.aClass45_9.method986()) {
			local5.method1817(arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ba;)V")
	private void method969(@OriginalArg(0) Class4_Sub2 arg0) {
		arg0.method1989();
		arg0.method72();
		@Pc(9) Class4 local9 = this.aClass45_10.aClass4_59.aClass4_128;
		if (local9 == this.aClass45_10.aClass4_59) {
			this.anInt1559 = -1;
		} else {
			this.anInt1559 = ((Class4_Sub2) local9).anInt91;
		}
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
	private void method970() {
		if (this.anInt1558 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub2 local8 = (Class4_Sub2) this.aClass45_10.method982(); local8 != null; local8 = (Class4_Sub2) this.aClass45_10.method986()) {
			local8.anInt91 -= this.anInt1558;
		}
		this.anInt1559 -= this.anInt1558;
		this.anInt1558 = 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!s;Lclient!ba;)V")
	private void method971(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		while (arg0 != this.aClass45_10.aClass4_59 && ((Class4_Sub2) arg0).anInt91 <= arg1.anInt91) {
			arg0 = arg0.aClass4_128;
		}
		this.aClass45_10.method983(arg1, arg0);
		this.anInt1559 = ((Class4_Sub2) this.aClass45_10.aClass4_59.aClass4_128).anInt91;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lclient!ac;)V")
	public synchronized void method972(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.method1989();
	}
}
