import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class3_Sub1_Sub3_Sub4 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "Lclient!uj;")
	private Class3_Sub9 aClass3_Sub9_6;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
	private int anInt6526 = 0;

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
	private int anInt6528 = 0;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "Z")
	private boolean aBoolean489 = true;

	@OriginalMember(owner = "client!lf", name = "ib", descriptor = "Z")
	public boolean aBoolean490 = false;

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
	private int anInt6523 = 0;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
	private int anInt6525 = 0;

	@OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
	private final int anInt6536 = -1;

	@OriginalMember(owner = "client!lf", name = "tb", descriptor = "I")
	private int anInt6542 = 0;

	@OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
	private final int anInt6541;

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "I")
	public final int anInt6535;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "Lclient!hg;")
	private Class130 aClass130_2;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class3_Sub1_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt6541 = arg0;
		this.anInt6525 = arg12;
		this.anInt6535 = arg2 + arg1;
		@Pc(53) Class109 local53 = Static459.aClass62_2.method2250(this.anInt6541);
		@Pc(56) int local56 = local53.anInt3971;
		if (local56 == -1) {
			this.aBoolean490 = true;
		} else {
			this.aClass130_2 = Static195.aClass193_1.method5573(local56);
			this.aBoolean490 = false;
		}
		if (this.anInt6535 == arg2) {
			Static609.method8918(this, this.anInt6526, this.aClass130_2);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		@Pc(23) Class166 local23 = this.method5566(arg0, this.anInt6541, (this.anInt6525 == 0 ? 0 : 5) | 0x800);
		if (local23 == null) {
			return null;
		}
		if (this.anInt6525 != 0) {
			local23.a(this.anInt6525 * 2048);
		}
		@Pc(39) Class30 local39 = arg0.method7308();
		local39.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		this.method5568(local23, arg0, local39);
		@Pc(58) Class3_Sub4 local58 = Static546.method8162(1, false);
		if (Static639.aBoolean753) {
			local23.method6678(local39, local58.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			local23.method6685(local39, local58.aClass3_Sub3Array1[0], 0);
		}
		if (this.aClass3_Sub9_6 != null) {
			@Pc(86) Class203 local86 = this.aClass3_Sub9_6.method8576();
			if (Static639.aBoolean753) {
				arg0.method7288(local86, Static380.anInt7419);
			} else {
				arg0.method7287(local86);
			}
		}
		this.aBoolean489 = local23.F();
		this.anInt6523 = local23.fa();
		this.anInt6542 = local23.ma();
		return local58;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.anInt6523;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub9_6 != null) {
			this.aClass3_Sub9_6.method8585();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ha;IIB)Lclient!ka;")
	private Class166 method5566(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class109 local13 = Static459.aClass62_2.method2250(arg1);
		@Pc(18) Class65 local18 = Static40.aClass65Array2[super.aByte132];
		@Pc(33) Class65 local33 = super.aByte131 < 3 ? Static40.aClass65Array2[super.aByte131 + 1] : null;
		return this.aBoolean490 ? local13.method3488(0, -1, super.anInt10306, arg2, arg0, -1, super.anInt10303, Static195.aClass193_1, local33, super.anInt10310, local18) : local13.method3488(this.anInt6528, this.anInt6526, super.anInt10306, arg2, arg0, this.anInt6536, super.anInt10303, Static195.aClass193_1, local33, super.anInt10310, local18);
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(Z)V")
	public void method5567() {
		if (this.aClass3_Sub9_6 != null) {
			this.aClass3_Sub9_6.method8585();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aBoolean489;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ka;Lclient!ha;ILclient!bca;)V")
	private void method5568(@OriginalArg(0) Class166 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class30 arg2) {
		arg0.method6690(arg2);
		@Pc(9) Class227[] local9 = arg0.method6689();
		@Pc(12) Class87[] local12 = arg0.method6674();
		if ((this.aClass3_Sub9_6 == null || this.aClass3_Sub9_6.aBoolean701) && (local9 != null || local12 != null)) {
			this.aClass3_Sub9_6 = Static575.method8577(Static407.anInt7704, true);
		}
		if (this.aClass3_Sub9_6 != null) {
			this.aClass3_Sub9_6.method8587(arg1, (long) Static407.anInt7704, local9, local12);
			this.aClass3_Sub9_6.method8584(super.aByte132, super.aShort118, super.aShort121, super.aShort120, super.aShort119);
		}
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 != -25675) {
			this.anInt6525 = 73;
		}
		return this.anInt6542;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
		@Pc(17) Class166 local17 = this.method5566(arg0, this.anInt6541, 0);
		if (local17 != null) {
			@Pc(22) Class30 local22 = arg0.method7308();
			local22.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			this.method5568(local17, arg0, local22);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	public void method5571(@OriginalArg(0) int arg0) {
		if (this.aBoolean490) {
			return;
		}
		this.anInt6528 += arg0;
		while (this.anInt6528 > this.aClass130_2.anIntArray242[this.anInt6526]) {
			this.anInt6528 -= this.aClass130_2.anIntArray242[this.anInt6526];
			this.anInt6526++;
			if (this.aClass130_2.anIntArray237.length <= this.anInt6526) {
				this.aBoolean490 = true;
				break;
			}
		}
		if (!this.aBoolean490) {
			Static609.method8918(this, this.anInt6526, this.aClass130_2);
		}
	}
}
