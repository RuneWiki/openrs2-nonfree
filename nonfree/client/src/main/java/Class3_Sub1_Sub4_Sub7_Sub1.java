import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class3_Sub1_Sub4_Sub7_Sub1 extends Class3_Sub1_Sub4_Sub7 {

	@OriginalMember(owner = "client!nf", name = "Cc", descriptor = "I")
	public int anInt2694;

	@OriginalMember(owner = "client!nf", name = "Dc", descriptor = "I")
	public int anInt2695;

	@OriginalMember(owner = "client!nf", name = "Ec", descriptor = "I")
	public int anInt2696;

	@OriginalMember(owner = "client!nf", name = "Jc", descriptor = "Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 aClass3_Sub1_Sub4_Sub5_1;

	@OriginalMember(owner = "client!nf", name = "Lc", descriptor = "I")
	public int anInt2701;

	@OriginalMember(owner = "client!nf", name = "Pc", descriptor = "I")
	public int anInt2704;

	@OriginalMember(owner = "client!nf", name = "Qc", descriptor = "Lclient!sd;")
	public Class73 aClass73_1521;

	@OriginalMember(owner = "client!nf", name = "Tc", descriptor = "I")
	public int anInt2707;

	@OriginalMember(owner = "client!nf", name = "Xc", descriptor = "I")
	public int anInt2710;

	@OriginalMember(owner = "client!nf", name = "cd", descriptor = "Lclient!mc;")
	public Class52 aClass52_2;

	@OriginalMember(owner = "client!nf", name = "dd", descriptor = "I")
	public int anInt2715;

	@OriginalMember(owner = "client!nf", name = "Fc", descriptor = "I")
	public int anInt2697 = -1;

	@OriginalMember(owner = "client!nf", name = "Nc", descriptor = "I")
	public int anInt2702 = 0;

	@OriginalMember(owner = "client!nf", name = "Uc", descriptor = "Z")
	public boolean aBoolean180 = false;

	@OriginalMember(owner = "client!nf", name = "Vc", descriptor = "I")
	public int anInt2708 = 0;

	@OriginalMember(owner = "client!nf", name = "Hc", descriptor = "I")
	public int anInt2699 = -1;

	@OriginalMember(owner = "client!nf", name = "bd", descriptor = "I")
	public int anInt2714 = 0;

	@OriginalMember(owner = "client!nf", name = "Zc", descriptor = "I")
	public int anInt2712 = 0;

	@OriginalMember(owner = "client!nf", name = "Ic", descriptor = "I")
	public int anInt2700 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ff;I)V")
	public void method2021(@OriginalArg(0) Class3_Sub12 arg0) {
		arg0.anInt1793 = 0;
		@Pc(12) int local12 = arg0.method1354();
		this.anInt2699 = arg0.method1342();
		@Pc(20) int[] local20 = new int[12];
		this.anInt2697 = arg0.method1342();
		@Pc(27) int local27 = -1;
		this.anInt2708 = 0;
		@Pc(53) int local53;
		@Pc(93) int local93;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1354();
			if (local38 == 0) {
				local20[local32] = 0;
			} else {
				local53 = arg0.method1354();
				local20[local32] = local53 + (local38 << 8);
				if (local32 == 0 && local20[0] == 65535) {
					local27 = arg0.method1359();
					break;
				}
				if (local20[local32] >= 512) {
					local93 = Static3.method42(local20[local32] - 512).anInt1221;
					if (local93 != 0) {
						this.anInt2708 = local93;
					}
				}
			}
		}
		@Pc(108) int[] local108 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local93 = arg0.method1354();
			if (local93 < 0 || local93 >= Static5.aShortArrayArray1[local53].length) {
				local93 = 0;
			}
			local108[local53] = local93;
		}
		super.anInt3154 = arg0.method1359();
		if (super.anInt3154 == 65535) {
			super.anInt3154 = -1;
		}
		super.anInt3168 = arg0.method1359();
		if (super.anInt3168 == 65535) {
			super.anInt3168 = -1;
		}
		super.anInt3142 = super.anInt3168;
		super.anInt3155 = arg0.method1359();
		if (super.anInt3155 == 65535) {
			super.anInt3155 = -1;
		}
		super.anInt3161 = arg0.method1359();
		if (super.anInt3161 == 65535) {
			super.anInt3161 = -1;
		}
		super.anInt3144 = arg0.method1359();
		if (super.anInt3144 == 65535) {
			super.anInt3144 = -1;
		}
		super.anInt3180 = arg0.method1359();
		if (super.anInt3180 == 65535) {
			super.anInt3180 = -1;
		}
		super.anInt3183 = arg0.method1359();
		if (super.anInt3183 == 65535) {
			super.anInt3183 = -1;
		}
		this.aClass73_1521 = Static168.method2643(arg0.method1339()).method2451();
		this.anInt2712 = arg0.method1354();
		this.anInt2702 = arg0.method1359();
		if (this.aClass52_2 == null) {
			this.aClass52_2 = new Class52();
		}
		this.aClass52_2.method1698(local20, local12 == 1, local108, local27);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass52_2 == null) {
			return;
		}
		@Pc(27) Class3_Sub1_Sub8 local27 = super.anInt3184 != -1 && super.anInt3173 == 0 ? Static98.method1697(super.anInt3184) : null;
		@Pc(48) Class3_Sub1_Sub8 local48 = super.anInt3141 == -1 || this.aBoolean180 || super.anInt3141 == super.anInt3154 && local27 != null ? null : Static98.method1697(super.anInt3141);
		@Pc(59) Class3_Sub1_Sub4_Sub5 local59 = this.aClass52_2.method1699(super.anInt3172, local27, local48, super.anInt3174);
		if (local59 == null) {
			return;
		}
		@Pc(64) Class3_Sub1_Sub4_Sub5 local64 = null;
		if (!this.aBoolean180 && super.anInt3149 != -1 && super.anInt3189 != -1) {
			local64 = Static12.method196(super.anInt3149).method1831(super.anInt3189);
			if (local64 != null) {
				local64.method1879(0, -super.anInt3157, 0);
			}
		}
		@Pc(97) Class3_Sub1_Sub4_Sub5 local97 = null;
		if (!this.aBoolean180 && this.aClass3_Sub1_Sub4_Sub5_1 != null) {
			if (Static44.anInt1024 >= this.anInt2714) {
				this.aClass3_Sub1_Sub4_Sub5_1 = null;
			}
			if (Static44.anInt1024 >= this.anInt2700 && Static44.anInt1024 < this.anInt2714) {
				local97 = this.aClass3_Sub1_Sub4_Sub5_1;
				local97.method1879(this.anInt2695 - super.anInt3169, this.anInt2710 + -this.anInt2704, this.anInt2715 - super.anInt3159);
				if (super.anInt3139 == 512) {
					local97.method1892();
					local97.method1892();
					local97.method1892();
				} else if (super.anInt3139 == 1024) {
					local97.method1892();
					local97.method1892();
				} else if (super.anInt3139 == 1536) {
					local97.method1892();
				}
			}
		}
		if (local64 != null) {
			local59 = ((Class3_Sub1_Sub4_Sub5_Sub1) local59).method1894(local64);
		}
		if (local97 != null) {
			local59 = ((Class3_Sub1_Sub4_Sub5_Sub1) local59).method1894(local97);
		}
		local59.aBoolean166 = true;
		local59.method2260(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		super.aShort32 = local59.aShort32;
		if (local97 == null) {
			return;
		}
		if (super.anInt3139 == 512) {
			local97.method1892();
		} else if (super.anInt3139 == 1024) {
			local97.method1892();
			local97.method1892();
		} else if (super.anInt3139 == 1536) {
			local97.method1892();
			local97.method1892();
			local97.method1892();
		}
		local97.method1879(super.anInt3169 - this.anInt2695, this.anInt2704 + -this.anInt2710, super.anInt3159 - this.anInt2715);
	}

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method2274() {
		return this.aClass52_2 != null;
	}
}
