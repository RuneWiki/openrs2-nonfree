import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LZZHVUJR")
public final class Class23 {

	@OriginalMember(owner = "client!LZZHVUJR", name = "b", descriptor = "I")
	private static int anInt357;

	@OriginalMember(owner = "client!LZZHVUJR", name = "c", descriptor = "[Lclient!LZZHVUJR;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!LZZHVUJR", name = "d", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!LZZHVUJR", name = "e", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!LZZHVUJR", name = "f", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!LZZHVUJR", name = "g", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!LZZHVUJR", name = "i", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!LZZHVUJR", name = "r", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!LZZHVUJR", name = "a", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!LZZHVUJR", name = "h", descriptor = "I")
	public int anInt359 = -1;

	@OriginalMember(owner = "client!LZZHVUJR", name = "j", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!LZZHVUJR", name = "k", descriptor = "I")
	public int anInt360 = 5;

	@OriginalMember(owner = "client!LZZHVUJR", name = "l", descriptor = "I")
	public int anInt361 = -1;

	@OriginalMember(owner = "client!LZZHVUJR", name = "m", descriptor = "I")
	public int anInt362 = -1;

	@OriginalMember(owner = "client!LZZHVUJR", name = "n", descriptor = "I")
	public int anInt363 = 99;

	@OriginalMember(owner = "client!LZZHVUJR", name = "o", descriptor = "I")
	public int anInt364 = -1;

	@OriginalMember(owner = "client!LZZHVUJR", name = "p", descriptor = "I")
	public int anInt365 = -1;

	@OriginalMember(owner = "client!LZZHVUJR", name = "q", descriptor = "I")
	public int anInt366 = 2;

	@OriginalMember(owner = "client!LZZHVUJR", name = "a", descriptor = "(ZLclient!FXNTEMPE;)V")
	public static void method234(@OriginalArg(1) Class13 arg0) {
		try {
			@Pc(10) Class2_Sub1_Sub4 local10 = new Class2_Sub1_Sub4(arg0.method117("seq.dat", null), -46859);
			anInt357 = local10.method342();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt357];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt357; local29++) {
				if (aClass23Array1[local29] == null) {
					aClass23Array1[local29] = new Class23();
				}
				aClass23Array1[local29].method236(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("20040, " + true + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LZZHVUJR", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!LZZHVUJR", name = "a", descriptor = "(II)I")
	public int method235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				this.aBoolean96 = !this.aBoolean96;
			}
			@Pc(14) int local14 = this.anIntArray84[arg0];
			if (local14 == 0) {
				@Pc(22) Class31 local22 = Class31.method294(this.anIntArray82[arg0]);
				if (local22 != null) {
					local14 = this.anIntArray84[arg0] = local22.anInt493;
				}
			}
			if (local14 == 0) {
				local14 = 1;
			}
			return local14;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("66273, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LZZHVUJR", name = "a", descriptor = "(Lclient!RSWRPCHR;B)V")
	private void method236(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method340();
				if (local11 == 0) {
					if (this.anInt358 == 0) {
						this.anInt358 = 1;
						this.anIntArray82 = new int[1];
						this.anIntArray82[0] = -1;
						this.anIntArray83 = new int[1];
						this.anIntArray83[0] = -1;
						this.anIntArray84 = new int[1];
						this.anIntArray84[0] = -1;
					}
					if (this.anInt364 == -1) {
						if (this.anIntArray85 == null) {
							this.anInt364 = 0;
						} else {
							this.anInt364 = 2;
						}
					}
					if (this.anInt365 == -1) {
						if (this.anIntArray85 != null) {
							this.anInt365 = 2;
							return;
						}
						this.anInt365 = 0;
						return;
					}
					return;
				}
				@Pc(38) int local38;
				if (local11 == 1) {
					this.anInt358 = arg0.method340();
					this.anIntArray82 = new int[this.anInt358];
					this.anIntArray83 = new int[this.anInt358];
					this.anIntArray84 = new int[this.anInt358];
					for (local38 = 0; local38 < this.anInt358; local38++) {
						this.anIntArray82[local38] = arg0.method342();
						this.anIntArray83[local38] = arg0.method342();
						if (this.anIntArray83[local38] == 65535) {
							this.anIntArray83[local38] = -1;
						}
						this.anIntArray84[local38] = arg0.method342();
					}
				} else if (local11 == 2) {
					this.anInt359 = arg0.method342();
				} else if (local11 == 3) {
					local38 = arg0.method340();
					this.anIntArray85 = new int[local38 + 1];
					for (@Pc(99) int local99 = 0; local99 < local38; local99++) {
						this.anIntArray85[local99] = arg0.method340();
					}
					this.anIntArray85[local38] = 9999999;
				} else if (local11 == 4) {
					this.aBoolean97 = true;
				} else if (local11 == 5) {
					this.anInt360 = arg0.method340();
				} else if (local11 == 6) {
					this.anInt361 = arg0.method342();
				} else if (local11 == 7) {
					this.anInt362 = arg0.method342();
				} else if (local11 == 8) {
					this.anInt363 = arg0.method340();
				} else if (local11 == 9) {
					this.anInt364 = arg0.method340();
				} else if (local11 == 10) {
					this.anInt365 = arg0.method340();
				} else if (local11 == 11) {
					this.anInt366 = arg0.method340();
				} else if (local11 == 12) {
					this.anInt367 = arg0.method345();
				} else {
					System.out.println("Error unrecognised seq config code: " + local11);
				}
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("5550, " + arg0 + ", " + 46 + ", " + local273.toString());
			throw new RuntimeException();
		}
	}
}
