import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class11 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	private static int anInt293;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[Lclient!fc;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	private static int anInt292 = 268;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public int anInt295 = -1;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt297 = 5;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public int anInt298 = -1;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt299 = -1;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt300 = 99;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!tb;I)V")
	public static void method221(@OriginalArg(0) Class34 arg0) {
		@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method428(null, "seq.dat"), (byte) 63);
		anInt293 = local9.method333();
		if (aClass11Array1 == null) {
			aClass11Array1 = new Class11[anInt293];
		}
		for (@Pc(23) int local23 = 0; local23 < anInt293; local23++) {
			if (aClass11Array1[local23] == null) {
				aClass11Array1[local23] = new Class11();
			}
			aClass11Array1[local23].method222(local9);
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!jb;)V")
	private void method222(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method331();
			if (local13 == 0) {
				if (this.anInt294 == 0) {
					this.anInt294 = 1;
					this.anIntArray124 = new int[1];
					this.anIntArray124[0] = -1;
					this.anIntArray125 = new int[1];
					this.anIntArray125[0] = -1;
					this.anIntArray126 = new int[1];
					this.anIntArray126[0] = -1;
				}
				return;
			}
			@Pc(40) int local40;
			if (local13 == 1) {
				this.anInt294 = arg0.method331();
				this.anIntArray124 = new int[this.anInt294];
				this.anIntArray125 = new int[this.anInt294];
				this.anIntArray126 = new int[this.anInt294];
				for (local40 = 0; local40 < this.anInt294; local40++) {
					this.anIntArray124[local40] = arg0.method333();
					this.anIntArray125[local40] = arg0.method333();
					if (this.anIntArray125[local40] == 65535) {
						this.anIntArray125[local40] = -1;
					}
					this.anIntArray126[local40] = arg0.method333();
					if (this.anIntArray126[local40] == 0) {
						this.anIntArray126[local40] = Class10.aClass10Array1[this.anIntArray124[local40]].anInt270;
					}
					if (this.anIntArray126[local40] == 0) {
						this.anIntArray126[local40] = 1;
					}
				}
			} else if (local13 == 2) {
				this.anInt295 = arg0.method333();
			} else if (local13 == 3) {
				local40 = arg0.method331();
				this.anIntArray127 = new int[local40 + 1];
				for (@Pc(127) int local127 = 0; local127 < local40; local127++) {
					this.anIntArray127[local127] = arg0.method331();
				}
				this.anIntArray127[local40] = 9999999;
			} else if (local13 == 4) {
				this.anInt296 = arg0.method333();
			} else if (local13 == 5) {
				this.anInt297 = arg0.method331();
			} else if (local13 == 6) {
				this.anInt298 = arg0.method333();
			} else if (local13 == 7) {
				this.anInt299 = arg0.method333();
			} else if (local13 == 8) {
				this.anInt300 = arg0.method331();
			} else {
				System.out.println("Error unrecognised seq config code: " + local13);
			}
		}
	}
}
