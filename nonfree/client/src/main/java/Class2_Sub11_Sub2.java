import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class2_Sub11_Sub2 extends Class2_Sub11 {

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Lclient!fh;")
	private final Class114 aClass114_17 = new Class114();

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "Lclient!fh;")
	private final Class114 aClass114_18 = new Class114();

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
	private int anInt3458 = 0;

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
	private int anInt3459 = -1;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!lea;)V")
	public synchronized void method2950(@OriginalArg(0) Class2_Sub11 arg0) {
		arg0.method8920();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!dfa;Lclient!wr;)V")
	private void method2951(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub51 arg1) {
		while (arg0 != this.aClass114_18.aClass2_90 && ((Class2_Sub51) arg0).anInt10433 <= arg1.anInt10433) {
			arg0 = arg0.aClass2_300;
		}
		Static296.method4688(arg0, arg1);
		this.anInt3459 = ((Class2_Sub51) this.aClass114_18.aClass2_90.aClass2_300).anInt10433;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6159(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3459 < 0) {
				this.method2953(arg0);
				return;
			}
			if (this.anInt3458 + arg0 < this.anInt3459) {
				this.anInt3458 += arg0;
				this.method2953(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3459 - this.anInt3458;
			this.method2953(local29);
			arg0 -= local29;
			this.anInt3458 += local29;
			this.method2954();
			@Pc(50) Class2_Sub51 local50 = (Class2_Sub51) this.aClass114_18.method2772();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method8870(this);
				if (local58 < 0) {
					local50.anInt10433 = 0;
					this.method2957(local50);
				} else {
					local50.anInt10433 = local58;
					this.method2951(local50.aClass2_300, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(Lclient!lea;)V")
	public synchronized void method2952(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass114_17.method2759(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "()I")
	@Override
	public int method6161() {
		return 0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6155(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3459 < 0) {
				this.method2956(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3458 + arg2 < this.anInt3459) {
				this.anInt3458 += arg2;
				this.method2956(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3459 - this.anInt3458;
			this.method2956(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3458 += local33;
			this.method2954();
			@Pc(60) Class2_Sub51 local60 = (Class2_Sub51) this.aClass114_18.method2772();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method8870(this);
				if (local68 < 0) {
					local60.anInt10433 = 0;
					this.method2957(local60);
				} else {
					local60.anInt10433 = local68;
					this.method2951(local60.aClass2_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	private void method2953(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub11 local5 = (Class2_Sub11) this.aClass114_17.method2772(); local5 != null; local5 = (Class2_Sub11) this.aClass114_17.method2762()) {
			local5.method6159(arg0);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "()Lclient!lea;")
	@Override
	public Class2_Sub11 method6156() {
		return (Class2_Sub11) this.aClass114_17.method2772();
	}

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "()V")
	private void method2954() {
		if (this.anInt3458 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub51 local8 = (Class2_Sub51) this.aClass114_18.method2772(); local8 != null; local8 = (Class2_Sub51) this.aClass114_18.method2762()) {
			local8.anInt10433 -= this.anInt3458;
		}
		this.anInt3459 -= this.anInt3458;
		this.anInt3458 = 0;
	}

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "()I")
	public synchronized int method2955() {
		return this.aClass114_17.method2766();
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "([III)V")
	private void method2956(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub11 local5 = (Class2_Sub11) this.aClass114_17.method2772(); local5 != null; local5 = (Class2_Sub11) this.aClass114_17.method2762()) {
			local5.method6158(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "()Lclient!lea;")
	@Override
	public Class2_Sub11 method6157() {
		return (Class2_Sub11) this.aClass114_17.method2762();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!wr;)V")
	private void method2957(@OriginalArg(0) Class2_Sub51 arg0) {
		arg0.method8920();
		arg0.method8871();
		@Pc(9) Class2 local9 = this.aClass114_18.aClass2_90.aClass2_300;
		if (local9 == this.aClass114_18.aClass2_90) {
			this.anInt3459 = -1;
		} else {
			this.anInt3459 = ((Class2_Sub51) local9).anInt10433;
		}
	}
}
