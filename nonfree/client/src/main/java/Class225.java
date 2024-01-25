import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class225 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
	private int[] anIntArray736;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Ljava/lang/String;")
	private String aString58;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	private int[] anIntArray737;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	private int[] anIntArray738;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
	private int[] anIntArray739;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[I")
	private int[] anIntArray740;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
	private int[] anIntArray741;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	private int[] anIntArray742;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!sq;")
	private Class214 aClass214_30;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Ljava/lang/String;")
	private String aString59;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
	private int[] anIntArray744;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	public int anInt6148 = -1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public void method5319() {
		if (this.aString58 == null) {
			this.aString58 = this.aString59;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!lk;B)V")
	public void method5320(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4240();
			if (local15 == 0) {
				return;
			}
			this.method5321(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!lk;II)V")
	private void method5321(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString59 = arg0.method4202();
		} else if (arg1 == 2) {
			this.aString58 = arg0.method4202();
		} else {
			@Pc(23) int local23;
			@Pc(30) int local30;
			if (arg1 == 3) {
				local23 = arg0.method4240();
				this.anIntArrayArray52 = new int[local23][3];
				for (local30 = 0; local30 < local23; local30++) {
					this.anIntArrayArray52[local30][0] = arg0.method4245();
					this.anIntArrayArray52[local30][1] = arg0.method4239();
					this.anIntArrayArray52[local30][2] = arg0.method4239();
				}
			} else if (arg1 == 4) {
				local23 = arg0.method4240();
				this.anIntArrayArray53 = new int[local23][3];
				for (local30 = 0; local30 < local23; local30++) {
					this.anIntArrayArray53[local30][0] = arg0.method4245();
					this.anIntArrayArray53[local30][1] = arg0.method4239();
					this.anIntArrayArray53[local30][2] = arg0.method4239();
				}
			} else if (arg1 == 5) {
				arg0.method4245();
			} else if (arg1 == 6) {
				arg0.method4240();
			} else if (arg1 == 7) {
				arg0.method4240();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4240();
				} else if (arg1 == 10) {
					local23 = arg0.method4240();
					this.anIntArray736 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray736[local30] = arg0.method4239();
					}
				} else if (arg1 == 12) {
					arg0.method4239();
				} else if (arg1 == 13) {
					local23 = arg0.method4240();
					this.anIntArray741 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray741[local30] = arg0.method4245();
					}
				} else if (arg1 == 14) {
					local23 = arg0.method4240();
					this.anIntArrayArray51 = new int[local23][2];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArrayArray51[local30][0] = arg0.method4240();
						this.anIntArrayArray51[local30][1] = arg0.method4240();
					}
				} else if (arg1 == 15) {
					arg0.method4245();
				} else if (arg1 == 17) {
					this.anInt6148 = arg0.method4245();
				} else if (arg1 == 18) {
					local23 = arg0.method4240();
					this.anIntArray744 = new int[local23];
					this.anIntArray742 = new int[local23];
					this.anIntArray740 = new int[local23];
					this.aStringArray41 = new String[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray742[local30] = arg0.method4239();
						this.anIntArray740[local30] = arg0.method4239();
						this.anIntArray744[local30] = arg0.method4239();
						this.aStringArray41[local30] = arg0.method4201();
					}
				} else if (arg1 == 19) {
					local23 = arg0.method4240();
					this.aStringArray40 = new String[local23];
					this.anIntArray738 = new int[local23];
					this.anIntArray739 = new int[local23];
					this.anIntArray737 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray738[local30] = arg0.method4239();
						this.anIntArray737[local30] = arg0.method4239();
						this.anIntArray739[local30] = arg0.method4239();
						this.aStringArray40[local30] = arg0.method4201();
					}
				} else if (arg1 == 249) {
					local23 = arg0.method4240();
					if (this.aClass214_30 == null) {
						local30 = Static353.method5359(local23);
						this.aClass214_30 = new Class214(local30);
					}
					for (local30 = 0; local30 < local23; local30++) {
						@Pc(232) boolean local232 = arg0.method4240() == 1;
						@Pc(236) int local236 = arg0.method4235();
						@Pc(245) Class2 local245;
						if (local232) {
							local245 = new Class2_Sub32(arg0.method4201());
						} else {
							local245 = new Class2_Sub44(arg0.method4239());
						}
						this.aClass214_30.method5065((long) local236, local245);
					}
				}
			}
		}
	}
}
