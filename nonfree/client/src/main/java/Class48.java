import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VSBOWDVL")
public final class Class48 {

	@OriginalMember(owner = "client!VSBOWDVL", name = "b", descriptor = "Z")
	private static boolean aBoolean169;

	@OriginalMember(owner = "client!VSBOWDVL", name = "c", descriptor = "I")
	private static int anInt781;

	@OriginalMember(owner = "client!VSBOWDVL", name = "d", descriptor = "[Lclient!VSBOWDVL;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!VSBOWDVL", name = "a", descriptor = "B")
	private static byte aByte39 = -27;

	@OriginalMember(owner = "client!VSBOWDVL", name = "p", descriptor = "Lclient!JLTMYUOM;")
	public static Class18 aClass18_9 = new Class18(true, 30);

	@OriginalMember(owner = "client!VSBOWDVL", name = "e", descriptor = "I")
	private int anInt782;

	@OriginalMember(owner = "client!VSBOWDVL", name = "f", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!VSBOWDVL", name = "h", descriptor = "Lclient!GMRGYXFL;")
	public Class16 aClass16_2;

	@OriginalMember(owner = "client!VSBOWDVL", name = "m", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!VSBOWDVL", name = "n", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!VSBOWDVL", name = "o", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!VSBOWDVL", name = "g", descriptor = "I")
	private int anInt784 = -1;

	@OriginalMember(owner = "client!VSBOWDVL", name = "i", descriptor = "[I")
	private int[] anIntArray203 = new int[6];

	@OriginalMember(owner = "client!VSBOWDVL", name = "j", descriptor = "[I")
	private int[] anIntArray204 = new int[6];

	@OriginalMember(owner = "client!VSBOWDVL", name = "k", descriptor = "I")
	public int anInt785 = 128;

	@OriginalMember(owner = "client!VSBOWDVL", name = "l", descriptor = "I")
	public int anInt786 = 128;

	@OriginalMember(owner = "client!VSBOWDVL", name = "a", descriptor = "(ILclient!QKFGLETG;)V")
	public static void method479(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("spotanim.dat", null));
			anInt781 = local16.method500();
			if (aClass48Array1 == null) {
				aClass48Array1 = new Class48[anInt781];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt781; local26++) {
				if (aClass48Array1[local26] == null) {
					aClass48Array1[local26] = new Class48();
				}
				aClass48Array1[local26].anInt782 = local26;
				aClass48Array1[local26].method480(aByte39, local16);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("60736, " + 0 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSBOWDVL", name = "<init>", descriptor = "()V")
	private Class48() {
	}

	@OriginalMember(owner = "client!VSBOWDVL", name = "a", descriptor = "(BLclient!XJCNBMKS;)V")
	private void method480(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 != aByte39) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(11) int local11 = arg1.method498();
					if (local11 == 0) {
						return;
					}
					if (local11 == 1) {
						this.anInt783 = arg1.method500();
					} else if (local11 == 2) {
						this.anInt784 = arg1.method500();
						if (Class16.aClass16Array1 != null) {
							this.aClass16_2 = Class16.aClass16Array1[this.anInt784];
						}
					} else if (local11 == 4) {
						this.anInt785 = arg1.method500();
					} else if (local11 == 5) {
						this.anInt786 = arg1.method500();
					} else if (local11 == 6) {
						this.anInt787 = arg1.method500();
					} else if (local11 == 7) {
						this.anInt788 = arg1.method498();
					} else if (local11 == 8) {
						this.anInt789 = arg1.method498();
					} else if (local11 >= 40 && local11 < 50) {
						this.anIntArray203[local11 - 40] = arg1.method500();
					} else if (local11 >= 50 && local11 < 60) {
						this.anIntArray204[local11 - 50] = arg1.method500();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local11);
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("16818, " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSBOWDVL", name = "a", descriptor = "()Lclient!FUTAQMCE;")
	public Class1_Sub1_Sub1_Sub3 method481() {
		@Pc(6) Class1_Sub1_Sub1_Sub3 local6 = (Class1_Sub1_Sub1_Sub3) aClass18_9.method216((long) this.anInt782);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub3.method182(this.anInt783);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray203[0] != 0) {
				local6.method196(this.anIntArray203[local21], this.anIntArray204[local21]);
			}
		}
		aClass18_9.method217((long) this.anInt782, local6);
		return local6;
	}
}
