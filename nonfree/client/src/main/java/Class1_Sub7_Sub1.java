import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "Lclient!wo;")
	private final Class266 aClass266_38 = new Class266();

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "Lclient!wo;")
	private final Class266 aClass266_39 = new Class266();

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
	private int anInt4898 = 0;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
	private int anInt4899 = -1;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!dm;)V")
	public synchronized void method3976(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass266_38.method5997(arg0);
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "([III)V")
	private void method3977(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass266_38.method6000(); local5 != null; local5 = (Class1_Sub7) this.aClass266_38.method5994()) {
			local5.method5931(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "()I")
	public synchronized int method3978() {
		return this.aClass266_38.method5992();
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(Lclient!dm;)V")
	public synchronized void method3979(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method6071();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5927(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4899 < 0) {
				this.method3981(arg0);
				return;
			}
			if (this.anInt4898 + arg0 < this.anInt4899) {
				this.anInt4898 += arg0;
				this.method3981(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4899 - this.anInt4898;
			this.method3981(local29);
			arg0 -= local29;
			this.anInt4898 += local29;
			this.method3983();
			@Pc(50) Class1_Sub12 local50 = (Class1_Sub12) this.aClass266_39.method6000();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1806(this);
				if (local58 < 0) {
					local50.anInt2155 = 0;
					this.method3982(local50);
				} else {
					local50.anInt2155 = local58;
					this.method3980(local50.aClass1_261, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "()Lclient!dm;")
	@Override
	public Class1_Sub7 method5930() {
		return (Class1_Sub7) this.aClass266_38.method6000();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!ki;Lclient!fu;)V")
	private void method3980(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		while (arg0 != this.aClass266_39.aClass1_255 && ((Class1_Sub12) arg0).anInt2155 <= arg1.anInt2155) {
			arg0 = arg0.aClass1_261;
		}
		Static75.method1282(arg0, arg1);
		this.anInt4899 = ((Class1_Sub12) this.aClass266_39.aClass1_255.aClass1_261).anInt2155;
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "()Lclient!dm;")
	@Override
	public Class1_Sub7 method5932() {
		return (Class1_Sub7) this.aClass266_38.method5994();
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
	private void method3981(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass266_38.method6000(); local5 != null; local5 = (Class1_Sub7) this.aClass266_38.method5994()) {
			local5.method5927(arg0);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!fu;)V")
	private void method3982(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.method6071();
		arg0.method1807();
		@Pc(9) Class1 local9 = this.aClass266_39.aClass1_255.aClass1_261;
		if (local9 == this.aClass266_39.aClass1_255) {
			this.anInt4899 = -1;
		} else {
			this.anInt4899 = ((Class1_Sub12) local9).anInt2155;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "()I")
	@Override
	public int method5926() {
		return 0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5928(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4899 < 0) {
				this.method3977(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4898 + arg2 < this.anInt4899) {
				this.anInt4898 += arg2;
				this.method3977(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4899 - this.anInt4898;
			this.method3977(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4898 += local33;
			this.method3983();
			@Pc(60) Class1_Sub12 local60 = (Class1_Sub12) this.aClass266_39.method6000();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1806(this);
				if (local68 < 0) {
					local60.anInt2155 = 0;
					this.method3982(local60);
				} else {
					local60.anInt2155 = local68;
					this.method3980(local60.aClass1_261, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "()V")
	private void method3983() {
		if (this.anInt4898 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) this.aClass266_39.method6000(); local8 != null; local8 = (Class1_Sub12) this.aClass266_39.method5994()) {
			local8.anInt2155 -= this.anInt4898;
		}
		this.anInt4899 -= this.anInt4898;
		this.anInt4898 = 0;
	}
}
