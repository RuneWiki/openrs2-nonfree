import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!v;")
	private final Class91 aClass91_8 = new Class91();

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "Lclient!v;")
	private final Class91 aClass91_9 = new Class91();

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
	private int anInt2656 = -1;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
	private int anInt2657 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!d;)V")
	public synchronized void method1995(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass91_8.method3146(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "()I")
	@Override
	public int method2374() {
		return 0;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2371(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2656 < 0) {
				this.method1998(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2657 + arg2 < this.anInt2656) {
				this.anInt2657 += arg2;
				this.method1998(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2656 - this.anInt2657;
			this.method1998(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2657 += local33;
			this.method1997();
			@Pc(60) Class1_Sub12 local60 = (Class1_Sub12) this.aClass91_9.method3148();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1346(this);
				if (local68 < 0) {
					local60.anInt1878 = 0;
					this.method1999(local60);
				} else {
					local60.anInt1878 = local68;
					this.method1996(local60.aClass1_213, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ji;Lclient!i;)V")
	private void method1996(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		while (arg0 != this.aClass91_9.aClass1_197 && ((Class1_Sub12) arg0).anInt1878 <= arg1.anInt1878) {
			arg0 = arg0.aClass1_213;
		}
		this.aClass91_9.method3144(arg1, arg0);
		this.anInt2656 = ((Class1_Sub12) this.aClass91_9.aClass1_197.aClass1_213).anInt1878;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2373(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2656 < 0) {
				this.method2001(arg0);
				return;
			}
			if (this.anInt2657 + arg0 < this.anInt2656) {
				this.anInt2657 += arg0;
				this.method2001(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2656 - this.anInt2657;
			this.method2001(local29);
			arg0 -= local29;
			this.anInt2657 += local29;
			this.method1997();
			@Pc(50) Class1_Sub12 local50 = (Class1_Sub12) this.aClass91_9.method3148();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1346(this);
				if (local58 < 0) {
					local50.anInt1878 = 0;
					this.method1999(local50);
				} else {
					local50.anInt1878 = local58;
					this.method1996(local50.aClass1_213, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()Lclient!d;")
	@Override
	public Class1_Sub6 method2368() {
		return (Class1_Sub6) this.aClass91_8.method3148();
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "()V")
	private void method1997() {
		if (this.anInt2657 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) this.aClass91_9.method3148(); local8 != null; local8 = (Class1_Sub12) this.aClass91_9.method3150()) {
			local8.anInt1878 -= this.anInt2657;
		}
		this.anInt2656 -= this.anInt2657;
		this.anInt2657 = 0;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()Lclient!d;")
	@Override
	public Class1_Sub6 method2369() {
		return (Class1_Sub6) this.aClass91_8.method3150();
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "([III)V")
	private void method1998(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass91_8.method3148(); local5 != null; local5 = (Class1_Sub6) this.aClass91_8.method3150()) {
			local5.method2370(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!i;)V")
	private void method1999(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.method3295();
		arg0.method1347();
		@Pc(9) Class1 local9 = this.aClass91_9.aClass1_197.aClass1_213;
		if (local9 == this.aClass91_9.aClass1_197) {
			this.anInt2656 = -1;
		} else {
			this.anInt2656 = ((Class1_Sub12) local9).anInt1878;
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lclient!d;)V")
	public synchronized void method2000(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.method3295();
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	private void method2001(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass91_8.method3148(); local5 != null; local5 = (Class1_Sub6) this.aClass91_8.method3150()) {
			local5.method2373(arg0);
		}
	}
}
