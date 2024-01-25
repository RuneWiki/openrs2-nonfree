import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class223 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!jq;")
	public Class127 aClass127_2;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "[I")
	public int[] anIntArray557;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	public int anInt6043;

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "[Z")
	public boolean[] aBooleanArray43;

	@OriginalMember(owner = "client!sm", name = "E", descriptor = "[I")
	public int[] anIntArray559;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public int anInt6039 = 5;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	public int anInt6040 = -1;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "Z")
	public boolean aBoolean422 = false;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	public int anInt6044 = 99;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "Z")
	public boolean aBoolean421 = false;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public int anInt6041 = -1;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "Z")
	public boolean aBoolean420 = false;

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "Z")
	public boolean aBoolean424 = false;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
	public int anInt6050 = 2;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
	public int anInt6049 = -1;

	@OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
	public int anInt6055 = -1;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	public int anInt6048 = -1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIILclient!t;)Lclient!t;")
	public Class105 method5048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class105 arg4) {
		@Pc(8) int local8 = this.anIntArray559[arg3];
		@Pc(13) int local13 = this.anIntArray557[arg3];
		@Pc(21) Class1_Sub2_Sub9 local21 = this.aClass127_2.method2976(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method3548((byte) 1, arg1, true);
		}
		@Pc(35) Class1_Sub2_Sub9 local35 = null;
		if ((this.aBoolean422 || Static21.aBoolean16) && arg2 != -1 && arg2 < this.anIntArray557.length) {
			@Pc(53) int local53 = this.anIntArray557[arg2];
			local35 = this.aClass127_2.method2976(local53 >> 16);
			arg2 = local53 & 0xFFFF;
		}
		@Pc(67) Class1_Sub2_Sub9 local67 = null;
		@Pc(69) Class1_Sub2_Sub9 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray558 != null) {
			if (arg3 < this.anIntArray558.length) {
				local71 = this.anIntArray558[arg3];
				if (local71 != 65535) {
					local67 = this.aClass127_2.method2976(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean422 || Static21.aBoolean16) && arg2 != -1 && this.anIntArray558.length > arg2) {
				local73 = this.anIntArray558[arg2];
				if (local73 != 65535) {
					local69 = this.aClass127_2.method2976(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean424) {
			arg1 |= 0x200;
		}
		if (local21.method2799(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method2800(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method2798(local25)) {
			arg1 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method2799(local71)) {
				arg1 |= 0x80;
			}
			if (local67.method2800(local71)) {
				arg1 |= 0x100;
			}
			if (local67.method2798(local71)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method2799(arg2)) {
				arg1 |= 0x80;
			}
			if (local35.method2800(arg2)) {
				arg1 |= 0x100;
			}
			if (local35.method2798(arg2)) {
				arg1 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method2799(local73)) {
				arg1 |= 0x80;
			}
			if (local69.method2800(local73)) {
				arg1 |= 0x100;
			}
			if (local69.method2798(local73)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(274) Class105 local274 = arg4.method3548((byte) 1, arg1, true);
		local274.method3539(local35, arg0 - 1, 0, local8, this.aBoolean424, local25, arg2, local21);
		if (local67 != null) {
			local274.method3539(local69, arg0 - 1, 0, local8, this.aBoolean424, local71, local73, local67);
		}
		return local274;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BILclient!hp;)V")
	private void method5049(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(135) int local135;
		@Pc(154) int local154;
		if (arg0 == 1) {
			local22 = arg1.method5362();
			this.anIntArray559 = new int[local22];
			for (local24 = 0; local24 < local22; local24++) {
				this.anIntArray559[local24] = arg1.method5362();
			}
			this.anIntArray557 = new int[local22];
			for (local135 = 0; local135 < local22; local135++) {
				this.anIntArray557[local135] = arg1.method5362();
			}
			for (local154 = 0; local154 < local22; local154++) {
				this.anIntArray557[local154] = (arg1.method5362() << 16) + this.anIntArray557[local154];
			}
		} else if (arg0 == 2) {
			this.anInt6055 = arg1.method5362();
		} else if (arg0 == 3) {
			this.aBooleanArray43 = new boolean[256];
			local22 = arg1.method5366();
			for (local24 = 0; local24 < local22; local24++) {
				this.aBooleanArray43[arg1.method5366()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean420 = true;
		} else if (arg0 == 5) {
			this.anInt6039 = arg1.method5366();
		} else if (arg0 == 6) {
			this.anInt6041 = arg1.method5362();
		} else if (arg0 == 7) {
			this.anInt6049 = arg1.method5362();
		} else if (arg0 == 8) {
			this.anInt6044 = arg1.method5366();
		} else if (arg0 == 9) {
			this.anInt6048 = arg1.method5366();
		} else if (arg0 == 10) {
			this.anInt6040 = arg1.method5366();
		} else if (arg0 == 11) {
			this.anInt6050 = arg1.method5366();
		} else if (arg0 == 12) {
			local22 = arg1.method5366();
			this.anIntArray558 = new int[local22];
			for (local24 = 0; local24 < local22; local24++) {
				this.anIntArray558[local24] = arg1.method5362();
			}
			for (local135 = 0; local135 < local22; local135++) {
				this.anIntArray558[local135] += arg1.method5362() << 16;
			}
		} else if (arg0 == 13) {
			local22 = arg1.method5362();
			this.anIntArrayArray57 = new int[local22][];
			for (local24 = 0; local24 < local22; local24++) {
				local135 = arg1.method5366();
				if (local135 > 0) {
					this.anIntArrayArray57[local24] = new int[local135];
					this.anIntArrayArray57[local24][0] = arg1.method5399();
					for (local154 = 1; local154 < local135; local154++) {
						this.anIntArrayArray57[local24][local154] = arg1.method5362();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean424 = true;
		} else if (arg0 == 15) {
			this.aBoolean422 = true;
		} else if (arg0 == 16) {
			this.aBoolean421 = true;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZII)I")
	public int method5050(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray557[arg0];
		@Pc(19) Class1_Sub2_Sub9 local19 = null;
		@Pc(27) Class1_Sub2_Sub9 local27 = this.aClass127_2.method2976(local12 >> 16);
		@Pc(31) int local31 = local12 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean422 || Static21.aBoolean16) && arg2 != -1 && this.anIntArray557.length > arg2) {
			local7 = this.anIntArray557[arg2];
			local19 = this.aClass127_2.method2976(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean424) {
			local5 = 512;
		}
		if (local27.method2799(local31)) {
			local5 |= 0x80;
		}
		if (local27.method2800(local31)) {
			local5 |= 0x100;
		}
		if (local27.method2798(local31)) {
			local5 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method2799(local7)) {
				local5 |= 0x80;
			}
			if (local19.method2800(local7)) {
				local5 |= 0x100;
			}
			if (local19.method2798(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray558 != null && arg1) {
			@Pc(147) int local147;
			@Pc(160) Class1_Sub2_Sub9 local160;
			if (this.anIntArray558.length > arg0) {
				local147 = this.anIntArray558[arg0];
				if (local147 != 65535) {
					local160 = this.aClass127_2.method2976(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method2799(local147)) {
							local5 |= 0x80;
						}
						if (local160.method2800(local147)) {
							local5 |= 0x100;
						}
						if (local160.method2798(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean422 || Static21.aBoolean16) && arg2 != -1 && arg2 < this.anIntArray558.length) {
				local147 = this.anIntArray558[arg2];
				if (local147 != 65535) {
					local160 = this.aClass127_2.method2976(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method2799(local147)) {
							local5 |= 0x80;
						}
						if (local160.method2800(local147)) {
							local5 |= 0x100;
						}
						if (local160.method2798(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public void method5052() {
		if (this.anInt6040 == -1) {
			if (this.aBooleanArray43 == null) {
				this.anInt6040 = 0;
			} else {
				this.anInt6040 = 2;
			}
		}
		if (this.anInt6048 != -1) {
			return;
		}
		if (this.aBooleanArray43 == null) {
			this.anInt6048 = 0;
		} else {
			this.anInt6048 = 2;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!hp;)V")
	public void method5053(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5366();
			if (local13 == 0) {
				return;
			}
			this.method5049(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!t;IIIBIII)Lclient!t;")
	public Class105 method5056(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray559[arg6];
		@Pc(13) int local13 = this.anIntArray557[arg6];
		@Pc(21) Class1_Sub2_Sub9 local21 = this.aClass127_2.method2976(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method3548(arg3, arg5, true);
		}
		@Pc(41) Class1_Sub2_Sub9 local41 = null;
		if ((this.aBoolean422 || Static21.aBoolean16) && arg2 != -1 && arg2 < this.anIntArray557.length) {
			@Pc(63) int local63 = this.anIntArray557[arg2];
			local41 = this.aClass127_2.method2976(local63 >> 16);
			arg2 = local63 & 0xFFFF;
		}
		if (this.aBoolean424) {
			arg5 |= 0x200;
		}
		if (local21.method2799(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method2800(local25)) {
			arg5 |= 0x100;
		}
		if (local21.method2798(local25)) {
			arg5 |= 0x400;
		}
		if (local41 != null) {
			if (local41.method2799(arg2)) {
				arg5 |= 0x80;
			}
			if (local41.method2800(arg2)) {
				arg5 |= 0x100;
			}
			if (local41.method2798(arg2)) {
				arg5 |= 0x400;
			}
		}
		arg5 |= 0x20;
		@Pc(148) Class105 local148 = arg0.method3548(arg3, arg5, true);
		local148.method3539(local41, arg4 - 1, arg1, local8, this.aBoolean424, local25, arg2, local21);
		return local148;
	}
}
