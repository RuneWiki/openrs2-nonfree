import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class1_Sub6_Sub3 extends Class1_Sub6 {

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!gca;")
	private final Class111 aClass111_54 = new Class111();

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!gca;")
	private final Class111 aClass111_55 = new Class111();

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	private int anInt8131 = 0;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	private int anInt8132 = -1;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub6 method6577() {
		return (Class1_Sub6) this.aClass111_54.method2547();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!rp;Lclient!fi;)V")
	private void method6527(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub21 arg1) {
		while (arg0 != this.aClass111_55.aClass1_94 && ((Class1_Sub21) arg0).anInt2739 <= arg1.anInt2739) {
			arg0 = arg0.aClass1_286;
		}
		Static151.method2498(arg0, arg1);
		this.anInt8132 = ((Class1_Sub21) this.aClass111_55.aClass1_94.aClass1_286).anInt2739;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!fi;)V")
	private void method6528(@OriginalArg(0) Class1_Sub21 arg0) {
		arg0.method7908();
		arg0.method2412();
		@Pc(9) Class1 local9 = this.aClass111_55.aClass1_94.aClass1_286;
		if (local9 == this.aClass111_55.aClass1_94) {
			this.anInt8132 = -1;
		} else {
			this.anInt8132 = ((Class1_Sub21) local9).anInt2739;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6579(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt8132 < 0) {
				this.method6533(arg0);
				return;
			}
			if (this.anInt8131 + arg0 < this.anInt8132) {
				this.anInt8131 += arg0;
				this.method6533(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt8132 - this.anInt8131;
			this.method6533(local29);
			arg0 -= local29;
			this.anInt8131 += local29;
			this.method6531();
			@Pc(50) Class1_Sub21 local50 = (Class1_Sub21) this.aClass111_55.method2547();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2411(this);
				if (local58 < 0) {
					local50.anInt2739 = 0;
					this.method6528(local50);
				} else {
					local50.anInt2739 = local58;
					this.method6527(local50.aClass1_286, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "()I")
	public synchronized int method6529() {
		return this.aClass111_54.method2545();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!jc;)V")
	public synchronized void method6530(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass111_54.method2549(arg0);
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "()V")
	private void method6531() {
		if (this.anInt8131 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub21 local8 = (Class1_Sub21) this.aClass111_55.method2547(); local8 != null; local8 = (Class1_Sub21) this.aClass111_55.method2554()) {
			local8.anInt2739 -= this.anInt8131;
		}
		this.anInt8132 -= this.anInt8131;
		this.anInt8131 = 0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!jc;)V")
	public synchronized void method6532(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.method7908();
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()I")
	@Override
	public int method6580() {
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub6 method6578() {
		return (Class1_Sub6) this.aClass111_54.method2554();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	private void method6533(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass111_54.method2547(); local5 != null; local5 = (Class1_Sub6) this.aClass111_54.method2554()) {
			local5.method6579(arg0);
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "([III)V")
	private void method6534(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub6 local5 = (Class1_Sub6) this.aClass111_54.method2547(); local5 != null; local5 = (Class1_Sub6) this.aClass111_54.method2554()) {
			local5.method6581(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt8132 < 0) {
				this.method6534(arg0, arg1, arg2);
				return;
			}
			if (this.anInt8131 + arg2 < this.anInt8132) {
				this.anInt8131 += arg2;
				this.method6534(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt8132 - this.anInt8131;
			this.method6534(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt8131 += local33;
			this.method6531();
			@Pc(60) Class1_Sub21 local60 = (Class1_Sub21) this.aClass111_55.method2547();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2411(this);
				if (local68 < 0) {
					local60.anInt2739 = 0;
					this.method6528(local60);
				} else {
					local60.anInt2739 = local68;
					this.method6527(local60.aClass1_286, local60);
				}
			}
		} while (arg2 != 0);
	}
}
