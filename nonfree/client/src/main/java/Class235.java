import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class235 {

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "Lclient!si;")
	private Class335 aClass335_24;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "[I")
	private int[] anIntArray344;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "Ljava/lang/String;")
	private String aString87;

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	public int anInt7155 = -1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ol;II)V")
	private void method6403(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString87 = arg0.method5183();
		} else if (arg1 == 2) {
			this.aString88 = arg0.method5183();
		} else {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (arg1 == 3) {
				local21 = arg0.method5203();
				this.anIntArrayArray33 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray33[local28][0] = arg0.method5211();
					this.anIntArrayArray33[local28][1] = arg0.method5172();
					this.anIntArrayArray33[local28][2] = arg0.method5172();
				}
			} else if (arg1 == 4) {
				local21 = arg0.method5203();
				this.anIntArrayArray31 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray31[local28][0] = arg0.method5211();
					this.anIntArrayArray31[local28][1] = arg0.method5172();
					this.anIntArrayArray31[local28][2] = arg0.method5172();
				}
			} else if (arg1 == 5) {
				arg0.method5211();
			} else if (arg1 == 6) {
				arg0.method5203();
			} else if (arg1 == 7) {
				arg0.method5203();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5203();
				} else if (arg1 == 10) {
					local21 = arg0.method5203();
					this.anIntArray341 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray341[local28] = arg0.method5172();
					}
				} else if (arg1 == 12) {
					arg0.method5172();
				} else if (arg1 == 13) {
					local21 = arg0.method5203();
					this.anIntArray345 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray345[local28] = arg0.method5211();
					}
				} else if (arg1 == 14) {
					local21 = arg0.method5203();
					this.anIntArrayArray32 = new int[local21][2];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArrayArray32[local28][0] = arg0.method5203();
						this.anIntArrayArray32[local28][1] = arg0.method5203();
					}
				} else if (arg1 == 15) {
					arg0.method5211();
				} else if (arg1 == 17) {
					this.anInt7155 = arg0.method5211();
				} else if (arg1 == 18) {
					local21 = arg0.method5203();
					this.anIntArray339 = new int[local21];
					this.anIntArray346 = new int[local21];
					this.aStringArray40 = new String[local21];
					this.anIntArray340 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray340[local28] = arg0.method5172();
						this.anIntArray339[local28] = arg0.method5172();
						this.anIntArray346[local28] = arg0.method5172();
						this.aStringArray40[local28] = arg0.method5178();
					}
				} else if (arg1 == 19) {
					local21 = arg0.method5203();
					this.anIntArray342 = new int[local21];
					this.anIntArray344 = new int[local21];
					this.anIntArray343 = new int[local21];
					this.aStringArray41 = new String[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray344[local28] = arg0.method5172();
						this.anIntArray342[local28] = arg0.method5172();
						this.anIntArray343[local28] = arg0.method5172();
						this.aStringArray41[local28] = arg0.method5178();
					}
				} else if (arg1 == 249) {
					local21 = arg0.method5203();
					if (this.aClass335_24 == null) {
						local28 = Static432.method7064(local21);
						this.aClass335_24 = new Class335(local28);
					}
					for (local28 = 0; local28 < local21; local28++) {
						@Pc(199) boolean local199 = arg0.method5203() == 1;
						@Pc(205) int local205 = arg0.method5161();
						@Pc(214) Class2 local214;
						if (local199) {
							local214 = new Class2_Sub19(arg0.method5178());
						} else {
							local214 = new Class2_Sub14(arg0.method5172());
						}
						this.aClass335_24.method8356(local214, (long) local205);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public void method6407() {
		if (this.aString88 == null) {
			this.aString88 = this.aString87;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ol;Z)V")
	public void method6408(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5203();
			if (local7 == 0) {
				return;
			}
			this.method6403(arg0, local7);
		}
	}
}
