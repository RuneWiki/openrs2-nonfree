import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Lclient!md;")
	private final Class50 aClass50_11 = new Class50();

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Lclient!md;")
	private final Class50 aClass50_12 = new Class50();

	@OriginalMember(owner = "client!re", name = "F", descriptor = "I")
	private int anInt2118 = 0;

	@OriginalMember(owner = "client!re", name = "G", descriptor = "I")
	private int anInt2119 = -1;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!c;)V")
	private void method1519(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.method2076();
		arg0.method283();
		@Pc(9) Class1 local9 = this.aClass50_12.aClass1_49.aClass1_106;
		if (local9 == this.aClass50_12.aClass1_49) {
			this.anInt2119 = -1;
		} else {
			this.anInt2119 = ((Class1_Sub3) local9).anInt450;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1512(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2119 < 0) {
				this.method1521(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2118 + arg2 < this.anInt2119) {
				this.anInt2118 += arg2;
				this.method1521(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2119 - this.anInt2118;
			this.method1521(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2118 += local33;
			this.method1522();
			@Pc(60) Class1_Sub3 local60 = (Class1_Sub3) this.aClass50_12.method1151();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method284(this);
				if (local68 < 0) {
					local60.anInt450 = 0;
					this.method1519(local60);
				} else {
					local60.anInt450 = local68;
					this.method1525(local60.aClass1_106, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	private void method1520(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub2 local5 = (Class1_Sub2) this.aClass50_11.method1151(); local5 != null; local5 = (Class1_Sub2) this.aClass50_11.method1141()) {
			local5.method1515(arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1515(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2119 < 0) {
				this.method1520(arg0);
				return;
			}
			if (this.anInt2118 + arg0 < this.anInt2119) {
				this.anInt2118 += arg0;
				this.method1520(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2119 - this.anInt2118;
			this.method1520(local29);
			arg0 -= local29;
			this.anInt2118 += local29;
			this.method1522();
			@Pc(50) Class1_Sub3 local50 = (Class1_Sub3) this.aClass50_12.method1151();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method284(this);
				if (local58 < 0) {
					local50.anInt450 = 0;
					this.method1519(local50);
				} else {
					local50.anInt450 = local58;
					this.method1525(local50.aClass1_106, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "([III)V")
	private void method1521(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub2 local5 = (Class1_Sub2) this.aClass50_11.method1151(); local5 != null; local5 = (Class1_Sub2) this.aClass50_11.method1141()) {
			local5.method1516(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()Lclient!mc;")
	@Override
	public Class1_Sub2 method1514() {
		return (Class1_Sub2) this.aClass50_11.method1151();
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "()V")
	private void method1522() {
		if (this.anInt2118 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub3 local8 = (Class1_Sub3) this.aClass50_12.method1151(); local8 != null; local8 = (Class1_Sub3) this.aClass50_12.method1141()) {
			local8.anInt450 -= this.anInt2118;
		}
		this.anInt2119 -= this.anInt2118;
		this.anInt2118 = 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!mc;)V")
	public synchronized void method1523(@OriginalArg(0) Class1_Sub2 arg0) {
		arg0.method2076();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
	@Override
	public int method1513() {
		return 0;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Lclient!mc;)V")
	public synchronized void method1524(@OriginalArg(0) Class1_Sub2 arg0) {
		this.aClass50_11.method1144(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!je;Lclient!c;)V")
	private void method1525(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		while (arg0 != this.aClass50_12.aClass1_49 && ((Class1_Sub3) arg0).anInt450 <= arg1.anInt450) {
			arg0 = arg0.aClass1_106;
		}
		this.aClass50_12.method1152(arg0, arg1);
		this.anInt2119 = ((Class1_Sub3) this.aClass50_12.aClass1_49.aClass1_106).anInt450;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()Lclient!mc;")
	@Override
	public Class1_Sub2 method1518() {
		return (Class1_Sub2) this.aClass50_11.method1141();
	}
}
