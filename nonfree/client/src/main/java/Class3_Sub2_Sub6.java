import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "[I")
	public static final int[] anIntArray496 = new int[32];

	@OriginalMember(owner = "client!uk", name = "R", descriptor = "Lclient!ko;")
	private Class57_Sub4 aClass57_Sub4_7;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
	private final int anInt7217 = -1;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
	private int anInt7224 = 0;

	@OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
	private int anInt7215 = 0;

	@OriginalMember(owner = "client!uk", name = "K", descriptor = "Z")
	public boolean aBoolean461 = false;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
	private int anInt7222 = -32768;

	@OriginalMember(owner = "client!uk", name = "ab", descriptor = "I")
	private int anInt7233 = 0;

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
	private final int anInt7226;

	@OriginalMember(owner = "client!uk", name = "bb", descriptor = "I")
	private final int anInt7234;

	@OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
	public final int anInt7220;

	@OriginalMember(owner = "client!uk", name = "db", descriptor = "Lclient!jl;")
	private Class131 aClass131_3;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray496[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class3_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7226 = arg4;
		this.anInt7234 = arg0;
		this.anInt7220 = arg1 + arg2;
		this.anInt7233 = arg12;
		@Pc(49) Class58 local49 = Static141.aClass141_2.method3177(this.anInt7234);
		@Pc(52) int local52 = local49.anInt2019;
		if (local52 == -1) {
			this.aBoolean461 = true;
		} else {
			this.aClass131_3 = Static5.aClass217_1.method5234(local52);
			this.aBoolean461 = false;
		}
		if (this.anInt7220 == arg2) {
			Static160.method2664(this.anInt7215, super.anInt7202, false, this.aClass131_3, super.anInt7207, super.aByte103);
		}
	}

	@OriginalMember(owner = "client!uk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass57_Sub4_7 != null) {
			this.aClass57_Sub4_7.method3252();
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public void method5953() {
		if (this.aClass57_Sub4_7 != null) {
			this.aClass57_Sub4_7.method3252();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!eq;I)Lclient!va;")
	private Class224 method5954(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class58 local13 = Static141.aClass141_2.method3177(arg0);
		@Pc(18) Class86 local18 = Static87.aClass86Array2[super.aByte103];
		@Pc(31) Class86 local31 = this.anInt7226 < 3 ? Static87.aClass86Array2[this.anInt7226 + 1] : null;
		return this.aBoolean461 ? local13.method1570(-1, local31, arg1, -1, 0, super.anInt7202, super.anInt7208, Static5.aClass217_1, local18, arg2, super.anInt7207) : local13.method1570(this.anInt7215, local31, arg1, this.anInt7217, this.anInt7224, super.anInt7202, super.anInt7208, Static5.aClass217_1, local18, arg2, super.anInt7207);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!eq;ILclient!va;)V")
	private void method5955(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Class224 arg1) {
		@Pc(6) Class119[] local6 = arg1.method5794();
		@Pc(9) Class94[] local9 = arg1.method5807();
		if ((this.aClass57_Sub4_7 == null || this.aClass57_Sub4_7.aBoolean262) && (local6 != null || local9 != null)) {
			this.aClass57_Sub4_7 = new Class57_Sub4(Static66.anInt1741);
		}
		if (this.aClass57_Sub4_7 != null) {
			this.aClass57_Sub4_7.method3248(arg0, (long) Static66.anInt1741, local6, local9);
			this.aClass57_Sub4_7.method3255(super.aByte103, super.aShort101, super.aShort100, super.aShort102, super.aShort99);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		@Pc(30) Class224 local30 = this.method5954(this.anInt7234, arg0, (this.anInt7233 == 0 ? 0 : 5) | 0x800);
		if (local30 == null) {
			return null;
		}
		if (this.anInt7233 != 0) {
			local30.method5839(this.anInt7233 * 2048);
		}
		@Pc(46) Class5 local46 = arg0.method5064();
		local46.method3846(super.anInt7202, super.anInt7208, super.anInt7207);
		if (this.aClass57_Sub4_7 == null) {
			local30.method5798(local46, null, 0);
		} else {
			@Pc(68) Class32 local68 = this.aClass57_Sub4_7.method3250();
			arg0.method5021(local30, local68, local46, null);
		}
		this.anInt7222 = local30.method5812();
		this.method5955(arg0, local30);
		return null;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)I")
	@Override
	public int method5947() {
		return this.anInt7222;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public void method5958(@OriginalArg(1) int arg0) {
		if (this.aBoolean461) {
			return;
		}
		this.anInt7224 += arg0;
		while (this.anInt7224 > this.aClass131_3.anIntArray233[this.anInt7215]) {
			this.anInt7224 -= this.aClass131_3.anIntArray233[this.anInt7215];
			this.anInt7215++;
			if (this.aClass131_3.anIntArray235.length <= this.anInt7215) {
				this.aBoolean461 = true;
				break;
			}
		}
		if (!this.aBoolean461) {
			Static160.method2664(this.anInt7215, super.anInt7202, false, this.aClass131_3, super.anInt7207, super.aByte103);
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
		@Pc(17) Class224 local17 = this.method5954(this.anInt7234, arg0, 0);
		if (local17 != null) {
			this.method5955(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		throw new IllegalStateException();
	}
}
