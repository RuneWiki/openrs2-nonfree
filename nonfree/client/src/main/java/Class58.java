import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class58 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!ke;")
	public Class141 aClass141_3;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public int anInt2025;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	private int anInt2027;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	private int anInt2020 = 0;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	private int anInt2021 = -1;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	private int anInt2022 = 0;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	private int anInt2016 = 128;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public int anInt2019 = -1;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	private int anInt2024 = 0;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "B")
	public byte aByte36 = 0;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
	private int anInt2030 = 128;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ae;Z)V")
	private void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt2027 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt2019 = arg1.method6485();
		} else if (arg0 == 4) {
			this.anInt2030 = arg1.method6485();
		} else if (arg0 == 5) {
			this.anInt2016 = arg1.method6485();
		} else if (arg0 == 6) {
			this.anInt2020 = arg1.method6485();
		} else if (arg0 == 7) {
			this.anInt2024 = arg1.method6433();
		} else if (arg0 == 8) {
			this.anInt2022 = arg1.method6433();
		} else if (arg0 == 9) {
			this.aByte36 = 3;
			this.anInt2021 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean141 = true;
		} else if (arg0 == 11) {
			this.aByte36 = 1;
		} else if (arg0 == 12) {
			this.aByte36 = 4;
		} else if (arg0 == 13) {
			this.aByte36 = 5;
		} else if (arg0 == 14) {
			this.aByte36 = 2;
			this.anInt2021 = arg1.method6433() * 256;
		} else if (arg0 == 15) {
			this.aByte36 = 3;
			this.anInt2021 = arg1.method6485();
		} else if (arg0 == 16) {
			this.aByte36 = 3;
			this.anInt2021 = arg1.method6442();
		} else {
			@Pc(130) int local130;
			@Pc(140) int local140;
			if (arg0 == 40) {
				local130 = arg1.method6433();
				this.aShortArray21 = new short[local130];
				this.aShortArray19 = new short[local130];
				for (local140 = 0; local140 < local130; local140++) {
					this.aShortArray19[local140] = (short) arg1.method6485();
					this.aShortArray21[local140] = (short) arg1.method6485();
				}
			} else if (arg0 == 41) {
				local130 = arg1.method6433();
				this.aShortArray20 = new short[local130];
				this.aShortArray18 = new short[local130];
				for (local140 = 0; local140 < local130; local140++) {
					this.aShortArray18[local140] = (short) arg1.method6485();
					this.aShortArray20[local140] = (short) arg1.method6485();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!og;IIIZLclient!og;BLclient!rs;BIILclient!eq;I)Lclient!va;")
	private Class224 method1568(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class86 arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class217 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class66 arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg4;
		@Pc(23) Class131 local23 = this.anInt2019 == -1 || arg10 == -1 ? null : arg8.method5234(this.anInt2019);
		@Pc(35) boolean local35 = arg5 & this.aByte36 != 0;
		if (local23 != null) {
			local7 = arg4 | local23.method3049(arg10, arg9, false);
		}
		if (local35) {
			local7 |= this.aByte36 == 3 ? 7 : 2;
		}
		if (this.anInt2016 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt2030 != 128 || this.anInt2020 != 0) {
			local7 |= 0x5;
		}
		@Pc(95) Class44 local95 = this.aClass141_3.aClass44_29;
		@Pc(115) Class224 local115;
		synchronized (this.aClass141_3.aClass44_29) {
			local115 = (Class224) this.aClass141_3.aClass44_29.method1353((long) (this.anInt2025 |= arg11.anInt5948 << 29));
		}
		if (local115 == null || arg11.method5053(local115.method5811(), local7) != 0) {
			if (local115 != null) {
				local7 = arg11.method5062(local7, local115.method5811());
			}
			@Pc(139) int local139 = local7;
			if (this.aShortArray19 != null) {
				local139 = local7 | 0x4000;
			}
			if (this.aShortArray18 != null) {
				local139 |= 0x8000;
			}
			@Pc(164) Class78 local164 = Static100.method1817(this.anInt2027, this.aClass141_3.aClass100_38);
			if (local164 == null) {
				return null;
			}
			if (local164.anInt2404 < 13) {
				local164.method1969();
			}
			local115 = arg11.method4971(local164, local139, this.aClass141_3.anInt3862, this.anInt2024 + 64, this.anInt2022 + 850);
			@Pc(199) int local199;
			if (this.aShortArray19 != null) {
				for (local199 = 0; local199 < this.aShortArray19.length; local199++) {
					local115.method5824(this.aShortArray19[local199], this.aShortArray21[local199]);
				}
			}
			if (this.aShortArray18 != null) {
				for (local199 = 0; local199 < this.aShortArray18.length; local199++) {
					local115.method5830(this.aShortArray18[local199], this.aShortArray20[local199]);
				}
			}
			local115.method5809(local7);
			@Pc(251) Class44 local251 = this.aClass141_3.aClass44_29;
			synchronized (this.aClass141_3.aClass44_29) {
				this.aClass141_3.aClass44_29.method1349(local115, (long) (this.anInt2025 |= arg11.anInt5948 << 29));
			}
		}
		@Pc(295) Class224 local295 = local23 == null ? local115.method5808(arg7, local7, true) : local23.method3050(arg3, arg9, 0, arg10, local7, arg7, local115);
		if (this.anInt2030 != 128 || this.anInt2016 != 128) {
			local295.method5823(this.anInt2030, this.anInt2016, this.anInt2030);
		}
		if (this.anInt2020 != 0) {
			if (this.anInt2020 == 90) {
				local295.method5839(4096);
			}
			if (this.anInt2020 == 180) {
				local295.method5839(8192);
			}
			if (this.anInt2020 == 270) {
				local295.method5839(12288);
			}
		}
		if (local35) {
			local295.method5819(this.aByte36, this.anInt2021, arg6, arg1, arg12, arg2, arg0);
		}
		local295.method5809(arg4);
		return local295;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ae;)V")
	public void method1569(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6433();
			if (local16 == 0) {
				return;
			}
			this.method1566(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!og;ZLclient!eq;IIIIILclient!rs;Lclient!og;II)Lclient!va;")
	public Class224 method1570(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class217 arg7, @OriginalArg(10) Class86 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method1568(arg10, arg1, arg6, arg4, arg9, true, arg8, (byte) 2, arg7, arg3, arg0, arg2, arg5);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!rs;BIILclient!eq;II)Lclient!va;")
	public Class224 method1571(@OriginalArg(0) Class217 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method1568(0, null, 0, arg2, arg4, false, null, (byte) 2, arg0, arg5, arg1, arg3, 0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBLclient!rs;ILclient!eq;)Lclient!va;")
	public Class224 method1572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class217 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class66 arg5) {
		return this.method1568(0, null, 0, arg2, arg1, false, null, (byte) 5, arg3, arg4, arg0, arg5, 0);
	}
}
