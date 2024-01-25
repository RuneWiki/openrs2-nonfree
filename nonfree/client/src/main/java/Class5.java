import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	private int anInt100 = 128;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	private int anInt102 = 0;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	private int anInt97 = 0;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
	private int anInt108 = 0;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public int anInt101 = -1;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
	private int anInt110 = 128;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method117(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3440();
			if (local5 == 0) {
				return;
			}
			this.method123(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!vq;III)Lclient!ni;")
	public Class38 method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg0;
		@Pc(30) Class14 local30 = this.anInt101 == -1 || arg1 == -1 ? null : Static225.method4042(this.anInt101);
		if (local30 != null) {
			local16 = arg0 | local30.method311(arg1, false, arg4);
		}
		if (this.anInt110 != 128) {
			local16 |= 0x2;
		}
		if (this.anInt100 != 128 || this.anInt97 != 0) {
			local16 |= 0x5;
		}
		@Pc(64) Class198 local64 = Static349.aClass198_242;
		@Pc(82) Class38 local82;
		synchronized (Static349.aClass198_242) {
			local82 = (Class38) Static349.aClass198_242.method5210((long) (this.anInt106 |= arg2.anInt3056 << 29));
		}
		if (local82 == null || arg2.method2695(local82.method1898(), local16) != 0) {
			if (local82 != null) {
				local16 = arg2.method2742(local16, local82.method1898());
			}
			@Pc(109) int local109 = local16;
			if (this.aShortArray2 != null) {
				local109 = local16 | 0x2000;
			}
			if (this.aShortArray1 != null) {
				local109 |= 0x4000;
			}
			@Pc(130) Class165 local130 = Static170.method3292(this.anInt95, Static29.aClass193_8);
			if (local130 == null) {
				return null;
			}
			local82 = arg2.method2717(local130, local109, Static143.anInt3247, this.anInt108 + 64, this.anInt102 + 850);
			@Pc(153) int local153;
			if (this.aShortArray2 != null) {
				for (local153 = 0; local153 < this.aShortArray2.length; local153++) {
					local82.method1886(this.aShortArray2[local153], this.aShortArray3[local153]);
				}
			}
			if (this.aShortArray1 != null) {
				for (local153 = 0; local153 < this.aShortArray1.length; local153++) {
					local82.method1904(this.aShortArray1[local153], this.aShortArray4[local153]);
				}
			}
			local82.method1890(local16);
			@Pc(203) Class198 local203 = Static349.aClass198_242;
			synchronized (Static349.aClass198_242) {
				Static349.aClass198_242.method5201(local82, (long) (this.anInt106 |= arg2.anInt3056 << 29));
			}
		}
		@Pc(245) Class38 local245 = local30 == null ? local82.method1915((byte) 2, local16, true) : local30.method307(local82, arg3, 0, local16, (byte) 2, arg1, arg4);
		if (this.anInt100 != 128 || this.anInt110 != 128) {
			local245.method1919(this.anInt100, this.anInt110, this.anInt100);
		}
		if (this.anInt97 != 0) {
			if (this.anInt97 == 90) {
				local245.method1899(4096);
			}
			if (this.anInt97 == 180) {
				local245.method1899(8192);
			}
			if (this.anInt97 == 270) {
				local245.method1899(12288);
			}
		}
		local245.method1890(arg0);
		return local245;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!lf;IB)V")
	private void method123(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt95 = arg0.method3401();
		} else if (arg1 == 2) {
			this.anInt101 = arg0.method3401();
		} else if (arg1 == 4) {
			this.anInt100 = arg0.method3401();
		} else if (arg1 == 5) {
			this.anInt110 = arg0.method3401();
		} else if (arg1 == 6) {
			this.anInt97 = arg0.method3401();
		} else if (arg1 == 7) {
			this.anInt108 = arg0.method3440();
		} else if (arg1 == 8) {
			this.anInt102 = arg0.method3440();
		} else if (arg1 == 9) {
			this.aBoolean12 = true;
		} else if (arg1 == 10) {
			this.aBoolean11 = true;
		} else {
			@Pc(53) int local53;
			@Pc(63) int local63;
			if (arg1 == 40) {
				local53 = arg0.method3440();
				this.aShortArray2 = new short[local53];
				this.aShortArray3 = new short[local53];
				for (local63 = 0; local63 < local53; local63++) {
					this.aShortArray2[local63] = (short) arg0.method3401();
					this.aShortArray3[local63] = (short) arg0.method3401();
				}
			} else if (arg1 == 41) {
				local53 = arg0.method3440();
				this.aShortArray1 = new short[local53];
				this.aShortArray4 = new short[local53];
				for (local63 = 0; local63 < local53; local63++) {
					this.aShortArray1[local63] = (short) arg0.method3401();
					this.aShortArray4[local63] = (short) arg0.method3401();
				}
			}
		}
	}
}
