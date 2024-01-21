import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class1_Sub3_Sub4_Sub2_Sub1 extends Class1_Sub3_Sub4_Sub2 {

	@OriginalMember(owner = "client!nb", name = "Nc", descriptor = "I")
	public int anInt1988;

	@OriginalMember(owner = "client!nb", name = "Oc", descriptor = "I")
	public int anInt1989;

	@OriginalMember(owner = "client!nb", name = "Rc", descriptor = "Lclient!td;")
	public Class74 aClass74_1;

	@OriginalMember(owner = "client!nb", name = "Tc", descriptor = "I")
	public int anInt1992;

	@OriginalMember(owner = "client!nb", name = "Uc", descriptor = "Lclient!af;")
	public Class5 aClass5_985;

	@OriginalMember(owner = "client!nb", name = "Yc", descriptor = "Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 aClass1_Sub3_Sub4_Sub4_3;

	@OriginalMember(owner = "client!nb", name = "md", descriptor = "I")
	public int anInt2004;

	@OriginalMember(owner = "client!nb", name = "pd", descriptor = "I")
	public int anInt2007;

	@OriginalMember(owner = "client!nb", name = "rd", descriptor = "I")
	public int anInt2009;

	@OriginalMember(owner = "client!nb", name = "sd", descriptor = "I")
	public int anInt2010;

	@OriginalMember(owner = "client!nb", name = "wd", descriptor = "I")
	public int anInt2011;

	@OriginalMember(owner = "client!nb", name = "Sc", descriptor = "I")
	public int anInt1991 = 0;

	@OriginalMember(owner = "client!nb", name = "Pc", descriptor = "I")
	public int anInt1990 = 0;

	@OriginalMember(owner = "client!nb", name = "hd", descriptor = "I")
	public int anInt2000 = 0;

	@OriginalMember(owner = "client!nb", name = "nd", descriptor = "I")
	public int anInt2005 = -1;

	@OriginalMember(owner = "client!nb", name = "id", descriptor = "I")
	public int anInt2001 = 0;

	@OriginalMember(owner = "client!nb", name = "qd", descriptor = "I")
	public int anInt2008 = -1;

	@OriginalMember(owner = "client!nb", name = "jd", descriptor = "I")
	public int anInt2002 = 0;

	@OriginalMember(owner = "client!nb", name = "ud", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!rd;)V")
	public void method1410(@OriginalArg(1) Class1_Sub20 arg0) {
		arg0.anInt2951 = 0;
		@Pc(8) int local8 = arg0.method2053();
		this.anInt2005 = arg0.method2099();
		this.anInt2008 = arg0.method2099();
		@Pc(28) int local28 = -1;
		this.anInt2000 = 0;
		@Pc(34) int[] local34 = new int[12];
		@Pc(57) int local57;
		@Pc(97) int local97;
		for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
			@Pc(42) int local42 = arg0.method2053();
			if (local42 == 0) {
				local34[local36] = 0;
			} else {
				local57 = arg0.method2053();
				local34[local36] = local57 + (local42 << 8);
				if (local36 == 0 && local34[0] == 65535) {
					local28 = arg0.method2087();
					break;
				}
				if (local34[local36] >= 512) {
					local97 = Static56.method1022(local34[local36] - 512).anInt2856;
					if (local97 != 0) {
						this.anInt2000 = local97;
					}
				}
			}
		}
		@Pc(112) int[] local112 = new int[5];
		for (local57 = 0; local57 < 5; local57++) {
			local97 = arg0.method2053();
			if (local97 < 0 || local97 >= Static3.aShortArrayArray1[local57].length) {
				local97 = 0;
			}
			local112[local57] = local97;
		}
		super.anInt3051 = arg0.method2087();
		if (super.anInt3051 == 65535) {
			super.anInt3051 = -1;
		}
		super.anInt3050 = arg0.method2087();
		if (super.anInt3050 == 65535) {
			super.anInt3050 = -1;
		}
		super.anInt3062 = super.anInt3050;
		super.anInt3046 = arg0.method2087();
		if (super.anInt3046 == 65535) {
			super.anInt3046 = -1;
		}
		super.anInt3078 = arg0.method2087();
		if (super.anInt3078 == 65535) {
			super.anInt3078 = -1;
		}
		super.anInt3055 = arg0.method2087();
		if (super.anInt3055 == 65535) {
			super.anInt3055 = -1;
		}
		super.anInt3041 = arg0.method2087();
		if (super.anInt3041 == 65535) {
			super.anInt3041 = -1;
		}
		super.anInt3036 = arg0.method2087();
		if (super.anInt3036 == 65535) {
			super.anInt3036 = -1;
		}
		this.aClass5_985 = Static76.method1314(arg0.method2068()).method219();
		this.anInt2001 = arg0.method2053();
		this.anInt2002 = arg0.method2087();
		if (this.aClass74_1 == null) {
			this.aClass74_1 = new Class74();
		}
		this.aClass74_1.method2045(local34, local8 == 1, local112, local28);
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method2159() {
		return this.aClass74_1 != null;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub4_Sub4 method2148() {
		if (this.aClass74_1 == null) {
			return null;
		}
		@Pc(27) Class1_Sub3_Sub11 local27 = super.anInt3068 != -1 && super.anInt3048 == 0 ? Static77.method1316(super.anInt3068) : null;
		@Pc(48) Class1_Sub3_Sub11 local48 = super.anInt3087 == -1 || this.aBoolean67 || super.anInt3087 == super.anInt3051 && local27 != null ? null : Static77.method1316(super.anInt3087);
		@Pc(66) Class1_Sub3_Sub4_Sub4 local66 = this.aClass74_1.method2042(super.anInt3077, super.anInt3075, local48, local27);
		if (local66 == null) {
			return null;
		}
		local66.method634();
		super.anInt3088 = local66.anInt3024;
		@Pc(97) Class1_Sub3_Sub4_Sub4 local97;
		@Pc(110) Class1_Sub3_Sub4_Sub4[] local110;
		if (!this.aBoolean67 && super.anInt3059 != -1 && super.anInt3065 != -1) {
			local97 = Static82.method1448(super.anInt3059).method584(super.anInt3065);
			if (local97 != null) {
				local110 = new Class1_Sub3_Sub4_Sub4[] { local66, local97 };
				local97.method653(0, -super.anInt3042, 0);
				local66 = new Class1_Sub3_Sub4_Sub4(local110, 2);
			}
		}
		if (!this.aBoolean67 && this.aClass1_Sub3_Sub4_Sub4_3 != null) {
			if (Static131.anInt3270 >= this.anInt1991) {
				this.aClass1_Sub3_Sub4_Sub4_3 = null;
			}
			if (this.anInt1990 <= Static131.anInt3270 && this.anInt1991 > Static131.anInt3270) {
				local97 = this.aClass1_Sub3_Sub4_Sub4_3;
				local110 = new Class1_Sub3_Sub4_Sub4[] { local66, local97 };
				local97.method653(this.anInt2009 - super.anInt3089, this.anInt2007 - this.anInt1989, this.anInt2010 - super.anInt3079);
				if (super.anInt3080 == 512) {
					local97.method632();
					local97.method632();
					local97.method632();
				} else if (super.anInt3080 == 1024) {
					local97.method632();
					local97.method632();
				} else if (super.anInt3080 == 1536) {
					local97.method632();
				}
				local66 = new Class1_Sub3_Sub4_Sub4(local110, 2);
				if (super.anInt3080 == 512) {
					local97.method632();
				} else if (super.anInt3080 == 1024) {
					local97.method632();
					local97.method632();
				} else if (super.anInt3080 == 1536) {
					local97.method632();
					local97.method632();
					local97.method632();
				}
				local97.method653(super.anInt3089 - this.anInt2009, this.anInt1989 + -this.anInt2007, super.anInt3079 - this.anInt2010);
			}
		}
		local66.aBoolean28 = true;
		return local66;
	}
}
