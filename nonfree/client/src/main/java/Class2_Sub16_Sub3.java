import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class2_Sub16_Sub3 extends Class2_Sub16 {

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Lclient!da;")
	private final Class13 aClass13_62 = new Class13();

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Lclient!da;")
	private final Class13 aClass13_63 = new Class13();

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
	private int anInt2637 = 0;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
	private int anInt2638 = -1;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()Lclient!wc;")
	@Override
	public Class2_Sub16 method1912() {
		return (Class2_Sub16) this.aClass13_62.method415();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!fe;Lclient!db;)V")
	private void method1837(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		while (arg0 != this.aClass13_63.aClass2_29 && ((Class2_Sub6) arg0).anInt588 <= arg1.anInt588) {
			arg0 = arg0.aClass2_117;
		}
		this.aClass13_63.method427(arg0, arg1);
		this.anInt2638 = ((Class2_Sub6) this.aClass13_63.aClass2_29.aClass2_117).anInt588;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!db;)V")
	private void method1838(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.method1930();
		arg0.method436();
		@Pc(9) Class2 local9 = this.aClass13_63.aClass2_29.aClass2_117;
		if (local9 == this.aClass13_63.aClass2_29) {
			this.anInt2638 = -1;
		} else {
			this.anInt2638 = ((Class2_Sub6) local9).anInt588;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!wc;)V")
	public synchronized void method1839(@OriginalArg(0) Class2_Sub16 arg0) {
		this.aClass13_62.method428(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	private void method1840(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub16 local5 = (Class2_Sub16) this.aClass13_62.method415(); local5 != null; local5 = (Class2_Sub16) this.aClass13_62.method414()) {
			local5.method1916(arg0);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1913(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2638 < 0) {
				this.method1841(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2637 + arg2 < this.anInt2638) {
				this.anInt2637 += arg2;
				this.method1841(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2638 - this.anInt2637;
			this.method1841(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2637 += local33;
			this.method1843();
			@Pc(60) Class2_Sub6 local60 = (Class2_Sub6) this.aClass13_63.method415();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method437(this);
				if (local68 < 0) {
					local60.anInt588 = 0;
					this.method1838(local60);
				} else {
					local60.anInt588 = local68;
					this.method1837(local60.aClass2_117, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "([III)V")
	private void method1841(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub16 local5 = (Class2_Sub16) this.aClass13_62.method415(); local5 != null; local5 = (Class2_Sub16) this.aClass13_62.method414()) {
			local5.method1915(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lclient!wc;)V")
	public synchronized void method1842(@OriginalArg(0) Class2_Sub16 arg0) {
		arg0.method1930();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()Lclient!wc;")
	@Override
	public Class2_Sub16 method1911() {
		return (Class2_Sub16) this.aClass13_62.method414();
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "()V")
	private void method1843() {
		if (this.anInt2637 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub6 local8 = (Class2_Sub6) this.aClass13_63.method415(); local8 != null; local8 = (Class2_Sub6) this.aClass13_63.method414()) {
			local8.anInt588 -= this.anInt2637;
		}
		this.anInt2638 -= this.anInt2637;
		this.anInt2637 = 0;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()I")
	@Override
	public int method1914() {
		return 0;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1916(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2638 < 0) {
				this.method1840(arg0);
				return;
			}
			if (this.anInt2637 + arg0 < this.anInt2638) {
				this.anInt2637 += arg0;
				this.method1840(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2638 - this.anInt2637;
			this.method1840(local29);
			arg0 -= local29;
			this.anInt2637 += local29;
			this.method1843();
			@Pc(50) Class2_Sub6 local50 = (Class2_Sub6) this.aClass13_63.method415();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method437(this);
				if (local58 < 0) {
					local50.anInt588 = 0;
					this.method1838(local50);
				} else {
					local50.anInt588 = local58;
					this.method1837(local50.aClass2_117, local50);
				}
			}
		} while (arg0 != 0);
	}
}
