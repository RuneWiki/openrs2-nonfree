import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class343 {

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "Lclient!vh;")
	private Class352 aClass352_2 = null;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
	public int anInt9505;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "Lclient!caa;")
	private final Class40 aClass40_1;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Z")
	private final boolean aBoolean714;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!caa;ZI)V")
	public Class343(@OriginalArg(0) Class40 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.anInt9505 = arg2;
		this.aClass40_1 = arg0;
		this.aBoolean714 = arg1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
	public boolean method8130(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method8139(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method8159(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	private boolean method8131(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8160()) {
			return false;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass352_2.aClass240_1.method6024(Static316.method5273(local14));
		if (this.method8162(local26)) {
			@Pc(54) int local54 = this.aClass352_2.aClass240Array1[local26].method6024(Static316.method5273(local17));
			return this.method8130(local26, local54);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)[B")
	public byte[] method8132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method8137(arg0, (int[]) null, arg1);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)V")
	private void method8133(@OriginalArg(0) int arg0) {
		this.aClass40_1.method7337(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
	private int method8134(@OriginalArg(1) int arg0) {
		if (this.method8162(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass40_1.method7339(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I[III)Z")
	private boolean method8135(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method8162(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			return false;
		} else {
			@Pc(33) int local33 = this.aClass352_2.anIntArray618[arg0];
			@Pc(39) int[] local39 = this.aClass352_2.anIntArrayArray57[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass352_2.anIntArray613[arg0]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg0];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local33; local63++) {
				@Pc(69) int local69;
				if (local39 == null) {
					local69 = local63;
				} else {
					local69 = local39[local63];
				}
				if (local59[local69] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(126) byte[] local126;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local126 = Static184.method3030(this.anObjectArray2[arg0], false);
			} else {
				local126 = Static184.method3030(this.anObjectArray2[arg0], true);
				@Pc(141) Class3_Sub9 local141 = new Class3_Sub9(local126);
				local141.method5589(arg1, local141.aByteArray51.length);
			}
			@Pc(155) byte[] local155;
			try {
				local155 = Static2.method27(local126);
			} catch (@Pc(157) RuntimeException local157) {
				throw Static438.method6616(local157, "T3 - " + (arg1 != null) + "," + arg0 + "," + local126.length + "," + Static266.method4462(local126, local126.length) + "," + Static266.method4462(local126, local126.length - 2) + "," + this.aClass352_2.anIntArray617[arg0] + "," + this.aClass352_2.anInt9745);
			}
			if (this.aBoolean714) {
				this.anObjectArray2[arg0] = null;
			}
			@Pc(231) int local231;
			if (local33 <= 1) {
				if (local39 == null) {
					local231 = 0;
				} else {
					local231 = local39[0];
				}
				if (this.anInt9505 == 0) {
					local59[local231] = Static176.method2904(local155);
				} else {
					local59[local231] = local155;
				}
			} else {
				@Pc(269) int local269;
				@Pc(282) Class3_Sub9 local282;
				@Pc(289) int local289;
				@Pc(291) int local291;
				@Pc(295) int local295;
				@Pc(297) int local297;
				@Pc(311) int local311;
				@Pc(356) int local356;
				@Pc(358) int local358;
				if (this.anInt9505 == 2) {
					local231 = local155.length;
					local231--;
					local269 = local155[local231] & 0xFF;
					local231 -= local33 * local269 * 4;
					local282 = new Class3_Sub9(local155);
					@Pc(284) int local284 = 0;
					local282.anInt6453 = local231;
					local289 = 0;
					for (local291 = 0; local291 < local269; local291++) {
						local295 = 0;
						for (local297 = 0; local297 < local33; local297++) {
							local295 += local282.method5585();
							if (local39 == null) {
								local311 = local297;
							} else {
								local311 = local39[local297];
							}
							if (arg2 == local311) {
								local284 += local295;
								local289 = local311;
							}
						}
					}
					if (local284 == 0) {
						return true;
					}
					@Pc(343) byte[] local343 = new byte[local284];
					local284 = 0;
					local282.anInt6453 = local231;
					local297 = 0;
					for (local311 = 0; local311 < local269; local311++) {
						local356 = 0;
						for (local358 = 0; local358 < local33; local358++) {
							local356 += local282.method5585();
							@Pc(372) int local372;
							if (local39 == null) {
								local372 = local358;
							} else {
								local372 = local39[local358];
							}
							if (arg2 == local372) {
								Static651.method749(local155, local297, local343, local284, local356);
								local284 += local356;
							}
							local297 += local356;
						}
					}
					local59[local289] = local343;
				} else {
					local231 = local155.length;
					local231--;
					local269 = local155[local231] & 0xFF;
					local231 -= local33 * local269 * 4;
					local282 = new Class3_Sub9(local155);
					@Pc(441) int[] local441 = new int[local33];
					local282.anInt6453 = local231;
					for (local289 = 0; local289 < local269; local289++) {
						local291 = 0;
						for (local295 = 0; local295 < local33; local295++) {
							local291 += local282.method5585();
							local441[local295] += local291;
						}
					}
					@Pc(482) byte[][] local482 = new byte[local33][];
					for (local295 = 0; local295 < local33; local295++) {
						local482[local295] = new byte[local441[local295]];
						local441[local295] = 0;
					}
					local282.anInt6453 = local231;
					local297 = 0;
					for (local311 = 0; local311 < local269; local311++) {
						local356 = 0;
						for (local358 = 0; local358 < local33; local358++) {
							local356 += local282.method5585();
							Static651.method749(local155, local297, local482[local358], local441[local358], local356);
							local297 += local356;
							local441[local358] += local356;
						}
					}
					for (local356 = 0; local356 < local33; local356++) {
						if (local39 == null) {
							local358 = local356;
						} else {
							local358 = local39[local356];
						}
						if (this.anInt9505 == 0) {
							local59[local358] = Static176.method2904(local482[local356]);
						} else {
							local59[local358] = local482[local356];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)I")
	public int method8136(@OriginalArg(0) int arg0) {
		if (this.method8160()) {
			@Pc(21) int local21 = this.aClass352_2.aClass240_1.method6024(arg0);
			return this.method8162(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II[II)[B")
	public byte[] method8137(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method8139(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(39) boolean local39 = this.method8135(arg0, arg1, arg2);
			if (!local39) {
				this.method8159(arg0);
				local39 = this.method8135(arg0, arg1, arg2);
				if (!local39) {
					return null;
				}
			}
		}
		@Pc(66) byte[] local66 = Static184.method3030(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt9505 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass352_2.anIntArray613[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt9505 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local66;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(IB)Z")
	public boolean method8138(@OriginalArg(0) int arg0) {
		if (!this.method8160()) {
			return false;
		} else if (this.aClass352_2.anIntArray613.length == 1) {
			return this.method8130(0, arg0);
		} else if (!this.method8162(arg0)) {
			return false;
		} else if (this.aClass352_2.anIntArray613[arg0] == 1) {
			return this.method8130(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(III)Z")
	private boolean method8139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method8160()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass352_2.anIntArray613.length > arg0 && this.aClass352_2.anIntArray613[arg0] > arg1) {
			return true;
		} else if (Static341.aBoolean464) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method8140(@OriginalArg(0) String arg0) {
		if (this.method8160()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass352_2.aClass240_1.method6024(Static316.method5273(local18));
			return this.method8146(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public void method8141() {
		if (this.anObjectArray2 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray2.length; local16++) {
				this.anObjectArray2[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B")
	public byte[] method8142(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8160()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass352_2.aClass240_1.method6024(Static316.method5273(local12));
		if (this.method8162(local24)) {
			@Pc(51) int local51 = this.aClass352_2.aClass240Array1[local24].method6024(Static316.method5273(local15));
			return this.method8132(local24, local51);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)[B")
	public byte[] method8143(@OriginalArg(0) int arg0) {
		if (!this.method8160()) {
			return null;
		} else if (this.aClass352_2.anIntArray613.length == 1) {
			return this.method8132(0, arg0);
		} else if (!this.method8162(arg0)) {
			return null;
		} else if (this.aClass352_2.anIntArray613[arg0] == 1) {
			return this.method8132(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
	public int method8144() {
		return this.method8160() ? this.aClass352_2.anIntArray613.length : -1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)[I")
	public int[] method8145(@OriginalArg(0) int arg0) {
		if (!this.method8162(arg0)) {
			return null;
		}
		@Pc(25) int[] local25 = this.aClass352_2.anIntArrayArray57[arg0];
		if (local25 == null) {
			local25 = new int[this.aClass352_2.anIntArray618[arg0]];
			@Pc(36) int local36 = 0;
			while (local25.length > local36) {
				local25[local36] = local36++;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)Z")
	public boolean method8146(@OriginalArg(1) int arg0) {
		if (!this.method8162(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method8159(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8147(@OriginalArg(1) String arg0) {
		if (this.method8160()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass352_2.aClass240_1.method6024(Static316.method5273(local12));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(IZ)V")
	public void method8148(@OriginalArg(0) int arg0) {
		if (this.method8162(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BZZ)V")
	public void method8149(@OriginalArg(1) boolean arg0) {
		if (!this.method8160()) {
			return;
		}
		if (arg0) {
			this.aClass352_2.aClass240_1 = null;
			this.aClass352_2.anIntArray614 = null;
		}
		this.aClass352_2.anIntArrayArray56 = null;
		this.aClass352_2.aClass240Array1 = null;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8150(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = this.method8158("");
		return local8 == -1 ? this.method8131(arg0, "") : this.method8131("", arg0);
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)Z")
	public boolean method8151() {
		if (!this.method8160()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass352_2.anIntArray616.length; local15++) {
			@Pc(23) int local23 = this.aClass352_2.anIntArray616[local15];
			if (this.anObjectArray2[local23] == null) {
				this.method8159(local23);
				if (this.anObjectArray2[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)I")
	public int method8153() {
		if (!this.method8160()) {
			throw new IllegalStateException("");
		}
		return this.aClass352_2.anInt9745;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)V")
	public void method8154() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray1.length; local15++) {
				this.anObjectArrayArray1[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method8155(@OriginalArg(0) String arg0) {
		if (this.method8160()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass352_2.aClass240_1.method6024(Static316.method5273(local17));
			this.method8133(local26);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method8156(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method8160()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass352_2.aClass240_1.method6024(Static316.method5273(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(44) int local44 = this.aClass352_2.aClass240Array1[local24].method6024(Static316.method5273(local15));
			return local44 >= 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(II)I")
	public int method8157(@OriginalArg(0) int arg0) {
		return this.method8162(arg0) ? this.aClass352_2.anIntArray613[arg0] : 0;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method8158(@OriginalArg(0) String arg0) {
		if (this.method8160()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass352_2.aClass240_1.method6024(Static316.method5273(local12));
			return this.method8162(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(II)V")
	private void method8159(@OriginalArg(1) int arg0) {
		if (this.aBoolean714) {
			this.anObjectArray2[arg0] = this.aClass40_1.method7334(arg0);
		} else {
			this.anObjectArray2[arg0] = Static176.method2904(this.aClass40_1.method7334(arg0));
		}
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)Z")
	private boolean method8160() {
		if (this.aClass352_2 == null) {
			this.aClass352_2 = this.aClass40_1.method7335();
			if (this.aClass352_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass352_2.anInt9751][];
			this.anObjectArray2 = new Object[this.aClass352_2.anInt9751];
		}
		return true;
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(B)I")
	public int method8161() {
		if (!this.method8160()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray2.length; local25++) {
			if (this.aClass352_2.anIntArray618[local25] > 0) {
				local13 += 100;
				local15 += this.method8134(local25);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(BI)Z")
	private boolean method8162(@OriginalArg(1) int arg0) {
		if (!this.method8160()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass352_2.anIntArray613.length && this.aClass352_2.anIntArray613[arg0] != 0) {
			return true;
		} else if (Static341.aBoolean464) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method8163(@OriginalArg(0) String arg0) {
		if (this.method8160()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass352_2.aClass240_1.method6024(Static316.method5273(local17));
			return this.method8134(local26);
		} else {
			return 0;
		}
	}
}
