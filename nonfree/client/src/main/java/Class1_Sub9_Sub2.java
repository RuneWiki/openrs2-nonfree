import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub9_Sub2 extends Class1_Sub9 {

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "Lclient!rc;")
	private final Class61 aClass61_9 = new Class61();

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "Lclient!rc;")
	private final Class61 aClass61_10 = new Class61();

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
	private int anInt1441 = 0;

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
	private int anInt1442 = -1;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1553(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1442 < 0) {
				this.method1014(arg0);
				return;
			}
			if (this.anInt1441 + arg0 < this.anInt1442) {
				this.anInt1441 += arg0;
				this.method1014(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1442 - this.anInt1441;
			this.method1014(local29);
			arg0 -= local29;
			this.anInt1441 += local29;
			this.method1017();
			@Pc(50) Class1_Sub7 local50 = (Class1_Sub7) this.aClass61_10.method1748();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method483(this);
				if (local58 < 0) {
					local50.anInt602 = 0;
					this.method1013(local50);
				} else {
					local50.anInt602 = local58;
					this.method1018(local50.aClass1_127, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1442 < 0) {
				this.method1015(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1441 + arg2 < this.anInt1442) {
				this.anInt1441 += arg2;
				this.method1015(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1442 - this.anInt1441;
			this.method1015(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1441 += local33;
			this.method1017();
			@Pc(60) Class1_Sub7 local60 = (Class1_Sub7) this.aClass61_10.method1748();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method483(this);
				if (local68 < 0) {
					local60.anInt602 = 0;
					this.method1013(local60);
				} else {
					local60.anInt602 = local68;
					this.method1018(local60.aClass1_127, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()I")
	@Override
	public int method1551() {
		return 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!m;)V")
	public synchronized void method1012(@OriginalArg(0) Class1_Sub9 arg0) {
		arg0.method2050();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!db;)V")
	private void method1013(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method2050();
		arg0.method482();
		@Pc(9) Class1 local9 = this.aClass61_10.aClass1_105.aClass1_127;
		if (local9 == this.aClass61_10.aClass1_105) {
			this.anInt1442 = -1;
		} else {
			this.anInt1442 = ((Class1_Sub7) local9).anInt602;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	private void method1014(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub9 local5 = (Class1_Sub9) this.aClass61_9.method1748(); local5 != null; local5 = (Class1_Sub9) this.aClass61_9.method1760()) {
			local5.method1553(arg0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "()Lclient!m;")
	@Override
	public Class1_Sub9 method1552() {
		return (Class1_Sub9) this.aClass61_9.method1760();
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "([III)V")
	private void method1015(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub9 local5 = (Class1_Sub9) this.aClass61_9.method1748(); local5 != null; local5 = (Class1_Sub9) this.aClass61_9.method1760()) {
			local5.method1548(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class1_Sub9 method1549() {
		return (Class1_Sub9) this.aClass61_9.method1748();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lclient!m;)V")
	public synchronized void method1016(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aClass61_9.method1755(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
	private void method1017() {
		if (this.anInt1441 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub7 local8 = (Class1_Sub7) this.aClass61_10.method1748(); local8 != null; local8 = (Class1_Sub7) this.aClass61_10.method1760()) {
			local8.anInt602 -= this.anInt1441;
		}
		this.anInt1442 -= this.anInt1441;
		this.anInt1441 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ce;Lclient!db;)V")
	private void method1018(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		while (arg0 != this.aClass61_10.aClass1_105 && ((Class1_Sub7) arg0).anInt602 <= arg1.anInt602) {
			arg0 = arg0.aClass1_127;
		}
		this.aClass61_10.method1759(arg0, arg1);
		this.anInt1442 = ((Class1_Sub7) this.aClass61_10.aClass1_105.aClass1_127).anInt602;
	}
}
