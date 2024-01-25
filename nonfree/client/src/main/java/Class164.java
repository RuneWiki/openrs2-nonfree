import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class164 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Lclient!jw;")
	private Class183 aClass183_18;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
	public int anInt4682 = -1;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!eh;B)V")
	public void method3968(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6015();
			if (local5 == 0) {
				return;
			}
			this.method3969(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLclient!eh;I)V")
	private void method3969(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString55 = arg0.method5968();
		} else if (arg1 == 2) {
			this.aString54 = arg0.method5968();
		} else {
			@Pc(102) int local102;
			@Pc(120) int local120;
			if (arg1 == 3) {
				local102 = arg0.method6015();
				this.anIntArrayArray52 = new int[local102][3];
				for (local120 = 0; local120 < local102; local120++) {
					this.anIntArrayArray52[local120][0] = arg0.method5982();
					this.anIntArrayArray52[local120][1] = arg0.method6026();
					this.anIntArrayArray52[local120][2] = arg0.method6026();
				}
			} else if (arg1 == 4) {
				local102 = arg0.method6015();
				this.anIntArrayArray51 = new int[local102][3];
				for (local120 = 0; local120 < local102; local120++) {
					this.anIntArrayArray51[local120][0] = arg0.method5982();
					this.anIntArrayArray51[local120][1] = arg0.method6026();
					this.anIntArrayArray51[local120][2] = arg0.method6026();
				}
			} else if (arg1 == 5) {
				arg0.method5982();
			} else if (arg1 == 6) {
				arg0.method6015();
			} else if (arg1 == 7) {
				arg0.method6015();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method6015();
					return;
				}
				if (arg1 != 10) {
					if (arg1 == 12) {
						arg0.method6026();
						return;
					}
					if (arg1 != 13) {
						if (arg1 != 14) {
							if (arg1 == 15) {
								arg0.method5982();
							} else if (arg1 == 17) {
								this.anInt4682 = arg0.method5982();
								return;
							} else if (arg1 == 18) {
								local102 = arg0.method6015();
								this.anIntArray409 = new int[local102];
								this.anIntArray412 = new int[local102];
								this.anIntArray411 = new int[local102];
								this.aStringArray20 = new String[local102];
								for (local120 = 0; local120 < local102; local120++) {
									this.anIntArray411[local120] = arg0.method6026();
									this.anIntArray412[local120] = arg0.method6026();
									this.anIntArray409[local120] = arg0.method6026();
									this.aStringArray20[local120] = arg0.method6010();
								}
								return;
							} else if (arg1 == 19) {
								local102 = arg0.method6015();
								this.anIntArray410 = new int[local102];
								this.anIntArray416 = new int[local102];
								this.aStringArray19 = new String[local102];
								this.anIntArray413 = new int[local102];
								for (local120 = 0; local120 < local102; local120++) {
									this.anIntArray416[local120] = arg0.method6026();
									this.anIntArray410[local120] = arg0.method6026();
									this.anIntArray413[local120] = arg0.method6026();
									this.aStringArray19[local120] = arg0.method6010();
								}
								return;
							} else if (arg1 == 249) {
								local102 = arg0.method6015();
								if (this.aClass183_18 == null) {
									local120 = Static514.method7261(local102);
									this.aClass183_18 = new Class183(local120);
								}
								for (local120 = 0; local120 < local102; local120++) {
									@Pc(262) boolean local262 = arg0.method6015() == 1;
									@Pc(266) int local266 = arg0.method6023();
									@Pc(275) Class4 local275;
									if (local262) {
										local275 = new Class4_Sub46(arg0.method6010());
									} else {
										local275 = new Class4_Sub33(arg0.method6026());
									}
									this.aClass183_18.method4282((long) local266, local275);
								}
								return;
							}
							return;
						}
						local102 = arg0.method6015();
						this.anIntArrayArray50 = new int[local102][2];
						for (local120 = 0; local120 < local102; local120++) {
							this.anIntArrayArray50[local120][0] = arg0.method6015();
							this.anIntArrayArray50[local120][1] = arg0.method6015();
						}
						return;
					}
					local102 = arg0.method6015();
					this.anIntArray415 = new int[local102];
					for (local120 = 0; local120 < local102; local120++) {
						this.anIntArray415[local120] = arg0.method5982();
					}
					return;
				}
				local102 = arg0.method6015();
				this.anIntArray414 = new int[local102];
				for (local120 = 0; local120 < local102; local120++) {
					this.anIntArray414[local120] = arg0.method6026();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
	public void method3970() {
		if (this.aString54 == null) {
			this.aString54 = this.aString55;
		}
	}
}
