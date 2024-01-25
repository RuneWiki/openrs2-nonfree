import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!wj", name = "D", descriptor = "Lclient!l;")
	private Class98_Sub3 aClass98_Sub3_7;

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "Z")
	public boolean aBoolean732 = false;

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
	private int anInt9547 = 0;

	@OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
	private int anInt9550 = 0;

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
	private int anInt9545 = -32768;

	@OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
	private int anInt9559 = 0;

	@OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
	private final int anInt9561 = -1;

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
	private final int anInt9548;

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
	public final int anInt9543;

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
	private final int anInt9556;

	@OriginalMember(owner = "client!wj", name = "I", descriptor = "Lclient!cu;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class4_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt9548 = arg0;
		this.anInt9543 = arg1 + arg2;
		this.anInt9559 = arg12;
		this.anInt9556 = arg4;
		@Pc(49) Class10 local49 = Static289.aClass66_7.method1652(this.anInt9548);
		@Pc(52) int local52 = local49.anInt334;
		if (local52 == -1) {
			this.aBoolean732 = true;
		} else {
			this.aClass57_3 = Static78.aClass298_2.method6521(local52);
			this.aBoolean732 = false;
		}
		if (arg2 == this.anInt9543) {
			Static520.method6532(super.aByte108, this.aClass57_3, false, super.anInt9542, this.anInt9550, super.anInt9540);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!oa;III)Lclient!ba;")
	private Class20 method7793(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10 local8 = Static289.aClass66_7.method1652(arg1);
		@Pc(17) Class59 local17 = Static273.aClass59Array4[super.aByte108];
		@Pc(32) Class59 local32 = this.anInt9556 < 3 ? Static273.aClass59Array4[this.anInt9556 + 1] : null;
		return this.aBoolean732 ? local8.method250(0, -1, super.anInt9542, local32, super.anInt9540, arg2, Static78.aClass298_2, local17, super.anInt9541, -1, arg0) : local8.method250(this.anInt9547, this.anInt9550, super.anInt9542, local32, super.anInt9540, arg2, Static78.aClass298_2, local17, super.anInt9541, this.anInt9561, arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
	public void method7794(@OriginalArg(1) int arg0) {
		if (this.aBoolean732) {
			return;
		}
		this.anInt9547 += arg0;
		while (this.aClass57_3.anIntArray130[this.anInt9550] < this.anInt9547) {
			this.anInt9547 -= this.aClass57_3.anIntArray130[this.anInt9550];
			this.anInt9550++;
			if (this.aClass57_3.anIntArray132.length <= this.anInt9550) {
				this.aBoolean732 = true;
				break;
			}
		}
		if (!this.aBoolean732) {
			Static520.method6532(super.aByte108, this.aClass57_3, false, super.anInt9542, this.anInt9550, super.anInt9540);
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
		@Pc(11) Class20 local11 = this.method7793(arg0, this.anInt9548, 0);
		if (local11 != null) {
			@Pc(20) Class54 local20 = arg0.method6851();
			local20.GA(super.anInt9542, super.anInt9541, super.anInt9540);
			this.method7795(arg0, local20, local11);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!oa;Lclient!q;ILclient!ba;)V")
	private void method7795(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(3) Class20 arg2) {
		arg2.method7263(arg1);
		@Pc(13) Class85[] local13 = arg2.method7267();
		@Pc(16) Class90[] local16 = arg2.method7261();
		if ((this.aClass98_Sub3_7 == null || this.aClass98_Sub3_7.aBoolean369) && (local13 != null || local16 != null)) {
			this.aClass98_Sub3_7 = Static275.method4528(Static312.anInt5688, true);
		}
		if (this.aClass98_Sub3_7 != null) {
			this.aClass98_Sub3_7.method4538(arg0, (long) Static312.anInt5688, local13, local16);
			this.aClass98_Sub3_7.method4530(super.aByte108, super.aShort126, super.aShort123, super.aShort125, super.aShort124);
		}
	}

	@OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass98_Sub3_7 != null) {
			this.aClass98_Sub3_7.method4537();
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		@Pc(18) Class20 local18 = this.method7793(arg0, this.anInt9548, (this.anInt9559 == 0 ? 0 : 5) | 0x800);
		if (local18 == null) {
			return null;
		}
		if (this.anInt9559 != 0) {
			local18.I(this.anInt9559 * 2048);
		}
		@Pc(40) Class54 local40 = arg0.method6851();
		local40.GA(super.anInt9542, super.anInt9541, super.anInt9540);
		this.method7795(arg0, local40, local18);
		if (this.aClass98_Sub3_7 == null) {
			local18.method7256(local40, null, 0);
		} else {
			@Pc(61) Class144 local61 = this.aClass98_Sub3_7.method4532();
			arg0.method6856(local18, local61, local40, null, 0);
		}
		this.anInt9545 = local18.DA();
		return null;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public void method7799() {
		if (this.aClass98_Sub3_7 != null) {
			this.aClass98_Sub3_7.method4537();
		}
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)I")
	@Override
	public int method7790() {
		return this.anInt9545;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		throw new IllegalStateException();
	}
}
