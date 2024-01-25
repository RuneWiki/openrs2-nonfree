import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class239 {

	@OriginalMember(owner = "client!or", name = "B", descriptor = "[B")
	public static final byte[] aByteArray88;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!sg;")
	public Class291 aClass291_1;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	private int anInt6961;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "I")
	public int anInt6964;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	private int anInt6953 = 128;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Z")
	public boolean aBoolean477 = false;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "I")
	public int anInt6960 = -1;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	private int anInt6956 = 0;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	private int anInt6958 = 0;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "B")
	public byte aByte77 = 0;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	private int anInt6957 = 0;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	private int anInt6962 = 128;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	private int anInt6966 = -1;

	static {
		@Pc(25) int local25 = 0;
		aByteArray88 = new byte[32896];
		for (@Pc(30) int local30 = 0; local30 < 256; local30++) {
			for (@Pc(33) int local33 = 0; local33 <= local30; local33++) {
				aByteArray88[local25++] = (byte) (255.0D / Math.sqrt((double) ((float) (local33 * local33 + local30 * local30 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!jr;Z)V")
	public void method5572(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6019();
			if (local15 == 0) {
				return;
			}
			this.method5573(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IILclient!jr;)V")
	private void method5573(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt6961 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt6960 = arg1.method6044();
		} else if (arg0 == 4) {
			this.anInt6962 = arg1.method6044();
		} else if (arg0 == 5) {
			this.anInt6953 = arg1.method6044();
		} else if (arg0 == 6) {
			this.anInt6957 = arg1.method6044();
		} else if (arg0 == 7) {
			this.anInt6956 = arg1.method6019();
		} else if (arg0 == 8) {
			this.anInt6958 = arg1.method6019();
		} else if (arg0 == 9) {
			this.anInt6966 = 8224;
			this.aByte77 = 3;
		} else if (arg0 == 10) {
			this.aBoolean477 = true;
		} else if (arg0 == 11) {
			this.aByte77 = 1;
		} else if (arg0 == 12) {
			this.aByte77 = 4;
		} else if (arg0 == 13) {
			this.aByte77 = 5;
		} else if (arg0 == 14) {
			this.aByte77 = 2;
			this.anInt6966 = arg1.method6019() * 256;
		} else if (arg0 == 15) {
			this.aByte77 = 3;
			this.anInt6966 = arg1.method6044();
		} else if (arg0 == 16) {
			this.aByte77 = 3;
			this.anInt6966 = arg1.method6015();
		} else {
			@Pc(127) int local127;
			@Pc(137) int local137;
			if (arg0 == 40) {
				local127 = arg1.method6019();
				this.aShortArray116 = new short[local127];
				this.aShortArray115 = new short[local127];
				for (local137 = 0; local137 < local127; local137++) {
					this.aShortArray116[local137] = (short) arg1.method6044();
					this.aShortArray115[local137] = (short) arg1.method6044();
				}
			} else if (arg0 == 41) {
				local127 = arg1.method6019();
				this.aShortArray113 = new short[local127];
				this.aShortArray114 = new short[local127];
				for (local137 = 0; local137 < local127; local137++) {
					this.aShortArray114[local137] = (short) arg1.method6044();
					this.aShortArray113[local137] = (short) arg1.method6044();
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZILclient!ur;IILclient!oa;IILclient!d;ILclient!d;BII)Lclient!ba;")
	private Class24 method5574(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class324 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class46 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class46 arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12) {
		@Pc(7) int local7 = arg9;
		@Pc(24) Class63 local24 = this.anInt6960 == -1 || arg3 == -1 ? null : arg2.method7265(this.anInt6960);
		@Pc(36) boolean local36 = arg0 & this.aByte77 != 0;
		if (local24 != null) {
			local7 = arg9 | local24.method1147(false, arg3, arg6);
		}
		if (local36) {
			local7 |= this.aByte77 == 3 ? 7 : 2;
		}
		if (this.anInt6953 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6962 != 128 || this.anInt6957 != 0) {
			local7 |= 0x5;
		}
		@Pc(87) Class330 local87 = this.aClass291_1.aClass330_58;
		@Pc(107) Class24 local107;
		synchronized (this.aClass291_1.aClass330_58) {
			local107 = (Class24) this.aClass291_1.aClass330_58.method7677((long) (this.anInt6964 |= arg5.anInt9369 << 29));
		}
		if (local107 == null || arg5.method7505(local107.h(), local7) != 0) {
			if (local107 != null) {
				local7 = arg5.method7461(local7, local107.h());
			}
			@Pc(139) int local139 = local7;
			if (this.aShortArray116 != null) {
				local139 = local7 | 0x4000;
			}
			if (this.aShortArray114 != null) {
				local139 |= 0x8000;
			}
			@Pc(162) Class134 local162 = Static311.method4670(this.aClass291_1.aClass248_91, this.anInt6961);
			if (local162 == null) {
				return null;
			}
			if (local162.anInt3869 < 13) {
				local162.method3345();
			}
			local107 = arg5.method7464(local162, local139, this.aClass291_1.anInt8314, this.anInt6956 + 64, this.anInt6958 - -850);
			@Pc(195) int local195;
			if (this.aShortArray116 != null) {
				for (local195 = 0; local195 < this.aShortArray116.length; local195++) {
					local107.UA(this.aShortArray116[local195], this.aShortArray115[local195]);
				}
			}
			if (this.aShortArray114 != null) {
				for (local195 = 0; local195 < this.aShortArray114.length; local195++) {
					local107.ka(this.aShortArray114[local195], this.aShortArray113[local195]);
				}
			}
			local107.ia(local7);
			@Pc(247) Class330 local247 = this.aClass291_1.aClass330_58;
			synchronized (this.aClass291_1.aClass330_58) {
				this.aClass291_1.aClass330_58.method7676(local107, (long) (this.anInt6964 |= arg5.anInt9369 << 29));
			}
		}
		@Pc(291) Class24 local291 = local24 == null ? local107.method7398(arg11, local7, true) : local24.method1151(arg6, local7, 0, arg11, arg3, local107, arg7);
		if (this.anInt6962 != 128 || this.anInt6953 != 128) {
			local291.l(this.anInt6962, this.anInt6953, this.anInt6962);
		}
		if (this.anInt6957 != 0) {
			if (this.anInt6957 == 90) {
				local291.I(4096);
			}
			if (this.anInt6957 == 180) {
				local291.I(8192);
			}
			if (this.anInt6957 == 270) {
				local291.I(12288);
			}
		}
		if (local36) {
			local291.OA(this.aByte77, this.anInt6966, arg8, arg10, arg4, arg1, arg12);
		}
		local291.ia(arg9);
		return local291;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILclient!ur;BLclient!oa;I)Lclient!ba;")
	public Class24 method5575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class324 arg3, @OriginalArg(5) Class90 arg4, @OriginalArg(6) int arg5) {
		return this.method5574(false, 0, arg3, arg5, 0, arg4, arg1, arg0, null, arg2, null, (byte) 2, 0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZIIIILclient!ur;ILclient!oa;IBLclient!d;ILclient!d;)Lclient!ba;")
	public Class24 method5577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class324 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class90 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class46 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class46 arg10) {
		return this.method5574(true, arg5, arg4, arg1, arg9, arg6, arg7, arg3, arg8, arg2, arg10, (byte) 2, arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!oa;ILclient!ur;III)Lclient!ba;")
	public Class24 method5578(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class324 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5574(false, 0, arg3, arg0, 0, arg1, arg2, arg4, null, arg5, null, (byte) 5, 0);
	}
}
