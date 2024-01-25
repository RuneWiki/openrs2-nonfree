import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!nr", name = "M", descriptor = "Lclient!bv;")
	private Class21_Sub2 aClass21_Sub2_5;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
	private int anInt4507 = -32768;

	@OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
	private int anInt4515 = 0;

	@OriginalMember(owner = "client!nr", name = "R", descriptor = "I")
	private final int anInt4517 = -1;

	@OriginalMember(owner = "client!nr", name = "U", descriptor = "Z")
	public boolean aBoolean323 = false;

	@OriginalMember(owner = "client!nr", name = "V", descriptor = "I")
	private int anInt4520 = 0;

	@OriginalMember(owner = "client!nr", name = "cb", descriptor = "I")
	private int anInt4526 = 0;

	@OriginalMember(owner = "client!nr", name = "S", descriptor = "I")
	public final int anInt4518;

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
	private final int anInt4512;

	@OriginalMember(owner = "client!nr", name = "Z", descriptor = "I")
	private final int anInt4523;

	@OriginalMember(owner = "client!nr", name = "Y", descriptor = "Lclient!jp;")
	private Class128 aClass128_2;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class3_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4518 = arg1 + arg2;
		this.anInt4526 = arg12;
		this.anInt4512 = arg0;
		this.anInt4523 = arg4;
		@Pc(49) Class229 local49 = Static431.aClass36_2.method696(this.anInt4512);
		@Pc(52) int local52 = local49.anInt6240;
		if (local52 == -1) {
			this.aBoolean323 = true;
		} else {
			this.aClass128_2 = Static334.aClass62_2.method1418(local52);
			this.aBoolean323 = false;
		}
		if (this.anInt4518 == arg2) {
			Static128.method1905(this.aClass128_2, super.anInt6835, false, super.aByte91, super.anInt6833, this.anInt4515);
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)I")
	@Override
	public int method5286() {
		return this.anInt4507;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
		@Pc(11) Class59 local11 = this.method3690(0, arg0, this.anInt4512);
		if (local11 != null) {
			this.method3689(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		@Pc(23) Class59 local23 = this.method3690((this.anInt4526 == 0 ? 0 : 5) | 0x800, arg0, this.anInt4512);
		if (local23 == null) {
			return null;
		}
		if (this.anInt4526 != 0) {
			local23.ma(this.anInt4526 * 2048);
		}
		@Pc(39) Class31 local39 = arg0.method5539();
		local39.U(super.anInt6833, super.anInt6832, super.anInt6835);
		if (this.aClass21_Sub2_5 == null) {
			local23.method5736(local39, null, 0);
		} else {
			@Pc(54) Class256 local54 = this.aClass21_Sub2_5.method634();
			arg0.method5551(local23, local54, local39, null);
		}
		this.anInt4507 = local23.B();
		this.method3689(local23, arg0);
		return null;
	}

	@OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub2_5 != null) {
			this.aClass21_Sub2_5.method635();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)V")
	public void method3685(@OriginalArg(0) int arg0) {
		if (this.aBoolean323) {
			return;
		}
		this.anInt4520 += arg0;
		while (this.aClass128_2.anIntArray276[this.anInt4515] < this.anInt4520) {
			this.anInt4520 -= this.aClass128_2.anIntArray276[this.anInt4515];
			this.anInt4515++;
			if (this.anInt4515 >= this.aClass128_2.anIntArray278.length) {
				this.aBoolean323 = true;
				break;
			}
		}
		if (!this.aBoolean323) {
			Static128.method1905(this.aClass128_2, super.anInt6835, false, super.aByte91, super.anInt6833, this.anInt4515);
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
	public void method3687() {
		if (this.aClass21_Sub2_5 != null) {
			this.aClass21_Sub2_5.method635();
		}
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!e;BLclient!za;)V")
	private void method3689(@OriginalArg(0) Class59 arg0, @OriginalArg(2) Class163 arg1) {
		@Pc(6) Class155[] local6 = arg0.method5742();
		@Pc(16) Class199[] local16 = arg0.method5749();
		if ((this.aClass21_Sub2_5 == null || this.aClass21_Sub2_5.aBoolean68) && (local6 != null || local16 != null)) {
			this.aClass21_Sub2_5 = new Class21_Sub2(Static266.anInt4392);
		}
		if (this.aClass21_Sub2_5 != null) {
			this.aClass21_Sub2_5.method641(arg1, (long) Static266.anInt4392, local6, local16);
			this.aClass21_Sub2_5.method637(super.aByte91, super.aShort92, super.aShort91, super.aShort89, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!za;BI)Lclient!e;")
	private Class59 method3690(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class229 local8 = Static431.aClass36_2.method696(arg2);
		@Pc(18) Class162 local18 = Static314.aClass162Array2[super.aByte91];
		@Pc(31) Class162 local31 = this.anInt4523 >= 3 ? null : Static314.aClass162Array2[this.anInt4523 + 1];
		return this.aBoolean323 ? local8.method4859(local18, 0, super.anInt6832, -1, arg0, local31, arg1, -1, Static334.aClass62_2, super.anInt6835, super.anInt6833) : local8.method4859(local18, this.anInt4520, super.anInt6832, this.anInt4517, arg0, local31, arg1, this.anInt4515, Static334.aClass62_2, super.anInt6835, super.anInt6833);
	}
}
