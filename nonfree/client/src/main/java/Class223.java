import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class223 {

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Lclient!te;")
	private Class319 aClass319_2 = null;

	@OriginalMember(owner = "client!ni", name = "M", descriptor = "Lclient!um;")
	private final Class193 aClass193_1;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Z")
	private final boolean aBoolean565;

	@OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
	public int anInt7135;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!um;ZI)V")
	public Class223(@OriginalArg(0) Class193 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass193_1 = arg0;
		this.aBoolean565 = arg1;
		this.anInt7135 = arg2;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5937(@OriginalArg(0) String arg0) {
		if (this.method5947()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass319_2.aClass138_1.method4263(Static529.method5804(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([IIBI)Z")
	private boolean method5938(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5967(arg2)) {
			return false;
		} else if (this.anObjectArray2[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass319_2.anIntArray492[arg2];
			@Pc(31) int[] local31 = this.aClass319_2.anIntArrayArray52[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass319_2.anIntArray493[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(53) boolean local53 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local63;
				} else {
					local69 = local31[local63];
				}
				if (local51[local69] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(130) byte[] local130;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local130 = Static56.method1712(this.anObjectArray2[arg2], false);
			} else {
				local130 = Static56.method1712(this.anObjectArray2[arg2], true);
				@Pc(135) Class6_Sub8 local135 = new Class6_Sub8(local130);
				local135.method8232(arg0, local135.aByteArray102.length);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static184.method3442(local130);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static596.method8283(local159, "T3 - " + (arg0 != null) + "," + arg2 + "," + local130.length + "," + Static64.method8774(local130.length, local130) + "," + Static64.method8774(local130.length - 2, local130) + "," + this.aClass319_2.anIntArray494[arg2] + "," + this.aClass319_2.anInt9375);
			}
			if (this.aBoolean565) {
				this.anObjectArray2[arg2] = null;
			}
			@Pc(231) int local231;
			if (local25 <= 1) {
				if (local31 == null) {
					local231 = 0;
				} else {
					local231 = local31[0];
				}
				if (this.anInt7135 == 0) {
					local51[local231] = Static591.method8149(local157);
				} else {
					local51[local231] = local157;
				}
			} else {
				@Pc(272) int local272;
				@Pc(285) Class6_Sub8 local285;
				@Pc(293) int local293;
				@Pc(297) int local297;
				@Pc(299) int local299;
				@Pc(357) int local357;
				@Pc(359) int local359;
				@Pc(363) int local363;
				@Pc(365) int local365;
				if (this.anInt7135 == 2) {
					local231 = local157.length;
					local231--;
					local272 = local157[local231] & 0xFF;
					local231 -= local272 * 4 * local25;
					local285 = new Class6_Sub8(local157);
					@Pc(474) int local474 = 0;
					local285.anInt10061 = local231;
					local293 = 0;
					for (local297 = 0; local297 < local272; local297++) {
						local299 = 0;
						for (local357 = 0; local357 < local25; local357++) {
							local299 += local285.method8236();
							if (local31 == null) {
								local359 = local357;
							} else {
								local359 = local31[local357];
							}
							if (local359 == arg1) {
								local474 += local299;
								local293 = local359;
							}
						}
					}
					if (local474 == 0) {
						return true;
					}
					@Pc(532) byte[] local532 = new byte[local474];
					local285.anInt10061 = local231;
					local474 = 0;
					local357 = 0;
					for (local359 = 0; local359 < local272; local359++) {
						local363 = 0;
						for (local365 = 0; local365 < local25; local365++) {
							local363 += local285.method8236();
							@Pc(561) int local561;
							if (local31 == null) {
								local561 = local365;
							} else {
								local561 = local31[local365];
							}
							if (arg1 == local561) {
								Static653.method6537(local157, local357, local532, local474, local363);
								local474 += local363;
							}
							local357 += local363;
						}
					}
					local51[local293] = local532;
				} else {
					local231 = local157.length;
					local231--;
					local272 = local157[local231] & 0xFF;
					local231 -= local272 * 4 * local25;
					local285 = new Class6_Sub8(local157);
					local285.anInt10061 = local231;
					@Pc(291) int[] local291 = new int[local25];
					for (local293 = 0; local293 < local272; local293++) {
						local297 = 0;
						for (local299 = 0; local299 < local25; local299++) {
							local297 += local285.method8236();
							local291[local299] += local297;
						}
					}
					@Pc(333) byte[][] local333 = new byte[local25][];
					for (local299 = 0; local299 < local25; local299++) {
						local333[local299] = new byte[local291[local299]];
						local291[local299] = 0;
					}
					local285.anInt10061 = local231;
					local357 = 0;
					for (local359 = 0; local359 < local272; local359++) {
						local363 = 0;
						for (local365 = 0; local365 < local25; local365++) {
							local363 += local285.method8236();
							Static653.method6537(local157, local357, local333[local365], local291[local365], local363);
							local357 += local363;
							local291[local365] += local363;
						}
					}
					for (local363 = 0; local363 < local25; local363++) {
						if (local31 == null) {
							local365 = local363;
						} else {
							local365 = local31[local363];
						}
						if (this.anInt7135 == 0) {
							local51[local365] = Static591.method8149(local333[local363]);
						} else {
							local51[local365] = local333[local363];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)Z")
	public boolean method5939() {
		if (!this.method5947()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass319_2.anIntArray490.length; local20++) {
			@Pc(28) int local28 = this.aClass319_2.anIntArray490[local20];
			if (this.anObjectArray2[local28] == null) {
				this.method5958(local28);
				if (this.anObjectArray2[local28] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z")
	private boolean method5940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5947()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass319_2.anIntArray493.length && arg1 < this.aClass319_2.anIntArray493[arg0]) {
			return true;
		} else if (Static167.aBoolean302) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	private void method5941(@OriginalArg(0) int arg0) {
		this.aClass193_1.method5569(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)[B")
	public byte[] method5942(@OriginalArg(0) int arg0) {
		if (!this.method5947()) {
			return null;
		} else if (this.aClass319_2.anIntArray493.length == 1) {
			return this.method5954(arg0, 0);
		} else if (!this.method5967(arg0)) {
			return null;
		} else if (this.aClass319_2.anIntArray493[arg0] == 1) {
			return this.method5954(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method5943(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = this.method5959("");
		return local14 == -1 ? this.method5953(arg0, "") : this.method5953("", arg0);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)I")
	public int method5944() {
		if (!this.method5947()) {
			throw new IllegalStateException("");
		}
		return this.aClass319_2.anInt9375;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([IIII)[B")
	public byte[] method5945(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5940(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(30) boolean local30 = this.method5938(arg0, arg1, arg2);
			if (!local30) {
				this.method5958(arg2);
				local30 = this.method5938(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static56.method1712(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt7135 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass319_2.anIntArray493[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt7135 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
	public boolean method5946(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5947()) {
			return false;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass319_2.aClass138_1.method4263(Static529.method5804(local17));
		if (local33 < 0) {
			return false;
		} else {
			@Pc(51) int local51 = this.aClass319_2.aClass138Array1[local33].method4263(Static529.method5804(local20));
			return local51 >= 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)Z")
	private boolean method5947() {
		if (this.aClass319_2 == null) {
			this.aClass319_2 = this.aClass193_1.method5568();
			if (this.aClass319_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass319_2.anInt9371][];
			this.anObjectArray2 = new Object[this.aClass319_2.anInt9371];
		}
		return true;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method5948(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5947()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass319_2.aClass138_1.method4263(Static529.method5804(local12));
		if (this.method5967(local24)) {
			@Pc(47) int local47 = this.aClass319_2.aClass138Array1[local24].method4263(Static529.method5804(local15));
			return this.method5954(local47, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(II)I")
	private int method5949(@OriginalArg(1) int arg0) {
		if (this.method5967(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass193_1.method5574(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5950(@OriginalArg(0) String arg0) {
		if (this.method5947()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass319_2.aClass138_1.method4263(Static529.method5804(local17));
			return this.method5965(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(II)Z")
	public boolean method5951(@OriginalArg(1) int arg0) {
		if (!this.method5947()) {
			return false;
		} else if (this.aClass319_2.anIntArray493.length == 1) {
			return this.method5960(arg0, 0);
		} else if (!this.method5967(arg0)) {
			return false;
		} else if (this.aClass319_2.anIntArray493[arg0] == 1) {
			return this.method5960(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(II)[I")
	public int[] method5952(@OriginalArg(0) int arg0) {
		if (!this.method5967(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass319_2.anIntArrayArray52[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass319_2.anIntArray492[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method5953(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5947()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass319_2.aClass138_1.method4263(Static529.method5804(local12));
		if (this.method5967(local24)) {
			@Pc(42) int local42 = this.aClass319_2.aClass138Array1[local24].method4263(Static529.method5804(local15));
			return this.method5960(local42, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZ)[B")
	public byte[] method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method5945((int[]) null, arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZB)V")
	public void method5956(@OriginalArg(0) boolean arg0) {
		if (!this.method5947()) {
			return;
		}
		if (arg0) {
			this.aClass319_2.aClass138_1 = null;
			this.aClass319_2.anIntArray489 = null;
		}
		this.aClass319_2.aClass138Array1 = null;
		this.aClass319_2.anIntArrayArray53 = null;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5957(@OriginalArg(1) String arg0) {
		if (this.method5947()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass319_2.aClass138_1.method4263(Static529.method5804(local17));
			return this.method5949(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(II)V")
	private void method5958(@OriginalArg(0) int arg0) {
		if (this.aBoolean565) {
			this.anObjectArray2[arg0] = this.aClass193_1.method5570(arg0);
		} else {
			this.anObjectArray2[arg0] = Static591.method8149(this.aClass193_1.method5570(arg0));
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method5959(@OriginalArg(1) String arg0) {
		if (this.method5947()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass319_2.aClass138_1.method4263(Static529.method5804(local12));
			return this.method5967(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)Z")
	public boolean method5960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5940(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method5958(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)I")
	public int method5961() {
		return this.method5947() ? this.aClass319_2.anIntArray493.length : -1;
	}

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(II)V")
	public void method5963(@OriginalArg(1) int arg0) {
		if (this.method5967(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(Ljava/lang/String;I)V")
	public void method5964(@OriginalArg(0) String arg0) {
		if (this.method5947()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass319_2.aClass138_1.method4263(Static529.method5804(local15));
			this.method5941(local24);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)Z")
	public boolean method5965(@OriginalArg(1) int arg0) {
		if (!this.method5967(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method5958(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)Z")
	private boolean method5967(@OriginalArg(0) int arg0) {
		if (!this.method5947()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass319_2.anIntArray493.length && this.aClass319_2.anIntArray493[arg0] != 0) {
			return true;
		} else if (Static167.aBoolean302) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(B)V")
	public void method5969() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "(II)I")
	public int method5970(@OriginalArg(1) int arg0) {
		return this.method5967(arg0) ? this.aClass319_2.anIntArray493[arg0] : 0;
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(B)I")
	public int method5971() {
		if (!this.method5947()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass319_2.anIntArray492[local17] > 0) {
				local15 += this.method5949(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "(II)I")
	public int method5972(@OriginalArg(1) int arg0) {
		if (this.method5947()) {
			@Pc(16) int local16 = this.aClass319_2.aClass138_1.method4263(arg0);
			return this.method5967(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public void method5975() {
		if (this.anObjectArray2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray2.length; local6++) {
				this.anObjectArray2[local6] = null;
			}
		}
	}
}
