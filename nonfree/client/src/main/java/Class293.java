import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class293 {

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Lclient!il;")
	private Class162 aClass162_34;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray148;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "[I")
	private int[] anIntArray542;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "[I")
	private int[] anIntArray543;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "[I")
	private int[] anIntArray544;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray149;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Ljava/lang/String;")
	private String aString86;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "[I")
	private int[] anIntArray545;

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "[I")
	private int[] anIntArray546;

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "[I")
	private int[] anIntArray547;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "Ljava/lang/String;")
	private String aString87;

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "[I")
	private int[] anIntArray548;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	public int anInt8052 = -1;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZLclient!es;)V")
	public void method6636(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4325();
			if (local5 == 0) {
				return;
			}
			this.method6638(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
	public void method6637() {
		if (this.aString86 == null) {
			this.aString86 = this.aString87;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!es;II)V")
	private void method6638(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString87 = arg0.method4321();
		} else if (arg1 == 2) {
			this.aString86 = arg0.method4321();
		} else {
			@Pc(25) int local25;
			@Pc(32) int local32;
			if (arg1 == 3) {
				local25 = arg0.method4325();
				this.anIntArrayArray51 = new int[local25][3];
				for (local32 = 0; local32 < local25; local32++) {
					this.anIntArrayArray51[local32][0] = arg0.method4294();
					this.anIntArrayArray51[local32][1] = arg0.method4307();
					this.anIntArrayArray51[local32][2] = arg0.method4307();
				}
			} else if (arg1 == 4) {
				local25 = arg0.method4325();
				this.anIntArrayArray50 = new int[local25][3];
				for (local32 = 0; local32 < local25; local32++) {
					this.anIntArrayArray50[local32][0] = arg0.method4294();
					this.anIntArrayArray50[local32][1] = arg0.method4307();
					this.anIntArrayArray50[local32][2] = arg0.method4307();
				}
			} else if (arg1 == 5) {
				arg0.method4294();
			} else if (arg1 == 6) {
				arg0.method4325();
			} else if (arg1 == 7) {
				arg0.method4325();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4325();
				} else if (arg1 == 10) {
					local25 = arg0.method4325();
					this.anIntArray547 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray547[local32] = arg0.method4307();
					}
				} else if (arg1 == 12) {
					arg0.method4307();
				} else if (arg1 == 13) {
					local25 = arg0.method4325();
					this.anIntArray541 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray541[local32] = arg0.method4294();
					}
				} else if (arg1 == 14) {
					local25 = arg0.method4325();
					this.anIntArrayArray52 = new int[local25][2];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArrayArray52[local32][0] = arg0.method4325();
						this.anIntArrayArray52[local32][1] = arg0.method4325();
					}
				} else if (arg1 == 15) {
					arg0.method4294();
				} else if (arg1 == 17) {
					this.anInt8052 = arg0.method4294();
				} else if (arg1 == 18) {
					local25 = arg0.method4325();
					this.anIntArray542 = new int[local25];
					this.aStringArray149 = new String[local25];
					this.anIntArray545 = new int[local25];
					this.anIntArray543 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray543[local32] = arg0.method4307();
						this.anIntArray542[local32] = arg0.method4307();
						this.anIntArray545[local32] = arg0.method4307();
						this.aStringArray149[local32] = arg0.method4324();
					}
				} else if (arg1 == 19) {
					local25 = arg0.method4325();
					this.anIntArray544 = new int[local25];
					this.anIntArray548 = new int[local25];
					this.aStringArray148 = new String[local25];
					this.anIntArray546 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray546[local32] = arg0.method4307();
						this.anIntArray544[local32] = arg0.method4307();
						this.anIntArray548[local32] = arg0.method4307();
						this.aStringArray148[local32] = arg0.method4324();
					}
				} else if (arg1 == 249) {
					local25 = arg0.method4325();
					if (this.aClass162_34 == null) {
						local32 = Static89.method7259(local25);
						this.aClass162_34 = new Class162(local32);
					}
					for (local32 = 0; local32 < local25; local32++) {
						@Pc(233) boolean local233 = arg0.method4325() == 1;
						@Pc(237) int local237 = arg0.method4341();
						@Pc(246) Class2 local246;
						if (local233) {
							local246 = new Class2_Sub1(arg0.method4324());
						} else {
							local246 = new Class2_Sub22(arg0.method4307());
						}
						this.aClass162_34.method3522(local246, (long) local237);
					}
				}
			}
		}
	}
}
