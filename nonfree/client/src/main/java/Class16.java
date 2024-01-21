import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HTOEUNMD")
public final class Class16 {

	@OriginalMember(owner = "client!HTOEUNMD", name = "a", descriptor = "I")
	private static int anInt237;

	@OriginalMember(owner = "client!HTOEUNMD", name = "b", descriptor = "[Lclient!HTOEUNMD;")
	public static Class16[] aClass16Array1;

	@OriginalMember(owner = "client!HTOEUNMD", name = "n", descriptor = "Lclient!LXKBDSHJ;")
	public static Class25 aClass25_1 = new Class25((byte) 0, 30);

	@OriginalMember(owner = "client!HTOEUNMD", name = "c", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!HTOEUNMD", name = "d", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!HTOEUNMD", name = "f", descriptor = "Lclient!KSVXFIAD;")
	public Class22 aClass22_2;

	@OriginalMember(owner = "client!HTOEUNMD", name = "k", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!HTOEUNMD", name = "l", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!HTOEUNMD", name = "m", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!HTOEUNMD", name = "e", descriptor = "I")
	private int anInt240 = -1;

	@OriginalMember(owner = "client!HTOEUNMD", name = "g", descriptor = "[I")
	private int[] anIntArray57 = new int[6];

	@OriginalMember(owner = "client!HTOEUNMD", name = "h", descriptor = "[I")
	private int[] anIntArray58 = new int[6];

	@OriginalMember(owner = "client!HTOEUNMD", name = "i", descriptor = "I")
	public int anInt241 = 128;

	@OriginalMember(owner = "client!HTOEUNMD", name = "j", descriptor = "I")
	public int anInt242 = 128;

	@OriginalMember(owner = "client!HTOEUNMD", name = "a", descriptor = "(BLclient!JUPFHAZZ;)V")
	public static void method149(@OriginalArg(1) Class21 arg0) {
		try {
			@Pc(20) Class2_Sub1_Sub4 local20 = new Class2_Sub1_Sub4(859, arg0.method275("spotanim.dat", null));
			anInt237 = local20.method494();
			if (aClass16Array1 == null) {
				aClass16Array1 = new Class16[anInt237];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt237; local30++) {
				if (aClass16Array1[local30] == null) {
					aClass16Array1[local30] = new Class16();
				}
				aClass16Array1[local30].anInt238 = local30;
				aClass16Array1[local30].method150(local20);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("32021, " + -3 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTOEUNMD", name = "<init>", descriptor = "()V")
	private Class16() {
	}

	@OriginalMember(owner = "client!HTOEUNMD", name = "a", descriptor = "(Lclient!TKPFKOXP;B)V")
	private void method150(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method492();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt239 = arg0.method494();
				} else if (local11 == 2) {
					this.anInt240 = arg0.method494();
					if (Class22.aClass22Array1 != null) {
						this.aClass22_2 = Class22.aClass22Array1[this.anInt240];
					}
				} else if (local11 == 4) {
					this.anInt241 = arg0.method494();
				} else if (local11 == 5) {
					this.anInt242 = arg0.method494();
				} else if (local11 == 6) {
					this.anInt243 = arg0.method494();
				} else if (local11 == 7) {
					this.anInt244 = arg0.method492();
				} else if (local11 == 8) {
					this.anInt245 = arg0.method492();
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray57[local11 - 40] = arg0.method494();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray58[local11 - 50] = arg0.method494();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local11);
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("20726, " + arg0 + ", " + 4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTOEUNMD", name = "a", descriptor = "()Lclient!OGORHYVW;")
	public Class2_Sub1_Sub1_Sub6 method151() {
		@Pc(6) Class2_Sub1_Sub1_Sub6 local6 = (Class2_Sub1_Sub1_Sub6) aClass25_1.method347((long) this.anInt238);
		if (local6 != null) {
			return local6;
		}
		local6 = Class2_Sub1_Sub1_Sub6.method385(this.anInt239);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray57[0] != 0) {
				local6.method399(this.anIntArray57[local20], this.anIntArray58[local20]);
			}
		}
		aClass25_1.method348(local6, (long) this.anInt238);
		return local6;
	}
}
