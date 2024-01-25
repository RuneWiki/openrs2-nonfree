import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class186 {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Ljava/lang/String;")
	private String aString113;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
	private int[] anIntArray301;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "Ljava/lang/String;")
	private String aString114;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "Lclient!mo;")
	private Class221 aClass221_18;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
	public int anInt5803 = -1;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public void method4479() {
		if (this.aString114 == null) {
			this.aString114 = this.aString113;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!ek;)V")
	public void method4480(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method7004();
			if (local18 == 0) {
				return;
			}
			this.method4482(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!ek;B)V")
	private void method4482(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.aString113 = arg1.method7006();
		} else if (arg0 == 2) {
			this.aString114 = arg1.method7006();
		} else {
			@Pc(41) int local41;
			@Pc(48) int local48;
			if (arg0 == 3) {
				local41 = arg1.method7004();
				this.anIntArrayArray28 = new int[local41][3];
				for (local48 = 0; local48 < local41; local48++) {
					this.anIntArrayArray28[local48][0] = arg1.method7054();
					this.anIntArrayArray28[local48][1] = arg1.method6990();
					this.anIntArrayArray28[local48][2] = arg1.method6990();
				}
			} else if (arg0 == 4) {
				local41 = arg1.method7004();
				this.anIntArrayArray27 = new int[local41][3];
				for (local48 = 0; local48 < local41; local48++) {
					this.anIntArrayArray27[local48][0] = arg1.method7054();
					this.anIntArrayArray27[local48][1] = arg1.method6990();
					this.anIntArrayArray27[local48][2] = arg1.method6990();
				}
			} else if (arg0 == 5) {
				arg1.method7054();
			} else if (arg0 == 6) {
				arg1.method7004();
			} else if (arg0 == 7) {
				arg1.method7004();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method7004();
					return;
				}
				if (arg0 != 10) {
					if (arg0 == 12) {
						arg1.method6990();
						return;
					}
					if (arg0 == 13) {
						local41 = arg1.method7004();
						this.anIntArray306 = new int[local41];
						for (local48 = 0; local48 < local41; local48++) {
							this.anIntArray306[local48] = arg1.method7054();
						}
						return;
					}
					if (arg0 != 14) {
						if (arg0 == 15) {
							arg1.method7054();
							return;
						}
						if (arg0 == 17) {
							this.anInt5803 = arg1.method7054();
							return;
						}
						if (arg0 == 18) {
							local41 = arg1.method7004();
							this.anIntArray307 = new int[local41];
							this.aStringArray21 = new String[local41];
							this.anIntArray304 = new int[local41];
							this.anIntArray302 = new int[local41];
							for (local48 = 0; local48 < local41; local48++) {
								this.anIntArray302[local48] = arg1.method6990();
								this.anIntArray307[local48] = arg1.method6990();
								this.anIntArray304[local48] = arg1.method6990();
								this.aStringArray21[local48] = arg1.method7016();
							}
							return;
						}
						if (arg0 == 19) {
							local41 = arg1.method7004();
							this.aStringArray20 = new String[local41];
							this.anIntArray308 = new int[local41];
							this.anIntArray301 = new int[local41];
							this.anIntArray305 = new int[local41];
							for (local48 = 0; local48 < local41; local48++) {
								this.anIntArray305[local48] = arg1.method6990();
								this.anIntArray301[local48] = arg1.method6990();
								this.anIntArray308[local48] = arg1.method6990();
								this.aStringArray20[local48] = arg1.method7016();
							}
						} else if (arg0 == 249) {
							local41 = arg1.method7004();
							if (this.aClass221_18 == null) {
								local48 = Static488.method7100(local41);
								this.aClass221_18 = new Class221(local48);
							}
							for (local48 = 0; local48 < local41; local48++) {
								@Pc(267) boolean local267 = arg1.method7004() == 1;
								@Pc(271) int local271 = arg1.method7013();
								@Pc(280) Class4 local280;
								if (local267) {
									local280 = new Class4_Sub11(arg1.method7016());
								} else {
									local280 = new Class4_Sub27(arg1.method6990());
								}
								this.aClass221_18.method5073(local280, (long) local271);
							}
							return;
						}
						return;
					}
					local41 = arg1.method7004();
					this.anIntArrayArray29 = new int[local41][2];
					for (local48 = 0; local48 < local41; local48++) {
						this.anIntArrayArray29[local48][0] = arg1.method7004();
						this.anIntArrayArray29[local48][1] = arg1.method7004();
					}
					return;
				}
				local41 = arg1.method7004();
				this.anIntArray303 = new int[local41];
				for (local48 = 0; local48 < local41; local48++) {
					this.anIntArray303[local48] = arg1.method6990();
				}
				return;
			}
		}
	}
}
