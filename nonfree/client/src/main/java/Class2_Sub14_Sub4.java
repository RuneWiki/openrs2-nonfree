import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class2_Sub14_Sub4 extends Class2_Sub14 {

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!tf;")
	private final Class81 aClass81_11 = new Class81();

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Lclient!tf;")
	private final Class81 aClass81_12 = new Class81();

	@OriginalMember(owner = "client!t", name = "t", descriptor = "I")
	private int anInt3346 = -1;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	private int anInt3347 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2587(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3346 < 0) {
				this.method2591(arg0);
				return;
			}
			if (this.anInt3347 + arg0 < this.anInt3346) {
				this.anInt3347 += arg0;
				this.method2591(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3346 - this.anInt3347;
			this.method2591(local29);
			arg0 -= local29;
			this.anInt3347 += local29;
			this.method2596();
			@Pc(50) Class2_Sub18 local50 = (Class2_Sub18) this.aClass81_12.method2682();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1551(this);
				if (local58 < 0) {
					local50.anInt1896 = 0;
					this.method2593(local50);
				} else {
					local50.anInt1896 = local58;
					this.method2595(local50.aClass2_214, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()I")
	@Override
	public int method2589() {
		return 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2584(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3346 < 0) {
				this.method2594(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3347 + arg2 < this.anInt3346) {
				this.anInt3347 += arg2;
				this.method2594(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3346 - this.anInt3347;
			this.method2594(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3347 += local33;
			this.method2596();
			@Pc(60) Class2_Sub18 local60 = (Class2_Sub18) this.aClass81_12.method2682();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1551(this);
				if (local68 < 0) {
					local60.anInt1896 = 0;
					this.method2593(local60);
				} else {
					local60.anInt1896 = local68;
					this.method2595(local60.aClass2_214, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!kc;)V")
	public synchronized void method2590(@OriginalArg(0) Class2_Sub14 arg0) {
		this.aClass81_11.method2679(arg0);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	private void method2591(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub14 local5 = (Class2_Sub14) this.aClass81_11.method2682(); local5 != null; local5 = (Class2_Sub14) this.aClass81_11.method2686()) {
			local5.method2587(arg0);
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(Lclient!kc;)V")
	public synchronized void method2592(@OriginalArg(0) Class2_Sub14 arg0) {
		arg0.method3007();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!kg;)V")
	private void method2593(@OriginalArg(0) Class2_Sub18 arg0) {
		arg0.method3007();
		arg0.method1550();
		@Pc(9) Class2 local9 = this.aClass81_12.aClass2_189.aClass2_214;
		if (local9 == this.aClass81_12.aClass2_189) {
			this.anInt3346 = -1;
		} else {
			this.anInt3346 = ((Class2_Sub18) local9).anInt1896;
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "([III)V")
	private void method2594(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub14 local5 = (Class2_Sub14) this.aClass81_11.method2682(); local5 != null; local5 = (Class2_Sub14) this.aClass81_11.method2686()) {
			local5.method2585(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()Lclient!kc;")
	@Override
	public Class2_Sub14 method2588() {
		return (Class2_Sub14) this.aClass81_11.method2686();
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()Lclient!kc;")
	@Override
	public Class2_Sub14 method2586() {
		return (Class2_Sub14) this.aClass81_11.method2682();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!hb;Lclient!kg;)V")
	private void method2595(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub18 arg1) {
		while (arg0 != this.aClass81_12.aClass2_189 && ((Class2_Sub18) arg0).anInt1896 <= arg1.anInt1896) {
			arg0 = arg0.aClass2_214;
		}
		this.aClass81_12.method2688(arg0, arg1);
		this.anInt3346 = ((Class2_Sub18) this.aClass81_12.aClass2_189.aClass2_214).anInt1896;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "()V")
	private void method2596() {
		if (this.anInt3347 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub18 local8 = (Class2_Sub18) this.aClass81_12.method2682(); local8 != null; local8 = (Class2_Sub18) this.aClass81_12.method2686()) {
			local8.anInt1896 -= this.anInt3347;
		}
		this.anInt3346 -= this.anInt3347;
		this.anInt3347 = 0;
	}
}
