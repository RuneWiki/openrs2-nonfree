import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class201 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!wb;")
	private Class243 aClass243_25;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "[I")
	private int[] anIntArray479;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "[I")
	private int[] anIntArray481;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "[I")
	private int[] anIntArray482;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray34;

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	public int anInt5608 = -1;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public void method4923() {
		if (this.aString54 == null) {
			this.aString54 = this.aString55;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!vt;)V")
	private void method4925(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 1) {
			this.aString55 = arg1.method5757();
		} else if (arg0 == 2) {
			this.aString54 = arg1.method5757();
		} else {
			@Pc(65) int local65;
			@Pc(71) int local71;
			if (arg0 == 3) {
				local65 = arg1.method5732();
				this.anIntArrayArray43 = new int[local65][3];
				for (local71 = 0; local71 < local65; local71++) {
					this.anIntArrayArray43[local71][0] = arg1.method5753();
					this.anIntArrayArray43[local71][1] = arg1.method5776();
					this.anIntArrayArray43[local71][2] = arg1.method5776();
				}
			} else if (arg0 == 4) {
				local65 = arg1.method5732();
				this.anIntArrayArray42 = new int[local65][3];
				for (local71 = 0; local71 < local65; local71++) {
					this.anIntArrayArray42[local71][0] = arg1.method5753();
					this.anIntArrayArray42[local71][1] = arg1.method5776();
					this.anIntArrayArray42[local71][2] = arg1.method5776();
				}
			} else if (arg0 == 5) {
				arg1.method5753();
			} else if (arg0 == 6) {
				arg1.method5732();
			} else if (arg0 == 7) {
				arg1.method5732();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5732();
					return;
				}
				if (arg0 == 10) {
					local65 = arg1.method5732();
					this.anIntArray481 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray481[local71] = arg1.method5776();
					}
					return;
				}
				if (arg0 == 12) {
					arg1.method5776();
					return;
				}
				if (arg0 != 13) {
					if (arg0 != 14) {
						if (arg0 == 15) {
							arg1.method5753();
						} else if (arg0 == 17) {
							this.anInt5608 = arg1.method5753();
							return;
						} else if (arg0 == 18) {
							local65 = arg1.method5732();
							this.aStringArray33 = new String[local65];
							this.anIntArray483 = new int[local65];
							this.anIntArray482 = new int[local65];
							this.anIntArray479 = new int[local65];
							for (local71 = 0; local71 < local65; local71++) {
								this.anIntArray482[local71] = arg1.method5776();
								this.anIntArray483[local71] = arg1.method5776();
								this.anIntArray479[local71] = arg1.method5776();
								this.aStringArray33[local71] = arg1.method5744();
							}
							return;
						} else if (arg0 == 19) {
							local65 = arg1.method5732();
							this.anIntArray480 = new int[local65];
							this.anIntArray477 = new int[local65];
							this.anIntArray478 = new int[local65];
							this.aStringArray34 = new String[local65];
							for (local71 = 0; local71 < local65; local71++) {
								this.anIntArray480[local71] = arg1.method5776();
								this.anIntArray478[local71] = arg1.method5776();
								this.anIntArray477[local71] = arg1.method5776();
								this.aStringArray34[local71] = arg1.method5744();
							}
							return;
						} else if (arg0 == 249) {
							local65 = arg1.method5732();
							if (this.aClass243_25 == null) {
								local71 = Static279.method4638(local65);
								this.aClass243_25 = new Class243(local71);
							}
							for (local71 = 0; local71 < local65; local71++) {
								@Pc(273) boolean local273 = arg1.method5732() == 1;
								@Pc(277) int local277 = arg1.method5736();
								@Pc(286) Class2 local286;
								if (local273) {
									local286 = new Class2_Sub31(arg1.method5744());
								} else {
									local286 = new Class2_Sub16(arg1.method5776());
								}
								this.aClass243_25.method5968((long) local277, local286);
							}
							return;
						}
						return;
					}
					local65 = arg1.method5732();
					this.anIntArrayArray44 = new int[local65][2];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArrayArray44[local71][0] = arg1.method5732();
						this.anIntArrayArray44[local71][1] = arg1.method5732();
					}
					return;
				}
				local65 = arg1.method5732();
				this.anIntArray475 = new int[local65];
				for (local71 = 0; local71 < local65; local71++) {
					this.anIntArray475[local71] = arg1.method5753();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!vt;I)V")
	public void method4926(@OriginalArg(0) Class2_Sub24 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5732();
			if (local17 == 0) {
				return;
			}
			this.method4925(local17, arg0);
		}
	}
}
