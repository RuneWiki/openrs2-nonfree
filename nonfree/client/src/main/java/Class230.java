import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class230 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "J")
	public static long aLong200 = 0L;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_58 = new Class98(5);

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	public static int anInt6443 = -1;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "[I")
	public static final int[] anIntArray444 = new int[32];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray60;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray61;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!ad;")
	private Class4 aClass4_134;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	public int anInt6442 = -1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!bt;I)V", line = 16)
	private void method5833(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString64 = arg0.method4857();
		} else if (arg1 == 2) {
			this.aString63 = arg0.method4857();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method4816();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method4830();
					this.anIntArrayArray55[local31][1] = arg0.method4837();
					this.anIntArrayArray55[local31][2] = arg0.method4837();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method4816();
				this.anIntArrayArray57 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method4830();
					this.anIntArrayArray57[local31][1] = arg0.method4837();
					this.anIntArrayArray57[local31][2] = arg0.method4837();
				}
			} else if (arg1 == 5) {
				arg0.method4830();
			} else if (arg1 == 6) {
				arg0.method4816();
			} else if (arg1 == 7) {
				arg0.method4816();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4816();
				} else if (arg1 == 10) {
					local24 = arg0.method4816();
					this.anIntArray436 = new int[local24];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArray436[local31] = arg0.method4837();
					}
				} else if (arg1 == 12) {
					arg0.method4837();
				} else if (arg1 == 13) {
					local24 = arg0.method4816();
					this.anIntArray443 = new int[local24];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArray443[local31] = arg0.method4830();
					}
				} else if (arg1 == 14) {
					local24 = arg0.method4816();
					this.anIntArrayArray56 = new int[local24][2];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArrayArray56[local31][0] = arg0.method4816();
						this.anIntArrayArray56[local31][1] = arg0.method4816();
					}
				} else if (arg1 == 15) {
					arg0.method4830();
				} else if (arg1 == 17) {
					this.anInt6442 = arg0.method4830();
				} else if (arg1 == 18) {
					local24 = arg0.method4816();
					this.anIntArray437 = new int[local24];
					this.anIntArray440 = new int[local24];
					this.anIntArray442 = new int[local24];
					this.aStringArray61 = new String[local24];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArray442[local31] = arg0.method4837();
						this.anIntArray440[local31] = arg0.method4837();
						this.anIntArray437[local31] = arg0.method4837();
						this.aStringArray61[local31] = arg0.method4810();
					}
				} else if (arg1 == 19) {
					local24 = arg0.method4816();
					this.anIntArray441 = new int[local24];
					this.aStringArray60 = new String[local24];
					this.anIntArray439 = new int[local24];
					this.anIntArray438 = new int[local24];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArray439[local31] = arg0.method4837();
						this.anIntArray438[local31] = arg0.method4837();
						this.anIntArray441[local31] = arg0.method4837();
						this.aStringArray60[local31] = arg0.method4810();
					}
				} else if (arg1 == 249) {
					local24 = arg0.method4816();
					if (this.aClass4_134 == null) {
						local31 = Static152.method2978(local24);
						this.aClass4_134 = new Class4(local31);
					}
					for (local31 = 0; local31 < local24; local31++) {
						@Pc(329) boolean local329 = arg0.method4816() == 1;
						@Pc(333) int local333 = arg0.method4834();
						@Pc(342) Class2 local342;
						if (local329) {
							local342 = new Class2_Sub40(arg0.method4810());
						} else {
							local342 = new Class2_Sub39(arg0.method4837());
						}
						this.aClass4_134.method87(local342, (long) local333);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 307)
	public void method5835() {
		if (this.aString63 == null) {
			this.aString63 = this.aString64;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!bt;)V", line = 348)
	public void method5837(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4816();
			if (local13 == 0) {
				return;
			}
			this.method5833(arg0, local13);
		}
	}
}
