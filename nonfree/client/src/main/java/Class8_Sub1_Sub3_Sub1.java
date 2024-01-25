import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class8_Sub1_Sub3_Sub1 extends Class8_Sub1_Sub3 {

	@OriginalMember(owner = "client!dga", name = "Nb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!dga", name = "Kb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!dga", name = "jb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!dga", name = "Mb", descriptor = "I")
	private int anInt1685;

	@OriginalMember(owner = "client!dga", name = "P", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!dga", name = "Lb", descriptor = "I")
	private int anInt1687;

	@OriginalMember(owner = "client!dga", name = "mb", descriptor = "Lclient!kq;")
	private Class8_Sub5 aClass8_Sub5_3;

	@OriginalMember(owner = "client!dga", name = "ob", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!dga", name = "vb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!dga", name = "O", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!dga", name = "Hb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!dga", name = "Gb", descriptor = "I")
	private int anInt1681 = -1;

	@OriginalMember(owner = "client!dga", name = "hb", descriptor = "I")
	private int anInt1690 = 0;

	@OriginalMember(owner = "client!dga", name = "Ob", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!dga", name = "xb", descriptor = "I")
	private int anInt1691 = 0;

	@OriginalMember(owner = "client!dga", name = "Q", descriptor = "I")
	private int anInt1694 = 0;

	@OriginalMember(owner = "client!dga", name = "db", descriptor = "I")
	private int anInt1708 = 0;

	@OriginalMember(owner = "client!dga", name = "ab", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!dga", name = "eb", descriptor = "I")
	private final int anInt1705;

	@OriginalMember(owner = "client!dga", name = "zb", descriptor = "I")
	private final int anInt1679;

	@OriginalMember(owner = "client!dga", name = "Db", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "client!dga", name = "Pb", descriptor = "I")
	private final int anInt1700;

	@OriginalMember(owner = "client!dga", name = "kb", descriptor = "I")
	public final int anInt1709;

	@OriginalMember(owner = "client!dga", name = "bb", descriptor = "I")
	public int anInt1677;

	@OriginalMember(owner = "client!dga", name = "Y", descriptor = "I")
	public final int anInt1692;

	@OriginalMember(owner = "client!dga", name = "Bb", descriptor = "I")
	public final int anInt1684;

	@OriginalMember(owner = "client!dga", name = "Ib", descriptor = "I")
	private final int anInt1702;

	@OriginalMember(owner = "client!dga", name = "Fb", descriptor = "I")
	private final int anInt1699;

	@OriginalMember(owner = "client!dga", name = "Jb", descriptor = "I")
	private final int anInt1676;

	@OriginalMember(owner = "client!dga", name = "S", descriptor = "Lclient!hs;")
	private final Class165 aClass165_1;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class8_Sub1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static380.method5559(arg3, arg1, arg4, 0) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt1705 = arg5;
		this.anInt1679 = arg10;
		this.aBoolean164 = false;
		this.aBoolean163 = arg13;
		this.anInt1700 = arg14;
		this.anInt1709 = arg11;
		this.anInt1677 = arg7;
		this.anInt1692 = arg12;
		this.anInt1684 = arg6;
		this.anInt1702 = arg9;
		this.anInt1699 = arg8;
		this.anInt1676 = arg0;
		@Pc(91) int local91 = Static421.aClass385_2.method9166(this.anInt1676).anInt3635;
		if (local91 == -1) {
			this.aClass165_1 = null;
		} else {
			this.aClass165_1 = Static158.aClass317_1.method7882(local91, 100);
		}
	}

	@OriginalMember(owner = "client!dga", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 != -2226) {
			this.finalize();
		}
		return this.anInt1690;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!ha;IB)Lclient!ka;")
	private Class164 method1521(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class160 local9 = Static421.aClass385_2.method9166(this.anInt1676);
		return local9.method3180(arg0, Static158.aClass317_1, this.anInt1691, this.anInt1694, arg1, this.anInt1681);
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			this.aBoolean163 = false;
		}
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		if (arg3 >= -43) {
			this.method1527(22, -90);
		}
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_3 != null) {
			this.aClass8_Sub5_3.method4913();
		}
	}

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "(I)V")
	@Override
	public void method8231() {
		super.aShort108 = super.aShort107 = (short) (int) (this.aDouble3 / 512.0D);
		super.aShort109 = super.aShort110 = (short) (int) (this.aDouble6 / 512.0D);
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(9) Class164 local9 = this.method1521(arg1, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(16) Class203 local16 = arg1.method7672();
		local16.method8322(this.anInt1685);
		local16.method8324(this.anInt1687);
		local16.method8335((int) this.aDouble6, (int) this.aDouble5, (int) this.aDouble3);
		this.anInt1690 = local9.fa();
		this.anInt1708 = local9.ma();
		this.method1528(arg1, local16, local9);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIBII)V")
	public void method1523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean164) {
			local9 = (double) (arg2 - super.anInt10355);
			@Pc(15) double local15 = (double) (arg3 - super.anInt10363);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local9 * local9);
			this.aDouble3 = (double) super.anInt10363 + (double) this.anInt1702 * local15 / local24;
			this.aDouble6 = (double) super.anInt10355 + local9 * (double) this.anInt1702 / local24;
			if (this.aBoolean163) {
				this.aDouble5 = (double) (Static380.method5559((int) this.aDouble6, super.aByte145, (int) this.aDouble3, 0) - this.anInt1705);
			} else {
				this.aDouble5 = (double) super.anInt10357;
			}
		}
		local9 = (double) (this.anInt1677 + 1 - arg1);
		this.aDouble8 = ((double) arg3 - this.aDouble3) / local9;
		this.aDouble4 = ((double) arg2 - this.aDouble6) / local9;
		this.aDouble7 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble8 * this.aDouble8);
		if (this.anInt1699 == -1) {
			this.aDouble1 = ((double) arg0 - this.aDouble5) / local9;
		} else {
			if (!this.aBoolean164) {
				this.aDouble1 = -this.aDouble7 * Math.tan((double) this.anInt1699 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg0 - this.aDouble1 * local9 - this.aDouble5) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.finalize();
		return this.anInt1708;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V")
	public void method1525() {
		if (this.aBoolean164 || this.anInt1679 == 0) {
			return;
		}
		@Pc(27) Class8_Sub1_Sub3_Sub2 local27 = null;
		@Pc(39) int local39;
		if (this.anInt1679 < 0) {
			local39 = -this.anInt1679 - 1;
			if (Static279.anInt4838 == local39) {
				local27 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1;
			} else {
				local27 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local39];
			}
		} else {
			local39 = this.anInt1679 - 1;
			@Pc(66) Class5_Sub35 local66 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local39, 1);
			if (local66 != null) {
				local27 = local66.aClass8_Sub1_Sub3_Sub2_Sub2_2;
			}
		}
		if (local27 == null) {
			return;
		}
		super.anInt10355 = local27.anInt10355;
		super.anInt10363 = local27.anInt10363;
		super.anInt10357 = Static380.method5559(local27.anInt10355, super.aByte145, local27.anInt10363, 0) - this.anInt1705;
		if (this.anInt1700 < 0) {
			return;
		}
		@Pc(103) Class101 local103 = local27.method5991(99);
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		if (local103.anIntArrayArray15 != null && local103.anIntArrayArray15[this.anInt1700] != null) {
			local107 = local103.anIntArrayArray15[this.anInt1700][2];
			local105 = local103.anIntArrayArray15[this.anInt1700][0];
		}
		if (local103.anIntArrayArray16 != null && local103.anIntArrayArray16[this.anInt1700] != null) {
			local105 += local103.anIntArrayArray16[this.anInt1700][0];
			local107 += local103.anIntArrayArray16[this.anInt1700][2];
		}
		if (local105 != 0 || local107 != 0) {
			@Pc(183) int local183 = local27.aClass270_7.method6422(5);
			@Pc(185) int local185 = local183;
			if (local27.anIntArray408 != null && local27.anIntArray408[this.anInt1700] != -1) {
				local185 = local27.anIntArray408[this.anInt1700];
			}
			@Pc(211) int local211 = local185 - local183 & 0x3FFF;
			@Pc(215) int local215 = Class5_Sub12.anIntArray544[local211];
			@Pc(219) int local219 = Class5_Sub12.anIntArray543[local211];
			@Pc(229) int local229 = local105 * local219 + local107 * local215 >> 14;
			local107 = local107 * local219 - local215 * local105 >> 14;
			super.anInt10363 += local107;
			super.anInt10355 += local229;
		}
		return;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aDouble1 = -0.8235206422668483D;
		}
		return this.aBoolean162;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)V")
	public void method1527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != -25877) {
			this.method8898(-12);
		}
		this.aDouble3 += (double) arg1 * this.aDouble8;
		this.aDouble6 += (double) arg1 * this.aDouble4;
		this.aBoolean164 = true;
		if (this.aBoolean163) {
			this.aDouble5 = (double) (Static380.method5559((int) this.aDouble6, super.aByte145, (int) this.aDouble3, arg0 + 25877) - this.anInt1705);
		} else if (this.anInt1699 == -1) {
			this.aDouble5 += this.aDouble1 * (double) arg1;
		} else {
			this.aDouble5 += (double) arg1 * this.aDouble1 + (double) arg1 * this.aDouble2 * 0.5D * (double) arg1;
			this.aDouble1 += (double) arg1 * this.aDouble2;
		}
		this.anInt1687 = (int) (Math.atan2(this.aDouble4, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt1685 = (int) (Math.atan2(this.aDouble1, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass165_1 == null) {
			return;
		}
		this.anInt1691 += arg1;
		while (true) {
			do {
				do {
					if (this.aClass165_1.anIntArray225[this.anInt1694] >= this.anInt1691) {
						return;
					}
					this.anInt1691 -= this.aClass165_1.anIntArray225[this.anInt1694];
					this.anInt1694++;
					if (this.anInt1694 >= this.aClass165_1.anIntArray226.length) {
						this.anInt1694 -= this.aClass165_1.anInt3907;
						if (this.anInt1694 < 0 || this.anInt1694 >= this.aClass165_1.anIntArray226.length) {
							this.anInt1694 = 0;
						}
					}
					this.anInt1681 = this.anInt1694 + 1;
				} while (this.anInt1681 < this.aClass165_1.anIntArray226.length);
				this.anInt1681 -= this.aClass165_1.anInt3907;
			} while (this.anInt1681 >= 0 && this.anInt1681 < this.aClass165_1.anIntArray226.length);
			this.anInt1681 = -1;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!ha;Lclient!qq;Lclient!ka;B)V")
	private void method1528(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class164 arg2) {
		arg2.method9090(arg1);
		@Pc(9) Class189[] local9 = arg2.method9081();
		@Pc(17) Class161[] local17 = arg2.method9070();
		if ((this.aClass8_Sub5_3 == null || this.aClass8_Sub5_3.aBoolean440) && (local9 != null || local17 != null)) {
			this.aClass8_Sub5_3 = Static321.method4911(Static44.anInt740, true);
		}
		if (this.aClass8_Sub5_3 != null) {
			this.aClass8_Sub5_3.method4903(arg0, (long) Static44.anInt740, local9, local17);
			this.aClass8_Sub5_3.method4917(super.aByte145, super.aShort109, super.aShort110, super.aShort108, super.aShort107);
		}
	}

	@OriginalMember(owner = "client!dga", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		if (arg0 != -38) {
			this.aDouble5 = -0.7171467825764641D;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		return arg1 <= 65 ? null : null;
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.method8897(true);
		}
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
	public void method1529() {
		if (this.aClass8_Sub5_3 != null) {
			this.aClass8_Sub5_3.method4913();
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(11) Class164 local11 = this.method1521(arg1, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(19) Class203 local19 = arg1.method7672();
		local19.method8322(this.anInt1685);
		local19.method8324(this.anInt1687);
		local19.method8335((int) this.aDouble6, (int) this.aDouble5, (int) this.aDouble3);
		this.method1528(arg1, local19, local11);
		@Pc(49) Class8_Sub10 local49 = Static213.method3056(false, 0, 1);
		if (arg0 != -104) {
			this.anInt1677 = 102;
		}
		if (Static565.aBoolean768) {
			local11.method9092(local19, local49.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			local11.method9073(local19, local49.aClass8_Sub7Array1[0], 0);
		}
		if (this.aClass8_Sub5_3 != null) {
			@Pc(89) Class193 local89 = this.aClass8_Sub5_3.method4912();
			if (Static565.aBoolean768) {
				arg1.method7662(local89, Static243.anInt4189);
			} else {
				arg1.method7728(local89);
			}
		}
		this.aBoolean162 = local11.F();
		this.anInt1690 = local11.fa();
		this.anInt1708 = local11.ma();
		return local49;
	}
}
