import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class186 {

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public int anInt5808;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "[Z")
	public boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "[I")
	public int[] anIntArray469;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "[I")
	public int[] anIntArray470;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Z")
	public boolean aBoolean405 = false;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public int anInt5807 = 5;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	public int anInt5813 = -1;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
	public boolean aBoolean407 = false;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public int anInt5809 = -1;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Z")
	public boolean aBoolean403 = false;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
	public int anInt5820 = -1;

	@OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
	public int anInt5823 = -1;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
	public int anInt5814 = 2;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
	public int anInt5811 = 99;

	@OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
	public int anInt5824 = -1;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIILclient!gk;)Lclient!gk;")
	public Class13_Sub1 method4664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13_Sub1 arg3) {
		@Pc(4) int local4 = this.anIntArray470[arg1];
		@Pc(13) int local13 = this.anIntArray469[arg1];
		@Pc(21) Class4_Sub2_Sub23 local21 = Static295.method4588(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method2750(true, true, true);
		}
		@Pc(37) Class4_Sub2_Sub23 local37 = null;
		@Pc(44) int local44 = 0;
		@Pc(46) Class4_Sub2_Sub23 local46 = null;
		@Pc(48) Class4_Sub2_Sub23 local48 = null;
		if ((this.aBoolean403 || Static230.aBoolean289) && arg2 != -1 && arg2 < this.anIntArray469.length) {
			@Pc(69) int local69 = this.anIntArray469[arg2];
			local37 = Static295.method4588(local69 >> 16);
			arg2 = local69 & 0xFFFF;
		}
		@Pc(81) int local81 = 0;
		if (this.anIntArray468 != null) {
			if (arg1 < this.anIntArray468.length) {
				local44 = this.anIntArray468[arg1];
				if (local44 != 65535) {
					local48 = Static295.method4588(local44 >> 16);
					local44 &= 0xFFFF;
				}
			}
			if ((this.aBoolean403 || Static230.aBoolean289) && arg2 != -1 && arg2 < this.anIntArray468.length) {
				local81 = this.anIntArray468[arg2];
				if (local81 != 65535) {
					local46 = Static295.method4588(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
		}
		@Pc(160) boolean local160 = !local21.method4713(local25);
		@Pc(169) boolean local169 = !local21.method4705(local25);
		if (local48 != null) {
			local160 &= !local48.method4713(local44);
			local169 &= !local48.method4705(local44);
		}
		if (local37 != null) {
			local160 &= !local37.method4713(arg2);
			local169 &= !local37.method4705(arg2);
		}
		if (local46 != null) {
			local160 &= !local46.method4713(local81);
			local169 &= !local46.method4705(local81);
		}
		@Pc(257) Class13_Sub1 local257 = arg3.method2750(local160, local169, !this.aBoolean405);
		local257.method2748(local21, local25, local37, arg2, arg0 - 1, local4, this.aBoolean405);
		if (local48 != null) {
			local257.method2748(local48, local44, local46, local81, arg0 - 1, local4, this.aBoolean405);
		}
		return local257;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!pi;II)V")
	private void method4665(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int arg1) {
		@Pc(24) int local24;
		@Pc(26) int local26;
		if (arg1 == 1) {
			local24 = arg0.method3085();
			this.anIntArray470 = new int[local24];
			for (local26 = 0; local26 < local24; local26++) {
				this.anIntArray470[local26] = arg0.method3085();
			}
			this.anIntArray469 = new int[local24];
			for (local26 = 0; local26 < local24; local26++) {
				this.anIntArray469[local26] = arg0.method3085();
			}
			for (local26 = 0; local26 < local24; local26++) {
				this.anIntArray469[local26] = (arg0.method3085() << 16) + this.anIntArray469[local26];
			}
		} else if (arg1 == 2) {
			this.anInt5823 = arg0.method3085();
		} else if (arg1 == 3) {
			this.aBooleanArray36 = new boolean[256];
			local24 = arg0.method3110();
			for (local26 = 0; local26 < local24; local26++) {
				this.aBooleanArray36[arg0.method3110()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean407 = true;
		} else if (arg1 == 5) {
			this.anInt5807 = arg0.method3110();
		} else if (arg1 == 6) {
			this.anInt5809 = arg0.method3085();
		} else if (arg1 == 7) {
			this.anInt5813 = arg0.method3085();
		} else if (arg1 == 8) {
			this.anInt5811 = arg0.method3110();
		} else if (arg1 == 9) {
			this.anInt5820 = arg0.method3110();
		} else if (arg1 == 10) {
			this.anInt5824 = arg0.method3110();
		} else if (arg1 == 11) {
			this.anInt5814 = arg0.method3110();
		} else if (arg1 == 12) {
			local24 = arg0.method3110();
			this.anIntArray468 = new int[local24];
			for (local26 = 0; local26 < local24; local26++) {
				this.anIntArray468[local26] = arg0.method3085();
			}
			for (local26 = 0; local26 < local24; local26++) {
				this.anIntArray468[local26] = (arg0.method3085() << 16) + this.anIntArray468[local26];
			}
		} else if (arg1 == 13) {
			local24 = arg0.method3085();
			this.anIntArrayArray42 = new int[local24][];
			for (local26 = 0; local26 < local24; local26++) {
				@Pc(128) int local128 = arg0.method3110();
				if (local128 > 0) {
					this.anIntArrayArray42[local26] = new int[local128];
					this.anIntArrayArray42[local26][0] = arg0.method3063();
					for (@Pc(150) int local150 = 1; local150 < local128; local150++) {
						this.anIntArrayArray42[local26][local150] = arg0.method3085();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean405 = true;
		} else if (arg1 == 15) {
			this.aBoolean403 = true;
		} else if (arg1 == 16) {
			this.aBoolean406 = true;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method4666(@OriginalArg(0) Class4_Sub24 arg0) {
		while (true) {
			@Pc(21) int local21 = arg0.method3110();
			if (local21 == 0) {
				return;
			}
			this.method4665(arg0, local21);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIIILclient!gk;)Lclient!gk;")
	public Class13_Sub1 method4667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13_Sub1 arg3) {
		@Pc(8) int local8 = this.anIntArray470[arg0];
		@Pc(13) int local13 = this.anIntArray469[arg0];
		@Pc(19) Class4_Sub2_Sub23 local19 = Static295.method4588(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg3.method2729(true, true, true);
		}
		@Pc(35) Class4_Sub2_Sub23 local35 = null;
		if ((this.aBoolean403 || Static230.aBoolean289) && arg2 != -1 && this.anIntArray469.length > arg2) {
			@Pc(57) int local57 = this.anIntArray469[arg2];
			local35 = Static295.method4588(local57 >> 16);
			arg2 = local57 & 0xFFFF;
		}
		@Pc(100) Class13_Sub1 local100;
		if (local35 == null) {
			local100 = arg3.method2729(!local19.method4713(local23), !local19.method4705(local23), !this.aBoolean405);
		} else {
			local100 = arg3.method2729(!local19.method4713(local23) & !local35.method4713(arg2), !local19.method4705(local23) & !local35.method4705(arg2), !this.aBoolean405);
		}
		local100.method2748(local19, local23, local35, arg2, arg1 - 1, local8, this.aBoolean405);
		return local100;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public void method4668() {
		if (this.anInt5820 == -1) {
			if (this.aBooleanArray36 == null) {
				this.anInt5820 = 0;
			} else {
				this.anInt5820 = 2;
			}
		}
		if (this.anInt5824 != -1) {
			return;
		}
		if (this.aBooleanArray36 == null) {
			this.anInt5824 = 0;
		} else {
			this.anInt5824 = 2;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!gk;IZIII)Lclient!gk;")
	public Class13_Sub1 method4672(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = this.anIntArray470[arg4];
		@Pc(20) int local20 = this.anIntArray469[arg4];
		@Pc(26) Class4_Sub2_Sub23 local26 = Static295.method4588(local20 >> 16);
		@Pc(30) int local30 = local20 & 0xFFFF;
		if (local26 == null) {
			return arg0.method2753(true, true, true);
		}
		@Pc(43) int local43 = arg2 & 0x3;
		@Pc(45) Class4_Sub2_Sub23 local45 = null;
		if ((this.aBoolean403 || Static230.aBoolean289) && arg3 != -1 && this.anIntArray469.length > arg3) {
			@Pc(63) int local63 = this.anIntArray469[arg3];
			local45 = Static295.method4588(local63 >> 16);
			arg3 = local63 & 0xFFFF;
		}
		@Pc(119) Class13_Sub1 local119;
		if (local45 == null) {
			local119 = arg0.method2753(!local26.method4713(local30), !local26.method4705(local30), !this.aBoolean405);
		} else {
			local119 = arg0.method2753(!local26.method4713(local30) & !local45.method4713(arg3), !local26.method4705(local30) & !local45.method4705(arg3), !this.aBoolean405);
		}
		if (Static251.aBoolean330 && this.aBoolean405) {
			if (local43 == 1) {
				((Class13_Sub1_Sub2) local119).method2775();
			} else if (local43 == 2) {
				((Class13_Sub1_Sub2) local119).method2788();
			} else if (local43 == 3) {
				((Class13_Sub1_Sub2) local119).method2761();
			}
		} else if (local43 == 1) {
			local119.method2747();
		} else if (local43 == 2) {
			local119.method2730();
		} else if (local43 == 3) {
			local119.method2745();
		}
		local119.method2748(local26, local30, local45, arg3, arg1 - 1, local15, this.aBoolean405);
		if (Static251.aBoolean330 && this.aBoolean405) {
			if (local43 == 1) {
				((Class13_Sub1_Sub2) local119).method2761();
			} else if (local43 == 2) {
				((Class13_Sub1_Sub2) local119).method2788();
			} else if (local43 == 3) {
				((Class13_Sub1_Sub2) local119).method2775();
			}
		} else if (local43 == 1) {
			local119.method2745();
		} else if (local43 == 2) {
			local119.method2730();
		} else if (local43 == 3) {
			local119.method2747();
		}
		return local119;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIILclient!gk;II)Lclient!gk;")
	public Class13_Sub1 method4673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = this.anIntArray470[arg4];
		@Pc(23) int local23 = this.anIntArray469[arg4];
		@Pc(29) Class4_Sub2_Sub23 local29 = Static295.method4588(local23 >> 16);
		@Pc(33) int local33 = local23 & 0xFFFF;
		if (local29 == null) {
			return arg2.method2750(true, true, true);
		}
		@Pc(45) int local45 = arg1 & 0x3;
		@Pc(47) Class4_Sub2_Sub23 local47 = null;
		if ((this.aBoolean403 || Static230.aBoolean289) && arg3 != -1 && this.anIntArray469.length > arg3) {
			@Pc(66) int local66 = this.anIntArray469[arg3];
			local47 = Static295.method4588(local66 >> 16);
			arg3 = local66 & 0xFFFF;
		}
		@Pc(104) Class13_Sub1 local104;
		if (local47 == null) {
			local104 = arg2.method2750(!local29.method4713(local33), !local29.method4705(local33), !this.aBoolean405);
		} else {
			local104 = arg2.method2750(!local29.method4713(local33) & !local47.method4713(arg3), !local29.method4705(local33) & !local47.method4705(arg3), !this.aBoolean405);
		}
		if (this.aBoolean405 && Static251.aBoolean330) {
			if (local45 == 1) {
				((Class13_Sub1_Sub2) local104).method2775();
			} else if (local45 == 2) {
				((Class13_Sub1_Sub2) local104).method2788();
			} else if (local45 == 3) {
				((Class13_Sub1_Sub2) local104).method2761();
			}
		} else if (local45 == 1) {
			local104.method2747();
		} else if (local45 == 2) {
			local104.method2730();
		} else if (local45 == 3) {
			local104.method2745();
		}
		local104.method2748(local29, local33, local47, arg3, arg0 - 1, local18, this.aBoolean405);
		if (this.aBoolean405 && Static251.aBoolean330) {
			if (local45 == 1) {
				((Class13_Sub1_Sub2) local104).method2761();
			} else if (local45 == 2) {
				((Class13_Sub1_Sub2) local104).method2788();
			} else if (local45 == 3) {
				((Class13_Sub1_Sub2) local104).method2775();
			}
		} else if (local45 == 1) {
			local104.method2745();
		} else if (local45 == 2) {
			local104.method2730();
		} else if (local45 == 3) {
			local104.method2747();
		}
		return local104;
	}
}
