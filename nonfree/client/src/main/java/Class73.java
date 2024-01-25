import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class73 {

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	public int anInt2403 = -1;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	public int anInt2406 = -1;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public int anInt2408 = -1;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public int anInt2407 = -1;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public int anInt2401 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
	public int anInt2399 = -1;

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
	public int anInt2414 = -1;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "[I")
	public int[] anIntArray250 = null;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
	public int anInt2418 = -1;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
	public int anInt2421 = 0;

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Z")
	public boolean aBoolean168 = true;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	public int anInt2402 = -1;

	@OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
	public int anInt2422 = -1;

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
	public int anInt2425 = -1;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
	public int anInt2429 = -1;

	@OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
	public int anInt2420 = 0;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
	public int anInt2410 = 0;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
	public int anInt2424 = 0;

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
	public int anInt2430 = 0;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public int anInt2433 = -1;

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
	public int anInt2435 = 0;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
	public int anInt2415 = -1;

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
	public int anInt2417 = -1;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
	public int anInt2419 = -1;

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
	public int anInt2428 = -1;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	public int anInt2412 = -1;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
	public int anInt2436 = 0;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
	public int anInt2434 = -1;

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
	public int anInt2423 = -1;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
	public int anInt2413 = -1;

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
	public int anInt2439 = -1;

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
	public int anInt2427 = 0;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public int anInt2409 = -1;

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
	public int anInt2437 = -1;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	public int anInt2404 = 0;

	@OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
	private int anInt2441 = 0;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
	public int anInt2405 = 0;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	public int anInt2400 = 0;

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
	public int anInt2440 = -1;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
	public int anInt2438 = -1;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "[I")
	public int[] anIntArray251 = null;

	static {
		new Class67("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLclient!rt;)V")
	private void method2117(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt2399 = arg1.method7591();
			this.anInt2438 = arg1.method7591();
			if (this.anInt2399 == 65535) {
				this.anInt2399 = -1;
			}
			if (this.anInt2438 == 65535) {
				this.anInt2438 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2417 = arg1.method7591();
		} else if (arg0 == 3) {
			this.anInt2407 = arg1.method7591();
		} else if (arg0 == 4) {
			this.anInt2419 = arg1.method7591();
		} else if (arg0 == 5) {
			this.anInt2403 = arg1.method7591();
		} else if (arg0 == 6) {
			this.anInt2434 = arg1.method7591();
		} else if (arg0 == 7) {
			this.anInt2412 = arg1.method7591();
		} else if (arg0 == 8) {
			this.anInt2439 = arg1.method7591();
		} else if (arg0 == 9) {
			this.anInt2425 = arg1.method7591();
		} else if (arg0 == 26) {
			this.anInt2421 = (short) (arg1.method7548() * 4);
			this.anInt2430 = (short) (arg1.method7548() * 4);
		} else {
			@Pc(74) int local74;
			@Pc(306) int local306;
			if (arg0 == 27) {
				if (this.anIntArrayArray29 == null) {
					this.anIntArrayArray29 = new int[12][];
				}
				local74 = arg1.method7548();
				this.anIntArrayArray29[local74] = new int[6];
				for (local306 = 0; local306 < 6; local306++) {
					this.anIntArrayArray29[local74][local306] = arg1.method7604();
				}
			} else if (arg0 == 28) {
				this.anIntArray249 = new int[12];
				for (local74 = 0; local74 < 12; local74++) {
					this.anIntArray249[local74] = arg1.method7548();
					if (this.anIntArray249[local74] == 255) {
						this.anIntArray249[local74] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt2405 = arg1.method7548();
			} else if (arg0 == 30) {
				this.anInt2410 = arg1.method7591();
			} else if (arg0 == 31) {
				this.anInt2424 = arg1.method7548();
			} else if (arg0 == 32) {
				this.anInt2435 = arg1.method7591();
			} else if (arg0 == 33) {
				this.anInt2404 = arg1.method7604();
			} else if (arg0 == 34) {
				this.anInt2427 = arg1.method7548();
			} else if (arg0 == 35) {
				this.anInt2420 = arg1.method7591();
			} else if (arg0 == 36) {
				this.anInt2400 = arg1.method7604();
			} else if (arg0 == 37) {
				this.anInt2429 = arg1.method7548();
			} else if (arg0 == 38) {
				this.anInt2437 = arg1.method7591();
			} else if (arg0 == 39) {
				this.anInt2428 = arg1.method7591();
			} else if (arg0 == 40) {
				this.anInt2402 = arg1.method7591();
			} else if (arg0 == 41) {
				this.anInt2423 = arg1.method7591();
			} else if (arg0 == 42) {
				this.anInt2409 = arg1.method7591();
			} else if (arg0 == 43) {
				this.anInt2413 = arg1.method7591();
			} else if (arg0 == 44) {
				this.anInt2440 = arg1.method7591();
			} else if (arg0 == 45) {
				this.anInt2415 = arg1.method7591();
			} else if (arg0 == 46) {
				this.anInt2422 = arg1.method7591();
			} else if (arg0 == 47) {
				this.anInt2414 = arg1.method7591();
			} else if (arg0 == 48) {
				this.anInt2408 = arg1.method7591();
			} else if (arg0 == 49) {
				this.anInt2433 = arg1.method7591();
			} else if (arg0 == 50) {
				this.anInt2406 = arg1.method7591();
			} else if (arg0 == 51) {
				this.anInt2418 = arg1.method7591();
			} else if (arg0 == 52) {
				local74 = arg1.method7548();
				this.anIntArray250 = new int[local74];
				this.anIntArray251 = new int[local74];
				for (local306 = 0; local306 < local74; local306++) {
					this.anIntArray250[local306] = arg1.method7591();
					@Pc(321) int local321 = arg1.method7548();
					this.anIntArray251[local306] = local321;
					this.anInt2441 += local321;
				}
			} else if (arg0 == 53) {
				this.aBoolean168 = false;
			} else if (arg0 == 54) {
				this.anInt2436 = arg1.method7548() << 6;
				this.anInt2401 = arg1.method7548() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!rt;)V")
	public void method2118(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7548();
			if (local15 == 0) {
				return;
			}
			this.method2117(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)I")
	public int method2119() {
		if (this.anInt2399 != -1) {
			return this.anInt2399;
		} else if (this.anIntArray250 == null) {
			return -1;
		} else {
			@Pc(24) int local24 = (int) ((double) this.anInt2441 * Math.random());
			@Pc(26) int local26;
			for (local26 = 0; local24 >= this.anIntArray251[local26]; local26++) {
				local24 -= this.anIntArray251[local26];
			}
			return this.anIntArray250[local26];
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)Z")
	public boolean method2120(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt2399) {
			return true;
		} else {
			if (this.anIntArray250 != null) {
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray250.length; local32++) {
					if (this.anIntArray250[local32] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
