import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 implements Interface10 {

	@OriginalMember(owner = "client!iq", name = "F", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!iq", name = "Y", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!iq", name = "bb", descriptor = "S")
	private final short aShort46;

	@OriginalMember(owner = "client!iq", name = "R", descriptor = "Z")
	private final boolean aBoolean227;

	@OriginalMember(owner = "client!iq", name = "U", descriptor = "Z")
	private final boolean aBoolean228;

	@OriginalMember(owner = "client!iq", name = "T", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!iq", name = "Q", descriptor = "Z")
	private final boolean aBoolean226;

	@OriginalMember(owner = "client!iq", name = "D", descriptor = "Lclient!va;")
	public Class224 aClass224_2;

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "Lclient!ss;")
	private Class6_Sub2_Sub10 aClass6_Sub2_Sub10_2;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!eq;Lclient!hn;IIIIIZIIIIIIZ)V")
	public Class3_Sub2_Sub4(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3181 == 1, Static387.method5709(arg13, arg12));
		this.aByte55 = (byte) arg12;
		this.aBoolean229 = arg14;
		this.aByte56 = (byte) arg13;
		this.aShort46 = (short) arg1.anInt3167;
		this.aBoolean227 = arg7;
		this.aBoolean228 = arg1.anInt3163 != 0 && !arg7;
		this.aByte57 = (byte) arg3;
		this.aBoolean226 = arg0.method4995() && arg1.aBoolean208 && !this.aBoolean227 && Static291.aClass28_Sub1_1.anInt1034 != 0;
		@Pc(75) int local75 = 2048;
		if (this.aBoolean229) {
			local75 |= 0x10000;
		}
		@Pc(90) Class247 local90 = this.method2932(arg0, this.aBoolean226, local75);
		if (local90 != null) {
			this.aClass224_2 = local90.aClass224_7;
			this.aClass6_Sub2_Sub10_2 = local90.aClass6_Sub2_Sub10_6;
			if (this.aBoolean229) {
				this.aClass224_2 = this.aClass224_2.method5808((byte) 0, local75, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return this.aBoolean229;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
		this.aBoolean229 = false;
		if (this.aClass224_2 != null) {
			this.aClass224_2.method5809(this.aClass224_2.method5811() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLclient!eq;)V")
	@Override
	public void method5322(@OriginalArg(1) Class66 arg0) {
		@Pc(14) Class6_Sub2_Sub10 local14;
		if (this.aClass6_Sub2_Sub10_2 == null && this.aBoolean226) {
			@Pc(25) Class247 local25 = this.method2932(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub10_6;
		} else {
			local14 = this.aClass6_Sub2_Sub10_2;
			this.aClass6_Sub2_Sub10_2 = null;
		}
		if (local14 != null) {
			Static194.method3059(local14, this.aByte57, super.anInt7202, super.anInt7207, null);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		if (arg2 instanceof Class3_Sub3_Sub1) {
			@Pc(28) Class3_Sub3_Sub1 local28 = (Class3_Sub3_Sub1) arg2;
			if (this.aClass224_2 != null && local28.aClass224_1 != null) {
				this.aClass224_2.method5825(local28.aClass224_1, arg3, arg1, arg0, arg4);
			}
		} else if (arg2 instanceof Class3_Sub2_Sub4) {
			@Pc(8) Class3_Sub2_Sub4 local8 = (Class3_Sub2_Sub4) arg2;
			if (this.aClass224_2 != null && local8.aClass224_2 != null) {
				this.aClass224_2.method5825(local8.aClass224_2, arg3, arg1, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I")
	@Override
	public int method5325() {
		return this.aShort46 & 0xFFFF;
	}

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "(I)I")
	public int method2928() {
		return this.aClass224_2 == null ? 15 : this.aClass224_2.method5843() / 4;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!eq;ZI)Lclient!va;")
	private Class224 method2931(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass224_2 != null && arg0.method5053(this.aClass224_2.method5811(), arg1) == 0) {
			return this.aClass224_2;
		} else {
			@Pc(23) Class247 local23 = this.method2932(arg0, false, arg1);
			return local23 == null ? null : local23.aClass224_7;
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		if (this.aClass224_2 == null) {
			return null;
		}
		@Pc(21) Class5 local21 = arg0.method5064();
		local21.method3846(super.anInt7202, super.anInt7208, super.anInt7207);
		@Pc(31) Class57_Sub2 local31 = null;
		if (this.aBoolean228) {
			local31 = Static291.method4377(1);
		}
		this.aClass224_2.method5798(local21, local31 == null ? null : local31.aClass57_Sub5Array1[0], 0);
		return local31;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	@Override
	public Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		return this.method2931(arg1, arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class224 local17 = this.method2931(arg1, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class5 local22 = arg1.method5064();
			local22.method3846(super.anInt7202, super.anInt7208, super.anInt7207);
			return local17.method5836(arg0, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5326() {
		return this.aBoolean226;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)I")
	@Override
	public int method5947() {
		return this.aClass224_2 == null ? 0 : this.aClass224_2.method5812();
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	@Override
	public void method5324() {
		if (this.aClass224_2 != null) {
			this.aClass224_2.method5799();
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!eq;ZII)Lclient!uq;")
	private Class247 method2932(@OriginalArg(0) Class66 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class106 local18 = Static448.aClass104_4.method2616(this.aShort46 & 0xFFFF);
		@Pc(26) Class86 local26;
		@Pc(30) Class86 local30;
		if (this.aBoolean227) {
			local26 = Static288.aClass86Array3[this.aByte57];
			local30 = Static87.aClass86Array2[0];
		} else {
			local26 = Static87.aClass86Array2[this.aByte57];
			if (this.aByte57 < 3) {
				local30 = Static87.aClass86Array2[this.aByte57 + 1];
			} else {
				local30 = null;
			}
		}
		return local18.method2627(local30, local26, super.anInt7202, super.anInt7207, arg2, super.anInt7208, this.aByte55 == 11 ? 10 : this.aByte55, arg1, this.aByte55 == 11 ? this.aByte56 + 4 : this.aByte56, arg0);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)I")
	@Override
	public int method5327() {
		return this.aByte55;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!eq;Z)V")
	@Override
	public void method5320(@OriginalArg(0) Class66 arg0) {
		@Pc(31) Class6_Sub2_Sub10 local31;
		if (this.aClass6_Sub2_Sub10_2 == null && this.aBoolean226) {
			@Pc(24) Class247 local24 = this.method2932(arg0, true, 262144);
			local31 = local24 == null ? null : local24.aClass6_Sub2_Sub10_6;
		} else {
			local31 = this.aClass6_Sub2_Sub10_2;
			this.aClass6_Sub2_Sub10_2 = null;
		}
		if (local31 != null) {
			Static236.method3640(local31, this.aByte57, super.anInt7202, super.anInt7207, null);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
	@Override
	public int method5321() {
		return this.aByte56;
	}
}
