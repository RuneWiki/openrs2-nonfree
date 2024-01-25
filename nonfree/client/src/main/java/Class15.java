import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class15 {

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "Lclient!bj;")
	private Class37 aClass37_1 = null;

	@OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
	public int anInt425;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Z")
	private final boolean aBoolean35;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Lclient!ms;")
	private final Class227 aClass227_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!ms;ZI)V")
	public Class15(@OriginalArg(0) Class227 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.anInt425 = arg2;
		this.aBoolean35 = arg1;
		this.aClass227_1 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
	public boolean method509(@OriginalArg(0) int arg0) {
		if (!this.method543(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method519(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Z")
	private boolean method510() {
		if (this.aClass37_1 == null) {
			this.aClass37_1 = this.aClass227_1.method8069();
			if (this.aClass37_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass37_1.anInt1033];
			this.anObjectArrayArray1 = new Object[this.aClass37_1.anInt1033][];
		}
		return true;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)I")
	public int method512(@OriginalArg(0) int arg0) {
		return this.method543(arg0) ? this.aClass37_1.anIntArray87[arg0] : 0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method514(@OriginalArg(0) String arg0) {
		if (this.method510()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass37_1.aClass150_1.method4036(Static641.method8909(local17));
			return this.method543(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public void method515() {
		if (this.anObjectArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray1.length; local10++) {
				this.anObjectArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)I")
	public int method516() {
		return this.method510() ? this.aClass37_1.anIntArray87.length : -1;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)[B")
	public byte[] method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method531(arg0, (int[]) null, arg1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIZ)V")
	public void method518(@OriginalArg(2) boolean arg0) {
		if (!this.method510()) {
			return;
		}
		this.aClass37_1.aClass150Array1 = null;
		this.aClass37_1.anIntArrayArray5 = null;
		if (arg0) {
			this.aClass37_1.anIntArray90 = null;
			this.aClass37_1.aClass150_1 = null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V")
	private void method519(@OriginalArg(0) int arg0) {
		if (this.aBoolean35) {
			this.anObjectArray1[arg0] = this.aClass227_1.method8071(arg0);
		} else {
			this.anObjectArray1[arg0] = Static540.method7762(this.aClass227_1.method8071(arg0));
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method520(@OriginalArg(1) String arg0) {
		if (this.method510()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass37_1.aClass150_1.method4036(Static641.method8909(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(II)V")
	private void method521(@OriginalArg(0) int arg0) {
		this.aClass227_1.method8070(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)I")
	public int method522(@OriginalArg(1) int arg0) {
		if (this.method510()) {
			@Pc(21) int local21 = this.aClass37_1.aClass150_1.method4036(arg0);
			return this.method543(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)Z")
	private boolean method523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method510()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass37_1.anIntArray87.length && this.aClass37_1.anIntArray87[arg1] > arg0) {
			return true;
		} else if (Static185.aBoolean284) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method524(@OriginalArg(1) String arg0) {
		if (this.method510()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass37_1.aClass150_1.method4036(Static641.method8909(local11));
			this.method521(local22);
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)I")
	public int method525() {
		if (!this.method510()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray1.length; local17++) {
			if (this.aClass37_1.anIntArray86[local17] > 0) {
				local13 += 100;
				local15 += this.method529(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(II)Z")
	public boolean method526(@OriginalArg(1) int arg0) {
		if (!this.method510()) {
			return false;
		} else if (this.aClass37_1.anIntArray87.length == 1) {
			return this.method542(arg0, 0);
		} else if (!this.method543(arg0)) {
			return false;
		} else if (this.aClass37_1.anIntArray87[arg0] == 1) {
			return this.method542(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method527(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method510()) {
			return false;
		}
		@Pc(22) String local22 = arg1.toLowerCase();
		@Pc(25) String local25 = arg0.toLowerCase();
		@Pc(34) int local34 = this.aClass37_1.aClass150_1.method4036(Static641.method8909(local22));
		if (local34 < 0) {
			return false;
		} else {
			@Pc(49) int local49 = this.aClass37_1.aClass150Array1[local34].method4036(Static641.method8909(local25));
			return local49 >= 0;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	private boolean method528(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method510()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass37_1.aClass150_1.method4036(Static641.method8909(local12));
		if (this.method543(local26)) {
			@Pc(53) int local53 = this.aClass37_1.aClass150Array1[local26].method4036(Static641.method8909(local15));
			return this.method542(local53, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(IZ)I")
	private int method529(@OriginalArg(0) int arg0) {
		if (this.method543(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass227_1.method8068(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)[I")
	public int[] method530(@OriginalArg(1) int arg0) {
		if (!this.method543(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass37_1.anIntArrayArray6[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass37_1.anIntArray86[arg0]];
			@Pc(29) int local29 = 0;
			while (local29 < local18.length) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[III)[B")
	public byte[] method531(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method523(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(35) boolean local35 = this.method540(arg2, arg0, arg1);
			if (!local35) {
				this.method519(arg2);
				local35 = this.method540(arg2, arg0, arg1);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(66) byte[] local66 = Static289.method4549(this.anObjectArrayArray1[arg2][arg0], false);
		if (this.anInt425 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass37_1.anIntArray87[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt425 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local66;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method532(@OriginalArg(1) String arg0) {
		if (this.method510()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass37_1.aClass150_1.method4036(Static641.method8909(local17));
			return this.method509(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method533(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method510()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass37_1.aClass150_1.method4036(Static641.method8909(local12));
		if (this.method543(local26)) {
			@Pc(52) int local52 = this.aClass37_1.aClass150Array1[local26].method4036(Static641.method8909(local15));
			return this.method517(local52, local26);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I")
	public int method534() {
		if (!this.method510()) {
			throw new IllegalStateException("");
		}
		return this.aClass37_1.anInt1032;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Z")
	public boolean method535() {
		if (!this.method510()) {
			return false;
		}
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < this.aClass37_1.anIntArray89.length; local13++) {
			@Pc(24) int local24 = this.aClass37_1.anIntArray89[local13];
			if (this.anObjectArray1[local24] == null) {
				this.method519(local24);
				if (this.anObjectArray1[local24] == null) {
					local11 = false;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(IZ)[B")
	public byte[] method536(@OriginalArg(0) int arg0) {
		if (!this.method510()) {
			return null;
		} else if (this.aClass37_1.anIntArray87.length == 1) {
			return this.method517(arg0, 0);
		} else if (!this.method543(arg0)) {
			return null;
		} else if (this.aClass37_1.anIntArray87[arg0] == 1) {
			return this.method517(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method537(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = this.method514("");
		return local8 == -1 ? this.method528("", arg0) : this.method528(arg0, "");
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method538(@OriginalArg(1) String arg0) {
		if (this.method510()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass37_1.aClass150_1.method4036(Static641.method8909(local12));
			return this.method529(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "(II)V")
	public void method539(@OriginalArg(0) int arg0) {
		if (this.method543(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB[I)Z")
	private boolean method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method543(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass37_1.anIntArray86[arg0];
			@Pc(31) int[] local31 = this.aClass37_1.anIntArrayArray6[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass37_1.anIntArray87[arg0]];
			}
			@Pc(57) Object[] local57 = this.anObjectArrayArray1[arg0];
			@Pc(59) boolean local59 = true;
			for (@Pc(61) int local61 = 0; local61 < local25; local61++) {
				@Pc(67) int local67;
				if (local31 == null) {
					local67 = local61;
				} else {
					local67 = local31[local61];
				}
				if (local57[local67] == null) {
					local59 = false;
					break;
				}
			}
			if (local59) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local127 = Static289.method4549(this.anObjectArray1[arg0], false);
			} else {
				local127 = Static289.method4549(this.anObjectArray1[arg0], true);
				@Pc(142) Class3_Sub25 local142 = new Class3_Sub25(local127);
				local142.method8612(local142.aByteArray106.length, arg2);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static482.method7009(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static195.method3560(local156, "T3 - " + (arg2 != null) + "," + arg0 + "," + local127.length + "," + Static396.method5593(local127.length, local127) + "," + Static396.method5593(local127.length - 2, local127) + "," + this.aClass37_1.anIntArray88[arg0] + "," + this.aClass37_1.anInt1032);
			}
			if (this.aBoolean35) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(228) int local228;
			if (local25 <= 1) {
				if (local31 == null) {
					local228 = 0;
				} else {
					local228 = local31[0];
				}
				if (this.anInt425 == 0) {
					local57[local228] = Static540.method7762(local154);
				} else {
					local57[local228] = local154;
				}
			} else {
				@Pc(271) int local271;
				@Pc(284) Class3_Sub25 local284;
				@Pc(291) int local291;
				@Pc(293) int local293;
				@Pc(297) int local297;
				@Pc(299) int local299;
				@Pc(313) int local313;
				@Pc(362) int local362;
				@Pc(364) int local364;
				if (this.anInt425 == 2) {
					local228 = local154.length;
					local228--;
					local271 = local154[local228] & 0xFF;
					local228 -= local25 * 4 * local271;
					local284 = new Class3_Sub25(local154);
					@Pc(286) int local286 = 0;
					local284.anInt9765 = local228;
					local291 = 0;
					for (local293 = 0; local293 < local271; local293++) {
						local297 = 0;
						for (local299 = 0; local299 < local25; local299++) {
							local297 += local284.method8618();
							if (local31 == null) {
								local313 = local299;
							} else {
								local313 = local31[local299];
							}
							if (arg1 == local313) {
								local291 = local313;
								local286 += local297;
							}
						}
					}
					if (local286 == 0) {
						return true;
					}
					@Pc(349) byte[] local349 = new byte[local286];
					local286 = 0;
					local284.anInt9765 = local228;
					local299 = 0;
					for (local313 = 0; local313 < local271; local313++) {
						local362 = 0;
						for (local364 = 0; local364 < local25; local364++) {
							local362 += local284.method8618();
							@Pc(378) int local378;
							if (local31 == null) {
								local378 = local364;
							} else {
								local378 = local31[local364];
							}
							if (arg1 == local378) {
								Static684.method5324(local154, local299, local349, local286, local362);
								local286 += local362;
							}
							local299 += local362;
						}
					}
					local57[local291] = local349;
				} else {
					local228 = local154.length;
					local228--;
					local271 = local154[local228] & 0xFF;
					local228 -= local25 * 4 * local271;
					local284 = new Class3_Sub25(local154);
					local284.anInt9765 = local228;
					@Pc(454) int[] local454 = new int[local25];
					for (local291 = 0; local291 < local271; local291++) {
						local293 = 0;
						for (local297 = 0; local297 < local25; local297++) {
							local293 += local284.method8618();
							local454[local297] += local293;
						}
					}
					@Pc(488) byte[][] local488 = new byte[local25][];
					for (local297 = 0; local297 < local25; local297++) {
						local488[local297] = new byte[local454[local297]];
						local454[local297] = 0;
					}
					local284.anInt9765 = local228;
					local299 = 0;
					for (local313 = 0; local313 < local271; local313++) {
						local362 = 0;
						for (local364 = 0; local364 < local25; local364++) {
							local362 += local284.method8618();
							Static684.method5324(local154, local299, local488[local364], local454[local364], local362);
							local454[local364] += local362;
							local299 += local362;
						}
					}
					for (local362 = 0; local362 < local25; local362++) {
						if (local31 == null) {
							local364 = local362;
						} else {
							local364 = local31[local362];
						}
						if (this.anInt425 == 0) {
							local57[local364] = Static540.method7762(local488[local362]);
						} else {
							local57[local364] = local488[local362];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
	public void method541() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(III)Z")
	public boolean method542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method523(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method519(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(BI)Z")
	private boolean method543(@OriginalArg(1) int arg0) {
		if (!this.method510()) {
			return false;
		} else if (arg0 >= 0 && this.aClass37_1.anIntArray87.length > arg0 && this.aClass37_1.anIntArray87[arg0] != 0) {
			return true;
		} else if (Static185.aBoolean284) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}
}
