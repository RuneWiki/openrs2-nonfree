import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class15_Sub2_Sub5 extends Class15_Sub2 {

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "Lclient!qp;")
	private Class30_Sub7 aClass30_Sub7_6;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	private int anInt7470 = 0;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "Z")
	public boolean aBoolean532 = false;

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
	private int anInt7497 = 0;

	@OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
	private int anInt7498 = 0;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	private final int anInt7483 = -1;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
	private int anInt7475 = -32768;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
	private final int anInt7473;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
	private final int anInt7479;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	public final int anInt7487;

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "Lclient!bj;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class15_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7473 = arg4;
		this.anInt7479 = arg0;
		this.anInt7497 = arg12;
		this.anInt7487 = arg2 + arg1;
		@Pc(49) Class48 local49 = Static501.aClass41_2.method1068(this.anInt7479);
		@Pc(52) int local52 = local49.anInt1218;
		if (local52 == -1) {
			this.aBoolean532 = true;
		} else {
			this.aClass31_2 = Static155.aClass76_2.method2152(local52);
			this.aBoolean532 = false;
		}
		if (arg2 == this.anInt7487) {
			Static279.method4554(false, super.anInt8493, this.anInt7470, this.aClass31_2, super.anInt8492, super.aByte91);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BIILclient!qa;)Lclient!r;")
	private Class36 method6071(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(13) Class48 local13 = Static501.aClass41_2.method1068(arg0);
		@Pc(18) Class131 local18 = Static493.aClass131Array5[super.aByte91];
		@Pc(31) Class131 local31 = this.anInt7473 < 3 ? Static493.aClass131Array5[this.anInt7473 + 1] : null;
		return this.aBoolean532 ? local13.method1171(0, local31, super.anInt8494, local18, arg2, arg1, Static155.aClass76_2, -1, super.anInt8492, super.anInt8493, -1) : local13.method1171(this.anInt7498, local31, super.anInt8494, local18, arg2, arg1, Static155.aClass76_2, this.anInt7483, super.anInt8492, super.anInt8493, this.anInt7470);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		@Pc(18) Class36 local18 = this.method6071(this.anInt7479, (this.anInt7497 == 0 ? 0 : 5) | 0x800, arg0);
		if (local18 == null) {
			return null;
		}
		if (this.anInt7497 != 0) {
			local18.OA(this.anInt7497 * 2048);
		}
		@Pc(34) Class78 local34 = arg0.method6994();
		local34.oa(super.anInt8492, super.anInt8494, super.anInt8493);
		if (this.aClass30_Sub7_6 == null) {
			local18.method7360(local34, null, 0);
		} else {
			@Pc(49) Class267 local49 = this.aClass30_Sub7_6.method5906();
			arg0.method7066(local18, local49, local34, null);
		}
		this.anInt7475 = local18.TA();
		this.method6072(arg0, local18);
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLclient!qa;Lclient!r;)V")
	private void method6072(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class36 arg1) {
		@Pc(6) Class223[] local6 = arg1.method7350();
		@Pc(9) Class280[] local9 = arg1.method7361();
		if ((this.aClass30_Sub7_6 == null || this.aClass30_Sub7_6.aBoolean513) && (local6 != null || local9 != null)) {
			this.aClass30_Sub7_6 = Static407.method5909(Static481.anInt8318);
		}
		if (this.aClass30_Sub7_6 != null) {
			this.aClass30_Sub7_6.method5901(arg0, (long) Static481.anInt8318, local6, local9);
			this.aClass30_Sub7_6.method5902(super.aByte91, super.aShort110, super.aShort111, super.aShort109, super.aShort108);
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)I")
	@Override
	public int method6864() {
		return this.anInt7475;
	}

	@OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass30_Sub7_6 != null) {
			this.aClass30_Sub7_6.method5903();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
		@Pc(22) Class36 local22 = this.method6071(this.anInt7479, 0, arg0);
		if (local22 != null) {
			this.method6072(arg0, local22);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public void method6079(@OriginalArg(0) int arg0) {
		if (this.aBoolean532) {
			return;
		}
		this.anInt7498 += arg0;
		while (this.anInt7498 > this.aClass31_2.anIntArray68[this.anInt7470]) {
			this.anInt7498 -= this.aClass31_2.anIntArray68[this.anInt7470];
			this.anInt7470++;
			if (this.aClass31_2.anIntArray69.length <= this.anInt7470) {
				this.aBoolean532 = true;
				break;
			}
		}
		if (!this.aBoolean532) {
			Static279.method4554(false, super.anInt8493, this.anInt7470, this.aClass31_2, super.anInt8492, super.aByte91);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)V")
	public void method6081() {
		if (this.aClass30_Sub7_6 != null) {
			this.aClass30_Sub7_6.method5903();
		}
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		throw new IllegalStateException();
	}
}
