import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class65 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "Ljava/lang/String;")
	private String aString51;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Ljava/lang/String;")
	private String aString52;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Lclient!uc;")
	private Class198 aClass198_11;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public int anInt1657 = -1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public void method1389() {
		if (this.aString52 == null) {
			this.aString52 = this.aString51;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!tq;)V")
	private void method1390(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 1) {
			this.aString51 = arg1.method2391();
		} else if (arg0 == 2) {
			this.aString52 = arg1.method2391();
		} else {
			@Pc(36) int local36;
			@Pc(43) int local43;
			if (arg0 == 3) {
				local36 = arg1.method2380();
				this.anIntArrayArray21 = new int[local36][3];
				for (local43 = 0; local43 < local36; local43++) {
					this.anIntArrayArray21[local43][0] = arg1.method2404();
					this.anIntArrayArray21[local43][1] = arg1.method2389();
					this.anIntArrayArray21[local43][2] = arg1.method2389();
				}
			} else if (arg0 == 4) {
				local36 = arg1.method2380();
				this.anIntArrayArray19 = new int[local36][3];
				for (local43 = 0; local43 < local36; local43++) {
					this.anIntArrayArray19[local43][0] = arg1.method2404();
					this.anIntArrayArray19[local43][1] = arg1.method2389();
					this.anIntArrayArray19[local43][2] = arg1.method2389();
				}
			} else if (arg0 == 5) {
				arg1.method2404();
			} else if (arg0 == 6) {
				arg1.method2380();
			} else if (arg0 == 7) {
				arg1.method2380();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method2380();
					return;
				}
				if (arg0 == 10) {
					local36 = arg1.method2380();
					this.anIntArray162 = new int[local36];
					for (local43 = 0; local43 < local36; local43++) {
						this.anIntArray162[local43] = arg1.method2389();
					}
					return;
				}
				if (arg0 == 12) {
					arg1.method2389();
					return;
				}
				if (arg0 != 13) {
					if (arg0 == 14) {
						local36 = arg1.method2380();
						this.anIntArrayArray20 = new int[local36][2];
						for (local43 = 0; local43 < local36; local43++) {
							this.anIntArrayArray20[local43][0] = arg1.method2380();
							this.anIntArrayArray20[local43][1] = arg1.method2380();
						}
						return;
					}
					if (arg0 == 15) {
						arg1.method2404();
						return;
					}
					if (arg0 == 17) {
						this.anInt1657 = arg1.method2404();
						return;
					}
					if (arg0 != 18) {
						if (arg0 == 19) {
							local36 = arg1.method2380();
							this.anIntArray167 = new int[local36];
							this.anIntArray168 = new int[local36];
							this.anIntArray166 = new int[local36];
							this.aStringArray12 = new String[local36];
							for (local43 = 0; local43 < local36; local43++) {
								this.anIntArray168[local43] = arg1.method2389();
								this.anIntArray166[local43] = arg1.method2389();
								this.anIntArray167[local43] = arg1.method2389();
								this.aStringArray12[local43] = arg1.method2379();
							}
						} else if (arg0 == 249) {
							local36 = arg1.method2380();
							if (this.aClass198_11 == null) {
								local43 = Static338.method4468(local36);
								this.aClass198_11 = new Class198(local43);
							}
							for (local43 = 0; local43 < local36; local43++) {
								@Pc(307) boolean local307 = arg1.method2380() == 1;
								@Pc(311) int local311 = arg1.method2402();
								@Pc(320) Class4 local320;
								if (local307) {
									local320 = new Class4_Sub30(arg1.method2379());
								} else {
									local320 = new Class4_Sub36(arg1.method2389());
								}
								this.aClass198_11.method5267((long) local311, local320);
							}
							return;
						}
						return;
					}
					local36 = arg1.method2380();
					this.anIntArray169 = new int[local36];
					this.anIntArray163 = new int[local36];
					this.anIntArray165 = new int[local36];
					this.aStringArray13 = new String[local36];
					for (local43 = 0; local43 < local36; local43++) {
						this.anIntArray169[local43] = arg1.method2389();
						this.anIntArray163[local43] = arg1.method2389();
						this.anIntArray165[local43] = arg1.method2389();
						this.aStringArray13[local43] = arg1.method2379();
					}
					return;
				}
				local36 = arg1.method2380();
				this.anIntArray164 = new int[local36];
				for (local43 = 0; local43 < local36; local43++) {
					this.anIntArray164[local43] = arg1.method2404();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!tq;)V")
	public void method1391(@OriginalArg(1) Class4_Sub7 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method2380();
			if (local8 == 0) {
				return;
			}
			this.method1390(local8, arg0);
		}
	}
}
