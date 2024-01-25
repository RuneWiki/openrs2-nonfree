import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class88 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Ljava/lang/String;")
	private String aString98;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray15;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Ljava/lang/String;")
	private String aString99;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray16;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!bo;")
	private Class24 aClass24_17;

	@OriginalMember(owner = "client!i", name = "w", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public int anInt2662 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!fb;IZ)V")
	private void method2168(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString99 = arg0.method3665();
		} else if (arg1 == 2) {
			this.aString98 = arg0.method3665();
		} else {
			@Pc(60) int local60;
			@Pc(66) int local66;
			if (arg1 == 3) {
				local60 = arg0.method3643();
				this.anIntArrayArray15 = new int[local60][3];
				for (local66 = 0; local66 < local60; local66++) {
					this.anIntArrayArray15[local66][0] = arg0.method3649();
					this.anIntArrayArray15[local66][1] = arg0.method3642();
					this.anIntArrayArray15[local66][2] = arg0.method3642();
				}
			} else if (arg1 == 4) {
				local60 = arg0.method3643();
				this.anIntArrayArray13 = new int[local60][3];
				for (local66 = 0; local66 < local60; local66++) {
					this.anIntArrayArray13[local66][0] = arg0.method3649();
					this.anIntArrayArray13[local66][1] = arg0.method3642();
					this.anIntArrayArray13[local66][2] = arg0.method3642();
				}
			} else if (arg1 == 5) {
				arg0.method3649();
			} else if (arg1 == 6) {
				arg0.method3643();
			} else if (arg1 == 7) {
				arg0.method3643();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method3643();
					return;
				}
				if (arg1 == 10) {
					local60 = arg0.method3643();
					this.anIntArray171 = new int[local60];
					for (local66 = 0; local66 < local60; local66++) {
						this.anIntArray171[local66] = arg0.method3642();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method3642();
					return;
				}
				if (arg1 == 13) {
					local60 = arg0.method3643();
					this.anIntArray174 = new int[local60];
					for (local66 = 0; local66 < local60; local66++) {
						this.anIntArray174[local66] = arg0.method3649();
					}
					return;
				}
				if (arg1 == 14) {
					local60 = arg0.method3643();
					this.anIntArrayArray14 = new int[local60][2];
					for (local66 = 0; local66 < local60; local66++) {
						this.anIntArrayArray14[local66][0] = arg0.method3643();
						this.anIntArrayArray14[local66][1] = arg0.method3643();
					}
					return;
				}
				if (arg1 == 15) {
					arg0.method3649();
					return;
				}
				if (arg1 == 17) {
					this.anInt2662 = arg0.method3649();
					return;
				}
				if (arg1 != 18) {
					if (arg1 == 19) {
						local60 = arg0.method3643();
						this.aStringArray16 = new String[local60];
						this.anIntArray176 = new int[local60];
						this.anIntArray175 = new int[local60];
						this.anIntArray170 = new int[local60];
						for (local66 = 0; local66 < local60; local66++) {
							this.anIntArray175[local66] = arg0.method3642();
							this.anIntArray176[local66] = arg0.method3642();
							this.anIntArray170[local66] = arg0.method3642();
							this.aStringArray16[local66] = arg0.method3671();
						}
					} else if (arg1 == 249) {
						local60 = arg0.method3643();
						if (this.aClass24_17 == null) {
							local66 = Static83.method1300(local60);
							this.aClass24_17 = new Class24(local66);
						}
						for (local66 = 0; local66 < local60; local66++) {
							@Pc(212) boolean local212 = arg0.method3643() == 1;
							@Pc(216) int local216 = arg0.method3659();
							@Pc(225) Class3 local225;
							if (local212) {
								local225 = new Class3_Sub24(arg0.method3671());
							} else {
								local225 = new Class3_Sub22(arg0.method3642());
							}
							this.aClass24_17.method598((long) local216, local225);
						}
						return;
					}
					return;
				}
				local60 = arg0.method3643();
				this.aStringArray15 = new String[local60];
				this.anIntArray172 = new int[local60];
				this.anIntArray173 = new int[local60];
				this.anIntArray177 = new int[local60];
				for (local66 = 0; local66 < local60; local66++) {
					this.anIntArray177[local66] = arg0.method3642();
					this.anIntArray173[local66] = arg0.method3642();
					this.anIntArray172[local66] = arg0.method3642();
					this.aStringArray15[local66] = arg0.method3671();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!fb;)V")
	public void method2170(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3643();
			if (local15 == 0) {
				return;
			}
			this.method2168(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public void method2173() {
		if (this.aString98 == null) {
			this.aString98 = this.aString99;
		}
	}
}
