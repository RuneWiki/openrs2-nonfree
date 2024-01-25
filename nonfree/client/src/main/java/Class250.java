import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class250 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public int anInt6991;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	private int anInt6996;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!en;")
	public Class70 aClass70_2;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	private int anInt6989 = 128;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "B")
	public byte aByte101 = 0;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
	private int anInt6997 = 0;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
	private int anInt6995 = 128;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	public int anInt6999 = -1;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
	private int anInt7001 = 0;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	private int anInt7007 = 0;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	private int anInt7004 = -1;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Z")
	public boolean aBoolean474 = false;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!nc;IIIILclient!qq;I)Lclient!cd;")
	public Class39 method5679(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28 arg4, @OriginalArg(6) int arg5) {
		return this.method5680(null, arg5, false, arg2, null, (byte) 5, arg0, 0, arg3, arg4, 0, arg1, 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!fo;IZILclient!fo;BLclient!nc;IIILclient!qq;III)Lclient!cd;")
	private Class39 method5680(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class84 arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) Class174 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class28 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg1;
		@Pc(23) Class83 local23 = this.anInt6999 == -1 || arg11 == -1 ? null : arg6.method4011(this.anInt6999);
		@Pc(35) boolean local35 = arg2 & this.aByte101 != 0;
		if (local23 != null) {
			local7 = arg1 | local23.method1831(arg8, arg11, false);
		}
		if (local35) {
			local7 |= this.aByte101 == 3 ? 7 : 2;
		}
		if (this.anInt6995 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6989 != 128 || this.anInt7007 != 0) {
			local7 |= 0x5;
		}
		@Pc(83) Class220 local83 = this.aClass70_2.aClass220_12;
		@Pc(103) Class39 local103;
		synchronized (this.aClass70_2.aClass220_12) {
			local103 = (Class39) this.aClass70_2.aClass220_12.method4990((long) (this.anInt6991 |= arg9.anInt3899 << 29));
		}
		if (local103 == null || arg9.method3532(local103.method4900(), local7) != 0) {
			if (local103 != null) {
				local7 = arg9.method3539(local7, local103.method4900());
			}
			@Pc(130) int local130 = local7;
			if (this.aShortArray98 != null) {
				local130 = local7 | 0x4000;
			}
			if (this.aShortArray101 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class266 local153 = Static249.method3846(this.anInt6996, this.aClass70_2.aClass158_23);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt7237 < 13) {
				local153.method5961();
			}
			local103 = arg9.method3496(local153, local130, this.aClass70_2.anInt1720, this.anInt6997 + 64, this.anInt7001 + 850);
			@Pc(186) int local186;
			if (this.aShortArray98 != null) {
				for (local186 = 0; local186 < this.aShortArray98.length; local186++) {
					local103.method4909(this.aShortArray98[local186], this.aShortArray99[local186]);
				}
			}
			if (this.aShortArray101 != null) {
				for (local186 = 0; local186 < this.aShortArray101.length; local186++) {
					local103.method4901(this.aShortArray101[local186], this.aShortArray100[local186]);
				}
			}
			local103.method4891(local7);
			@Pc(242) Class220 local242 = this.aClass70_2.aClass220_12;
			synchronized (this.aClass70_2.aClass220_12) {
				this.aClass70_2.aClass220_12.method4996(local103, (long) (this.anInt6991 |= arg9.anInt3899 << 29));
			}
		}
		@Pc(286) Class39 local286 = local23 == null ? local103.method4863(arg5, local7, true) : local23.method1834(0, arg5, local103, arg3, arg8, arg11, local7);
		if (this.anInt6989 != 128 || this.anInt6995 != 128) {
			local286.method4870(this.anInt6989, this.anInt6995, this.anInt6989);
		}
		if (this.anInt7007 != 0) {
			if (this.anInt7007 == 90) {
				local286.method4907(4096);
			}
			if (this.anInt7007 == 180) {
				local286.method4907(8192);
			}
			if (this.anInt7007 == 270) {
				local286.method4907(12288);
			}
		}
		if (local35) {
			local286.method4872(this.aByte101, this.anInt7004, arg0, arg4, arg7, arg12, arg10);
		}
		local286.method4891(arg1);
		return local286;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!qq;IZIIIILclient!fo;Lclient!nc;IILclient!fo;)Lclient!cd;")
	public Class39 method5681(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class84 arg7, @OriginalArg(9) Class174 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class84 arg10) {
		return this.method5680(arg7, arg0, true, arg2, arg10, (byte) 2, arg8, arg6, arg5, arg1, arg9, arg4, arg3);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method5682(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method5683(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!ha;)V")
	private void method5683(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt6996 = arg1.method3108();
		} else if (arg0 == 2) {
			this.anInt6999 = arg1.method3108();
		} else if (arg0 == 4) {
			this.anInt6989 = arg1.method3108();
		} else if (arg0 == 5) {
			this.anInt6995 = arg1.method3108();
		} else if (arg0 == 6) {
			this.anInt7007 = arg1.method3108();
		} else if (arg0 == 7) {
			this.anInt6997 = arg1.method3111();
		} else if (arg0 == 8) {
			this.anInt7001 = arg1.method3111();
		} else if (arg0 == 9) {
			this.anInt7004 = 8224;
			this.aByte101 = 3;
		} else if (arg0 == 10) {
			this.aBoolean474 = true;
		} else if (arg0 == 11) {
			this.aByte101 = 1;
		} else if (arg0 == 12) {
			this.aByte101 = 4;
		} else if (arg0 == 13) {
			this.aByte101 = 5;
		} else if (arg0 == 14) {
			this.aByte101 = 2;
			this.anInt7004 = arg1.method3111() * 256;
		} else if (arg0 == 15) {
			this.aByte101 = 3;
			this.anInt7004 = arg1.method3108();
		} else if (arg0 == 16) {
			this.aByte101 = 3;
			this.anInt7004 = arg1.method3109();
		} else {
			@Pc(118) int local118;
			@Pc(128) int local128;
			if (arg0 == 40) {
				local118 = arg1.method3111();
				this.aShortArray99 = new short[local118];
				this.aShortArray98 = new short[local118];
				for (local128 = 0; local128 < local118; local128++) {
					this.aShortArray98[local128] = (short) arg1.method3108();
					this.aShortArray99[local128] = (short) arg1.method3108();
				}
			} else if (arg0 == 41) {
				local118 = arg1.method3111();
				this.aShortArray100 = new short[local118];
				this.aShortArray101 = new short[local118];
				for (local128 = 0; local128 < local118; local128++) {
					this.aShortArray101[local128] = (short) arg1.method3108();
					this.aShortArray100[local128] = (short) arg1.method3108();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!qq;Lclient!nc;IIIII)Lclient!cd;")
	public Class39 method5686(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method5680(null, arg4, false, arg3, null, (byte) 2, arg1, 0, arg2, arg0, 0, arg5, 0);
	}
}
