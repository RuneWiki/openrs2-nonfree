import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Z")
	private final boolean aBoolean254;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Z")
	private final boolean aBoolean255;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "S")
	private final short aShort47;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "Z")
	private final boolean aBoolean256;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!ss;")
	private Class6_Sub2_Sub10 aClass6_Sub2_Sub10_3;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "Lclient!va;")
	private Class224 aClass224_4;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!eq;Lclient!hn;IIIIZIZ)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean214, arg1.aBoolean207);
		this.aBoolean254 = arg1.anInt3163 != 0 && !arg6;
		super.anInt5119 = arg5;
		super.anInt5122 = arg3;
		this.aBoolean255 = arg6;
		this.aByte59 = (byte) arg7;
		this.aShort47 = (short) arg1.anInt3167;
		this.aBoolean253 = arg8;
		this.aByte60 = (byte) arg2;
		this.aBoolean256 = arg0.method4995() && arg1.aBoolean208 && !this.aBoolean255 && Static291.aClass28_Sub1_1.anInt1034 != 0;
		@Pc(65) int local65 = 2048;
		if (this.aBoolean253) {
			local65 |= 0x10000;
		}
		@Pc(80) Class247 local80 = this.method3170(arg0, this.aBoolean256, local65);
		if (local80 != null) {
			this.aClass6_Sub2_Sub10_3 = local80.aClass6_Sub2_Sub10_6;
			this.aClass224_4 = local80.aClass224_7;
			if (this.aBoolean253) {
				this.aClass224_4 = this.aClass224_4.method5808((byte) 0, local65, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!eq;Z)V")
	@Override
	public void method5320(@OriginalArg(0) Class66 arg0) {
		@Pc(25) Class6_Sub2_Sub10 local25;
		if (this.aClass6_Sub2_Sub10_3 == null && this.aBoolean256) {
			@Pc(18) Class247 local18 = this.method3170(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass6_Sub2_Sub10_6;
		} else {
			local25 = this.aClass6_Sub2_Sub10_3;
			this.aClass6_Sub2_Sub10_3 = null;
		}
		if (local25 != null) {
			Static236.method3640(local25, this.aByte60, super.anInt5122, super.anInt5119, null);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	@Override
	public int method5325() {
		return this.aShort47 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return this.aBoolean253;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!eq;)V")
	@Override
	public void method5322(@OriginalArg(1) Class66 arg0) {
		@Pc(32) Class6_Sub2_Sub10 local32;
		if (this.aClass6_Sub2_Sub10_3 == null && this.aBoolean256) {
			@Pc(25) Class247 local25 = this.method3170(arg0, true, 262144);
			local32 = local25 == null ? null : local25.aClass6_Sub2_Sub10_6;
		} else {
			local32 = this.aClass6_Sub2_Sub10_3;
			this.aClass6_Sub2_Sub10_3 = null;
		}
		if (local32 != null) {
			Static194.method3059(local32, this.aByte60, super.anInt5122, super.anInt5119, null);
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	@Override
	public void method5324() {
		if (this.aClass224_4 != null) {
			this.aClass224_4.method5799();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!eq;)Lclient!va;")
	private Class224 method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		if (this.aClass224_4 != null && arg1.method5053(this.aClass224_4.method5811(), arg0) == 0) {
			return this.aClass224_4;
		} else {
			@Pc(31) Class247 local31 = this.method3170(arg1, false, arg0);
			return local31 == null ? null : local31.aClass224_7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I")
	@Override
	public int method5327() {
		return 22;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!eq;ZBI)Lclient!uq;")
	private Class247 method3170(@OriginalArg(0) Class66 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class106 local13 = Static448.aClass104_4.method2616(this.aShort47 & 0xFFFF);
		@Pc(25) Class86 local25;
		@Pc(20) Class86 local20;
		if (this.aBoolean255) {
			local20 = Static87.aClass86Array2[0];
			local25 = Static288.aClass86Array3[this.aByte60];
		} else {
			local25 = Static87.aClass86Array2[this.aByte60];
			if (this.aByte60 < 3) {
				local20 = Static87.aClass86Array2[this.aByte60 + 1];
			} else {
				local20 = null;
			}
		}
		return local13.method2627(local20, local25, super.anInt5122, super.anInt5119, arg2, super.anInt5120, 22, arg1, this.aByte59, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		if (arg2 instanceof Class3_Sub5_Sub2) {
			@Pc(5) Class3_Sub5_Sub2 local5 = (Class3_Sub5_Sub2) arg2;
			if (this.aClass224_4 != null && local5.aClass224_4 != null) {
				this.aClass224_4.method5825(local5.aClass224_4, arg3, arg1, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
		this.aBoolean253 = false;
		if (this.aClass224_4 != null) {
			this.aClass224_4.method5809(this.aClass224_4.method5811() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!eq;Z)Lclient!va;")
	@Override
	public Class224 method5323(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		return this.method3169(arg0, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
	@Override
	public int method5321() {
		return this.aByte59;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class224 local9 = this.method3169(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class5 local14 = arg1.method5064();
			local14.method3846(super.anInt5122, super.anInt5120, super.anInt5119);
			return local9.method5836(arg0, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5326() {
		return this.aBoolean256;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		if (this.aClass224_4 == null) {
			return null;
		}
		@Pc(11) Class5 local11 = arg0.method5064();
		local11.method3846(super.anInt5122, super.anInt5120, super.anInt5119);
		@Pc(27) Class57_Sub2 local27 = null;
		if (this.aBoolean254) {
			local27 = Static291.method4377(1);
		}
		this.aClass224_4.method5798(local11, local27 == null ? null : local27.aClass57_Sub5Array1[0], 0);
		return local27;
	}
}
