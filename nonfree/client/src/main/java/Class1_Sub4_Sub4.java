import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Lclient!ab;")
	private Class3 aClass3_18 = new Class3();

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Lclient!ab;")
	private Class3 aClass3_19 = new Class3();

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	private int anInt4103 = 0;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	private int anInt4104 = -1;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "()V")
	private void method3077() {
		if (this.anInt4103 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub15 local8 = (Class1_Sub15) this.aClass3_19.method30(); local8 != null; local8 = (Class1_Sub15) this.aClass3_19.method33()) {
			local8.anInt2786 -= this.anInt4103;
		}
		this.anInt4104 -= this.anInt4103;
		this.anInt4103 = 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!jg;Lclient!ii;)V")
	private void method3078(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub15 arg1) {
		while (arg0 != this.aClass3_19.aClass1_5 && ((Class1_Sub15) arg0).anInt2786 <= arg1.anInt2786) {
			arg0 = arg0.aClass1_213;
		}
		Static113.method4193(arg1, arg0);
		this.anInt4104 = ((Class1_Sub15) this.aClass3_19.aClass1_5.aClass1_213).anInt2786;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()Lclient!ta;")
	@Override
	public Class1_Sub4 method3073() {
		return (Class1_Sub4) this.aClass3_18.method30();
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method3074(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4104 < 0) {
				this.method3083(arg0);
				return;
			}
			if (this.anInt4103 + arg0 < this.anInt4104) {
				this.anInt4103 += arg0;
				this.method3083(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4104 - this.anInt4103;
			this.method3083(local29);
			arg0 -= local29;
			this.anInt4103 += local29;
			this.method3077();
			@Pc(50) Class1_Sub15 local50 = (Class1_Sub15) this.aClass3_19.method30();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2124(this);
				if (local58 < 0) {
					local50.anInt2786 = 0;
					this.method3082(local50);
				} else {
					local50.anInt2786 = local58;
					this.method3078(local50.aClass1_213, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "([III)V")
	private void method3079(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass3_18.method30(); local5 != null; local5 = (Class1_Sub4) this.aClass3_18.method33()) {
			local5.method3070(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()Lclient!ta;")
	@Override
	public Class1_Sub4 method3075() {
		return (Class1_Sub4) this.aClass3_18.method33();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ta;)V")
	public synchronized void method3080(@OriginalArg(0) Class1_Sub4 arg0) {
		this.aClass3_18.method31(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Lclient!ta;)V")
	public synchronized void method3081(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.method4186();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3072(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4104 < 0) {
				this.method3079(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4103 + arg2 < this.anInt4104) {
				this.anInt4103 += arg2;
				this.method3079(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4104 - this.anInt4103;
			this.method3079(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4103 += local33;
			this.method3077();
			@Pc(60) Class1_Sub15 local60 = (Class1_Sub15) this.aClass3_19.method30();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2124(this);
				if (local68 < 0) {
					local60.anInt2786 = 0;
					this.method3082(local60);
				} else {
					local60.anInt2786 = local68;
					this.method3078(local60.aClass1_213, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()I")
	@Override
	public int method3076() {
		return 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ii;)V")
	private void method3082(@OriginalArg(0) Class1_Sub15 arg0) {
		arg0.method4186();
		arg0.method2125();
		@Pc(9) Class1 local9 = this.aClass3_19.aClass1_5.aClass1_213;
		if (local9 == this.aClass3_19.aClass1_5) {
			this.anInt4104 = -1;
		} else {
			this.anInt4104 = ((Class1_Sub15) local9).anInt2786;
		}
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
	private void method3083(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass3_18.method30(); local5 != null; local5 = (Class1_Sub4) this.aClass3_18.method33()) {
			local5.method3074(arg0);
		}
	}
}
