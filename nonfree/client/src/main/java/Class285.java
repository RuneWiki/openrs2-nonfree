import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class285 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "Ljava/lang/String;")
	private String aString191;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
	private int[] anIntArray655;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
	private int[] anIntArray657;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
	private int[] anIntArray658;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "[I")
	private int[] anIntArray659;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "[I")
	private int[] anIntArray660;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "[I")
	private int[] anIntArray661;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "Ljava/lang/String;")
	private String aString192;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "[I")
	private int[] anIntArray662;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "[I")
	private int[] anIntArray663;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "Lclient!ica;")
	private Class127 aClass127_43;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray80;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
	public int anInt8612 = -1;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public void method7224() {
		if (this.aString192 == null) {
			this.aString192 = this.aString191;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ps;B)V")
	public void method7226(@OriginalArg(0) Class2_Sub29 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5170();
			if (local11 == 0) {
				return;
			}
			this.method7227(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!ps;I)V")
	private void method7227(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString191 = arg0.method5176();
		} else if (arg1 == 2) {
			this.aString192 = arg0.method5176();
		} else {
			@Pc(28) int local28;
			@Pc(35) int local35;
			if (arg1 == 3) {
				local28 = arg0.method5170();
				this.anIntArrayArray78 = new int[local28][3];
				for (local35 = 0; local35 < local28; local35++) {
					this.anIntArrayArray78[local35][0] = arg0.method5229();
					this.anIntArrayArray78[local35][1] = arg0.method5198();
					this.anIntArrayArray78[local35][2] = arg0.method5198();
				}
			} else if (arg1 == 4) {
				local28 = arg0.method5170();
				this.anIntArrayArray80 = new int[local28][3];
				for (local35 = 0; local35 < local28; local35++) {
					this.anIntArrayArray80[local35][0] = arg0.method5229();
					this.anIntArrayArray80[local35][1] = arg0.method5198();
					this.anIntArrayArray80[local35][2] = arg0.method5198();
				}
			} else if (arg1 == 5) {
				arg0.method5229();
			} else if (arg1 == 6) {
				arg0.method5170();
			} else if (arg1 == 7) {
				arg0.method5170();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5170();
				} else if (arg1 == 10) {
					local28 = arg0.method5170();
					this.anIntArray661 = new int[local28];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArray661[local35] = arg0.method5198();
					}
				} else if (arg1 == 12) {
					arg0.method5198();
				} else if (arg1 == 13) {
					local28 = arg0.method5170();
					this.anIntArray658 = new int[local28];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArray658[local35] = arg0.method5229();
					}
				} else if (arg1 == 14) {
					local28 = arg0.method5170();
					this.anIntArrayArray79 = new int[local28][2];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArrayArray79[local35][0] = arg0.method5170();
						this.anIntArrayArray79[local35][1] = arg0.method5170();
					}
				} else if (arg1 == 15) {
					arg0.method5229();
				} else if (arg1 == 17) {
					this.anInt8612 = arg0.method5229();
				} else if (arg1 == 18) {
					local28 = arg0.method5170();
					this.aStringArray41 = new String[local28];
					this.anIntArray659 = new int[local28];
					this.anIntArray660 = new int[local28];
					this.anIntArray663 = new int[local28];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArray660[local35] = arg0.method5198();
						this.anIntArray659[local35] = arg0.method5198();
						this.anIntArray663[local35] = arg0.method5198();
						this.aStringArray41[local35] = arg0.method5194();
					}
				} else if (arg1 == 19) {
					local28 = arg0.method5170();
					this.aStringArray40 = new String[local28];
					this.anIntArray662 = new int[local28];
					this.anIntArray657 = new int[local28];
					this.anIntArray655 = new int[local28];
					for (local35 = 0; local35 < local28; local35++) {
						this.anIntArray657[local35] = arg0.method5198();
						this.anIntArray655[local35] = arg0.method5198();
						this.anIntArray662[local35] = arg0.method5198();
						this.aStringArray40[local35] = arg0.method5194();
					}
				} else if (arg1 == 249) {
					local28 = arg0.method5170();
					if (this.aClass127_43 == null) {
						local35 = Static131.method2413(local28);
						this.aClass127_43 = new Class127(local35);
					}
					for (local35 = 0; local35 < local28; local35++) {
						@Pc(257) boolean local257 = arg0.method5170() == 1;
						@Pc(261) int local261 = arg0.method5210();
						@Pc(272) Class2 local272;
						if (local257) {
							local272 = new Class2_Sub43(arg0.method5194());
						} else {
							local272 = new Class2_Sub32(arg0.method5198());
						}
						this.aClass127_43.method3213(local272, (long) local261);
					}
				}
			}
		}
	}
}
