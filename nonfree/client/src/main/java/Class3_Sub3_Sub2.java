import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "Lclient!se;")
	private final Class65 aClass65_40 = new Class65();

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "Lclient!se;")
	private final Class65 aClass65_41 = new Class65();

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
	private int anInt1600 = 0;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	private int anInt1601 = -1;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()Lclient!da;")
	@Override
	public Class3_Sub3 method2145() {
		return (Class3_Sub3) this.aClass65_40.method1958();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!da;)V")
	public synchronized void method1072(@OriginalArg(0) Class3_Sub3 arg0) {
		this.aClass65_40.method1964(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "()Lclient!da;")
	@Override
	public Class3_Sub3 method2147() {
		return (Class3_Sub3) this.aClass65_40.method1962();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!fa;)V")
	private void method1073(@OriginalArg(0) Class3_Sub6 arg0) {
		arg0.method2201();
		arg0.method619();
		@Pc(9) Class3 local9 = this.aClass65_41.aClass3_111.aClass3_127;
		if (local9 == this.aClass65_41.aClass3_111) {
			this.anInt1601 = -1;
		} else {
			this.anInt1601 = ((Class3_Sub6) local9).anInt1032;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
	@Override
	public int method2144() {
		return 0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!da;)V")
	public synchronized void method1074(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.method2201();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ad;Lclient!fa;)V")
	private void method1075(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub6 arg1) {
		while (arg0 != this.aClass65_41.aClass3_111 && ((Class3_Sub6) arg0).anInt1032 <= arg1.anInt1032) {
			arg0 = arg0.aClass3_127;
		}
		this.aClass65_41.method1961(arg1, arg0);
		this.anInt1601 = ((Class3_Sub6) this.aClass65_41.aClass3_111.aClass3_127).anInt1032;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "()V")
	private void method1076() {
		if (this.anInt1600 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub6 local8 = (Class3_Sub6) this.aClass65_41.method1958(); local8 != null; local8 = (Class3_Sub6) this.aClass65_41.method1962()) {
			local8.anInt1032 -= this.anInt1600;
		}
		this.anInt1601 -= this.anInt1600;
		this.anInt1600 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2146(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1601 < 0) {
				this.method1077(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1600 + arg2 < this.anInt1601) {
				this.anInt1600 += arg2;
				this.method1077(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1601 - this.anInt1600;
			this.method1077(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1600 += local33;
			this.method1076();
			@Pc(60) Class3_Sub6 local60 = (Class3_Sub6) this.aClass65_41.method1958();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method620(this);
				if (local68 < 0) {
					local60.anInt1032 = 0;
					this.method1073(local60);
				} else {
					local60.anInt1032 = local68;
					this.method1075(local60.aClass3_127, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "([III)V")
	private void method1077(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass65_40.method1958(); local5 != null; local5 = (Class3_Sub3) this.aClass65_40.method1962()) {
			local5.method2150(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	private void method1078(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass65_40.method1958(); local5 != null; local5 = (Class3_Sub3) this.aClass65_40.method1962()) {
			local5.method2148(arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2148(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1601 < 0) {
				this.method1078(arg0);
				return;
			}
			if (this.anInt1600 + arg0 < this.anInt1601) {
				this.anInt1600 += arg0;
				this.method1078(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1601 - this.anInt1600;
			this.method1078(local29);
			arg0 -= local29;
			this.anInt1600 += local29;
			this.method1076();
			@Pc(50) Class3_Sub6 local50 = (Class3_Sub6) this.aClass65_41.method1958();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method620(this);
				if (local58 < 0) {
					local50.anInt1032 = 0;
					this.method1073(local50);
				} else {
					local50.anInt1032 = local58;
					this.method1075(local50.aClass3_127, local50);
				}
			}
		} while (arg0 != 0);
	}
}
