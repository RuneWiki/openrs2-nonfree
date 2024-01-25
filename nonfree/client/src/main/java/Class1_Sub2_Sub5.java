import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!os", name = "J", descriptor = "Lclient!jg;")
	private Class23_Sub3 aClass23_Sub3_3;

	@OriginalMember(owner = "client!os", name = "H", descriptor = "I")
	private int anInt5260 = -32768;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "I")
	private int anInt5250 = 0;

	@OriginalMember(owner = "client!os", name = "B", descriptor = "Z")
	public boolean aBoolean382 = false;

	@OriginalMember(owner = "client!os", name = "S", descriptor = "I")
	private int anInt5267 = 0;

	@OriginalMember(owner = "client!os", name = "V", descriptor = "I")
	private int anInt5269 = 0;

	@OriginalMember(owner = "client!os", name = "R", descriptor = "I")
	private final int anInt5266 = -1;

	@OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
	public final int anInt5272;

	@OriginalMember(owner = "client!os", name = "G", descriptor = "I")
	private final int anInt5259;

	@OriginalMember(owner = "client!os", name = "D", descriptor = "I")
	private final int anInt5256;

	@OriginalMember(owner = "client!os", name = "L", descriptor = "Lclient!vr;")
	private Class261 aClass261_2;

	static {
		new Class174("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt5272 = arg1 + arg2;
		this.anInt5267 = arg12;
		this.anInt5259 = arg4;
		this.anInt5256 = arg0;
		@Pc(49) Class52 local49 = Static387.aClass201_2.method4775(this.anInt5256);
		@Pc(52) int local52 = local49.anInt1397;
		if (local52 == -1) {
			this.aBoolean382 = true;
		} else {
			this.aClass261_2 = Static444.aClass59_3.method1552(local52);
			this.aBoolean382 = false;
		}
		if (this.anInt5272 == arg2) {
			Static192.method3007(this.aClass261_2, super.aByte101, this.anInt5250, super.anInt7560, super.anInt7557, false);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIBLclient!qa;)Lclient!ka;")
	private Class108 method4336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(14) Class52 local14 = Static387.aClass201_2.method4775(arg1);
		@Pc(19) Class55 local19 = Static182.aClass55Array2[super.aByte101];
		@Pc(34) Class55 local34 = this.anInt5259 >= 3 ? null : Static182.aClass55Array2[this.anInt5259 + 1];
		return this.aBoolean382 ? local14.method1408(super.anInt7563, super.anInt7560, local34, -1, Static444.aClass59_3, arg2, -1, 0, local19, super.anInt7557, arg0) : local14.method1408(super.anInt7563, super.anInt7560, local34, this.anInt5266, Static444.aClass59_3, arg2, this.anInt5250, this.anInt5269, local19, super.anInt7557, arg0);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!os", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass23_Sub3_3 != null) {
			this.aClass23_Sub3_3.method2967();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public void method4337() {
		if (this.aClass23_Sub3_3 != null) {
			this.aClass23_Sub3_3.method2967();
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
		@Pc(19) Class108 local19 = this.method4336(0, this.anInt5256, arg0);
		if (local19 != null) {
			this.method4340(local19, arg0);
		}
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLclient!ka;Lclient!qa;)V")
	private void method4340(@OriginalArg(1) Class108 arg0, @OriginalArg(2) Class167 arg1) {
		@Pc(6) Class141[] local6 = arg0.method4944();
		@Pc(9) Class95[] local9 = arg0.method4940();
		if ((this.aClass23_Sub3_3 == null || this.aClass23_Sub3_3.aBoolean265) && (local6 != null || local9 != null)) {
			this.aClass23_Sub3_3 = new Class23_Sub3(Static172.anInt3107);
		}
		if (this.aClass23_Sub3_3 != null) {
			this.aClass23_Sub3_3.method2972(arg1, (long) Static172.anInt3107, local6, local9);
			this.aClass23_Sub3_3.method2971(super.aByte101, super.aShort108, super.aShort109, super.aShort107, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)I")
	@Override
	public int method6184() {
		return this.anInt5260;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		@Pc(21) Class108 local21 = this.method4336((this.anInt5267 == 0 ? 0 : 5) | 0x800, this.anInt5256, arg0);
		if (local21 == null) {
			return null;
		}
		if (this.anInt5267 != 0) {
			local21.l(this.anInt5267 * 2048);
		}
		@Pc(38) Class11 local38 = arg0.method5989();
		local38.C(super.anInt7560, super.anInt7563, super.anInt7557);
		if (this.aClass23_Sub3_3 == null) {
			local21.method4931(local38, null, 0);
		} else {
			@Pc(60) Class77 local60 = this.aClass23_Sub3_3.method2974();
			arg0.method5999(local21, local60, local38, null);
		}
		this.anInt5260 = local21.ja();
		this.method4340(local21, arg0);
		return null;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(BI)V")
	public void method4343(@OriginalArg(1) int arg0) {
		if (this.aBoolean382) {
			return;
		}
		this.anInt5269 += arg0;
		while (this.anInt5269 > this.aClass261_2.anIntArray493[this.anInt5250]) {
			this.anInt5269 -= this.aClass261_2.anIntArray493[this.anInt5250];
			this.anInt5250++;
			if (this.aClass261_2.anIntArray494.length <= this.anInt5250) {
				this.aBoolean382 = true;
				break;
			}
		}
		if (!this.aBoolean382) {
			Static192.method3007(this.aClass261_2, super.aByte101, this.anInt5250, super.anInt7560, super.anInt7557, false);
		}
	}
}
