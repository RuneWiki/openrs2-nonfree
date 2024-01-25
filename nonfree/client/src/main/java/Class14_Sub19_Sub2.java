import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class14_Sub19_Sub2 extends Class14_Sub19 {

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!bd;")
	private final Class18 aClass18_27 = new Class18();

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!bd;")
	private final Class18 aClass18_28 = new Class18();

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	private int anInt4729 = 0;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	private int anInt4730 = -1;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()I")
	@Override
	public int method5509() {
		return 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!kp;")
	@Override
	public Class14_Sub19 method5506() {
		return (Class14_Sub19) this.aClass18_27.method459();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!kp;)V")
	public synchronized void method4245(@OriginalArg(0) Class14_Sub19 arg0) {
		arg0.method5986();
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
	private void method4246(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class14_Sub19 local5 = (Class14_Sub19) this.aClass18_27.method459(); local5 != null; local5 = (Class14_Sub19) this.aClass18_27.method453()) {
			local5.method5507(arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!tf;Lclient!db;)V")
	private void method4247(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14_Sub8 arg1) {
		while (arg0 != this.aClass18_28.aClass14_17 && ((Class14_Sub8) arg0).anInt1295 <= arg1.anInt1295) {
			arg0 = arg0.aClass14_248;
		}
		Static218.method3934(arg1, arg0);
		this.anInt4730 = ((Class14_Sub8) this.aClass18_28.aClass14_17.aClass14_248).anInt1295;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5507(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4730 < 0) {
				this.method4246(arg0);
				return;
			}
			if (this.anInt4729 + arg0 < this.anInt4730) {
				this.anInt4729 += arg0;
				this.method4246(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4730 - this.anInt4729;
			this.method4246(local29);
			arg0 -= local29;
			this.anInt4729 += local29;
			this.method4251();
			@Pc(50) Class14_Sub8 local50 = (Class14_Sub8) this.aClass18_28.method459();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1230(this);
				if (local58 < 0) {
					local50.anInt1295 = 0;
					this.method4249(local50);
				} else {
					local50.anInt1295 = local58;
					this.method4247(local50.aClass14_248, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lclient!kp;)V")
	public synchronized void method4248(@OriginalArg(0) Class14_Sub19 arg0) {
		this.aClass18_27.method456(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!kp;")
	@Override
	public Class14_Sub19 method5508() {
		return (Class14_Sub19) this.aClass18_27.method453();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!db;)V")
	private void method4249(@OriginalArg(0) Class14_Sub8 arg0) {
		arg0.method5986();
		arg0.method1231();
		@Pc(9) Class14 local9 = this.aClass18_28.aClass14_17.aClass14_248;
		if (local9 == this.aClass18_28.aClass14_17) {
			this.anInt4730 = -1;
		} else {
			this.anInt4730 = ((Class14_Sub8) local9).anInt1295;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "([III)V")
	private void method4250(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class14_Sub19 local5 = (Class14_Sub19) this.aClass18_27.method459(); local5 != null; local5 = (Class14_Sub19) this.aClass18_27.method453()) {
			local5.method5505(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5504(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4730 < 0) {
				this.method4250(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4729 + arg2 < this.anInt4730) {
				this.anInt4729 += arg2;
				this.method4250(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4730 - this.anInt4729;
			this.method4250(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4729 += local33;
			this.method4251();
			@Pc(60) Class14_Sub8 local60 = (Class14_Sub8) this.aClass18_28.method459();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1230(this);
				if (local68 < 0) {
					local60.anInt1295 = 0;
					this.method4249(local60);
				} else {
					local60.anInt1295 = local68;
					this.method4247(local60.aClass14_248, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "()V")
	private void method4251() {
		if (this.anInt4729 <= 0) {
			return;
		}
		for (@Pc(8) Class14_Sub8 local8 = (Class14_Sub8) this.aClass18_28.method459(); local8 != null; local8 = (Class14_Sub8) this.aClass18_28.method453()) {
			local8.anInt1295 -= this.anInt4729;
		}
		this.anInt4730 -= this.anInt4729;
		this.anInt4729 = 0;
	}
}
