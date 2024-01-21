import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!nd;")
	private final Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!a", name = "E", descriptor = "Lclient!nd;")
	private final Class53 aClass53_2 = new Class53();

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	private int anInt33 = -1;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "I")
	private int anInt34 = 0;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "([III)V")
	private void method36(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass53_1.method1442(); local5 != null; local5 = (Class1_Sub1) this.aClass53_1.method1450()) {
			local5.method1363(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ja;)V")
	public synchronized void method37(@OriginalArg(0) Class1_Sub1 arg0) {
		arg0.method2220();
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Lclient!ja;)V")
	public synchronized void method38(@OriginalArg(0) Class1_Sub1 arg0) {
		this.aClass53_1.method1451(arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()Lclient!ja;")
	@Override
	public Class1_Sub1 method1357() {
		return (Class1_Sub1) this.aClass53_1.method1450();
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()I")
	@Override
	public int method1360() {
		return 0;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1358(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt33 < 0) {
				this.method41(arg0);
				return;
			}
			if (this.anInt34 + arg0 < this.anInt33) {
				this.anInt34 += arg0;
				this.method41(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt33 - this.anInt34;
			this.method41(local29);
			arg0 -= local29;
			this.anInt34 += local29;
			this.method40();
			@Pc(50) Class1_Sub7 local50 = (Class1_Sub7) this.aClass53_2.method1442();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method768(this);
				if (local58 < 0) {
					local50.anInt1029 = 0;
					this.method39(local50);
				} else {
					local50.anInt1029 = local58;
					this.method42(local50.aClass1_124, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "()Lclient!ja;")
	@Override
	public Class1_Sub1 method1362() {
		return (Class1_Sub1) this.aClass53_1.method1442();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fe;)V")
	private void method39(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method2220();
		arg0.method769();
		@Pc(9) Class1 local9 = this.aClass53_2.aClass1_85.aClass1_124;
		if (local9 == this.aClass53_2.aClass1_85) {
			this.anInt33 = -1;
		} else {
			this.anInt33 = ((Class1_Sub7) local9).anInt1029;
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "()V")
	private void method40() {
		if (this.anInt34 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub7 local8 = (Class1_Sub7) this.aClass53_2.method1442(); local8 != null; local8 = (Class1_Sub7) this.aClass53_2.method1450()) {
			local8.anInt1029 -= this.anInt34;
		}
		this.anInt33 -= this.anInt34;
		this.anInt34 = 0;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	private void method41(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass53_1.method1442(); local5 != null; local5 = (Class1_Sub1) this.aClass53_1.method1450()) {
			local5.method1358(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!te;Lclient!fe;)V")
	private void method42(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		while (arg0 != this.aClass53_2.aClass1_85 && ((Class1_Sub7) arg0).anInt1029 <= arg1.anInt1029) {
			arg0 = arg0.aClass1_124;
		}
		this.aClass53_2.method1453(arg0, arg1);
		this.anInt33 = ((Class1_Sub7) this.aClass53_2.aClass1_85.aClass1_124).anInt1029;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1359(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt33 < 0) {
				this.method36(arg0, arg1, arg2);
				return;
			}
			if (this.anInt34 + arg2 < this.anInt33) {
				this.anInt34 += arg2;
				this.method36(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt33 - this.anInt34;
			this.method36(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt34 += local33;
			this.method40();
			@Pc(60) Class1_Sub7 local60 = (Class1_Sub7) this.aClass53_2.method1442();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method768(this);
				if (local68 < 0) {
					local60.anInt1029 = 0;
					this.method39(local60);
				} else {
					local60.anInt1029 = local68;
					this.method42(local60.aClass1_124, local60);
				}
			}
		} while (arg2 != 0);
	}
}
