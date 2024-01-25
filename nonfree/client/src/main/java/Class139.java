import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class139 {

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	private int anInt4359;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/lang/String;")
	public String aString156;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
	public int anInt4364;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
	public int anInt4367;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	private int anInt4368;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
	private int anInt4369;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
	public int anInt4372;

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
	public int anInt4374;

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
	public int anInt4378;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
	public int anInt4382;

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
	private int anInt4386;

	@OriginalMember(owner = "client!nj", name = "O", descriptor = "Ljava/lang/String;")
	public String aString158;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
	public int anInt4363 = -1;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public int anInt4358 = -1;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	private int anInt4360 = -1;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
	public int anInt4370 = -1;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
	public boolean aBoolean370 = true;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public int anInt4355 = -1;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public int anInt4357 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	private int anInt4354 = -1;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Z")
	public boolean aBoolean371 = false;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	public int anInt4362 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
	public int anInt4371 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
	public int anInt4373 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Z")
	public boolean aBoolean372 = true;

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
	private int anInt4380 = -1;

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "Z")
	public boolean aBoolean373 = true;

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
	public int anInt4376 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
	private int anInt4383 = -1;

	@OriginalMember(owner = "client!nj", name = "R", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray35 = new String[5];

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
	private int anInt4375 = -1;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
	public void method3652() {
		if (this.anIntArray365 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray365.length; local6 += 2) {
			if (this.anIntArray365[local6] < this.anInt4373) {
				this.anInt4373 = this.anIntArray365[local6];
			} else if (this.anInt4371 < this.anIntArray365[local6]) {
				this.anInt4371 = this.anIntArray365[local6];
			}
			if (this.anInt4376 > this.anIntArray365[local6 + 1]) {
				this.anInt4376 = this.anIntArray365[local6 + 1];
			} else if (this.anInt4362 < this.anIntArray365[local6 + 1]) {
				this.anInt4362 = this.anIntArray365[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!tq;II)V")
	private void method3653(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4358 = arg0.method2404();
		} else if (arg1 == 2) {
			this.anInt4355 = arg0.method2404();
		} else if (arg1 == 3) {
			this.aString156 = arg0.method2379();
		} else if (arg1 == 4) {
			this.anInt4378 = arg0.method2402();
		} else if (arg1 == 5) {
			this.anInt4363 = arg0.method2402();
		} else if (arg1 == 6) {
			this.anInt4357 = arg0.method2380();
		} else {
			@Pc(137) int local137;
			if (arg1 == 7) {
				local137 = arg0.method2380();
				if ((local137 & 0x1) == 0) {
					this.aBoolean370 = false;
				}
				if ((local137 & 0x2) == 2) {
					this.aBoolean371 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean373 = arg0.method2380() == 1;
			} else if (arg1 == 9) {
				this.anInt4360 = arg0.method2404();
				if (this.anInt4360 == 65535) {
					this.anInt4360 = -1;
				}
				this.anInt4375 = arg0.method2404();
				if (this.anInt4375 == 65535) {
					this.anInt4375 = -1;
				}
				this.anInt4368 = arg0.method2389();
				this.anInt4359 = arg0.method2389();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray35[arg1 - 10] = arg0.method2379();
			} else if (arg1 == 15) {
				local137 = arg0.method2380();
				this.anIntArray365 = new int[local137 * 2];
				for (@Pc(145) int local145 = 0; local145 < local137 * 2; local145++) {
					this.anIntArray365[local145] = arg0.method2396();
				}
				this.anInt4374 = arg0.method2389();
				this.anInt4367 = arg0.method2389();
			} else if (arg1 == 16) {
				this.aBoolean372 = false;
			} else if (arg1 == 17) {
				this.aString158 = arg0.method2379();
			} else if (arg1 == 18) {
				this.anInt4383 = arg0.method2404();
			} else if (arg1 == 19) {
				this.anInt4370 = arg0.method2404();
			} else if (arg1 == 20) {
				this.anInt4380 = arg0.method2404();
				if (this.anInt4380 == 65535) {
					this.anInt4380 = -1;
				}
				this.anInt4354 = arg0.method2404();
				if (this.anInt4354 == 65535) {
					this.anInt4354 = -1;
				}
				this.anInt4386 = arg0.method2389();
				this.anInt4369 = arg0.method2389();
			} else if (arg1 == 21) {
				this.anInt4364 = arg0.method2389();
			} else if (arg1 == 22) {
				this.anInt4382 = arg0.method2389();
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!vm;)Lclient!lg;")
	public Class60 method3654(@OriginalArg(1) Class92 arg0) {
		@Pc(18) Class60 local18 = (Class60) Static60.aClass154_18.method4222((long) (this.anInt4383 | 0x20000 | arg0.anInt5370 << 29));
		if (local18 != null) {
			return local18;
		}
		Static133.aClass11_59.method274(this.anInt4383);
		@Pc(46) Class206 local46 = Static367.method5452(Static133.aClass11_59, this.anInt4383, 0);
		if (local46 != null) {
			local18 = arg0.method4506(local46);
			Static60.aClass154_18.method4221((long) (this.anInt4383 | 0x20000 | arg0.anInt5370 << 29), local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
	public boolean method3656() {
		if (this.anInt4375 == -1 && this.anInt4360 == -1) {
			return true;
		}
		@Pc(34) int local34;
		if (this.anInt4375 == -1) {
			local34 = Static44.method807(this.anInt4360);
		} else {
			local34 = Static103.anIntArray295[this.anInt4375];
		}
		if (this.anInt4368 > local34 || this.anInt4359 < local34) {
			return false;
		} else if (this.anInt4354 == -1 && this.anInt4380 == -1) {
			return true;
		} else {
			if (this.anInt4354 == -1) {
				local34 = Static44.method807(this.anInt4380);
			} else {
				local34 = Static103.anIntArray295[this.anInt4354];
			}
			return this.anInt4386 <= local34 && this.anInt4369 >= local34;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!tq;I)V")
	public void method3658(@OriginalArg(0) Class4_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2380();
			if (local5 == 0) {
				return;
			}
			this.method3653(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLclient!vm;I)Lclient!lg;")
	public Class60 method3659(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class92 arg1) {
		@Pc(18) int local18 = arg0 ? this.anInt4355 : this.anInt4358;
		@Pc(25) int local25 = arg1.anInt5370 << 29 | local18;
		@Pc(32) Class60 local32 = (Class60) Static60.aClass154_18.method4222((long) local25);
		if (local32 != null) {
			return local32;
		} else if (Static133.aClass11_59.method274(local18)) {
			@Pc(48) Class206 local48 = Static367.method5452(Static133.aClass11_59, local18, 0);
			if (local48 != null) {
				local32 = arg1.method4506(local48);
				Static60.aClass154_18.method4221((long) local25, local32);
			}
			return local32;
		} else {
			return null;
		}
	}
}
