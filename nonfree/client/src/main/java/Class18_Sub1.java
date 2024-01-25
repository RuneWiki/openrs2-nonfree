import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "[B")
	private byte[] aByteArray93;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "Lclient!qh;")
	private Class167 aClass167_2;

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "Z")
	private boolean aBoolean586;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	private int anInt6750 = 0;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!uc;")
	private final Class198 aClass198_36 = new Class198(16);

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
	private int anInt6767 = 0;

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "Lclient!mk;")
	private final Class130 aClass130_156 = new Class130();

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "J")
	private long aLong256 = 0L;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "Lclient!qk;")
	private final Class169 aClass169_4;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	private final int anInt6742;

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "Z")
	private boolean aBoolean587;

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "Lclient!mk;")
	private Class130 aClass130_155;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!qk;")
	private final Class169 aClass169_3;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!ud;")
	private final Class199 aClass199_5;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private final int anInt6753;

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "Z")
	private final boolean aBoolean588;

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
	private final int anInt6766;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "Lclient!ho;")
	private final Class93 aClass93_3;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Lclient!ub;")
	private Class4_Sub1_Sub18 aClass4_Sub1_Sub18_1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(ILclient!qk;Lclient!qk;Lclient!ho;Lclient!ud;IIZ)V")
	public Class18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class169 arg1, @OriginalArg(2) Class169 arg2, @OriginalArg(3) Class93 arg3, @OriginalArg(4) Class199 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass169_4 = arg1;
		this.anInt6742 = arg0;
		if (this.aClass169_4 == null) {
			this.aBoolean587 = false;
		} else {
			this.aBoolean587 = true;
			this.aClass130_155 = new Class130();
		}
		this.aClass169_3 = arg2;
		this.aClass199_5 = arg4;
		this.anInt6753 = arg5;
		this.aBoolean588 = arg7;
		this.anInt6766 = arg6;
		this.aClass93_3 = arg3;
		if (this.aClass169_3 != null) {
			this.aClass4_Sub1_Sub18_1 = this.aClass199_5.method5274(this.aClass169_3, this.anInt6742);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	@Override
	public int method5602(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub1_Sub18 local11 = (Class4_Sub1_Sub18) this.aClass198_36.method5261((long) arg0);
		return local11 == null ? 0 : local11.method4683();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)I")
	public int method5608() {
		if (this.method5600() == null) {
			return this.aClass4_Sub1_Sub18_1 == null ? 0 : this.aClass4_Sub1_Sub18_1.method4683();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public void method5609() {
		if (this.aClass130_155 == null || this.method5600() == null) {
			return;
		}
		for (@Pc(26) Class4 local26 = this.aClass130_156.method3499(); local26 != null; local26 = this.aClass130_156.method3512()) {
			@Pc(32) int local32 = (int) local26.aLong259;
			if (local32 < 0 || local32 >= this.aClass167_2.anInt5312 || this.aClass167_2.anIntArray441[local32] == 0) {
				local26.method5667();
			} else {
				if (this.aByteArray93[local32] == 0) {
					this.method5613(1, local32);
				}
				if (this.aByteArray93[local32] == -1) {
					this.method5613(2, local32);
				}
				if (this.aByteArray93[local32] == 1) {
					local26.method5667();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)I")
	public int method5610() {
		return this.anInt6750;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method5605(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub1_Sub18 local16 = this.method5613(0, arg0);
		if (local16 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local16.method4684();
			local16.method5667();
			return local24;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZ)Lclient!ub;")
	private Class4_Sub1_Sub18 method5613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub1_Sub18 local13 = (Class4_Sub1_Sub18) this.aClass198_36.method5261((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean487 && local13.aBoolean489) {
			local13.method5667();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass169_4 == null || this.aByteArray93[arg1] == -1) {
					if (this.aClass93_3.method2431()) {
						return null;
					}
					local13 = this.aClass93_3.method2425(arg1, this.anInt6742, true, (byte) 2);
				} else {
					local13 = this.aClass199_5.method5274(this.aClass169_4, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass169_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass199_5.method5278(arg1, this.aClass169_4);
			} else if (arg0 == 2) {
				if (this.aClass169_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray93[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass93_3.method2424()) {
					return null;
				}
				local13 = this.aClass93_3.method2425(arg1, this.anInt6742, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass198_36.method5267((long) arg1, local13);
		}
		if (local13.aBoolean489) {
			return null;
		}
		@Pc(155) byte[] local155 = local13.method4684();
		@Pc(182) int local182;
		@Pc(283) Class4_Sub1_Sub18_Sub2 local283;
		if (!(local13 instanceof Class4_Sub1_Sub18_Sub1)) {
			try {
				if (local155 == null || local155.length <= 2) {
					throw new RuntimeException();
				}
				Static211.aCRC32_1.reset();
				Static211.aCRC32_1.update(local155, 0, local155.length - 2);
				local182 = (int) Static211.aCRC32_1.getValue();
				if (this.aClass167_2.anIntArray439[arg1] != local182) {
					throw new RuntimeException();
				}
				this.aClass93_3.anInt2727 = 0;
				this.aClass93_3.anInt2728 = 0;
			} catch (@Pc(337) RuntimeException local337) {
				this.aClass93_3.method2438();
				local13.method5667();
				if (local13.aBoolean487 && !this.aClass93_3.method2431()) {
					local283 = this.aClass93_3.method2425(arg1, this.anInt6742, true, (byte) 2);
					this.aClass198_36.method5267((long) arg1, local283);
				}
				return null;
			}
			local155[local155.length - 2] = (byte) (this.aClass167_2.anIntArray443[arg1] >>> 8);
			local155[local155.length - 1] = (byte) this.aClass167_2.anIntArray443[arg1];
			if (this.aClass169_4 != null) {
				this.aClass199_5.method5279(arg1, local155, this.aClass169_4);
				if (this.aByteArray93[arg1] != 1) {
					this.anInt6750++;
					this.aByteArray93[arg1] = 1;
				}
			}
			if (!local13.aBoolean487) {
				local13.method5667();
			}
			return local13;
		}
		try {
			if (local155 == null || local155.length <= 2) {
				throw new RuntimeException();
			}
			Static211.aCRC32_1.reset();
			Static211.aCRC32_1.update(local155, 0, local155.length - 2);
			local182 = (int) Static211.aCRC32_1.getValue();
			if (this.aClass167_2.anIntArray439[arg1] != local182) {
				throw new RuntimeException();
			}
			@Pc(218) int local218 = ((local155[local155.length - 2] & 0xFF) << 8) + (local155[local155.length - 1] & 0xFF);
			if ((this.aClass167_2.anIntArray443[arg1] & 0xFFFF) != local218) {
				throw new RuntimeException();
			}
			if (this.aByteArray93[arg1] != 1) {
				this.anInt6750++;
				this.aByteArray93[arg1] = 1;
			}
			if (!local13.aBoolean487) {
				local13.method5667();
			}
			return local13;
		} catch (@Pc(257) Exception local257) {
			this.aByteArray93[arg1] = -1;
			local13.method5667();
			if (local13.aBoolean487 && !this.aClass93_3.method2431()) {
				local283 = this.aClass93_3.method2425(arg1, this.anInt6742, true, (byte) 2);
				this.aClass198_36.method5267((long) arg1, local283);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lclient!qh;")
	@Override
	public Class167 method5600() {
		if (this.aClass167_2 != null) {
			return this.aClass167_2;
		}
		if (this.aClass4_Sub1_Sub18_1 == null) {
			if (this.aClass93_3.method2431()) {
				return null;
			}
			this.aClass4_Sub1_Sub18_1 = this.aClass93_3.method2425(this.anInt6742, 255, true, (byte) 0);
		}
		if (this.aClass4_Sub1_Sub18_1.aBoolean489) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass4_Sub1_Sub18_1.method4684();
		if (this.aClass4_Sub1_Sub18_1 instanceof Class4_Sub1_Sub18_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass167_2 = new Class167(local50, this.anInt6753);
				if (this.anInt6766 != this.aClass167_2.anInt5306) {
					throw new RuntimeException();
				}
			} catch (@Pc(144) RuntimeException local144) {
				this.aClass167_2 = null;
				if (this.aClass93_3.method2431()) {
					this.aClass4_Sub1_Sub18_1 = null;
				} else {
					this.aClass4_Sub1_Sub18_1 = this.aClass93_3.method2425(this.anInt6742, 255, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass167_2 = new Class167(local50, this.anInt6753);
			} catch (@Pc(70) RuntimeException local70) {
				this.aClass93_3.method2438();
				this.aClass167_2 = null;
				if (this.aClass93_3.method2431()) {
					this.aClass4_Sub1_Sub18_1 = null;
				} else {
					this.aClass4_Sub1_Sub18_1 = this.aClass93_3.method2425(this.anInt6742, 255, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass169_3 != null) {
				this.aClass199_5.method5279(this.anInt6742, local50, this.aClass169_3);
			}
		}
		if (this.aClass169_4 != null) {
			this.aByteArray93 = new byte[this.aClass167_2.anInt5312];
			this.anInt6750 = 0;
		}
		this.aClass4_Sub1_Sub18_1 = null;
		return this.aClass167_2;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
	public void method5614() {
		if (this.aClass169_4 != null) {
			this.aBoolean586 = true;
			if (this.aClass130_155 == null) {
				this.aClass130_155 = new Class130();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0) {
		if (this.aClass169_4 == null) {
			return;
		}
		for (@Pc(22) Class4 local22 = this.aClass130_156.method3499(); local22 != null; local22 = this.aClass130_156.method3512()) {
			if ((long) arg0 == local22.aLong259) {
				return;
			}
		}
		@Pc(42) Class4 local42 = new Class4();
		local42.aLong259 = arg0;
		this.aClass130_156.method3510(local42);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	public void method5615() {
		if (this.aClass130_155 != null) {
			if (this.method5600() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class4 local23;
			@Pc(29) int local29;
			@Pc(116) Class4 local116;
			if (this.aBoolean587) {
				local18 = true;
				for (local23 = this.aClass130_155.method3499(); local23 != null; local23 = this.aClass130_155.method3512()) {
					local29 = (int) local23.aLong259;
					if (this.aByteArray93[local29] == 0) {
						this.method5613(1, local29);
					}
					if (this.aByteArray93[local29] == 0) {
						local18 = false;
					} else {
						local23.method5667();
					}
				}
				while (this.aClass167_2.anIntArray441.length > this.anInt6767) {
					if (this.aClass167_2.anIntArray441[this.anInt6767] == 0) {
						this.anInt6767++;
					} else {
						if (this.aClass199_5.anInt6316 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray93[this.anInt6767] == 0) {
							this.method5613(1, this.anInt6767);
						}
						if (this.aByteArray93[this.anInt6767] == 0) {
							local116 = new Class4();
							local116.aLong259 = this.anInt6767;
							local18 = false;
							this.aClass130_155.method3510(local116);
						}
						this.anInt6767++;
					}
				}
				if (local18) {
					this.anInt6767 = 0;
					this.aBoolean587 = false;
				}
			} else if (this.aBoolean586) {
				local18 = true;
				for (local23 = this.aClass130_155.method3499(); local23 != null; local23 = this.aClass130_155.method3512()) {
					local29 = (int) local23.aLong259;
					if (this.aByteArray93[local29] != 1) {
						this.method5613(2, local29);
					}
					if (this.aByteArray93[local29] == 1) {
						local23.method5667();
					} else {
						local18 = false;
					}
				}
				while (this.anInt6767 < this.aClass167_2.anIntArray441.length) {
					if (this.aClass167_2.anIntArray441[this.anInt6767] == 0) {
						this.anInt6767++;
					} else {
						if (this.aClass93_3.method2424()) {
							local18 = false;
							break;
						}
						if (this.aByteArray93[this.anInt6767] != 1) {
							this.method5613(2, this.anInt6767);
						}
						if (this.aByteArray93[this.anInt6767] != 1) {
							local116 = new Class4();
							local116.aLong259 = this.anInt6767;
							local18 = false;
							this.aClass130_155.method3510(local116);
						}
						this.anInt6767++;
					}
				}
				if (local18) {
					this.anInt6767 = 0;
					this.aBoolean586 = false;
				}
			} else {
				this.aClass130_155 = null;
			}
		}
		if (!this.aBoolean588 || this.aLong256 > Static274.method4763()) {
			return;
		}
		for (@Pc(324) Class4_Sub1_Sub18 local324 = (Class4_Sub1_Sub18) this.aClass198_36.method5268(); local324 != null; local324 = (Class4_Sub1_Sub18) this.aClass198_36.method5263()) {
			if (!local324.aBoolean489) {
				if (local324.aBoolean488) {
					if (!local324.aBoolean487) {
						throw new RuntimeException();
					}
					local324.method5667();
				} else {
					local324.aBoolean488 = true;
				}
			}
		}
		this.aLong256 = Static274.method4763() + 1000L;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I")
	public int method5616() {
		if (this.aClass167_2 == null) {
			return 0;
		} else if (this.aBoolean587) {
			@Pc(20) Class4 local20 = this.aClass130_155.method3499();
			return local20 == null ? 0 : (int) local20.aLong259;
		} else {
			return this.aClass167_2.anInt5307;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)I")
	public int method5618() {
		return this.aClass167_2 == null ? 0 : this.aClass167_2.anInt5307;
	}
}
