import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class145 {

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!hca", name = "w", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!hca", name = "i", descriptor = "Ljava/lang/String;")
	private String aString33;

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!hca", name = "u", descriptor = "Lclient!qr;")
	private Class306 aClass306_15;

	@OriginalMember(owner = "client!hca", name = "y", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!hca", name = "v", descriptor = "Ljava/lang/String;")
	private String aString34;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
	public int anInt3696 = -1;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLclient!wq;)V")
	public void method3388(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7291();
			if (local15 == 0) {
				return;
			}
			this.method3391(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!wq;I)V")
	private void method3391(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString34 = arg0.method7275();
		} else if (arg1 == 2) {
			this.aString33 = arg0.method7275();
		} else {
			@Pc(78) int local78;
			@Pc(84) int local84;
			if (arg1 == 3) {
				local78 = arg0.method7291();
				this.anIntArrayArray27 = new int[local78][3];
				for (local84 = 0; local84 < local78; local84++) {
					this.anIntArrayArray27[local84][0] = arg0.method7333();
					this.anIntArrayArray27[local84][1] = arg0.method7268();
					this.anIntArrayArray27[local84][2] = arg0.method7268();
				}
			} else if (arg1 == 4) {
				local78 = arg0.method7291();
				this.anIntArrayArray28 = new int[local78][3];
				for (local84 = 0; local84 < local78; local84++) {
					this.anIntArrayArray28[local84][0] = arg0.method7333();
					this.anIntArrayArray28[local84][1] = arg0.method7268();
					this.anIntArrayArray28[local84][2] = arg0.method7268();
				}
			} else if (arg1 == 5) {
				arg0.method7333();
			} else if (arg1 == 6) {
				arg0.method7291();
			} else if (arg1 == 7) {
				arg0.method7291();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method7291();
					return;
				}
				if (arg1 == 10) {
					local78 = arg0.method7291();
					this.anIntArray180 = new int[local78];
					for (local84 = 0; local84 < local78; local84++) {
						this.anIntArray180[local84] = arg0.method7268();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method7268();
					return;
				}
				if (arg1 != 13) {
					if (arg1 != 14) {
						if (arg1 == 15) {
							arg0.method7333();
							return;
						}
						if (arg1 == 17) {
							this.anInt3696 = arg0.method7333();
							return;
						}
						if (arg1 != 18) {
							if (arg1 == 19) {
								local78 = arg0.method7291();
								this.anIntArray176 = new int[local78];
								this.anIntArray175 = new int[local78];
								this.anIntArray182 = new int[local78];
								this.aStringArray21 = new String[local78];
								for (local84 = 0; local84 < local78; local84++) {
									this.anIntArray176[local84] = arg0.method7268();
									this.anIntArray175[local84] = arg0.method7268();
									this.anIntArray182[local84] = arg0.method7268();
									this.aStringArray21[local84] = arg0.method7281();
								}
							} else if (arg1 == 249) {
								local78 = arg0.method7291();
								if (this.aClass306_15 == null) {
									local84 = Static146.method2737(local78);
									this.aClass306_15 = new Class306(local84);
								}
								for (local84 = 0; local84 < local78; local84++) {
									@Pc(190) boolean local190 = arg0.method7291() == 1;
									@Pc(194) int local194 = arg0.method7331();
									@Pc(203) Class5 local203;
									if (local190) {
										local203 = new Class5_Sub46(arg0.method7281());
									} else {
										local203 = new Class5_Sub43(arg0.method7268());
									}
									this.aClass306_15.method6944(local203, (long) local194, -12002);
								}
								return;
							}
							return;
						}
						local78 = arg0.method7291();
						this.aStringArray20 = new String[local78];
						this.anIntArray181 = new int[local78];
						this.anIntArray179 = new int[local78];
						this.anIntArray177 = new int[local78];
						for (local84 = 0; local84 < local78; local84++) {
							this.anIntArray181[local84] = arg0.method7268();
							this.anIntArray179[local84] = arg0.method7268();
							this.anIntArray177[local84] = arg0.method7268();
							this.aStringArray20[local84] = arg0.method7281();
						}
						return;
					}
					local78 = arg0.method7291();
					this.anIntArrayArray26 = new int[local78][2];
					for (local84 = 0; local84 < local78; local84++) {
						this.anIntArrayArray26[local84][0] = arg0.method7291();
						this.anIntArrayArray26[local84][1] = arg0.method7291();
					}
					return;
				}
				local78 = arg0.method7291();
				this.anIntArray178 = new int[local78];
				for (local84 = 0; local84 < local78; local84++) {
					this.anIntArray178[local84] = arg0.method7333();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
	public void method3392() {
		if (this.aString33 == null) {
			this.aString33 = this.aString34;
		}
	}
}
