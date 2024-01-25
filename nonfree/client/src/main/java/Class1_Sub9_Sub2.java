import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class1_Sub9_Sub2 extends Class1_Sub9 {

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Lclient!vp;")
	private final Class254 aClass254_9 = new Class254();

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!vp;")
	private final Class254 aClass254_10 = new Class254();

	@OriginalMember(owner = "client!df", name = "v", descriptor = "I")
	private int anInt1193 = 0;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	private int anInt1192 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!wb;)V")
	private void method1033(@OriginalArg(0) Class1_Sub44 arg0) {
		arg0.method5617();
		arg0.method5512();
		@Pc(9) Class1 local9 = this.aClass254_10.aClass1_249.aClass1_262;
		if (local9 == this.aClass254_10.aClass1_249) {
			this.anInt1192 = -1;
		} else {
			this.anInt1192 = ((Class1_Sub44) local9).anInt7290;
		}
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "()V")
	private void method1034() {
		if (this.anInt1193 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub44 local8 = (Class1_Sub44) this.aClass254_10.method5437(); local8 != null; local8 = (Class1_Sub44) this.aClass254_10.method5433()) {
			local8.anInt7290 -= this.anInt1193;
		}
		this.anInt1192 -= this.anInt1193;
		this.anInt1193 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4592(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1192 < 0) {
				this.method1035(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1193 + arg2 < this.anInt1192) {
				this.anInt1193 += arg2;
				this.method1035(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1192 - this.anInt1193;
			this.method1035(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1193 += local33;
			this.method1034();
			@Pc(60) Class1_Sub44 local60 = (Class1_Sub44) this.aClass254_10.method5437();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5511(this);
				if (local68 < 0) {
					local60.anInt7290 = 0;
					this.method1033(local60);
				} else {
					local60.anInt7290 = local68;
					this.method1040(local60.aClass1_262, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "([III)V")
	private void method1035(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub9 local5 = (Class1_Sub9) this.aClass254_9.method5437(); local5 != null; local5 = (Class1_Sub9) this.aClass254_9.method5433()) {
			local5.method4593(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!hf;)V")
	public synchronized void method1036(@OriginalArg(0) Class1_Sub9 arg0) {
		this.aClass254_9.method5440(arg0);
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "()I")
	public synchronized int method1037() {
		return this.aClass254_9.method5431();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4597(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1192 < 0) {
				this.method1039(arg0);
				return;
			}
			if (this.anInt1193 + arg0 < this.anInt1192) {
				this.anInt1193 += arg0;
				this.method1039(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1192 - this.anInt1193;
			this.method1039(local29);
			arg0 -= local29;
			this.anInt1193 += local29;
			this.method1034();
			@Pc(50) Class1_Sub44 local50 = (Class1_Sub44) this.aClass254_10.method5437();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5511(this);
				if (local58 < 0) {
					local50.anInt7290 = 0;
					this.method1033(local50);
				} else {
					local50.anInt7290 = local58;
					this.method1040(local50.aClass1_262, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Lclient!hf;)V")
	public synchronized void method1038(@OriginalArg(0) Class1_Sub9 arg0) {
		arg0.method5617();
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()Lclient!hf;")
	@Override
	public Class1_Sub9 method4595() {
		return (Class1_Sub9) this.aClass254_9.method5437();
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	private void method1039(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub9 local5 = (Class1_Sub9) this.aClass254_9.method5437(); local5 != null; local5 = (Class1_Sub9) this.aClass254_9.method5433()) {
			local5.method4597(arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!kp;Lclient!wb;)V")
	private void method1040(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub44 arg1) {
		while (arg0 != this.aClass254_10.aClass1_249 && ((Class1_Sub44) arg0).anInt7290 <= arg1.anInt7290) {
			arg0 = arg0.aClass1_262;
		}
		Static359.method4651(arg1, arg0);
		this.anInt1192 = ((Class1_Sub44) this.aClass254_10.aClass1_249.aClass1_262).anInt7290;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()Lclient!hf;")
	@Override
	public Class1_Sub9 method4591() {
		return (Class1_Sub9) this.aClass254_9.method5433();
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()I")
	@Override
	public int method4596() {
		return 0;
	}
}
