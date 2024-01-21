import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class37 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
	private static boolean aBoolean114;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	private static int anInt621;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
	private static int[] anIntArray195;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!jb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_18;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "[Lclient!wb;")
	private static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	private static int anInt622;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "B")
	private static byte aByte30 = 2;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "Lclient!r;")
	public static Class30 aClass30_4 = new Class30(-947, 500);

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "Lclient!r;")
	public static Class30 aClass30_5 = new Class30(-947, 30);

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public int anInt624;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Z")
	public boolean aBoolean115;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Z")
	private boolean aBoolean119;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "Z")
	public boolean aBoolean120;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "B")
	private byte aByte31;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "B")
	private byte aByte32;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Z")
	private boolean aBoolean121;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	private int anInt632;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	private int anInt623 = -1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!tb;)V")
	public static void method443(@OriginalArg(0) Class34 arg0) {
		aClass1_Sub3_Sub3_18 = new Class1_Sub3_Sub3(arg0.method428(null, "loc.dat"), (byte) 63);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method428(null, "loc.idx"), (byte) 63);
		anInt621 = local21.method333();
		anIntArray195 = new int[anInt621];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt621; local31++) {
			anIntArray195[local31] = local29;
			local29 += local21.method333();
		}
		aClass37Array1 = new Class37[10];
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			aClass37Array1[local51] = new Class37();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method444() {
		aClass30_4 = null;
		aClass30_5 = null;
		anIntArray195 = null;
		aClass37Array1 = null;
		aClass1_Sub3_Sub3_18 = null;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Lclient!wb;")
	public static Class37 method445(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass37Array1[local1].anInt623 == arg0) {
				return aClass37Array1[local1];
			}
		}
		anInt622 = (anInt622 + 1) % 10;
		@Pc(27) Class37 local27 = aClass37Array1[anInt622];
		aClass1_Sub3_Sub3_18.anInt394 = anIntArray195[arg0];
		local27.anInt623 = arg0;
		local27.method446();
		local27.method447(aClass1_Sub3_Sub3_18);
		return local27;
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	private Class37() {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	private void method446() {
		this.anIntArray196 = null;
		this.anIntArray197 = null;
		this.aString23 = null;
		this.aByteArray12 = null;
		this.anIntArray198 = null;
		this.anIntArray199 = null;
		this.anInt624 = 1;
		this.anInt625 = 1;
		this.aBoolean115 = true;
		this.aBoolean116 = true;
		this.aBoolean117 = false;
		this.aBoolean118 = false;
		this.aBoolean119 = false;
		this.aBoolean120 = false;
		this.anInt626 = -1;
		this.anInt627 = 16;
		this.aByte31 = 0;
		this.aByte32 = 0;
		this.aStringArray7 = null;
		this.aBoolean121 = false;
		this.anInt628 = -1;
		this.anInt629 = -1;
		this.aBoolean122 = false;
		this.aBoolean123 = true;
		this.anInt630 = 128;
		this.anInt631 = 128;
		this.anInt632 = 128;
		this.anInt633 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!jb;)V")
	private void method447(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		@Pc(10) int local10 = -1;
		while (true) {
			while (true) {
				@Pc(13) int local13 = arg0.method331();
				if (local13 == 0) {
					if (this.anIntArray197 == null) {
						this.anIntArray197 = new int[0];
					}
					if (local10 == -1) {
						this.aBoolean117 = false;
						if (this.anIntArray197.length > 0 && this.anIntArray197[0] == 10) {
							this.aBoolean117 = true;
						}
						if (this.aStringArray7 != null) {
							this.aBoolean117 = true;
						}
					}
					return;
				}
				@Pc(21) int local21;
				@Pc(31) int local31;
				if (local13 == 1) {
					local21 = arg0.method331();
					this.anIntArray197 = new int[local21];
					this.anIntArray196 = new int[local21];
					for (local31 = 0; local31 < local21; local31++) {
						this.anIntArray196[local31] = arg0.method333();
						this.anIntArray197[local31] = arg0.method331();
					}
				} else if (local13 == 2) {
					this.aString23 = arg0.method338();
				} else if (local13 == 3) {
					this.aByteArray12 = arg0.method339();
				} else if (local13 == 14) {
					this.anInt624 = arg0.method331();
				} else if (local13 == 15) {
					this.anInt625 = arg0.method331();
				} else if (local13 == 17) {
					this.aBoolean115 = false;
				} else if (local13 == 18) {
					this.aBoolean116 = false;
				} else if (local13 == 19) {
					local10 = arg0.method331();
					if (local10 == 1) {
						this.aBoolean117 = true;
					}
				} else if (local13 == 21) {
					this.aBoolean118 = true;
				} else if (local13 == 22) {
					this.aBoolean119 = true;
				} else if (local13 == 23) {
					this.aBoolean120 = true;
				} else if (local13 == 24) {
					this.anInt626 = arg0.method333();
					if (this.anInt626 == 65535) {
						this.anInt626 = -1;
					}
				} else if (local13 == 25) {
					this.aBoolean121 = true;
				} else if (local13 == 28) {
					this.anInt627 = arg0.method331();
				} else if (local13 == 29) {
					this.aByte31 = arg0.method332();
				} else if (local13 == 39) {
					this.aByte32 = arg0.method332();
				} else if (local13 >= 30 && local13 < 39) {
					if (this.aStringArray7 == null) {
						this.aStringArray7 = new String[5];
					}
					this.aStringArray7[local13 - 30] = arg0.method338();
				} else if (local13 == 40) {
					local21 = arg0.method331();
					this.anIntArray198 = new int[local21];
					this.anIntArray199 = new int[local21];
					for (local31 = 0; local31 < local21; local31++) {
						this.anIntArray198[local31] = arg0.method333();
						this.anIntArray199[local31] = arg0.method333();
					}
				} else if (local13 == 60) {
					this.anInt628 = arg0.method333();
				} else if (local13 == 62) {
					this.aBoolean122 = true;
				} else if (local13 == 64) {
					this.aBoolean123 = false;
				} else if (local13 == 65) {
					this.anInt630 = arg0.method333();
				} else if (local13 == 66) {
					this.anInt631 = arg0.method333();
				} else if (local13 == 67) {
					this.anInt632 = arg0.method333();
				} else if (local13 == 68) {
					this.anInt629 = arg0.method333();
				} else if (local13 == 69) {
					this.anInt633 = arg0.method331();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)Lclient!db;")
	public Class1_Sub3_Sub1 method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray197.length; local5++) {
			if (this.anIntArray197[local5] == arg0) {
				local3 = local5;
				break;
			}
		}
		if (local3 == -1) {
			return null;
		}
		@Pc(47) long local47 = (long) ((this.anInt623 << 6) + (local3 << 3) + arg1) + ((long) (arg6 + 1) << 32);
		if (!this.aBoolean118 && !this.aBoolean119) {
			@Pc(58) Class1_Sub3_Sub1 local58 = (Class1_Sub3_Sub1) aClass30_5.method419(local47);
			if (local58 != null) {
				return local58;
			}
		}
		if (local3 >= this.anIntArray196.length) {
			return null;
		}
		@Pc(74) int local74 = this.anIntArray196[local3];
		if (local74 == -1) {
			return null;
		}
		@Pc(89) boolean local89 = this.aBoolean122 ^ arg1 > 3;
		if (local89) {
			local74 += 65536;
		}
		@Pc(101) Class1_Sub3_Sub1 local101 = (Class1_Sub3_Sub1) aClass30_4.method419((long) local74);
		if (local101 == null) {
			local101 = new Class1_Sub3_Sub1(local74 & 0xFFFF, aBoolean114);
			if (local89) {
				local101.method167();
			}
			aClass30_4.method420(local101, (long) local74, aByte30);
		}
		@Pc(136) boolean local136;
		if (this.anInt630 == 128 && this.anInt631 == 128 && this.anInt632 == 128) {
			local136 = false;
		} else {
			local136 = true;
		}
		@Pc(177) Class1_Sub3_Sub1 local177 = new Class1_Sub3_Sub1(this.anIntArray198 == null, !this.aBoolean121, local101, 440, !this.aBoolean119, arg1 == 0 && !this.aBoolean118 && arg6 == -1 && !local136);
		if (arg6 != -1) {
			local177.method159();
			local177.method160(arg6);
			local177.anIntArrayArray8 = null;
			local177.anIntArrayArray7 = null;
		}
		while (arg1-- > 0) {
			local177.method163();
		}
		@Pc(206) int local206;
		if (this.anIntArray198 != null) {
			for (local206 = 0; local206 < this.anIntArray198.length; local206++) {
				local177.method166(this.anIntArray198[local206], this.anIntArray199[local206]);
			}
		}
		if (local136) {
			local177.method168(this.anInt631, this.anInt630, this.anInt632);
		}
		if (this.aBoolean118) {
			local206 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(250) int local250 = 0; local250 < local177.anInt211; local250++) {
				@Pc(257) int local257 = local177.anIntArray63[local250];
				@Pc(262) int local262 = local177.anIntArray65[local250];
				@Pc(274) int local274 = arg2 + (arg3 - arg2) * (local257 + 64) / 128;
				@Pc(286) int local286 = arg5 + (arg4 - arg5) * (local257 + 64) / 128;
				@Pc(298) int local298 = local274 + (local286 - local274) * (local262 + 64) / 128;
				local177.anIntArray64[local250] += local298 - local206;
			}
		}
		local177.method169(this.aByte31 + 64, this.aByte32 * 5 + 768, -50, -10, -50, !this.aBoolean119);
		if (this.aBoolean115) {
			local177.anInt224 = local177.anInt220;
		}
		if (!this.aBoolean118 && !this.aBoolean119) {
			aClass30_5.method420(local177, local47, aByte30);
		}
		return local177;
	}
}
