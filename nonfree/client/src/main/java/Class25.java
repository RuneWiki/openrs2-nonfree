import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MBSSGBHW")
public final class Class25 {

	@OriginalMember(owner = "client!MBSSGBHW", name = "b", descriptor = "I")
	private static int anInt469;

	@OriginalMember(owner = "client!MBSSGBHW", name = "c", descriptor = "[Lclient!MBSSGBHW;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!MBSSGBHW", name = "a", descriptor = "I")
	private static int anInt468 = 4;

	@OriginalMember(owner = "client!MBSSGBHW", name = "o", descriptor = "Lclient!WUMSOEQS;")
	public static Class46 aClass46_7 = new Class46((byte) 5, 30);

	@OriginalMember(owner = "client!MBSSGBHW", name = "d", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!MBSSGBHW", name = "e", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!MBSSGBHW", name = "g", descriptor = "Lclient!JZFUUSFN;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!MBSSGBHW", name = "l", descriptor = "I")
	public int anInt475;

	@OriginalMember(owner = "client!MBSSGBHW", name = "m", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!MBSSGBHW", name = "n", descriptor = "I")
	public int anInt477;

	@OriginalMember(owner = "client!MBSSGBHW", name = "f", descriptor = "I")
	private int anInt472 = -1;

	@OriginalMember(owner = "client!MBSSGBHW", name = "h", descriptor = "[I")
	private int[] anIntArray96 = new int[6];

	@OriginalMember(owner = "client!MBSSGBHW", name = "i", descriptor = "[I")
	private int[] anIntArray97 = new int[6];

	@OriginalMember(owner = "client!MBSSGBHW", name = "j", descriptor = "I")
	public int anInt473 = 128;

	@OriginalMember(owner = "client!MBSSGBHW", name = "k", descriptor = "I")
	public int anInt474 = 128;

	@OriginalMember(owner = "client!MBSSGBHW", name = "a", descriptor = "(BLclient!IEMHZJLX;)V")
	public static void method276(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub4 local8 = new Class1_Sub1_Sub4(0, arg0.method181("spotanim.dat", null));
			anInt469 = local8.method296();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt469];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt469; local23++) {
				if (aClass25Array1[local23] == null) {
					aClass25Array1[local23] = new Class25();
				}
				aClass25Array1[local23].anInt470 = local23;
				aClass25Array1[local23].method277(403, local8);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("1712, " + 8 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBSSGBHW", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!MBSSGBHW", name = "a", descriptor = "(ILclient!MVHXDWGI;)V")
	private void method277(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method294();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt471 = arg1.method296();
					} else if (local8 == 2) {
						this.anInt472 = arg1.method296();
						if (Class19.aClass19Array1 != null) {
							this.aClass19_1 = Class19.aClass19Array1[this.anInt472];
						}
					} else if (local8 == 4) {
						this.anInt473 = arg1.method296();
					} else if (local8 == 5) {
						this.anInt474 = arg1.method296();
					} else if (local8 == 6) {
						this.anInt475 = arg1.method296();
					} else if (local8 == 7) {
						this.anInt476 = arg1.method294();
					} else if (local8 == 8) {
						this.anInt477 = arg1.method294();
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray96[local8 - 40] = arg1.method296();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray97[local8 - 50] = arg1.method296();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local8);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("21340, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBSSGBHW", name = "a", descriptor = "()Lclient!PDVZPZLT;")
	public Class1_Sub1_Sub1_Sub4 method278() {
		@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) aClass46_7.method557((long) this.anInt470);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub4.method363(this.anInt471);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray96[0] != 0) {
				local6.method377(this.anIntArray96[local20], this.anIntArray97[local20]);
			}
		}
		aClass46_7.method558((long) this.anInt470, local6);
		return local6;
	}
}
