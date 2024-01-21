import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KMWMLVIH")
public final class Class19 {

	@OriginalMember(owner = "client!KMWMLVIH", name = "a", descriptor = "I")
	private static int anInt210;

	@OriginalMember(owner = "client!KMWMLVIH", name = "b", descriptor = "[Lclient!KMWMLVIH;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!KMWMLVIH", name = "c", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!KMWMLVIH", name = "d", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!KMWMLVIH", name = "e", descriptor = "[I")
	public int[] anIntArray100;

	@OriginalMember(owner = "client!KMWMLVIH", name = "f", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!KMWMLVIH", name = "h", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!KMWMLVIH", name = "q", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!KMWMLVIH", name = "g", descriptor = "I")
	public int anInt212 = -1;

	@OriginalMember(owner = "client!KMWMLVIH", name = "i", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!KMWMLVIH", name = "j", descriptor = "I")
	public int anInt213 = 5;

	@OriginalMember(owner = "client!KMWMLVIH", name = "k", descriptor = "I")
	public int anInt214 = -1;

	@OriginalMember(owner = "client!KMWMLVIH", name = "l", descriptor = "I")
	public int anInt215 = -1;

	@OriginalMember(owner = "client!KMWMLVIH", name = "m", descriptor = "I")
	public int anInt216 = 99;

	@OriginalMember(owner = "client!KMWMLVIH", name = "n", descriptor = "I")
	public int anInt217 = -1;

	@OriginalMember(owner = "client!KMWMLVIH", name = "o", descriptor = "I")
	public int anInt218 = -1;

	@OriginalMember(owner = "client!KMWMLVIH", name = "p", descriptor = "I")
	public int anInt219 = 2;

	@OriginalMember(owner = "client!KMWMLVIH", name = "a", descriptor = "(Lclient!WEMOPWVJ;I)V")
	public static void method192(@OriginalArg(0) Class43 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub4 local10 = new Class1_Sub1_Sub4(arg0.method515("seq.dat", null), true);
			anInt210 = local10.method407();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt210];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt210; local20++) {
				if (aClass19Array1[local20] == null) {
					aClass19Array1[local20] = new Class19();
				}
				aClass19Array1[local20].method194(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("31938, " + arg0 + ", " + 24414 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMWMLVIH", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!KMWMLVIH", name = "a", descriptor = "(IB)I")
	public int method193(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray101[arg0];
			if (local4 == 0) {
				@Pc(20) Class30 local20 = Class30.method333(this.anIntArray99[arg0]);
				if (local20 != null) {
					local4 = this.anIntArray101[arg0] = local20.anInt531;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("31730, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMWMLVIH", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	private void method194(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method405();
				if (local14 == 0) {
					if (this.anInt211 == 0) {
						this.anInt211 = 1;
						this.anIntArray99 = new int[1];
						this.anIntArray99[0] = -1;
						this.anIntArray100 = new int[1];
						this.anIntArray100[0] = -1;
						this.anIntArray101 = new int[1];
						this.anIntArray101[0] = -1;
					}
					if (this.anInt217 == -1) {
						if (this.anIntArray102 == null) {
							this.anInt217 = 0;
						} else {
							this.anInt217 = 2;
						}
					}
					if (this.anInt218 == -1) {
						if (this.anIntArray102 != null) {
							this.anInt218 = 2;
							return;
						}
						this.anInt218 = 0;
						return;
					}
					return;
				}
				@Pc(41) int local41;
				if (local14 == 1) {
					this.anInt211 = arg0.method405();
					this.anIntArray99 = new int[this.anInt211];
					this.anIntArray100 = new int[this.anInt211];
					this.anIntArray101 = new int[this.anInt211];
					for (local41 = 0; local41 < this.anInt211; local41++) {
						this.anIntArray99[local41] = arg0.method407();
						this.anIntArray100[local41] = arg0.method407();
						if (this.anIntArray100[local41] == 65535) {
							this.anIntArray100[local41] = -1;
						}
						this.anIntArray101[local41] = arg0.method407();
					}
				} else if (local14 == 2) {
					this.anInt212 = arg0.method407();
				} else if (local14 == 3) {
					local41 = arg0.method405();
					this.anIntArray102 = new int[local41 + 1];
					for (@Pc(102) int local102 = 0; local102 < local41; local102++) {
						this.anIntArray102[local102] = arg0.method405();
					}
					this.anIntArray102[local41] = 9999999;
				} else if (local14 == 4) {
					this.aBoolean52 = true;
				} else if (local14 == 5) {
					this.anInt213 = arg0.method405();
				} else if (local14 == 6) {
					this.anInt214 = arg0.method407();
				} else if (local14 == 7) {
					this.anInt215 = arg0.method407();
				} else if (local14 == 8) {
					this.anInt216 = arg0.method405();
				} else if (local14 == 9) {
					this.anInt217 = arg0.method405();
				} else if (local14 == 10) {
					this.anInt218 = arg0.method405();
				} else if (local14 == 11) {
					this.anInt219 = arg0.method405();
				} else if (local14 == 12) {
					this.anInt220 = arg0.method410();
				} else {
					System.out.println("Error unrecognised seq config code: " + local14);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("20310, " + -13096 + ", " + arg0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}
}
