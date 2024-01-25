import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class11_Sub3_Sub1 extends Class11_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!dda", name = "N", descriptor = "Lclient!gr;")
	private Class122 aClass122_1;

	@OriginalMember(owner = "client!dda", name = "L", descriptor = "Z")
	private final boolean aBoolean196;

	@OriginalMember(owner = "client!dda", name = "w", descriptor = "S")
	private final short aShort22;

	@OriginalMember(owner = "client!dda", name = "z", descriptor = "B")
	private final byte aByte26;

	@OriginalMember(owner = "client!dda", name = "T", descriptor = "B")
	private final byte aByte28;

	@OriginalMember(owner = "client!dda", name = "I", descriptor = "B")
	private final byte aByte27;

	@OriginalMember(owner = "client!dda", name = "E", descriptor = "Z")
	private final boolean aBoolean195;

	@OriginalMember(owner = "client!dda", name = "P", descriptor = "Z")
	private final boolean aBoolean197;

	@OriginalMember(owner = "client!dda", name = "K", descriptor = "Lclient!w;")
	private Class6_Sub4_Sub2 aClass6_Sub4_Sub2_2;

	@OriginalMember(owner = "client!dda", name = "U", descriptor = "Lclient!ba;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIZIIIII)V")
	public Class11_Sub3_Sub1(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static345.method5630(arg10, arg11));
		this.aBoolean196 = arg1.anInt1107 != 0 && !arg6;
		this.aShort22 = (short) arg1.anInt1060;
		this.aByte26 = (byte) arg11;
		this.aByte28 = (byte) arg10;
		this.aByte27 = (byte) arg2;
		super.anInt8625 = arg3;
		this.aBoolean195 = arg6;
		super.anInt8617 = arg5;
		this.aBoolean197 = arg0.method5452() && arg1.aBoolean93 && !this.aBoolean195 && Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145) != 0;
		@Pc(74) Class20 local74 = this.method1940(this.aBoolean197, 2048, arg0);
		if (local74 != null) {
			this.aClass6_Sub4_Sub2_2 = local74.aClass6_Sub4_Sub2_1;
			this.aClass23_2 = local74.aClass23_1;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8120(@OriginalArg(0) Class9 arg0) {
		@Pc(14) Class6_Sub4_Sub2 local14;
		if (this.aClass6_Sub4_Sub2_2 == null && this.aBoolean197) {
			@Pc(25) Class20 local25 = this.method1940(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub4_Sub2_1;
		} else {
			local14 = this.aClass6_Sub4_Sub2_2;
			this.aClass6_Sub4_Sub2_2 = null;
		}
		if (local14 != null) {
			Static279.method4617(local14, this.aByte27, super.anInt8625, super.anInt8617, null);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		if (this.aClass122_1 == null) {
			this.aClass122_1 = Static73.method1560(super.anInt8625, this.method1942(arg0, 0), super.anInt8617, super.anInt8619);
		}
		return this.aClass122_1;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method8118(@OriginalArg(0) Class9 arg0) {
		@Pc(32) Class6_Sub4_Sub2 local32;
		if (this.aClass6_Sub4_Sub2_2 == null && this.aBoolean197) {
			@Pc(25) Class20 local25 = this.method1940(true, 262144, arg0);
			local32 = local25 == null ? null : local25.aClass6_Sub4_Sub2_1;
		} else {
			local32 = this.aClass6_Sub4_Sub2_2;
			this.aClass6_Sub4_Sub2_2 = null;
		}
		if (local32 != null) {
			Static217.method3472(local32, this.aByte27, super.anInt8625, super.anInt8617, null);
		}
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)I")
	@Override
	public int method8121() {
		return this.aByte26;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	@Override
	public void method8115() {
		if (this.aClass23_2 != null) {
			this.aClass23_2.method7069();
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)I")
	@Override
	public int method8119() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZBILclient!oa;)Lclient!au;")
	private Class20 method1940(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(19) Class31 local19 = Static480.aClass57_11.method1469(this.aShort22 & 0xFFFF);
		@Pc(27) Class62 local27;
		@Pc(31) Class62 local31;
		if (this.aBoolean195) {
			local27 = Static369.aClass62Array3[this.aByte27];
			local31 = Static53.aClass62Array2[0];
		} else {
			local27 = Static53.aClass62Array2[this.aByte27];
			if (this.aByte27 < 3) {
				local31 = Static53.aClass62Array2[this.aByte27 + 1];
			} else {
				local31 = null;
			}
		}
		return local19.method1022(arg2, local27, super.anInt8617, super.anInt8619, this.aByte26, super.anInt8625, arg0, arg1, this.aByte28, local31);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I")
	@Override
	public int method8114() {
		return this.aShort22 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class23 local9 = this.method1942(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class8 local20 = arg1.method5417();
			local20.GA(super.anInt8625, super.anInt8619, super.anInt8617);
			return local9.method7073(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	private Class23 method1942(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass23_2 != null && arg0.method5468(this.aClass23_2.h(), arg1) == 0) {
			return this.aClass23_2;
		} else {
			@Pc(28) Class20 local28 = this.method1940(false, arg1, arg0);
			return local28 == null ? null : local28.aClass23_1;
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8116() {
		return this.aBoolean197;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		if (this.aClass23_2 == null) {
			return null;
		}
		@Pc(11) Class8 local11 = arg0.method5417();
		local11.GA(super.anInt8625 + super.anInt8628, super.anInt8619, super.anInt8627 + super.anInt8617);
		@Pc(27) Class5_Sub5 local27 = null;
		if (this.aBoolean196) {
			local27 = Static342.method5386(1);
		}
		this.aClass23_2.method7077(local11, local27 == null ? null : local27.aClass5_Sub4Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)I")
	@Override
	public int method7208() {
		return this.aClass23_2 == null ? 0 : this.aClass23_2.DA();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.method1942(arg1, arg0);
	}
}
