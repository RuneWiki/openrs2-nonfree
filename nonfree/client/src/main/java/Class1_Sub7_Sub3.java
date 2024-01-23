import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class1_Sub7_Sub3 extends Class1_Sub7 {

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!jo;")
	private Class96 aClass96_19 = new Class96();

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!jo;")
	private Class96 aClass96_20 = new Class96();

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	private int anInt4203 = -1;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
	private int anInt4204 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ro;)V")
	public synchronized void method3613(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.method4573();
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "()Lclient!ro;")
	@Override
	public Class1_Sub7 method3724() {
		return (Class1_Sub7) this.aClass96_19.method2340();
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()I")
	@Override
	public int method3728() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	private void method3614(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass96_19.method2340(); local5 != null; local5 = (Class1_Sub7) this.aClass96_19.method2342()) {
			local5.method3726(arg0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Lclient!ro;)V")
	public synchronized void method3615(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass96_19.method2337(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3725(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4203 < 0) {
				this.method3619(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4204 + arg2 < this.anInt4203) {
				this.anInt4204 += arg2;
				this.method3619(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4203 - this.anInt4204;
			this.method3619(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4204 += local33;
			this.method3617();
			@Pc(60) Class1_Sub2 local60 = (Class1_Sub2) this.aClass96_20.method2340();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method56(this);
				if (local68 < 0) {
					local60.anInt106 = 0;
					this.method3616(local60);
				} else {
					local60.anInt106 = local68;
					this.method3618(local60.aClass1_235, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3726(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4203 < 0) {
				this.method3614(arg0);
				return;
			}
			if (this.anInt4204 + arg0 < this.anInt4203) {
				this.anInt4204 += arg0;
				this.method3614(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4203 - this.anInt4204;
			this.method3614(local29);
			arg0 -= local29;
			this.anInt4204 += local29;
			this.method3617();
			@Pc(50) Class1_Sub2 local50 = (Class1_Sub2) this.aClass96_20.method2340();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method56(this);
				if (local58 < 0) {
					local50.anInt106 = 0;
					this.method3616(local50);
				} else {
					local50.anInt106 = local58;
					this.method3618(local50.aClass1_235, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ac;)V")
	private void method3616(@OriginalArg(0) Class1_Sub2 arg0) {
		arg0.method4573();
		arg0.method55();
		@Pc(9) Class1 local9 = this.aClass96_20.aClass1_109.aClass1_235;
		if (local9 == this.aClass96_20.aClass1_109) {
			this.anInt4203 = -1;
		} else {
			this.anInt4203 = ((Class1_Sub2) local9).anInt106;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()Lclient!ro;")
	@Override
	public Class1_Sub7 method3722() {
		return (Class1_Sub7) this.aClass96_19.method2342();
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "()V")
	private void method3617() {
		if (this.anInt4204 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub2 local8 = (Class1_Sub2) this.aClass96_20.method2340(); local8 != null; local8 = (Class1_Sub2) this.aClass96_20.method2342()) {
			local8.anInt106 -= this.anInt4204;
		}
		this.anInt4203 -= this.anInt4204;
		this.anInt4204 = 0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ak;Lclient!ac;)V")
	private void method3618(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		while (arg0 != this.aClass96_20.aClass1_109 && ((Class1_Sub2) arg0).anInt106 <= arg1.anInt106) {
			arg0 = arg0.aClass1_235;
		}
		Static281.method98(arg1, arg0);
		this.anInt4203 = ((Class1_Sub2) this.aClass96_20.aClass1_109.aClass1_235).anInt106;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "([III)V")
	private void method3619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub7 local5 = (Class1_Sub7) this.aClass96_19.method2340(); local5 != null; local5 = (Class1_Sub7) this.aClass96_19.method2342()) {
			local5.method3727(arg0, arg1, arg2);
		}
	}
}
