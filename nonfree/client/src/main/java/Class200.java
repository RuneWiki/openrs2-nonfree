import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class200 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!dj;")
	private Class66 aClass66_23;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray23;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "[I")
	private int[] anIntArray393;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "[I")
	private int[] anIntArray394;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray24;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "[I")
	private int[] anIntArray395;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "[I")
	private int[] anIntArray398;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public int anInt5043 = -1;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!es;I)V")
	public void method4433(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8865();
			if (local17 == 0) {
				return;
			}
			this.method4436(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V")
	public void method4435() {
		if (this.aString54 == null) {
			this.aString54 = this.aString55;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILclient!es;)V")
	private void method4436(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aString55 = arg1.method8844();
		} else if (arg0 == 2) {
			this.aString54 = arg1.method8844();
		} else {
			@Pc(89) int local89;
			@Pc(95) int local95;
			if (arg0 == 3) {
				local89 = arg1.method8865();
				this.anIntArrayArray32 = new int[local89][3];
				for (local95 = 0; local95 < local89; local95++) {
					this.anIntArrayArray32[local95][0] = arg1.method8859();
					this.anIntArrayArray32[local95][1] = arg1.method8850();
					this.anIntArrayArray32[local95][2] = arg1.method8850();
				}
			} else if (arg0 == 4) {
				local89 = arg1.method8865();
				this.anIntArrayArray31 = new int[local89][3];
				for (local95 = 0; local95 < local89; local95++) {
					this.anIntArrayArray31[local95][0] = arg1.method8859();
					this.anIntArrayArray31[local95][1] = arg1.method8850();
					this.anIntArrayArray31[local95][2] = arg1.method8850();
				}
			} else if (arg0 == 5) {
				arg1.method8859();
			} else if (arg0 == 6) {
				arg1.method8865();
			} else if (arg0 == 7) {
				arg1.method8865();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method8865();
				} else if (arg0 == 10) {
					local89 = arg1.method8865();
					this.anIntArray393 = new int[local89];
					for (local95 = 0; local95 < local89; local95++) {
						this.anIntArray393[local95] = arg1.method8850();
					}
				} else if (arg0 == 12) {
					arg1.method8850();
				} else if (arg0 == 13) {
					local89 = arg1.method8865();
					this.anIntArray394 = new int[local89];
					for (local95 = 0; local95 < local89; local95++) {
						this.anIntArray394[local95] = arg1.method8859();
					}
				} else if (arg0 == 14) {
					local89 = arg1.method8865();
					this.anIntArrayArray33 = new int[local89][2];
					for (local95 = 0; local95 < local89; local95++) {
						this.anIntArrayArray33[local95][0] = arg1.method8865();
						this.anIntArrayArray33[local95][1] = arg1.method8865();
					}
				} else if (arg0 == 15) {
					arg1.method8859();
				} else if (arg0 == 17) {
					this.anInt5043 = arg1.method8859();
				} else if (arg0 == 18) {
					local89 = arg1.method8865();
					this.anIntArray396 = new int[local89];
					this.anIntArray392 = new int[local89];
					this.anIntArray398 = new int[local89];
					this.aStringArray24 = new String[local89];
					for (local95 = 0; local95 < local89; local95++) {
						this.anIntArray392[local95] = arg1.method8850();
						this.anIntArray396[local95] = arg1.method8850();
						this.anIntArray398[local95] = arg1.method8850();
						this.aStringArray24[local95] = arg1.method8853();
					}
				} else if (arg0 == 19) {
					local89 = arg1.method8865();
					this.anIntArray397 = new int[local89];
					this.anIntArray391 = new int[local89];
					this.anIntArray395 = new int[local89];
					this.aStringArray23 = new String[local89];
					for (local95 = 0; local95 < local89; local95++) {
						this.anIntArray397[local95] = arg1.method8850();
						this.anIntArray395[local95] = arg1.method8850();
						this.anIntArray391[local95] = arg1.method8850();
						this.aStringArray23[local95] = arg1.method8853();
					}
				} else if (arg0 == 249) {
					local89 = arg1.method8865();
					if (this.aClass66_23 == null) {
						local95 = Static162.method2593(local89);
						this.aClass66_23 = new Class66(local95);
					}
					for (local95 = 0; local95 < local89; local95++) {
						@Pc(267) boolean local267 = arg1.method8865() == 1;
						@Pc(271) int local271 = arg1.method8827();
						@Pc(280) Class4 local280;
						if (local267) {
							local280 = new Class4_Sub46(arg1.method8853());
						} else {
							local280 = new Class4_Sub24(arg1.method8850());
						}
						this.aClass66_23.method1985(local280, (long) local271);
					}
				}
			}
		}
	}
}
