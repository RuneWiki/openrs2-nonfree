import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class196 {

	@OriginalMember(owner = "client!la", name = "j", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!m;")
	private Class211 aClass211_1 = null;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "I")
	public int anInt5854;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Z")
	private final boolean aBoolean414;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!ht;")
	private final Class147 aClass147_1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ht;ZI)V")
	public Class196(@OriginalArg(0) Class147 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.anInt5854 = arg2;
		this.aBoolean414 = arg1;
		this.aClass147_1 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5090(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = this.method5104("");
		return local16 == -1 ? this.method5092("", arg0) : this.method5092(arg0, "");
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public void method5091() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method5092(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5114()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass211_1.aClass190_1.method4746(Static93.method2088(local12));
		if (this.method5100(local24)) {
			@Pc(48) int local48 = this.aClass211_1.aClass190Array1[local24].method4746(Static93.method2088(local15));
			return this.method5115(local48, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method5093(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5114()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass211_1.aClass190_1.method4746(Static93.method2088(local12));
		if (this.method5100(local24)) {
			@Pc(42) int local42 = this.aClass211_1.aClass190Array1[local24].method4746(Static93.method2088(local15));
			return this.method5102(local24, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	private void method5095(@OriginalArg(0) int arg0) {
		if (this.aBoolean414) {
			this.anObjectArray2[arg0] = this.aClass147_1.method7343(arg0);
		} else {
			this.anObjectArray2[arg0] = Static125.method2479(this.aClass147_1.method7343(arg0));
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
	private void method5096(@OriginalArg(0) int arg0) {
		this.aClass147_1.method7341(arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method5097(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5114()) {
			return false;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass211_1.aClass190_1.method4746(Static93.method2088(local17));
		if (local29 < 0) {
			return false;
		} else {
			@Pc(49) int local49 = this.aClass211_1.aClass190Array1[local29].method4746(Static93.method2088(local20));
			return local49 >= 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Z")
	private boolean method5098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5114()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass211_1.anIntArray387.length > arg1 && arg0 < this.aClass211_1.anIntArray387[arg1]) {
			return true;
		} else if (Static148.aBoolean191) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIII)Z")
	private boolean method5099(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5100(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass211_1.anIntArray384[arg1];
			@Pc(31) int[] local31 = this.aClass211_1.anIntArrayArray47[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass211_1.anIntArray387[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(63) int local63;
				if (local31 == null) {
					local63 = local55;
				} else {
					local63 = local31[local55];
				}
				if (local51[local63] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(125) byte[] local125;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local125 = Static483.method7202(false, this.anObjectArray2[arg1]);
			} else {
				local125 = Static483.method7202(true, this.anObjectArray2[arg1]);
				@Pc(140) Class3_Sub3 local140 = new Class3_Sub3(local125);
				local140.method4252(local140.aByteArray54.length, arg0);
			}
			@Pc(152) byte[] local152;
			try {
				local152 = Static631.method8656(local125);
			} catch (@Pc(154) RuntimeException local154) {
				throw Static319.method5226(local154, "T3 - " + (arg0 != null) + "," + arg1 + "," + local125.length + "," + Static361.method5906(local125, local125.length) + "," + Static361.method5906(local125, local125.length - 2) + "," + this.aClass211_1.anIntArray385[arg1] + "," + this.aClass211_1.anInt6278);
			}
			if (this.aBoolean414) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(236) int local236;
			if (local25 <= 1) {
				if (local31 == null) {
					local236 = 0;
				} else {
					local236 = local31[0];
				}
				if (this.anInt5854 == 0) {
					local51[local236] = Static125.method2479(local152);
				} else {
					local51[local236] = local152;
				}
			} else {
				@Pc(277) int local277;
				@Pc(290) Class3_Sub3 local290;
				@Pc(294) int local294;
				@Pc(299) int local299;
				@Pc(303) int local303;
				@Pc(305) int local305;
				@Pc(319) int local319;
				@Pc(368) int local368;
				@Pc(370) int local370;
				if (this.anInt5854 == 2) {
					local236 = local152.length;
					local236--;
					local277 = local152[local236] & 0xFF;
					local236 -= local277 * 4 * local25;
					local290 = new Class3_Sub3(local152);
					@Pc(292) int local292 = 0;
					local294 = 0;
					local290.anInt4736 = local236;
					for (local299 = 0; local299 < local277; local299++) {
						local303 = 0;
						for (local305 = 0; local305 < local25; local305++) {
							local303 += local290.method4207();
							if (local31 == null) {
								local319 = local305;
							} else {
								local319 = local31[local305];
							}
							if (local319 == arg2) {
								local294 = local319;
								local292 += local303;
							}
						}
					}
					if (local292 == 0) {
						return true;
					}
					@Pc(355) byte[] local355 = new byte[local292];
					local292 = 0;
					local290.anInt4736 = local236;
					local305 = 0;
					for (local319 = 0; local319 < local277; local319++) {
						local368 = 0;
						for (local370 = 0; local370 < local25; local370++) {
							local368 += local290.method4207();
							@Pc(382) int local382;
							if (local31 == null) {
								local382 = local370;
							} else {
								local382 = local31[local370];
							}
							if (local382 == arg2) {
								Static653.method6858(local152, local305, local355, local292, local368);
								local292 += local368;
							}
							local305 += local368;
						}
					}
					local51[local294] = local355;
				} else {
					local236 = local152.length;
					local236--;
					local277 = local152[local236] & 0xFF;
					local236 -= local277 * local25 * 4;
					local290 = new Class3_Sub3(local152);
					local290.anInt4736 = local236;
					@Pc(456) int[] local456 = new int[local25];
					for (local294 = 0; local294 < local277; local294++) {
						local299 = 0;
						for (local303 = 0; local303 < local25; local303++) {
							local299 += local290.method4207();
							local456[local303] += local299;
						}
					}
					@Pc(498) byte[][] local498 = new byte[local25][];
					for (local303 = 0; local303 < local25; local303++) {
						local498[local303] = new byte[local456[local303]];
						local456[local303] = 0;
					}
					local290.anInt4736 = local236;
					local305 = 0;
					for (local319 = 0; local319 < local277; local319++) {
						local368 = 0;
						for (local370 = 0; local370 < local25; local370++) {
							local368 += local290.method4207();
							Static653.method6858(local152, local305, local498[local370], local456[local370], local368);
							local456[local370] += local368;
							local305 += local368;
						}
					}
					for (local368 = 0; local368 < local25; local368++) {
						if (local31 == null) {
							local370 = local368;
						} else {
							local370 = local31[local368];
						}
						if (this.anInt5854 == 0) {
							local51[local370] = Static125.method2479(local498[local368]);
						} else {
							local51[local370] = local498[local368];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
	private boolean method5100(@OriginalArg(0) int arg0) {
		if (!this.method5114()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass211_1.anIntArray387.length && this.aClass211_1.anIntArray387[arg0] != 0) {
			return true;
		} else if (Static148.aBoolean191) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)[B")
	public byte[] method5102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method5120(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method5104(@OriginalArg(1) String arg0) {
		if (this.method5114()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass211_1.aClass190_1.method4746(Static93.method2088(local12));
			return this.method5100(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method5105(@OriginalArg(0) String arg0) {
		if (this.method5114()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass211_1.aClass190_1.method4746(Static93.method2088(local12));
			return this.method5121(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5106(@OriginalArg(0) String arg0) {
		if (this.method5114()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass211_1.aClass190_1.method4746(Static93.method2088(local12));
			return this.method5119(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5107(@OriginalArg(1) String arg0) {
		if (this.method5114()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass211_1.aClass190_1.method4746(Static93.method2088(local18));
			return local27 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZI)V")
	public void method5108(@OriginalArg(1) boolean arg0) {
		if (!this.method5114()) {
			return;
		}
		if (arg0) {
			this.aClass211_1.aClass190_1 = null;
			this.aClass211_1.anIntArray383 = null;
		}
		this.aClass211_1.aClass190Array1 = null;
		this.aClass211_1.anIntArrayArray48 = null;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(BLjava/lang/String;)V")
	public void method5109(@OriginalArg(1) String arg0) {
		if (this.method5114()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass211_1.aClass190_1.method4746(Static93.method2088(local11));
			this.method5096(local20);
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	public void method5110() {
		if (this.anObjectArray2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray2.length; local10++) {
				this.anObjectArray2[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)Z")
	public boolean method5111(@OriginalArg(1) int arg0) {
		if (!this.method5114()) {
			return false;
		} else if (this.aClass211_1.anIntArray387.length == 1) {
			return this.method5115(arg0, 0);
		} else if (!this.method5100(arg0)) {
			return false;
		} else if (this.aClass211_1.anIntArray387[arg0] == 1) {
			return this.method5115(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(I)I")
	public int method5112() {
		if (!this.method5114()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass211_1.anIntArray384[local17] > 0) {
				local13 += 100;
				local15 += this.method5121(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[B")
	public byte[] method5113(@OriginalArg(1) int arg0) {
		if (!this.method5114()) {
			return null;
		} else if (this.aClass211_1.anIntArray387.length == 1) {
			return this.method5102(0, arg0);
		} else if (!this.method5100(arg0)) {
			return null;
		} else if (this.aClass211_1.anIntArray387[arg0] == 1) {
			return this.method5102(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Z")
	private boolean method5114() {
		if (this.aClass211_1 == null) {
			this.aClass211_1 = this.aClass147_1.method7344();
			if (this.aClass211_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass211_1.anInt6282][];
			this.anObjectArray2 = new Object[this.aClass211_1.anInt6282];
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(III)Z")
	public boolean method5115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5098(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method5095(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(BI)V")
	public void method5116(@OriginalArg(1) int arg0) {
		if (this.method5100(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)I")
	public int method5117() {
		if (!this.method5114()) {
			throw new IllegalStateException("");
		}
		return this.aClass211_1.anInt6278;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(II)I")
	public int method5118(@OriginalArg(0) int arg0) {
		return this.method5100(arg0) ? this.aClass211_1.anIntArray387[arg0] : 0;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(II)Z")
	public boolean method5119(@OriginalArg(1) int arg0) {
		if (!this.method5100(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method5095(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI[I)[B")
	public byte[] method5120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method5098(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method5099(arg2, arg1, arg0);
			if (!local30) {
				this.method5095(arg1);
				local30 = this.method5099(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static483.method7202(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt5854 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass211_1.anIntArray387[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt5854 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local64;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)I")
	private int method5121(@OriginalArg(1) int arg0) {
		if (this.method5100(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass147_1.method7339(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(Z)Z")
	public boolean method5122() {
		if (!this.method5114()) {
			return false;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.aClass211_1.anIntArray388.length; local19++) {
			@Pc(27) int local27 = this.aClass211_1.anIntArray388[local19];
			if (this.anObjectArray2[local27] == null) {
				this.method5095(local27);
				if (this.anObjectArray2[local27] == null) {
					local17 = false;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(II)[I")
	public int[] method5123(@OriginalArg(0) int arg0) {
		if (!this.method5100(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass211_1.anIntArrayArray47[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass211_1.anIntArray384[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)I")
	public int method5124(@OriginalArg(0) int arg0) {
		if (this.method5114()) {
			@Pc(16) int local16 = this.aClass211_1.aClass190_1.method4746(arg0);
			return this.method5100(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)I")
	public int method5125() {
		return this.method5114() ? this.aClass211_1.anIntArray387.length : -1;
	}
}
