import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class208 {

	@OriginalMember(owner = "client!la", name = "p", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!gj;")
	private Class145 aClass145_1 = null;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public int anInt5851;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!ri;")
	private final Class260 aClass260_1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ri;ZI)V")
	public Class208(@OriginalArg(0) Class260 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean444 = arg1;
		this.anInt5851 = arg2;
		this.aClass260_1 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)I")
	private int method4972(@OriginalArg(1) int arg0) {
		if (this.method4973(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass260_1.method6251(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	private boolean method4973(@OriginalArg(1) int arg0) {
		if (!this.method4976()) {
			return false;
		} else if (arg0 >= 0 && this.aClass145_1.anIntArray185.length > arg0 && this.aClass145_1.anIntArray185[arg0] != 0) {
			return true;
		} else if (Static74.aBoolean97) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)Z")
	public boolean method4975(@OriginalArg(1) int arg0) {
		if (!this.method4973(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method4982(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Z")
	private boolean method4976() {
		if (this.aClass145_1 == null) {
			this.aClass145_1 = this.aClass260_1.method6255();
			if (this.aClass145_1 == null) {
				return false;
			}
			this.anObjectArray34 = new Object[this.aClass145_1.anInt3194];
			this.anObjectArrayArray1 = new Object[this.aClass145_1.anInt3194][];
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(II)Z")
	public boolean method4977(@OriginalArg(0) int arg0) {
		if (!this.method4976()) {
			return false;
		} else if (this.aClass145_1.anIntArray185.length == 1) {
			return this.method4980(arg0, 0);
		} else if (!this.method4973(arg0)) {
			return false;
		} else if (this.aClass145_1.anIntArray185[arg0] == 1) {
			return this.method4980(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(BI)I")
	public int method4978(@OriginalArg(1) int arg0) {
		if (this.method4976()) {
			@Pc(17) int local17 = this.aClass145_1.aClass328_1.method8005(arg0);
			return this.method4973(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[I")
	public int[] method4979(@OriginalArg(1) int arg0) {
		if (!this.method4973(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass145_1.anIntArrayArray22[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass145_1.anIntArray187[arg0]];
			@Pc(38) int local38 = 0;
			while (local27.length > local38) {
				local27[local38] = local38++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z")
	public boolean method4980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4994(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray34[arg1] == null) {
			this.method4982(arg1);
			return this.anObjectArray34[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(II)V")
	private void method4982(@OriginalArg(1) int arg0) {
		if (this.aBoolean444) {
			this.anObjectArray34[arg0] = this.aClass260_1.method6250(arg0);
		} else {
			this.anObjectArray34[arg0] = Static631.method8844(this.aClass260_1.method6250(arg0));
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Z")
	public boolean method4983() {
		if (!this.method4976()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass145_1.anIntArray181.length; local16++) {
			@Pc(26) int local26 = this.aClass145_1.anIntArray181[local16];
			if (this.anObjectArray34[local26] == null) {
				this.method4982(local26);
				if (this.anObjectArray34[local26] == null) {
					local14 = false;
				}
			}
		}
		if (false) {
			this.method4997(-109);
		}
		return local14;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZZ)V")
	public void method4984(@OriginalArg(1) boolean arg0) {
		if (!this.method4976()) {
			return;
		}
		this.aClass145_1.aClass328Array1 = null;
		this.aClass145_1.anIntArrayArray21 = null;
		if (arg0) {
			this.aClass145_1.anIntArray182 = null;
			this.aClass145_1.aClass328_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[I)Z")
	private boolean method4985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4973(arg1)) {
			return false;
		} else if (this.anObjectArray34[arg1] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass145_1.anIntArray187[arg1];
			@Pc(33) int[] local33 = this.aClass145_1.anIntArrayArray22[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass145_1.anIntArray185[arg1]];
			}
			@Pc(55) Object[] local55 = this.anObjectArrayArray1[arg1];
			@Pc(57) boolean local57 = true;
			for (@Pc(59) int local59 = 0; local59 < local27; local59++) {
				@Pc(67) int local67;
				if (local33 == null) {
					local67 = local59;
				} else {
					local67 = local33[local59];
				}
				if (local55[local67] == null) {
					local57 = false;
					break;
				}
			}
			if (local57) {
				return true;
			}
			@Pc(135) byte[] local135;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local135 = Static355.method5319(false, this.anObjectArray34[arg1]);
			} else {
				local135 = Static355.method5319(true, this.anObjectArray34[arg1]);
				@Pc(140) Class5_Sub23 local140 = new Class5_Sub23(local135);
				local140.method8489(local140.aByteArray102.length, arg2);
			}
			@Pc(164) byte[] local164;
			try {
				local164 = Static121.method1706(local135);
			} catch (@Pc(166) RuntimeException local166) {
				throw Static53.method801(local166, "T3 - " + (arg2 != null) + "," + arg1 + "," + local135.length + "," + Static134.method1939(local135.length, local135) + "," + Static134.method1939(local135.length - 2, local135) + "," + this.aClass145_1.anIntArray184[arg1] + "," + this.aClass145_1.anInt3198);
			}
			if (this.aBoolean444) {
				this.anObjectArray34[arg1] = null;
			}
			@Pc(249) int local249;
			if (local27 <= 1) {
				if (local33 == null) {
					local249 = 0;
				} else {
					local249 = local33[0];
				}
				if (this.anInt5851 == 0) {
					local55[local249] = Static631.method8844(local164);
				} else {
					local55[local249] = local164;
				}
			} else {
				@Pc(295) int local295;
				@Pc(308) Class5_Sub23 local308;
				@Pc(315) int local315;
				@Pc(317) int local317;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(337) int local337;
				@Pc(397) int local397;
				@Pc(399) int local399;
				if (this.anInt5851 == 2) {
					local249 = local164.length;
					local249--;
					local295 = local164[local249] & 0xFF;
					local249 -= local295 * local27 * 4;
					local308 = new Class5_Sub23(local164);
					@Pc(310) int local310 = 0;
					local308.anInt9869 = local249;
					local315 = 0;
					for (local317 = 0; local317 < local295; local317++) {
						local323 = 0;
						for (local325 = 0; local325 < local27; local325++) {
							local323 += local308.method8527();
							if (local33 == null) {
								local337 = local325;
							} else {
								local337 = local33[local325];
							}
							if (arg0 == local337) {
								local310 += local323;
								local315 = local337;
							}
						}
					}
					if (local310 == 0) {
						return true;
					}
					@Pc(384) byte[] local384 = new byte[local310];
					local310 = 0;
					local308.anInt9869 = local249;
					local325 = 0;
					for (local337 = 0; local337 < local295; local337++) {
						local397 = 0;
						for (local399 = 0; local399 < local27; local399++) {
							local397 += local308.method8527();
							@Pc(411) int local411;
							if (local33 == null) {
								local411 = local399;
							} else {
								local411 = local33[local399];
							}
							if (local411 == arg0) {
								Static682.method799(local164, local325, local384, local310, local397);
								local310 += local397;
							}
							local325 += local397;
						}
					}
					local55[local315] = local384;
				} else {
					local249 = local164.length;
					local249--;
					local295 = local164[local249] & 0xFF;
					local249 -= local27 * 4 * local295;
					local308 = new Class5_Sub23(local164);
					local308.anInt9869 = local249;
					@Pc(491) int[] local491 = new int[local27];
					for (local315 = 0; local315 < local295; local315++) {
						local317 = 0;
						for (local323 = 0; local323 < local27; local323++) {
							local317 += local308.method8527();
							local491[local323] += local317;
						}
					}
					@Pc(531) byte[][] local531 = new byte[local27][];
					for (local323 = 0; local323 < local27; local323++) {
						local531[local323] = new byte[local491[local323]];
						local491[local323] = 0;
					}
					local308.anInt9869 = local249;
					local325 = 0;
					for (local337 = 0; local337 < local295; local337++) {
						local397 = 0;
						for (local399 = 0; local399 < local27; local399++) {
							local397 += local308.method8527();
							Static682.method799(local164, local325, local531[local399], local491[local399], local397);
							local325 += local397;
							local491[local399] += local397;
						}
					}
					for (local397 = 0; local397 < local27; local397++) {
						if (local33 == null) {
							local399 = local397;
						} else {
							local399 = local33[local397];
						}
						if (this.anInt5851 == 0) {
							local55[local399] = Static631.method8844(local531[local397]);
						} else {
							local55[local399] = local531[local397];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4986(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.method4976()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass145_1.aClass328_1.method8005(Static638.method8924(local21));
			return this.method4973(local30) ? local30 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4987(@OriginalArg(1) String arg0) {
		if (this.method4976()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass145_1.aClass328_1.method8005(Static638.method8924(local21));
			return this.method4972(local30);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(B)I")
	public int method4988() {
		return this.method4976() ? this.aClass145_1.anIntArray185.length : -1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method4989(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4976()) {
			return false;
		}
		@Pc(24) String local24 = arg1.toLowerCase();
		@Pc(27) String local27 = arg0.toLowerCase();
		@Pc(36) int local36 = this.aClass145_1.aClass328_1.method8005(Static638.method8924(local24));
		if (local36 < 0) {
			return false;
		} else {
			@Pc(52) int local52 = this.aClass145_1.aClass328Array1[local36].method8005(Static638.method8924(local27));
			return local52 >= 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public void method4990(@OriginalArg(0) String arg0) {
		if (this.method4976()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass145_1.aClass328_1.method8005(Static638.method8924(local12));
			this.method4996(local21);
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(III)[B")
	public byte[] method4991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method5002(arg0, (int[]) null, arg1);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)I")
	public int method4993() {
		if (!this.method4976()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anObjectArray34.length; local26++) {
			if (this.aClass145_1.anIntArray187[local26] > 0) {
				local14 += 100;
				local16 += this.method4972(local26);
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(III)Z")
	private boolean method4994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4976()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass145_1.anIntArray185.length > arg1 && this.aClass145_1.anIntArray185[arg1] > arg0) {
			return true;
		} else if (Static74.aBoolean97) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I")
	public int method4995() {
		if (!this.method4976()) {
			throw new IllegalStateException("");
		}
		return this.aClass145_1.anInt3198;
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(II)V")
	private void method4996(@OriginalArg(0) int arg0) {
		this.aClass260_1.method6254(arg0);
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(II)[B")
	public byte[] method4997(@OriginalArg(1) int arg0) {
		if (!this.method4976()) {
			return null;
		} else if (this.aClass145_1.anIntArray185.length == 1) {
			return this.method4991(0, arg0, 86);
		} else if (!this.method4973(arg0)) {
			return null;
		} else if (this.aClass145_1.anIntArray185[arg0] == 1) {
			return this.method4991(arg0, 0, -122);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4998(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = this.method4986("", -110);
		return local16 == -1 ? this.method5003("", arg0) : this.method5003(arg0, "");
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method4999(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4976()) {
			return null;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(25) int local25 = this.aClass145_1.aClass328_1.method8005(Static638.method8924(local13));
		if (this.method4973(local25)) {
			@Pc(44) int local44 = this.aClass145_1.aClass328Array1[local25].method8005(Static638.method8924(local16));
			return this.method4991(local25, local44, -118);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5000(@OriginalArg(0) String arg0) {
		if (this.method4976()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass145_1.aClass328_1.method8005(Static638.method8924(local13));
			return local22 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public void method5001() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IZI)[B")
	public byte[] method5002(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method4994(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(33) boolean local33 = this.method4985(arg2, arg0, arg1);
			if (!local33) {
				this.method4982(arg0);
				local33 = this.method4985(arg2, arg0, arg1);
				if (!local33) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static355.method5319(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt5851 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass145_1.anIntArray185[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt5851 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local61;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	private boolean method5003(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4976()) {
			return false;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(25) int local25 = this.aClass145_1.aClass328_1.method8005(Static638.method8924(local13));
		if (this.method4973(local25)) {
			@Pc(53) int local53 = this.aClass145_1.aClass328Array1[local25].method8005(Static638.method8924(local16));
			return this.method4980(local53, local25);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
	public void method5004() {
		if (this.anObjectArray34 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray34.length; local6++) {
				this.anObjectArray34[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)I")
	public int method5005(@OriginalArg(0) int arg0) {
		return this.method4973(arg0) ? this.aClass145_1.anIntArray185[arg0] : 0;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5006(@OriginalArg(0) String arg0) {
		if (this.method4976()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(32) int local32 = this.aClass145_1.aClass328_1.method8005(Static638.method8924(local13));
			return this.method4975(local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)V")
	public void method5007(@OriginalArg(1) int arg0) {
		if (this.method4973(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}
}
