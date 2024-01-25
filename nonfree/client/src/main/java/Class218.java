import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class218 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "Ljava/lang/String;")
	private String aString73;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray35;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "[I")
	private int[] anIntArray491;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "[I")
	private int[] anIntArray492;

	@OriginalMember(owner = "client!si", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36;

	@OriginalMember(owner = "client!si", name = "y", descriptor = "Lclient!cv;")
	private Class51 aClass51_26;

	@OriginalMember(owner = "client!si", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "I")
	public int anInt6600 = -1;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ti;)V")
	public void method5158(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4548();
			if (local5 == 0) {
				return;
			}
			this.method5161(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public void method5160() {
		if (this.aString74 == null) {
			this.aString74 = this.aString73;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ti;I)V")
	private void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aString73 = arg1.method4492();
		} else if (arg0 == 2) {
			this.aString74 = arg1.method4492();
		} else {
			@Pc(36) int local36;
			@Pc(43) int local43;
			if (arg0 == 3) {
				local36 = arg1.method4548();
				this.anIntArrayArray48 = new int[local36][3];
				for (local43 = 0; local43 < local36; local43++) {
					this.anIntArrayArray48[local43][0] = arg1.method4498();
					this.anIntArrayArray48[local43][1] = arg1.method4500();
					this.anIntArrayArray48[local43][2] = arg1.method4500();
				}
			} else if (arg0 == 4) {
				local36 = arg1.method4548();
				this.anIntArrayArray50 = new int[local36][3];
				for (local43 = 0; local43 < local36; local43++) {
					this.anIntArrayArray50[local43][0] = arg1.method4498();
					this.anIntArrayArray50[local43][1] = arg1.method4500();
					this.anIntArrayArray50[local43][2] = arg1.method4500();
				}
			} else if (arg0 == 5) {
				arg1.method4498();
			} else if (arg0 == 6) {
				arg1.method4548();
			} else if (arg0 == 7) {
				arg1.method4548();
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method4548();
					return;
				}
				if (arg0 == 10) {
					local36 = arg1.method4548();
					this.anIntArray492 = new int[local36];
					for (local43 = 0; local43 < local36; local43++) {
						this.anIntArray492[local43] = arg1.method4500();
					}
					return;
				}
				if (arg0 == 12) {
					arg1.method4500();
					return;
				}
				if (arg0 != 13) {
					if (arg0 == 14) {
						local36 = arg1.method4548();
						this.anIntArrayArray49 = new int[local36][2];
						for (local43 = 0; local43 < local36; local43++) {
							this.anIntArrayArray49[local43][0] = arg1.method4548();
							this.anIntArrayArray49[local43][1] = arg1.method4548();
						}
						return;
					}
					if (arg0 != 15) {
						if (arg0 == 17) {
							this.anInt6600 = arg1.method4498();
							return;
						}
						if (arg0 == 18) {
							local36 = arg1.method4548();
							this.anIntArray487 = new int[local36];
							this.anIntArray490 = new int[local36];
							this.anIntArray488 = new int[local36];
							this.aStringArray35 = new String[local36];
							for (local43 = 0; local43 < local36; local43++) {
								this.anIntArray487[local43] = arg1.method4500();
								this.anIntArray490[local43] = arg1.method4500();
								this.anIntArray488[local43] = arg1.method4500();
								this.aStringArray35[local43] = arg1.method4509();
							}
							return;
						}
						if (arg0 == 19) {
							local36 = arg1.method4548();
							this.anIntArray491 = new int[local36];
							this.anIntArray485 = new int[local36];
							this.aStringArray36 = new String[local36];
							this.anIntArray486 = new int[local36];
							for (local43 = 0; local43 < local36; local43++) {
								this.anIntArray486[local43] = arg1.method4500();
								this.anIntArray491[local43] = arg1.method4500();
								this.anIntArray485[local43] = arg1.method4500();
								this.aStringArray36[local43] = arg1.method4509();
							}
						} else if (arg0 == 249) {
							local36 = arg1.method4548();
							if (this.aClass51_26 == null) {
								local43 = Static30.method427(local36);
								this.aClass51_26 = new Class51(local43);
							}
							for (local43 = 0; local43 < local36; local43++) {
								@Pc(302) boolean local302 = arg1.method4548() == 1;
								@Pc(306) int local306 = arg1.method4496();
								@Pc(317) Class1 local317;
								if (local302) {
									local317 = new Class1_Sub18(arg1.method4509());
								} else {
									local317 = new Class1_Sub37(arg1.method4500());
								}
								this.aClass51_26.method931(local317, (long) local306);
							}
							return;
						}
						return;
					}
					arg1.method4498();
					return;
				}
				local36 = arg1.method4548();
				this.anIntArray489 = new int[local36];
				for (local43 = 0; local43 < local36; local43++) {
					this.anIntArray489[local43] = arg1.method4498();
				}
				return;
			}
		}
	}
}
