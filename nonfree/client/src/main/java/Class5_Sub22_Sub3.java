import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class5_Sub22_Sub3 extends Class5_Sub22 {

	@OriginalMember(owner = "client!nw", name = "o", descriptor = "Lclient!nv;")
	private final Class177 aClass177_27 = new Class177();

	@OriginalMember(owner = "client!nw", name = "p", descriptor = "Lclient!nv;")
	private final Class177 aClass177_28 = new Class177();

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
	private int anInt4569 = -1;

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "I")
	private int anInt4570 = 0;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!rf;)V")
	private void method3634(@OriginalArg(0) Class5_Sub35 arg0) {
		arg0.method6003();
		arg0.method4579();
		@Pc(9) Class5 local9 = this.aClass177_28.aClass5_167.aClass5_267;
		if (local9 == this.aClass177_28.aClass5_167) {
			this.anInt4569 = -1;
		} else {
			this.anInt4569 = ((Class5_Sub35) local9).anInt5772;
		}
	}

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "()I")
	public synchronized int method3635() {
		return this.aClass177_27.method3620();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5930(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4569 < 0) {
				this.method3640(arg0);
				return;
			}
			if (this.anInt4570 + arg0 < this.anInt4569) {
				this.anInt4570 += arg0;
				this.method3640(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4569 - this.anInt4570;
			this.method3640(local29);
			arg0 -= local29;
			this.anInt4570 += local29;
			this.method3638();
			@Pc(50) Class5_Sub35 local50 = (Class5_Sub35) this.aClass177_28.method3618();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4578(this);
				if (local58 < 0) {
					local50.anInt5772 = 0;
					this.method3634(local50);
				} else {
					local50.anInt5772 = local58;
					this.method3639(local50.aClass5_267, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4569 < 0) {
				this.method3637(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4570 + arg2 < this.anInt4569) {
				this.anInt4570 += arg2;
				this.method3637(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4569 - this.anInt4570;
			this.method3637(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4570 += local33;
			this.method3638();
			@Pc(60) Class5_Sub35 local60 = (Class5_Sub35) this.aClass177_28.method3618();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4578(this);
				if (local68 < 0) {
					local60.anInt5772 = 0;
					this.method3634(local60);
				} else {
					local60.anInt5772 = local68;
					this.method3639(local60.aClass5_267, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "()Lclient!ms;")
	@Override
	public Class5_Sub22 method5929() {
		return (Class5_Sub22) this.aClass177_27.method3618();
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "()I")
	@Override
	public int method5931() {
		return 0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!ms;)V")
	public synchronized void method3636(@OriginalArg(0) Class5_Sub22 arg0) {
		arg0.method6003();
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "([III)V")
	private void method3637(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub22 local5 = (Class5_Sub22) this.aClass177_27.method3618(); local5 != null; local5 = (Class5_Sub22) this.aClass177_27.method3619()) {
			local5.method5932(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "()V")
	private void method3638() {
		if (this.anInt4570 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub35 local8 = (Class5_Sub35) this.aClass177_28.method3618(); local8 != null; local8 = (Class5_Sub35) this.aClass177_28.method3619()) {
			local8.anInt5772 -= this.anInt4570;
		}
		this.anInt4569 -= this.anInt4570;
		this.anInt4570 = 0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!dd;Lclient!rf;)V")
	private void method3639(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub35 arg1) {
		while (arg0 != this.aClass177_28.aClass5_167 && ((Class5_Sub35) arg0).anInt5772 <= arg1.anInt5772) {
			arg0 = arg0.aClass5_267;
		}
		Static442.method5809(arg1, arg0);
		this.anInt4569 = ((Class5_Sub35) this.aClass177_28.aClass5_167.aClass5_267).anInt5772;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
	private void method3640(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub22 local5 = (Class5_Sub22) this.aClass177_27.method3618(); local5 != null; local5 = (Class5_Sub22) this.aClass177_27.method3619()) {
			local5.method5930(arg0);
		}
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Lclient!ms;)V")
	public synchronized void method3641(@OriginalArg(0) Class5_Sub22 arg0) {
		this.aClass177_27.method3611(arg0);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "()Lclient!ms;")
	@Override
	public Class5_Sub22 method5928() {
		return (Class5_Sub22) this.aClass177_27.method3619();
	}
}
