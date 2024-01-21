import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class5_Sub11_Sub4 extends Class5_Sub11 {

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!sg;")
	private final Class91 aClass91_17 = new Class91();

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!sg;")
	private final Class91 aClass91_18 = new Class91();

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	private int anInt3787 = -1;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private int anInt3788 = 0;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "([III)V")
	private void method2871(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub11 local5 = (Class5_Sub11) this.aClass91_17.method2684(); local5 != null; local5 = (Class5_Sub11) this.aClass91_17.method2678()) {
			local5.method2867(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!f;)V")
	public synchronized void method2872(@OriginalArg(0) Class5_Sub11 arg0) {
		this.aClass91_17.method2681(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ob;)V")
	private void method2873(@OriginalArg(0) Class5_Sub22 arg0) {
		arg0.method3207();
		arg0.method2078();
		@Pc(9) Class5 local9 = this.aClass91_18.aClass5_173.aClass5_209;
		if (local9 == this.aClass91_18.aClass5_173) {
			this.anInt3787 = -1;
		} else {
			this.anInt3787 = ((Class5_Sub22) local9).anInt2799;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
	@Override
	public int method2864() {
		return 0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2869(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3787 < 0) {
				this.method2871(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3788 + arg2 < this.anInt3787) {
				this.anInt3788 += arg2;
				this.method2871(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3787 - this.anInt3788;
			this.method2871(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3788 += local33;
			this.method2874();
			@Pc(60) Class5_Sub22 local60 = (Class5_Sub22) this.aClass91_18.method2684();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2079(this);
				if (local68 < 0) {
					local60.anInt2799 = 0;
					this.method2873(local60);
				} else {
					local60.anInt2799 = local68;
					this.method2876(local60.aClass5_209, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()Lclient!f;")
	@Override
	public Class5_Sub11 method2866() {
		return (Class5_Sub11) this.aClass91_17.method2684();
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "()V")
	private void method2874() {
		if (this.anInt3788 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub22 local8 = (Class5_Sub22) this.aClass91_18.method2684(); local8 != null; local8 = (Class5_Sub22) this.aClass91_18.method2678()) {
			local8.anInt2799 -= this.anInt3788;
		}
		this.anInt3787 -= this.anInt3788;
		this.anInt3788 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	private void method2875(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub11 local5 = (Class5_Sub11) this.aClass91_17.method2684(); local5 != null; local5 = (Class5_Sub11) this.aClass91_17.method2678()) {
			local5.method2870(arg0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()Lclient!f;")
	@Override
	public Class5_Sub11 method2865() {
		return (Class5_Sub11) this.aClass91_17.method2678();
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2870(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3787 < 0) {
				this.method2875(arg0);
				return;
			}
			if (this.anInt3788 + arg0 < this.anInt3787) {
				this.anInt3788 += arg0;
				this.method2875(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3787 - this.anInt3788;
			this.method2875(local29);
			arg0 -= local29;
			this.anInt3788 += local29;
			this.method2874();
			@Pc(50) Class5_Sub22 local50 = (Class5_Sub22) this.aClass91_18.method2684();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2079(this);
				if (local58 < 0) {
					local50.anInt2799 = 0;
					this.method2873(local50);
				} else {
					local50.anInt2799 = local58;
					this.method2876(local50.aClass5_209, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ej;Lclient!ob;)V")
	private void method2876(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub22 arg1) {
		while (arg0 != this.aClass91_18.aClass5_173 && ((Class5_Sub22) arg0).anInt2799 <= arg1.anInt2799) {
			arg0 = arg0.aClass5_209;
		}
		this.aClass91_18.method2688(arg0, arg1);
		this.anInt3787 = ((Class5_Sub22) this.aClass91_18.aClass5_173.aClass5_209).anInt2799;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!f;)V")
	public synchronized void method2877(@OriginalArg(0) Class5_Sub11 arg0) {
		arg0.method3207();
	}
}
