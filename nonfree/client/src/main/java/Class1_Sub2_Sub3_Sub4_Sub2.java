import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub2_Sub3_Sub4_Sub2 extends Class1_Sub2_Sub3_Sub4 {

	@OriginalMember(owner = "client!v", name = "yc", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!v", name = "Ac", descriptor = "Lclient!u;")
	public Class75 aClass75_2;

	@OriginalMember(owner = "client!v", name = "Dc", descriptor = "I")
	public int anInt2844;

	@OriginalMember(owner = "client!v", name = "Ic", descriptor = "I")
	public int anInt2847;

	@OriginalMember(owner = "client!v", name = "Sc", descriptor = "I")
	public int anInt2851;

	@OriginalMember(owner = "client!v", name = "Uc", descriptor = "I")
	public int anInt2853;

	@OriginalMember(owner = "client!v", name = "Wc", descriptor = "Lclient!fc;")
	public Class25 aClass25_1384;

	@OriginalMember(owner = "client!v", name = "fd", descriptor = "Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 aClass1_Sub2_Sub3_Sub2_3;

	@OriginalMember(owner = "client!v", name = "gd", descriptor = "I")
	public int anInt2860;

	@OriginalMember(owner = "client!v", name = "hd", descriptor = "I")
	public int anInt2861;

	@OriginalMember(owner = "client!v", name = "md", descriptor = "I")
	public int anInt2864;

	@OriginalMember(owner = "client!v", name = "Qc", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!v", name = "Mc", descriptor = "I")
	public int anInt2849 = 0;

	@OriginalMember(owner = "client!v", name = "Cc", descriptor = "I")
	public int anInt2843 = 0;

	@OriginalMember(owner = "client!v", name = "cd", descriptor = "I")
	public int anInt2858 = 0;

	@OriginalMember(owner = "client!v", name = "zc", descriptor = "I")
	public int anInt2842 = -1;

	@OriginalMember(owner = "client!v", name = "xc", descriptor = "I")
	public int anInt2840 = 0;

	@OriginalMember(owner = "client!v", name = "id", descriptor = "I")
	public int anInt2862 = -1;

	@OriginalMember(owner = "client!v", name = "ad", descriptor = "I")
	public int anInt2857 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!dc;)V")
	public void method1981(@OriginalArg(1) Class1_Sub5 arg0) {
		arg0.anInt792 = 0;
		@Pc(12) int local12 = arg0.method672();
		this.anInt2842 = arg0.method643();
		@Pc(20) int[] local20 = new int[12];
		@Pc(22) int local22 = -1;
		this.anInt2862 = arg0.method643();
		this.anInt2858 = 0;
		@Pc(50) int local50;
		@Pc(94) int local94;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method672();
			if (local38 == 0) {
				local20[local32] = 0;
			} else {
				local50 = arg0.method672();
				local20[local32] = local50 + (local38 << 8);
				if (local32 == 0 && local20[0] == 65535) {
					local22 = arg0.method651();
					break;
				}
				if (local20[local32] >= 512) {
					local94 = Static33.method736(local20[local32] - 512).anInt2132;
					if (local94 != 0) {
						this.anInt2858 = local94;
					}
				}
			}
		}
		@Pc(106) int[] local106 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local94 = arg0.method672();
			if (local94 < 0 || Static28.aShortArrayArray1[local50].length <= local94) {
				local94 = 0;
			}
			local106[local50] = local94;
		}
		super.anInt2835 = arg0.method651();
		if (super.anInt2835 == 65535) {
			super.anInt2835 = -1;
		}
		super.anInt2817 = arg0.method651();
		if (super.anInt2817 == 65535) {
			super.anInt2817 = -1;
		}
		super.anInt2785 = super.anInt2817;
		super.anInt2799 = arg0.method651();
		if (super.anInt2799 == 65535) {
			super.anInt2799 = -1;
		}
		super.anInt2788 = arg0.method651();
		if (super.anInt2788 == 65535) {
			super.anInt2788 = -1;
		}
		super.anInt2833 = arg0.method651();
		if (super.anInt2833 == 65535) {
			super.anInt2833 = -1;
		}
		super.anInt2825 = arg0.method651();
		if (super.anInt2825 == 65535) {
			super.anInt2825 = -1;
		}
		super.anInt2796 = arg0.method651();
		if (super.anInt2796 == 65535) {
			super.anInt2796 = -1;
		}
		this.aClass25_1384 = Static24.method575(arg0.method669()).method772();
		this.anInt2840 = arg0.method672();
		this.anInt2843 = arg0.method651();
		if (this.aClass75_2 == null) {
			this.aClass75_2 = new Class75();
		}
		this.aClass75_2.method1846(local22, local106, local12 == 1, local20);
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lclient!da;")
	@Override
	public Class1_Sub2_Sub3_Sub2 method1969() {
		if (this.aClass75_2 == null) {
			return null;
		}
		@Pc(35) Class1_Sub2_Sub17 local35 = super.anInt2810 != -1 && super.anInt2829 == 0 ? Static34.method755(super.anInt2810) : null;
		@Pc(60) Class1_Sub2_Sub17 local60 = super.anInt2795 == -1 || this.aBoolean127 || super.anInt2795 == super.anInt2835 && local35 != null ? null : Static34.method755(super.anInt2795);
		@Pc(71) Class1_Sub2_Sub3_Sub2 local71 = this.aClass75_2.method1848(local60, super.anInt2808, local35, super.anInt2814);
		if (local71 == null) {
			return null;
		}
		local71.method465();
		super.anInt2838 = local71.anInt2778;
		@Pc(102) Class1_Sub2_Sub3_Sub2 local102;
		@Pc(122) Class1_Sub2_Sub3_Sub2[] local122;
		if (!this.aBoolean127 && super.anInt2813 != -1 && super.anInt2792 != -1) {
			local102 = Static52.method1009(super.anInt2813).method1553(super.anInt2792);
			if (local102 != null) {
				local102.method470(0, -super.anInt2821, 0);
				local122 = new Class1_Sub2_Sub3_Sub2[] { local71, local102 };
				local71 = new Class1_Sub2_Sub3_Sub2(local122, 2);
			}
		}
		if (!this.aBoolean127 && this.aClass1_Sub2_Sub3_Sub2_3 != null) {
			if (this.anInt2849 <= Static60.anInt1366) {
				this.aClass1_Sub2_Sub3_Sub2_3 = null;
			}
			if (Static60.anInt1366 >= this.anInt2857 && Static60.anInt1366 < this.anInt2849) {
				local102 = this.aClass1_Sub2_Sub3_Sub2_3;
				local122 = new Class1_Sub2_Sub3_Sub2[] { local71, local102 };
				local102.method470(this.anInt2860 - super.anInt2832, this.anInt2853 + -this.anInt2864, this.anInt2861 - super.anInt2827);
				if (super.anInt2809 == 512) {
					local102.method467();
					local102.method467();
					local102.method467();
				} else if (super.anInt2809 == 1024) {
					local102.method467();
					local102.method467();
				} else if (super.anInt2809 == 1536) {
					local102.method467();
				}
				local71 = new Class1_Sub2_Sub3_Sub2(local122, 2);
				if (super.anInt2809 == 512) {
					local102.method467();
				} else if (super.anInt2809 == 1024) {
					local102.method467();
					local102.method467();
				} else if (super.anInt2809 == 1536) {
					local102.method467();
					local102.method467();
					local102.method467();
				}
				local102.method470(super.anInt2832 - this.anInt2860, -this.anInt2853 + this.anInt2864, super.anInt2827 - this.anInt2861);
			}
		}
		local71.aBoolean19 = true;
		return local71;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1977() {
		return this.aClass75_2 != null;
	}
}
