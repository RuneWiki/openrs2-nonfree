import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class3_Sub2_Sub1_Sub2_Sub1 extends Class3_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!db", name = "W", descriptor = "Lclient!eh;")
	public Class28 aClass28_296;

	@OriginalMember(owner = "client!db", name = "lc", descriptor = "I")
	public int anInt874;

	@OriginalMember(owner = "client!db", name = "mc", descriptor = "Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 aClass3_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!db", name = "nc", descriptor = "I")
	public int anInt875;

	@OriginalMember(owner = "client!db", name = "rc", descriptor = "Lclient!ub;")
	public Class76 aClass76_1;

	@OriginalMember(owner = "client!db", name = "zc", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!db", name = "Dc", descriptor = "I")
	public int anInt885;

	@OriginalMember(owner = "client!db", name = "Kc", descriptor = "I")
	public int anInt890;

	@OriginalMember(owner = "client!db", name = "Mc", descriptor = "I")
	public int anInt892;

	@OriginalMember(owner = "client!db", name = "Nc", descriptor = "I")
	public int anInt893;

	@OriginalMember(owner = "client!db", name = "qc", descriptor = "I")
	public int anInt877 = 0;

	@OriginalMember(owner = "client!db", name = "uc", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!db", name = "vc", descriptor = "I")
	public int anInt879 = 0;

	@OriginalMember(owner = "client!db", name = "Cc", descriptor = "I")
	public int anInt884 = -1;

	@OriginalMember(owner = "client!db", name = "xc", descriptor = "I")
	public int anInt881 = -1;

	@OriginalMember(owner = "client!db", name = "wc", descriptor = "I")
	public int anInt880 = 0;

	@OriginalMember(owner = "client!db", name = "Ic", descriptor = "I")
	public int anInt888 = 0;

	@OriginalMember(owner = "client!db", name = "yc", descriptor = "S")
	private short aShort21 = 0;

	@OriginalMember(owner = "client!db", name = "kc", descriptor = "S")
	private short aShort20 = 0;

	@OriginalMember(owner = "client!db", name = "Jc", descriptor = "I")
	public int anInt889 = 0;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1436() {
		return this.aClass76_1 != null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass76_1 == null) {
			return;
		}
		@Pc(27) Class3_Sub2_Sub4 local27 = super.anInt1833 != -1 && super.anInt1832 == 0 ? Static21.method594(super.anInt1833) : null;
		@Pc(48) Class3_Sub2_Sub4 local48 = super.anInt1827 == -1 || this.aBoolean48 || super.anInt1821 == super.anInt1827 && local27 != null ? null : Static21.method594(super.anInt1827);
		@Pc(59) Class3_Sub2_Sub1_Sub1 local59 = this.aClass76_1.method2967(super.anInt1814, local27, local48, super.anInt1799);
		if (local59 == null) {
			return;
		}
		local59.method191();
		super.aShort36 = local59.aShort36;
		if (this.aShort21 != 0 && this.aShort20 != 0) {
			@Pc(84) int local84 = Class3_Sub2_Sub2_Sub2.anIntArray129[arg0];
			@Pc(88) int local88 = Class3_Sub2_Sub2_Sub2.anIntArray127[arg0];
			@Pc(91) short local91 = this.aShort21;
			@Pc(94) short local94 = this.aShort20;
			@Pc(99) int local99 = -local91 / 2;
			@Pc(104) int local104 = -local94 / 2;
			@Pc(108) int local108 = local91 / 2;
			@Pc(113) int local113 = -local94 / 2;
			@Pc(124) int local124 = local113 * local84 - local88 * local108 >> 16;
			@Pc(135) int local135 = local88 * local113 + local84 * local108 >> 16;
			@Pc(146) int local146 = local88 * local104 + local99 * local84 >> 16;
			@Pc(156) int local156 = local84 * local104 - local99 * local88 >> 16;
			@Pc(169) int local169 = Static33.method848(local146 + super.anInt1800, Static171.anInt4109, super.anInt1792 + local156);
			@Pc(183) int local183 = Static33.method848(super.anInt1800 + local135, Static171.anInt4109, super.anInt1792 + local124);
			@Pc(188) int local188 = -local91 / 2;
			@Pc(192) int local192 = local91 / 2;
			@Pc(196) int local196 = local94 / 2;
			@Pc(206) int local206 = local188 * local84 + local88 * local196 >> 16;
			@Pc(210) int local210 = local94 / 2;
			@Pc(220) int local220 = local192 * local84 + local88 * local210 >> 16;
			@Pc(231) int local231 = local210 * local84 - local88 * local192 >> 16;
			@Pc(242) int local242 = local196 * local84 - local88 * local188 >> 16;
			@Pc(254) int local254 = Static33.method848(local206 + super.anInt1800, Static171.anInt4109, local242 + super.anInt1792);
			@Pc(267) int local267 = Static33.method848(local220 + super.anInt1800, Static171.anInt4109, super.anInt1792 + local231);
			@Pc(278) int local278 = local183 <= local169 ? local183 : local169;
			@Pc(289) int local289 = local254 < local267 ? local254 : local267;
			@Pc(303) int local303 = (int) (Math.atan2((double) (local278 - local289), (double) local94) * 320.0D) & 0x7FF;
			@Pc(314) int local314 = local267 <= local183 ? local267 : local183;
			@Pc(325) int local325 = local169 < local254 ? local169 : local254;
			local59.method202(local303);
			@Pc(338) int local338 = (local325 + local314 + local289 + local278) / 4;
			@Pc(351) int local351 = (int) (Math.atan2((double) (local325 - local314), (double) local91) * 320.0D) & 0x7FF;
			local59.method197(local351);
			local59.method189(0, local338 - super.anInt1809, 0);
		}
		@Pc(365) Class3_Sub2_Sub1_Sub1 local365 = null;
		if (!this.aBoolean48 && super.anInt1790 != -1 && super.anInt1838 != -1) {
			local365 = Static1.method8(super.anInt1790).method553(super.anInt1838);
			if (local365 != null) {
				local365.method189(0, -super.anInt1824, 0);
			}
		}
		@Pc(398) Class3_Sub2_Sub1_Sub1 local398 = null;
		if (!this.aBoolean48 && this.aClass3_Sub2_Sub1_Sub1_1 != null) {
			if (Static14.anInt481 >= this.anInt889) {
				this.aClass3_Sub2_Sub1_Sub1_1 = null;
			}
			if (this.anInt879 <= Static14.anInt481 && this.anInt889 > Static14.anInt481) {
				local398 = this.aClass3_Sub2_Sub1_Sub1_1;
				local398.method189(this.anInt882 - super.anInt1800, -super.anInt1809 + this.anInt893, this.anInt892 - super.anInt1792);
				if (super.anInt1793 == 512) {
					local398.method190();
					local398.method190();
					local398.method190();
				} else if (super.anInt1793 == 1024) {
					local398.method190();
					local398.method190();
				} else if (super.anInt1793 == 1536) {
					local398.method190();
				}
			}
		}
		if (local365 != null) {
			local59 = ((Class3_Sub2_Sub1_Sub1_Sub1) local59).method208(local365);
		}
		if (local398 != null) {
			local59 = ((Class3_Sub2_Sub1_Sub1_Sub1) local59).method208(local398);
		}
		local59.aBoolean13 = true;
		local59.method2763(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local398 == null) {
			return;
		}
		if (super.anInt1793 == 512) {
			local398.method190();
		} else if (super.anInt1793 == 1024) {
			local398.method190();
			local398.method190();
		} else if (super.anInt1793 == 1536) {
			local398.method190();
			local398.method190();
			local398.method190();
		}
		local398.method189(super.anInt1800 - this.anInt882, -this.anInt893 + super.anInt1809, super.anInt1792 - this.anInt892);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!hd;I)V")
	public void method742(@OriginalArg(0) Class3_Sub8 arg0) {
		arg0.anInt1948 = 0;
		@Pc(6) int local6 = arg0.method1545();
		@Pc(14) boolean local14 = (local6 & 0x4) != 0;
		@Pc(22) int local22 = local6 & 0x1;
		if ((local6 & 0x2) == 2) {
			this.aShort21 = (short) (arg0.method1545() << 2);
			this.aShort20 = (short) (arg0.method1545() << 2);
		} else {
			this.aShort20 = 0;
			this.aShort21 = 0;
		}
		super.anInt1787 = (local6 >> 3) + 1;
		@Pc(60) int[] local60 = new int[12];
		this.anInt881 = arg0.method1508();
		@Pc(67) int local67 = -1;
		this.anInt884 = arg0.method1508();
		this.anInt880 = 0;
		@Pc(93) int local93;
		@Pc(100) int local100;
		for (@Pc(77) int local77 = 0; local77 < 12; local77++) {
			@Pc(82) int local82 = arg0.method1545();
			if (local82 == 0) {
				local60[local77] = 0;
			} else {
				local93 = arg0.method1545();
				local100 = (local82 << 8) + local93;
				if (local77 == 0 && local100 == 65535) {
					local67 = arg0.method1510();
					break;
				}
				if (local100 >= 32768) {
					local100 = Static96.anIntArray696[local100 - 32768];
					local60[local77] = local100 | 0x40000000;
					@Pc(137) int local137 = Static76.method1736(local100).anInt1888;
					if (local137 != 0) {
						this.anInt880 = local137;
					}
				} else {
					local60[local77] = Integer.MIN_VALUE | local100 - 256;
				}
			}
		}
		@Pc(161) int[] local161 = new int[5];
		for (local93 = 0; local93 < 5; local93++) {
			local100 = arg0.method1545();
			if (local100 < 0 || local100 >= Static74.aShortArrayArray5[local93].length) {
				local100 = 0;
			}
			local161[local93] = local100;
		}
		super.anInt1821 = arg0.method1510();
		if (super.anInt1821 == 65535) {
			super.anInt1821 = -1;
		}
		super.anInt1823 = arg0.method1510();
		if (super.anInt1823 == 65535) {
			super.anInt1823 = -1;
		}
		super.anInt1786 = super.anInt1823;
		super.anInt1831 = arg0.method1510();
		if (super.anInt1831 == 65535) {
			super.anInt1831 = -1;
		}
		super.anInt1839 = arg0.method1510();
		if (super.anInt1839 == 65535) {
			super.anInt1839 = -1;
		}
		super.anInt1835 = arg0.method1510();
		if (super.anInt1835 == 65535) {
			super.anInt1835 = -1;
		}
		super.anInt1791 = arg0.method1510();
		if (super.anInt1791 == 65535) {
			super.anInt1791 = -1;
		}
		super.anInt1802 = arg0.method1510();
		if (super.anInt1802 == 65535) {
			super.anInt1802 = -1;
		}
		this.aClass28_296 = Static149.method2829(arg0.method1511()).method912();
		this.anInt877 = arg0.method1545();
		if (local14) {
			this.anInt888 = arg0.method1510();
		}
		if (this.aClass76_1 == null) {
			this.aClass76_1 = new Class76();
		}
		this.aClass76_1.method2962(local161, local22 == 1, local67, local60);
	}
}
