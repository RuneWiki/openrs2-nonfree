import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
	public int anInt1849 = 4;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "Z")
	public boolean aBoolean125 = true;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
	public int anInt1843 = 0;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	public int anInt1852 = 1638;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
	public int anInt1855 = 4;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "[B")
	private byte[] aByteArray11 = new byte[512];

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
	public int anInt1846 = 4;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		this.aByteArray11 = Static339.method5063(this.anInt1843);
		this.method1545();
		for (@Pc(23) int local23 = this.anInt1846 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray12[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt1846--;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIBIII)I")
	private int method1544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg3) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg1 & 0xFFF;
		local13 &= 0xFF;
		@Pc(34) int local34 = local26 - 4096;
		@Pc(38) int local38 = arg0 - 4096;
		@Pc(42) int local42 = Class1_Sub30.anIntArray363[local26];
		@Pc(52) int local52 = this.aByteArray11[local17 + arg4] & 0x3;
		@Pc(66) int local66;
		if (local52 <= 1) {
			local66 = local52 == 0 ? arg0 + local26 : arg0 + -local26;
		} else {
			local66 = local52 == 2 ? local26 - arg0 : -arg0 + -local26;
		}
		local52 = this.aByteArray11[arg4 + local13] & 0x3;
		@Pc(115) int local115;
		if (local52 <= 1) {
			local115 = local52 == 0 ? arg0 + local34 : -local34 + arg0;
		} else {
			local115 = local52 == 2 ? local34 - arg0 : -local34 - arg0;
		}
		local52 = this.aByteArray11[arg5 + local17] & 0x3;
		@Pc(153) int local153 = local66 + (local42 * (local115 - local66) >> 12);
		if (local52 > 1) {
			local66 = local52 == 2 ? local26 - local38 : -local38 + -local26;
		} else {
			local66 = local52 == 0 ? local26 + local38 : -local26 + local38;
		}
		local52 = this.aByteArray11[arg5 + local13] & 0x3;
		if (local52 <= 1) {
			local115 = local52 == 0 ? local38 + local34 : local38 + -local34;
		} else {
			local115 = local52 == 2 ? local34 - local38 : -local38 + -local34;
		}
		@Pc(234) int local234 = local66 + ((local115 - local66) * local42 >> 12);
		return (arg2 * (local234 - local153) >> 12) + local153;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.aBoolean125 = arg1.method7974() == 1;
		} else if (arg0 == 1) {
			this.anInt1846 = arg1.method7974();
		} else if (arg0 == 2) {
			this.anInt1852 = arg1.method7975();
			if (this.anInt1852 < 0) {
				this.aShortArray12 = new short[this.anInt1846];
				for (@Pc(67) int local67 = 0; local67 < this.anInt1846; local67++) {
					this.aShortArray12[local67] = (short) arg1.method7975();
				}
			}
		} else if (arg0 == 3) {
			this.anInt1855 = this.anInt1849 = arg1.method7974();
		} else if (arg0 == 4) {
			this.anInt1843 = arg1.method7974();
		} else if (arg0 == 5) {
			this.anInt1855 = arg1.method7974();
		} else if (arg0 == 6) {
			this.anInt1849 = arg1.method7974();
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
	private void method1545() {
		@Pc(28) int local28;
		if (this.anInt1852 > 0) {
			this.aShortArray12 = new short[this.anInt1846];
			this.aShortArray11 = new short[this.anInt1846];
			for (local28 = 0; local28 < this.anInt1846; local28++) {
				this.aShortArray12[local28] = (short) (Math.pow((double) ((float) this.anInt1852 / 4096.0F), (double) local28) * 4096.0D);
				this.aShortArray11[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		} else if (this.aShortArray12 != null && this.aShortArray12.length == this.anInt1846) {
			this.aShortArray11 = new short[this.anInt1846];
			for (local28 = 0; local28 < this.anInt1846; local28++) {
				this.aShortArray11[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			this.method1547(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([III)V")
	public void method1547(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt1849 * Static583.anIntArray614[arg1];
		@Pc(120) int local120;
		@Pc(134) int local134;
		@Pc(46) int local46;
		@Pc(29) short local29;
		@Pc(111) int local111;
		@Pc(59) int local59;
		@Pc(53) int local53;
		@Pc(66) int local66;
		@Pc(91) int local91;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(100) int local100;
		@Pc(109) int local109;
		if (this.anInt1846 == 1) {
			local46 = this.aShortArray11[0] << 12;
			local29 = this.aShortArray12[0];
			local53 = this.anInt1855 * local46 >> 12;
			local66 = this.anInt1849 * local46 >> 12;
			local59 = local46 * local12 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			if (local66 <= local74) {
				local74 = 0;
			}
			local59 &= 0xFFF;
			local109 = this.aByteArray11[local74 & 0xFF] & 0xFF;
			local91 = Class1_Sub30.anIntArray363[local59];
			local100 = this.aByteArray11[local70 & 0xFF] & 0xFF;
			if (this.aBoolean125) {
				for (local111 = 0; local111 < Static501.anInt8748; local111++) {
					local120 = Static95.anIntArray77[local111] * this.anInt1855;
					local134 = this.method1544(local59, local46 * local120 >> 12, local91, local53, local100, local109);
					local134 = local29 * local134 >> 12;
					arg0[local111] = (local134 >> 1) + 2048;
				}
			} else {
				for (local111 = 0; local111 < Static501.anInt8748; local111++) {
					local120 = Static95.anIntArray77[local111] * this.anInt1855;
					local134 = this.method1544(local59, local120 * local46 >> 12, local91, local53, local100, local109);
					arg0[local111] = local134 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray12[0];
		if (local29 > 8 || local29 < -8) {
			local46 = this.aShortArray11[0] << 12;
			local53 = this.anInt1855 * local46 >> 12;
			local59 = local12 * local46 >> 12;
			local66 = local46 * this.anInt1849 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			local59 &= 0xFFF;
			if (local66 <= local74) {
				local74 = 0;
			}
			local91 = Class1_Sub30.anIntArray363[local59];
			local100 = this.aByteArray11[local70 & 0xFF] & 0xFF;
			local109 = this.aByteArray11[local74 & 0xFF] & 0xFF;
			for (local111 = 0; local111 < Static501.anInt8748; local111++) {
				local120 = Static95.anIntArray77[local111] * this.anInt1855;
				local134 = this.method1544(local59, local120 * local46 >> 12, local91, local53, local100, local109);
				arg0[local111] = local134 * local29 >> 12;
			}
		}
		for (@Pc(152) int local152 = 1; local152 < this.anInt1846; local152++) {
			local29 = this.aShortArray12[local152];
			if (local29 > 8 || local29 < -8) {
				local46 = this.aShortArray11[local152] << 12;
				local59 = local12 * local46 >> 12;
				local66 = local46 * this.anInt1849 >> 12;
				local53 = this.anInt1855 * local46 >> 12;
				local70 = local59 >> 12;
				local74 = local70 + 1;
				if (local66 <= local74) {
					local74 = 0;
				}
				local59 &= 0xFFF;
				local100 = this.aByteArray11[local70 & 0xFF] & 0xFF;
				local91 = Class1_Sub30.anIntArray363[local59];
				local109 = this.aByteArray11[local74 & 0xFF] & 0xFF;
				if (this.aBoolean125 && this.anInt1846 - 1 == local152) {
					for (local111 = 0; local111 < Static501.anInt8748; local111++) {
						local120 = this.anInt1855 * Static95.anIntArray77[local111];
						local134 = this.method1544(local59, local120 * local46 >> 12, local91, local53, local100, local109);
						local134 = (local29 * local134 >> 12) + arg0[local111];
						arg0[local111] = (local134 >> 1) + 2048;
					}
				} else {
					for (local111 = 0; local111 < Static501.anInt8748; local111++) {
						local120 = Static95.anIntArray77[local111] * this.anInt1855;
						local134 = this.method1544(local59, local46 * local120 >> 12, local91, local53, local100, local109);
						arg0[local111] += local29 * local134 >> 12;
					}
				}
			}
		}
	}
}
