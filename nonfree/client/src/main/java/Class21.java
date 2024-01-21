import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KIZBPSHZ")
public final class Class21 {

	@OriginalMember(owner = "client!KIZBPSHZ", name = "b", descriptor = "I")
	private static int anInt368;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "c", descriptor = "[Lclient!KIZBPSHZ;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "a", descriptor = "I")
	private static int anInt367 = 974;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "d", descriptor = "I")
	public int anInt369;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "e", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "f", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "g", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "i", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "r", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "h", descriptor = "I")
	public int anInt370 = -1;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "j", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "k", descriptor = "I")
	public int anInt371 = 5;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "l", descriptor = "I")
	public int anInt372 = -1;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "m", descriptor = "I")
	public int anInt373 = -1;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "n", descriptor = "I")
	public int anInt374 = 99;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "o", descriptor = "I")
	public int anInt375 = -1;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "p", descriptor = "I")
	public int anInt376 = -1;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "q", descriptor = "I")
	public int anInt377 = 2;

	@OriginalMember(owner = "client!KIZBPSHZ", name = "a", descriptor = "(ILclient!QDHHNYHL;)V")
	public static void method274(@OriginalArg(1) Class32 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub4 local8 = new Class4_Sub1_Sub4(5, arg0.method426("seq.dat", null));
			anInt368 = local8.method357();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt368];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt368; local18++) {
				if (aClass21Array1[local18] == null) {
					aClass21Array1[local18] = new Class21();
				}
				aClass21Array1[local18].method276(local8, anInt367);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("91085, " + 0 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KIZBPSHZ", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!KIZBPSHZ", name = "a", descriptor = "(II)I")
	public int method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = this.anIntArray71[arg1];
			if (arg0 != 40410) {
				return 0;
			}
			if (local4 == 0) {
				@Pc(17) Class16 local17 = Class16.method192(this.anIntArray69[arg1]);
				if (local17 != null) {
					local4 = this.anIntArray71[arg1] = local17.anInt265;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("33776, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KIZBPSHZ", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	private void method276(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				anInt367 = -204;
			}
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method355();
					if (local8 == 0) {
						if (this.anInt369 == 0) {
							this.anInt369 = 1;
							this.anIntArray69 = new int[1];
							this.anIntArray69[0] = -1;
							this.anIntArray70 = new int[1];
							this.anIntArray70[0] = -1;
							this.anIntArray71 = new int[1];
							this.anIntArray71[0] = -1;
						}
						if (this.anInt375 == -1) {
							if (this.anIntArray72 == null) {
								this.anInt375 = 0;
							} else {
								this.anInt375 = 2;
							}
						}
						if (this.anInt376 == -1) {
							if (this.anIntArray72 != null) {
								this.anInt376 = 2;
								return;
							}
							this.anInt376 = 0;
							return;
						}
						return;
					}
					@Pc(35) int local35;
					if (local8 == 1) {
						this.anInt369 = arg0.method355();
						this.anIntArray69 = new int[this.anInt369];
						this.anIntArray70 = new int[this.anInt369];
						this.anIntArray71 = new int[this.anInt369];
						for (local35 = 0; local35 < this.anInt369; local35++) {
							this.anIntArray69[local35] = arg0.method357();
							this.anIntArray70[local35] = arg0.method357();
							if (this.anIntArray70[local35] == 65535) {
								this.anIntArray70[local35] = -1;
							}
							this.anIntArray71[local35] = arg0.method357();
						}
					} else if (local8 == 2) {
						this.anInt370 = arg0.method357();
					} else if (local8 == 3) {
						local35 = arg0.method355();
						this.anIntArray72 = new int[local35 + 1];
						for (@Pc(96) int local96 = 0; local96 < local35; local96++) {
							this.anIntArray72[local96] = arg0.method355();
						}
						this.anIntArray72[local35] = 9999999;
					} else if (local8 == 4) {
						this.aBoolean100 = true;
					} else if (local8 == 5) {
						this.anInt371 = arg0.method355();
					} else if (local8 == 6) {
						this.anInt372 = arg0.method357();
					} else if (local8 == 7) {
						this.anInt373 = arg0.method357();
					} else if (local8 == 8) {
						this.anInt374 = arg0.method355();
					} else if (local8 == 9) {
						this.anInt375 = arg0.method355();
					} else if (local8 == 10) {
						this.anInt376 = arg0.method355();
					} else if (local8 == 11) {
						this.anInt377 = arg0.method355();
					} else if (local8 == 12) {
						this.anInt378 = arg0.method360();
					} else {
						System.out.println("Error unrecognised seq config code: " + local8);
					}
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("62251, " + arg0 + ", " + arg1 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}
}
