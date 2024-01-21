import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XYSJIYWF")
public final class Class46 {

	@OriginalMember(owner = "client!XYSJIYWF", name = "b", descriptor = "I")
	private static int anInt814;

	@OriginalMember(owner = "client!XYSJIYWF", name = "c", descriptor = "[Lclient!XYSJIYWF;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!XYSJIYWF", name = "o", descriptor = "Lclient!UNPPHFRC;")
	public static Class41 aClass41_9 = new Class41(true, 30);

	@OriginalMember(owner = "client!XYSJIYWF", name = "d", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!XYSJIYWF", name = "e", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!XYSJIYWF", name = "g", descriptor = "Lclient!DVIZXFSW;")
	public Class7 aClass7_2;

	@OriginalMember(owner = "client!XYSJIYWF", name = "l", descriptor = "I")
	public int anInt820;

	@OriginalMember(owner = "client!XYSJIYWF", name = "m", descriptor = "I")
	public int anInt821;

	@OriginalMember(owner = "client!XYSJIYWF", name = "n", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!XYSJIYWF", name = "a", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!XYSJIYWF", name = "f", descriptor = "I")
	private int anInt817 = -1;

	@OriginalMember(owner = "client!XYSJIYWF", name = "h", descriptor = "[I")
	private int[] anIntArray203 = new int[6];

	@OriginalMember(owner = "client!XYSJIYWF", name = "i", descriptor = "[I")
	private int[] anIntArray204 = new int[6];

	@OriginalMember(owner = "client!XYSJIYWF", name = "j", descriptor = "I")
	public int anInt818 = 128;

	@OriginalMember(owner = "client!XYSJIYWF", name = "k", descriptor = "I")
	public int anInt819 = 128;

	@OriginalMember(owner = "client!XYSJIYWF", name = "a", descriptor = "(Lclient!HBJEXSJX;Z)V")
	public static void method552(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg0.method278("spotanim.dat", null), 0);
			anInt814 = local11.method157();
			if (aClass46Array1 == null) {
				aClass46Array1 = new Class46[anInt814];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt814; local21++) {
				if (aClass46Array1[local21] == null) {
					aClass46Array1[local21] = new Class46();
				}
				aClass46Array1[local21].anInt815 = local21;
				aClass46Array1[local21].method553(local11);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("76109, " + arg0 + ", " + true + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XYSJIYWF", name = "<init>", descriptor = "()V")
	private Class46() {
	}

	@OriginalMember(owner = "client!XYSJIYWF", name = "a", descriptor = "(BLclient!EYMNCFMK;)V")
	private void method553(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method155();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt816 = arg0.method157();
				} else if (local15 == 2) {
					this.anInt817 = arg0.method157();
					if (Class7.aClass7Array1 != null) {
						this.aClass7_2 = Class7.aClass7Array1[this.anInt817];
					}
				} else if (local15 == 4) {
					this.anInt818 = arg0.method157();
				} else if (local15 == 5) {
					this.anInt819 = arg0.method157();
				} else if (local15 == 6) {
					this.anInt820 = arg0.method157();
				} else if (local15 == 7) {
					this.anInt821 = arg0.method155();
				} else if (local15 == 8) {
					this.anInt822 = arg0.method155();
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray203[local15 - 40] = arg0.method157();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray204[local15 - 50] = arg0.method157();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local15);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("50291, " + 5 + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XYSJIYWF", name = "a", descriptor = "()Lclient!OJGAHFXC;")
	public Class1_Sub1_Sub1_Sub5 method554() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass41_9.method498((long) this.anInt815);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method379(this.anInt816);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray203[0] != 0) {
				local6.method393(this.anIntArray203[local20], this.anIntArray204[local20]);
			}
		}
		aClass41_9.method499((long) this.anInt815, local6);
		return local6;
	}
}
