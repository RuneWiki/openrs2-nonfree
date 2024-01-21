import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class3_Sub1_Sub5_Sub1_Sub1 extends Class3_Sub1_Sub5_Sub1 {

	@OriginalMember(owner = "client!d", name = "Tc", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!d", name = "bd", descriptor = "I")
	public int anInt829;

	@OriginalMember(owner = "client!d", name = "dd", descriptor = "Lclient!he;")
	public Class26 aClass26_393;

	@OriginalMember(owner = "client!d", name = "gd", descriptor = "Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 aClass3_Sub1_Sub5_Sub7_1;

	@OriginalMember(owner = "client!d", name = "id", descriptor = "I")
	public int anInt831;

	@OriginalMember(owner = "client!d", name = "md", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!d", name = "od", descriptor = "I")
	public int anInt835;

	@OriginalMember(owner = "client!d", name = "pd", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!d", name = "td", descriptor = "Lclient!jf;")
	public Class35 aClass35_1;

	@OriginalMember(owner = "client!d", name = "vd", descriptor = "I")
	public int anInt839;

	@OriginalMember(owner = "client!d", name = "wd", descriptor = "I")
	public int anInt840;

	@OriginalMember(owner = "client!d", name = "Wc", descriptor = "I")
	public int anInt825 = 0;

	@OriginalMember(owner = "client!d", name = "ad", descriptor = "I")
	public int anInt828 = 0;

	@OriginalMember(owner = "client!d", name = "Vc", descriptor = "I")
	public int anInt824 = -1;

	@OriginalMember(owner = "client!d", name = "hd", descriptor = "I")
	public int anInt830 = -1;

	@OriginalMember(owner = "client!d", name = "ed", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!d", name = "ld", descriptor = "I")
	public int anInt833 = 0;

	@OriginalMember(owner = "client!d", name = "sd", descriptor = "I")
	public int anInt838 = 0;

	@OriginalMember(owner = "client!d", name = "Uc", descriptor = "I")
	public int anInt823 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!m;)V")
	public void method477(@OriginalArg(1) Class3_Sub11 arg0) {
		arg0.anInt1562 = 0;
		@Pc(14) int local14 = arg0.method981();
		this.anInt830 = arg0.method994();
		this.anInt824 = arg0.method994();
		this.anInt828 = 0;
		@Pc(31) int local31 = -1;
		@Pc(34) int[] local34 = new int[12];
		@Pc(59) int local59;
		@Pc(96) int local96;
		for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
			@Pc(44) int local44 = arg0.method981();
			if (local44 == 0) {
				local34[local36] = 0;
			} else {
				local59 = arg0.method981();
				local34[local36] = (local44 << 8) + local59;
				if (local36 == 0 && local34[0] == 65535) {
					local31 = arg0.method974();
					break;
				}
				if (local34[local36] >= 512) {
					local96 = Static117.method2099(local34[local36] - 512).anInt1706;
					if (local96 != 0) {
						this.anInt828 = local96;
					}
				}
			}
		}
		@Pc(108) int[] local108 = new int[5];
		for (local59 = 0; local59 < 5; local59++) {
			local96 = arg0.method981();
			if (local96 < 0 || Static46.aShortArrayArray3[local59].length <= local96) {
				local96 = 0;
			}
			local108[local59] = local96;
		}
		super.anInt2729 = arg0.method974();
		if (super.anInt2729 == 65535) {
			super.anInt2729 = -1;
		}
		super.anInt2716 = arg0.method974();
		if (super.anInt2716 == 65535) {
			super.anInt2716 = -1;
		}
		super.anInt2714 = super.anInt2716;
		super.anInt2734 = arg0.method974();
		if (super.anInt2734 == 65535) {
			super.anInt2734 = -1;
		}
		super.anInt2732 = arg0.method974();
		if (super.anInt2732 == 65535) {
			super.anInt2732 = -1;
		}
		super.anInt2728 = arg0.method974();
		if (super.anInt2728 == 65535) {
			super.anInt2728 = -1;
		}
		super.anInt2717 = arg0.method974();
		if (super.anInt2717 == 65535) {
			super.anInt2717 = -1;
		}
		super.anInt2736 = arg0.method974();
		if (super.anInt2736 == 65535) {
			super.anInt2736 = -1;
		}
		this.aClass26_393 = Static111.method2010(arg0.method980()).method853();
		this.anInt823 = arg0.method981();
		this.anInt825 = arg0.method974();
		if (this.aClass35_1 == null) {
			this.aClass35_1 = new Class35();
		}
		this.aClass35_1.method1142(local108, local34, local31, local14 == 1);
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method1880() {
		return this.aClass35_1 != null;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(Z)Lclient!oa;")
	@Override
	public Class3_Sub1_Sub5_Sub7 method1874() {
		if (this.aClass35_1 == null) {
			return null;
		}
		@Pc(36) Class3_Sub1_Sub17 local36 = super.anInt2738 != -1 && super.anInt2695 == 0 ? Static111.method2009(super.anInt2738) : null;
		@Pc(62) Class3_Sub1_Sub17 local62 = super.anInt2723 == -1 || this.aBoolean41 || super.anInt2729 == super.anInt2723 && local36 != null ? null : Static111.method2009(super.anInt2723);
		@Pc(73) Class3_Sub1_Sub5_Sub7 local73 = this.aClass35_1.method1145(super.anInt2724, local36, super.anInt2708, local62);
		if (local73 == null) {
			return null;
		}
		local73.method1475();
		super.anInt2743 = local73.anInt2680;
		@Pc(103) Class3_Sub1_Sub5_Sub7 local103;
		@Pc(116) Class3_Sub1_Sub5_Sub7[] local116;
		if (!this.aBoolean41 && super.anInt2698 != -1 && super.anInt2711 != -1) {
			local103 = Static90.method1658(super.anInt2698).method814(super.anInt2711);
			if (local103 != null) {
				local116 = new Class3_Sub1_Sub5_Sub7[] { local73, local103 };
				local103.method1474(0, -super.anInt2700, 0);
				local73 = new Class3_Sub1_Sub5_Sub7(local116, 2);
			}
		}
		if (!this.aBoolean41 && this.aClass3_Sub1_Sub5_Sub7_1 != null) {
			if (this.anInt833 <= Static4.anInt136) {
				this.aClass3_Sub1_Sub5_Sub7_1 = null;
			}
			if (Static4.anInt136 >= this.anInt838 && this.anInt833 > Static4.anInt136) {
				local103 = this.aClass3_Sub1_Sub5_Sub7_1;
				local103.method1474(this.anInt834 - super.anInt2733, -this.anInt835 + this.anInt822, this.anInt831 - super.anInt2731);
				local116 = new Class3_Sub1_Sub5_Sub7[] { local73, local103 };
				if (super.anInt2691 == 512) {
					local103.method1473();
					local103.method1473();
					local103.method1473();
				} else if (super.anInt2691 == 1024) {
					local103.method1473();
					local103.method1473();
				} else if (super.anInt2691 == 1536) {
					local103.method1473();
				}
				local73 = new Class3_Sub1_Sub5_Sub7(local116, 2);
				if (super.anInt2691 == 512) {
					local103.method1473();
				} else if (super.anInt2691 == 1024) {
					local103.method1473();
					local103.method1473();
				} else if (super.anInt2691 == 1536) {
					local103.method1473();
					local103.method1473();
					local103.method1473();
				}
				local103.method1474(super.anInt2733 - this.anInt834, this.anInt835 - this.anInt822, super.anInt2731 - this.anInt831);
			}
		}
		local73.aBoolean130 = true;
		return local73;
	}
}
