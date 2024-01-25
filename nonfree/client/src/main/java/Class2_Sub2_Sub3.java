import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lu", name = "S", descriptor = "Lclient!ru;")
	private Class55_Sub8 aClass55_Sub8_3;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
	private int anInt6194 = 0;

	@OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
	private final int anInt6200 = -1;

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
	private int anInt6207 = 0;

	@OriginalMember(owner = "client!lu", name = "M", descriptor = "Z")
	public boolean aBoolean532 = false;

	@OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
	private int anInt6202 = 0;

	@OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
	private int anInt6212 = -32768;

	@OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
	public final int anInt6205;

	@OriginalMember(owner = "client!lu", name = "T", descriptor = "I")
	private final int anInt6216;

	@OriginalMember(owner = "client!lu", name = "U", descriptor = "I")
	private final int anInt6217;

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "Lclient!jq;")
	private Class174 aClass174_1;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt6205 = arg1 + arg2;
		this.anInt6216 = arg0;
		this.anInt6217 = arg4;
		this.anInt6207 = arg12;
		@Pc(49) Class77 local49 = Static107.aClass303_1.method7476(this.anInt6216);
		@Pc(52) int local52 = local49.anInt2573;
		if (local52 == -1) {
			this.aBoolean532 = true;
		} else {
			this.aClass174_1 = Static532.aClass157_2.method3734(local52);
			this.aBoolean532 = false;
		}
		if (arg2 == this.anInt6205) {
			Static28.method957(this.aClass174_1, super.aByte103, super.anInt9396, super.anInt9398, false, this.anInt6202);
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
		@Pc(18) Class21 local18 = this.method5166(arg0, 0, this.anInt6216);
		if (local18 != null) {
			@Pc(23) Class255 local23 = arg0.method5343();
			local23.GA(super.anInt9398, super.anInt9400, super.anInt9396);
			this.method5169(local23, local18, arg0);
		}
	}

	@OriginalMember(owner = "client!lu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass55_Sub8_3 != null) {
			this.aClass55_Sub8_3.method7122();
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)I")
	@Override
	public int method7629() {
		return this.anInt6212;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
	public void method5165(@OriginalArg(1) int arg0) {
		if (this.aBoolean532) {
			return;
		}
		this.anInt6194 += arg0;
		while (this.aClass174_1.anIntArray325[this.anInt6202] < this.anInt6194) {
			this.anInt6194 -= this.aClass174_1.anIntArray325[this.anInt6202];
			this.anInt6202++;
			if (this.aClass174_1.anIntArray326.length <= this.anInt6202) {
				this.aBoolean532 = true;
				break;
			}
		}
		if (!this.aBoolean532) {
			Static28.method957(this.aClass174_1, super.aByte103, super.anInt9396, super.anInt9398, false, this.anInt6202);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!oa;II)Lclient!ba;")
	private Class21 method5166(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class77 local14 = Static107.aClass303_1.method7476(arg2);
		@Pc(19) Class4 local19 = Static381.aClass4Array2[super.aByte103];
		@Pc(34) Class4 local34 = this.anInt6217 < 3 ? Static381.aClass4Array2[this.anInt6217 + 1] : null;
		return this.aBoolean532 ? local14.method2272(Static532.aClass157_2, arg0, super.anInt9398, local34, 0, -1, arg1, super.anInt9400, local19, -1, super.anInt9396) : local14.method2272(Static532.aClass157_2, arg0, super.anInt9398, local34, this.anInt6194, this.anInt6202, arg1, super.anInt9400, local19, this.anInt6200, super.anInt9396);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public void method5167() {
		if (this.aClass55_Sub8_3 != null) {
			this.aClass55_Sub8_3.method7122();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLclient!q;Lclient!ba;Lclient!oa;)V")
	private void method5169(@OriginalArg(1) Class255 arg0, @OriginalArg(2) Class21 arg1, @OriginalArg(3) Class15 arg2) {
		arg1.method7143(arg0);
		@Pc(9) Class121[] local9 = arg1.method7138();
		@Pc(12) Class280[] local12 = arg1.method7135();
		if ((this.aClass55_Sub8_3 == null || this.aClass55_Sub8_3.aBoolean712) && (local9 != null || local12 != null)) {
			this.aClass55_Sub8_3 = Static465.method7126(Static129.anInt10429, true);
		}
		if (this.aClass55_Sub8_3 != null) {
			this.aClass55_Sub8_3.method7121(arg2, (long) Static129.anInt10429, local9, local12);
			this.aClass55_Sub8_3.method7124(super.aByte103, super.aShort120, super.aShort121, super.aShort122, super.aShort123);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		@Pc(21) Class21 local21 = this.method5166(arg0, (this.anInt6207 == 0 ? 0 : 5) | 0x800, this.anInt6216);
		if (local21 == null) {
			return null;
		}
		if (this.anInt6207 != 0) {
			local21.I(this.anInt6207 * 2048);
		}
		@Pc(37) Class255 local37 = arg0.method5343();
		local37.GA(super.anInt9398, super.anInt9400, super.anInt9396);
		this.method5169(local37, local21, arg0);
		if (this.aClass55_Sub8_3 == null) {
			local21.method7145(local37, null, 0);
		} else {
			@Pc(66) Class274 local66 = this.aClass55_Sub8_3.method7127();
			arg0.method5309(local21, local66, local37, null, 0);
		}
		this.anInt6212 = local21.DA();
		return null;
	}
}
