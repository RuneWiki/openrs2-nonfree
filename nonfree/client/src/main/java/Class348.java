import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class348 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "Lclient!pq;")
	private Class267 aClass267_2 = null;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
	public int anInt10233;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "Lclient!ts;")
	private final Class240 aClass240_1;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Z")
	private final boolean aBoolean703;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!ts;ZI)V")
	public Class348(@OriginalArg(0) Class240 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt10233 = arg2;
		this.aClass240_1 = arg0;
		this.aBoolean703 = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZZZ)V")
	public void method7950(@OriginalArg(0) boolean arg0) {
		if (!this.method7983()) {
			return;
		}
		this.aClass267_2.aClass359Array1 = null;
		this.aClass267_2.anIntArrayArray40 = null;
		if (arg0) {
			this.aClass267_2.aClass359_1 = null;
			this.aClass267_2.anIntArray441 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7951(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = this.method7966("");
		return local13 == -1 ? this.method7968(arg0, "") : this.method7968("", arg0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public void method7952(@OriginalArg(1) int arg0) {
		if (this.method7957(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)I")
	public int method7953(@OriginalArg(0) int arg0) {
		if (this.method7983()) {
			@Pc(26) int local26 = this.aClass267_2.aClass359_1.method8128(arg0);
			return this.method7957(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7955(@OriginalArg(0) String arg0) {
		if (this.method7983()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass267_2.aClass359_1.method8128(Static80.method1711(local19));
			return this.method7984(local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method7956(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method7983()) {
			return null;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass267_2.aClass359_1.method8128(Static80.method1711(local17));
		if (this.method7957(local29)) {
			@Pc(47) int local47 = this.aClass267_2.aClass359Array1[local29].method8128(Static80.method1711(local20));
			return this.method7964(local47, local29);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(II)Z")
	private boolean method7957(@OriginalArg(0) int arg0) {
		if (!this.method7983()) {
			return false;
		} else if (arg0 >= 0 && this.aClass267_2.anIntArray440.length > arg0 && this.aClass267_2.anIntArray440[arg0] != 0) {
			return true;
		} else if (Static99.aBoolean192) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III[I)[B")
	public byte[] method7958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method7973(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method7965(arg0, arg2, arg1);
			if (!local30) {
				this.method7971(arg1);
				local30 = this.method7965(arg0, arg2, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static141.method8245(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.anInt10233 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass267_2.anIntArray440[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt10233 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z")
	public boolean method7959() {
		if (!this.method7983()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass267_2.anIntArray442.length; local15++) {
			@Pc(23) int local23 = this.aClass267_2.anIntArray442[local15];
			if (this.anObjectArray32[local23] == null) {
				this.method7971(local23);
				if (this.anObjectArray32[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(II)Z")
	public boolean method7960(@OriginalArg(1) int arg0) {
		if (!this.method7983()) {
			return false;
		} else if (this.aClass267_2.anIntArray440.length == 1) {
			return this.method7972(0, arg0);
		} else if (!this.method7957(arg0)) {
			return false;
		} else if (this.aClass267_2.anIntArray440[arg0] == 1) {
			return this.method7972(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
	public void method7961() {
		if (this.anObjectArray32 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray32.length; local6++) {
				this.anObjectArray32[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)I")
	public int method7962() {
		if (!this.method7983()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray32.length; local17++) {
			if (this.aClass267_2.anIntArray445[local17] > 0) {
				local15 += this.method7977(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)[B")
	public byte[] method7964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method7958(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI[II)Z")
	private boolean method7965(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method7957(arg2)) {
			return false;
		} else if (this.anObjectArray32[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass267_2.anIntArray445[arg2];
			@Pc(31) int[] local31 = this.aClass267_2.anIntArrayArray39[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass267_2.anIntArray440[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local63;
				} else {
					local69 = local31[local63];
				}
				if (local51[local69] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(130) byte[] local130;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local130 = Static141.method8245(this.anObjectArray32[arg2], false);
			} else {
				local130 = Static141.method8245(this.anObjectArray32[arg2], true);
				@Pc(145) Class4_Sub13 local145 = new Class4_Sub13(local130);
				local145.method7025(local145.aByteArray88.length, arg1);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static100.method1930(local130);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static461.method6781(local159, "T3 - " + (arg1 != null) + "," + arg2 + "," + local130.length + "," + Static89.method1821(local130.length, local130) + "," + Static89.method1821(local130.length - 2, local130) + "," + this.aClass267_2.anIntArray443[arg2] + "," + this.aClass267_2.anInt7965);
			}
			if (this.aBoolean703) {
				this.anObjectArray32[arg2] = null;
			}
			@Pc(231) int local231;
			if (local25 <= 1) {
				if (local31 == null) {
					local231 = 0;
				} else {
					local231 = local31[0];
				}
				if (this.anInt10233 == 0) {
					local51[local231] = Static111.method2038(local157);
				} else {
					local51[local231] = local157;
				}
			} else {
				@Pc(272) int local272;
				@Pc(285) Class4_Sub13 local285;
				@Pc(293) int local293;
				@Pc(297) int local297;
				@Pc(299) int local299;
				@Pc(353) int local353;
				@Pc(355) int local355;
				@Pc(359) int local359;
				@Pc(361) int local361;
				if (this.anInt10233 == 2) {
					local231 = local157.length;
					local231--;
					local272 = local157[local231] & 0xFF;
					local231 -= local272 * 4 * local25;
					local285 = new Class4_Sub13(local157);
					@Pc(471) int local471 = 0;
					local293 = 0;
					local285.anInt9170 = local231;
					for (local297 = 0; local297 < local272; local297++) {
						local299 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local299 += local285.method6990();
							if (local31 == null) {
								local355 = local353;
							} else {
								local355 = local31[local353];
							}
							if (local355 == arg0) {
								local293 = local355;
								local471 += local299;
							}
						}
					}
					if (local471 == 0) {
						return true;
					}
					@Pc(538) byte[] local538 = new byte[local471];
					local471 = 0;
					local285.anInt9170 = local231;
					local353 = 0;
					for (local355 = 0; local355 < local272; local355++) {
						local359 = 0;
						for (local361 = 0; local361 < local25; local361++) {
							local359 += local285.method6990();
							@Pc(567) int local567;
							if (local31 == null) {
								local567 = local361;
							} else {
								local567 = local31[local361];
							}
							if (local567 == arg0) {
								Static599.method3060(local157, local353, local538, local471, local359);
								local471 += local359;
							}
							local353 += local359;
						}
					}
					local51[local293] = local538;
				} else {
					local231 = local157.length;
					local231--;
					local272 = local157[local231] & 0xFF;
					local231 -= local272 * 4 * local25;
					local285 = new Class4_Sub13(local157);
					local285.anInt9170 = local231;
					@Pc(291) int[] local291 = new int[local25];
					for (local293 = 0; local293 < local272; local293++) {
						local297 = 0;
						for (local299 = 0; local299 < local25; local299++) {
							local297 += local285.method6990();
							local291[local299] += local297;
						}
					}
					@Pc(329) byte[][] local329 = new byte[local25][];
					for (local299 = 0; local299 < local25; local299++) {
						local329[local299] = new byte[local291[local299]];
						local291[local299] = 0;
					}
					local285.anInt9170 = local231;
					local353 = 0;
					for (local355 = 0; local355 < local272; local355++) {
						local359 = 0;
						for (local361 = 0; local361 < local25; local361++) {
							local359 += local285.method6990();
							Static599.method3060(local157, local353, local329[local361], local291[local361], local359);
							local291[local361] += local359;
							local353 += local359;
						}
					}
					for (local359 = 0; local359 < local25; local359++) {
						if (local31 == null) {
							local361 = local359;
						} else {
							local361 = local31[local359];
						}
						if (this.anInt10233 == 0) {
							local51[local361] = Static111.method2038(local329[local359]);
						} else {
							local51[local361] = local329[local359];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method7966(@OriginalArg(1) String arg0) {
		if (this.method7983()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass267_2.aClass359_1.method8128(Static80.method1711(local20));
			return this.method7957(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method7967(@OriginalArg(1) String arg0) {
		if (this.method7983()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass267_2.aClass359_1.method8128(Static80.method1711(local12));
			return this.method7977(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method7968(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method7983()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass267_2.aClass359_1.method8128(Static80.method1711(local20));
		if (this.method7957(local32)) {
			@Pc(50) int local50 = this.aClass267_2.aClass359Array1[local32].method8128(Static80.method1711(local23));
			return this.method7972(local32, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(II)[B")
	public byte[] method7969(@OriginalArg(1) int arg0) {
		if (!this.method7983()) {
			return null;
		} else if (this.aClass267_2.anIntArray440.length == 1) {
			return this.method7964(arg0, 0);
		} else if (!this.method7957(arg0)) {
			return null;
		} else if (this.aClass267_2.anIntArray440[arg0] == 1) {
			return this.method7964(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method7970(@OriginalArg(1) String arg0) {
		if (this.method7983()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass267_2.aClass359_1.method8128(Static80.method1711(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "(II)V")
	private void method7971(@OriginalArg(0) int arg0) {
		if (this.aBoolean703) {
			this.anObjectArray32[arg0] = this.aClass240_1.method5488(arg0);
		} else {
			this.anObjectArray32[arg0] = Static111.method2038(this.aClass240_1.method5488(arg0));
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(III)Z")
	public boolean method7972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method7973(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method7971(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(III)Z")
	private boolean method7973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method7983()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass267_2.anIntArray440.length > arg1 && arg0 < this.aClass267_2.anIntArray440[arg1]) {
			return true;
		} else if (Static99.aBoolean192) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
	public int method7974() {
		if (!this.method7983()) {
			throw new IllegalStateException("");
		}
		return this.aClass267_2.anInt7965;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(Ljava/lang/String;I)V")
	public void method7975(@OriginalArg(0) String arg0) {
		if (this.method7983()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass267_2.aClass359_1.method8128(Static80.method1711(local13));
			this.method7979(local22);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)[I")
	public int[] method7976(@OriginalArg(0) int arg0) {
		if (!this.method7957(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass267_2.anIntArrayArray39[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass267_2.anIntArray445[arg0]];
			@Pc(37) int local37 = 0;
			while (local26.length > local37) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(IZ)I")
	private int method7977(@OriginalArg(0) int arg0) {
		if (this.method7957(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass240_1.method5487(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "(II)V")
	private void method7979(@OriginalArg(0) int arg0) {
		this.aClass240_1.method5490(arg0);
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V")
	public void method7980() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "(II)I")
	public int method7981(@OriginalArg(1) int arg0) {
		return this.method7957(arg0) ? this.aClass267_2.anIntArray440[arg0] : 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z")
	public boolean method7982(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method7983()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass267_2.aClass359_1.method8128(Static80.method1711(local20));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass267_2.aClass359Array1[local32].method8128(Static80.method1711(local23));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)Z")
	private boolean method7983() {
		if (this.aClass267_2 == null) {
			this.aClass267_2 = this.aClass240_1.method5489();
			if (this.aClass267_2 == null) {
				return false;
			}
			this.anObjectArray32 = new Object[this.aClass267_2.anInt7966];
			this.anObjectArrayArray1 = new Object[this.aClass267_2.anInt7966][];
		}
		return true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)Z")
	public boolean method7984(@OriginalArg(1) int arg0) {
		if (!this.method7957(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method7971(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)I")
	public int method7985() {
		return this.method7983() ? this.aClass267_2.anIntArray440.length : -1;
	}
}
