import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class124 {

	@OriginalMember(owner = "client!gga", name = "z", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!gga", name = "O", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!gga", name = "B", descriptor = "Lclient!wu;")
	private Class394 aClass394_1 = null;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
	public int anInt3918;

	@OriginalMember(owner = "client!gga", name = "D", descriptor = "Z")
	private final boolean aBoolean307;

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "Lclient!cg;")
	private final Class51 aClass51_1;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lclient!cg;ZI)V")
	public Class124(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.anInt3918 = arg2;
		this.aBoolean307 = arg1;
		this.aClass51_1 = arg0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)Z")
	public boolean method3608(@OriginalArg(1) int arg0) {
		if (!this.method3636(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3613(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)Z")
	public boolean method3609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3617(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3613(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)[B")
	public byte[] method3610(@OriginalArg(0) int arg0) {
		if (!this.method3630()) {
			return null;
		} else if (this.aClass394_1.anIntArray601.length == 1) {
			return this.method3641(0, arg0);
		} else if (!this.method3636(arg0)) {
			return null;
		} else if (this.aClass394_1.anIntArray601[arg0] == 1) {
			return this.method3641(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZZZ)V")
	public void method3611(@OriginalArg(2) boolean arg0) {
		if (!this.method3630()) {
			return;
		}
		this.aClass394_1.anIntArrayArray62 = null;
		this.aClass394_1.aClass201Array1 = null;
		if (arg0) {
			this.aClass394_1.aClass201_1 = null;
			this.aClass394_1.anIntArray600 = null;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3612(@OriginalArg(1) String arg0) {
		if (this.method3630()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass394_1.aClass201_1.method5348(Static321.method5290(local20));
			return this.method3608(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(II)V")
	private void method3613(@OriginalArg(1) int arg0) {
		if (this.aBoolean307) {
			this.anObjectArray1[arg0] = this.aClass51_1.method8045(arg0);
		} else {
			this.anObjectArray1[arg0] = Static340.method5715(this.aClass51_1.method8045(arg0));
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
	public void method3614() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)I")
	public int method3615() {
		if (!this.method3630()) {
			throw new IllegalStateException("");
		}
		return this.aClass394_1.anInt11414;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB[II)[B")
	public byte[] method3616(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3617(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(35) boolean local35 = this.method3623(arg2, arg1, arg0);
			if (!local35) {
				this.method3613(arg0);
				local35 = this.method3623(arg2, arg1, arg0);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static221.method4081(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt3918 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass394_1.anIntArray601[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt3918 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local64;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZI)Z")
	private boolean method3617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3630()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass394_1.anIntArray601.length && this.aClass394_1.anIntArray601[arg0] > arg1) {
			return true;
		} else if (Static312.aBoolean423) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BI)I")
	public int method3619(@OriginalArg(1) int arg0) {
		if (this.method3630()) {
			@Pc(16) int local16 = this.aClass394_1.aClass201_1.method5348(arg0);
			return this.method3636(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
	public int method3620() {
		if (!this.method3630()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray1.length; local17++) {
			if (this.aClass394_1.anIntArray598[local17] > 0) {
				local13 += 100;
				local15 += this.method3640(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(Z)V")
	public void method3621() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZ)V")
	private void method3622(@OriginalArg(0) int arg0) {
		this.aClass51_1.method8047(arg0);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BI[II)Z")
	private boolean method3623(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3636(arg2)) {
			return false;
		} else if (this.anObjectArray1[arg2] == null) {
			return false;
		} else {
			@Pc(31) int local31 = this.aClass394_1.anIntArray598[arg2];
			@Pc(37) int[] local37 = this.aClass394_1.anIntArrayArray61[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass394_1.anIntArray601[arg2]];
			}
			@Pc(57) Object[] local57 = this.anObjectArrayArray1[arg2];
			@Pc(59) boolean local59 = true;
			for (@Pc(61) int local61 = 0; local61 < local31; local61++) {
				@Pc(66) int local66;
				if (local37 == null) {
					local66 = local61;
				} else {
					local66 = local37[local61];
				}
				if (local57[local66] == null) {
					local59 = false;
					break;
				}
			}
			if (local59) {
				return true;
			}
			@Pc(118) byte[] local118;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local118 = Static221.method4081(this.anObjectArray1[arg2], false);
			} else {
				local118 = Static221.method4081(this.anObjectArray1[arg2], true);
				@Pc(132) Class2_Sub8 local132 = new Class2_Sub8(local118);
				local132.method5195(arg1, local132.lb.length);
			}
			@Pc(144) byte[] local144;
			try {
				local144 = Static353.method6086(local118);
			} catch (@Pc(146) RuntimeException local146) {
				throw Static489.method7748(local146, "T3 - " + (arg1 != null) + "," + arg2 + "," + local118.length + "," + Static538.method8271(local118.length, local118) + "," + Static538.method8271(local118.length - 2, local118) + "," + this.aClass394_1.anIntArray599[arg2] + "," + this.aClass394_1.anInt11414);
			}
			if (this.aBoolean307) {
				this.anObjectArray1[arg2] = null;
			}
			@Pc(220) int local220;
			if (local31 <= 1) {
				if (local37 == null) {
					local220 = 0;
				} else {
					local220 = local37[0];
				}
				if (this.anInt3918 == 0) {
					local57[local220] = Static340.method5715(local144);
				} else {
					local57[local220] = local144;
				}
			} else {
				@Pc(255) int local255;
				@Pc(268) Class2_Sub8 local268;
				@Pc(275) int local275;
				@Pc(277) int local277;
				@Pc(280) int local280;
				@Pc(282) int local282;
				@Pc(293) int local293;
				@Pc(349) int local349;
				@Pc(351) int local351;
				if (this.anInt3918 == 2) {
					local220 = local144.length;
					local220--;
					local255 = local144[local220] & 0xFF;
					local220 -= local255 * local31 * 4;
					local268 = new Class2_Sub8(local144);
					@Pc(270) int local270 = 0;
					local268.anInt5725 = local220;
					local275 = 0;
					for (local277 = 0; local277 < local255; local277++) {
						local280 = 0;
						for (local282 = 0; local282 < local31; local282++) {
							local280 += local268.method5172();
							if (local37 == null) {
								local293 = local282;
							} else {
								local293 = local37[local282];
							}
							if (arg0 == local293) {
								local270 += local280;
								local275 = local293;
							}
						}
					}
					if (local270 == 0) {
						return true;
					}
					@Pc(337) byte[] local337 = new byte[local270];
					local268.anInt5725 = local220;
					local270 = 0;
					local282 = 0;
					for (local293 = 0; local293 < local255; local293++) {
						local349 = 0;
						for (local351 = 0; local351 < local31; local351++) {
							local349 += local268.method5172();
							@Pc(362) int local362;
							if (local37 == null) {
								local362 = local351;
							} else {
								local362 = local37[local351];
							}
							if (arg0 == local362) {
								Static679.method4129(local144, local282, local337, local270, local349);
								local270 += local349;
							}
							local282 += local349;
						}
					}
					local57[local275] = local337;
				} else {
					local220 = local144.length;
					local220--;
					local255 = local144[local220] & 0xFF;
					local220 -= local255 * 4 * local31;
					local268 = new Class2_Sub8(local144);
					@Pc(423) int[] local423 = new int[local31];
					local268.anInt5725 = local220;
					for (local275 = 0; local275 < local255; local275++) {
						local277 = 0;
						for (local280 = 0; local280 < local31; local280++) {
							local277 += local268.method5172();
							local423[local280] += local277;
						}
					}
					@Pc(458) byte[][] local458 = new byte[local31][];
					for (local280 = 0; local280 < local31; local280++) {
						local458[local280] = new byte[local423[local280]];
						local423[local280] = 0;
					}
					local268.anInt5725 = local220;
					local282 = 0;
					for (local293 = 0; local293 < local255; local293++) {
						local349 = 0;
						for (local351 = 0; local351 < local31; local351++) {
							local349 += local268.method5172();
							Static679.method4129(local144, local282, local458[local351], local423[local351], local349);
							local423[local351] += local349;
							local282 += local349;
						}
					}
					for (local349 = 0; local349 < local31; local349++) {
						if (local37 == null) {
							local351 = local349;
						} else {
							local351 = local37[local349];
						}
						if (this.anInt3918 == 0) {
							local57[local351] = Static340.method5715(local458[local349]);
						} else {
							local57[local351] = local458[local349];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method3624(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3630()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass394_1.aClass201_1.method5348(Static321.method5290(local20));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass394_1.aClass201Array1[local32].method5348(Static321.method5290(local23));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(II)V")
	public void method3625(@OriginalArg(1) int arg0) {
		if (this.method3636(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)Z")
	public boolean method3626() {
		if (!this.method3630()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass394_1.anIntArray603.length; local20++) {
			@Pc(28) int local28 = this.aClass394_1.anIntArray603[local20];
			if (this.anObjectArray1[local28] == null) {
				this.method3613(local28);
				if (this.anObjectArray1[local28] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)Z")
	public boolean method3627(@OriginalArg(0) int arg0) {
		if (!this.method3630()) {
			return false;
		} else if (this.aClass394_1.anIntArray601.length == 1) {
			return this.method3609(0, arg0);
		} else if (!this.method3636(arg0)) {
			return false;
		} else if (this.aClass394_1.anIntArray601[arg0] == 1) {
			return this.method3609(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method3628(@OriginalArg(0) String arg0) {
		if (this.method3630()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass394_1.aClass201_1.method5348(Static321.method5290(local21));
			this.method3622(local30);
		}
	}

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "(II)I")
	public int method3629(@OriginalArg(1) int arg0) {
		return this.method3636(arg0) ? this.aClass394_1.anIntArray601[arg0] : 0;
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(Z)Z")
	private boolean method3630() {
		if (this.aClass394_1 == null) {
			this.aClass394_1 = this.aClass51_1.method8046();
			if (this.aClass394_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass394_1.anInt11411];
			this.anObjectArrayArray1 = new Object[this.aClass394_1.anInt11411][];
		}
		return true;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
	private boolean method3631(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3630()) {
			return false;
		}
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(19) String local19 = arg1.toLowerCase();
		@Pc(28) int local28 = this.aClass394_1.aClass201_1.method5348(Static321.method5290(local16));
		if (this.method3636(local28)) {
			@Pc(51) int local51 = this.aClass394_1.aClass201Array1[local28].method5348(Static321.method5290(local19));
			return this.method3609(local28, local51);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3632(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = this.method3638("");
		return local14 == -1 ? this.method3631(arg0, "") : this.method3631("", arg0);
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(B)I")
	public int method3633() {
		return this.method3630() ? this.aClass394_1.anIntArray601.length : -1;
	}

	@OriginalMember(owner = "client!gga", name = "f", descriptor = "(II)[I")
	public int[] method3634(@OriginalArg(1) int arg0) {
		if (!this.method3636(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass394_1.anIntArrayArray61[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass394_1.anIntArray598[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local26.length) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "(II)Z")
	private boolean method3636(@OriginalArg(0) int arg0) {
		if (!this.method3630()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass394_1.anIntArray601.length && this.aClass394_1.anIntArray601[arg0] != 0) {
			return true;
		} else if (Static312.aBoolean423) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3637(@OriginalArg(1) String arg0) {
		if (this.method3630()) {
			@Pc(22) String local22 = arg0.toLowerCase();
			@Pc(33) int local33 = this.aClass394_1.aClass201_1.method5348(Static321.method5290(local22));
			return local33 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method3638(@OriginalArg(1) String arg0) {
		if (this.method3630()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass394_1.aClass201_1.method5348(Static321.method5290(local19));
			return this.method3636(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3639(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3630()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass394_1.aClass201_1.method5348(Static321.method5290(local12));
		if (this.method3636(local30)) {
			@Pc(48) int local48 = this.aClass394_1.aClass201Array1[local30].method5348(Static321.method5290(local19));
			return this.method3641(local30, local48);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(IZ)I")
	private int method3640(@OriginalArg(0) int arg0) {
		if (this.method3636(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass51_1.method8049(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)[B")
	public byte[] method3641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3616(arg0, (int[]) null, arg1);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3642(@OriginalArg(0) String arg0) {
		if (this.method3630()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass394_1.aClass201_1.method5348(Static321.method5290(local12));
			return this.method3640(local23);
		} else {
			return 0;
		}
	}
}
