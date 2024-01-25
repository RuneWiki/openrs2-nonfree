import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class69 {

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "Lclient!tga;")
	private Class335 aClass335_10;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	public int anInt1478 = -1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method1380(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3642();
			if (local16 == 0) {
				return;
			}
			this.method1382(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	public void method1381() {
		if (this.aString12 == null) {
			this.aString12 = this.aString11;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILclient!rv;)V")
	private void method1382(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aString11 = arg1.method3674();
		} else if (arg0 == 2) {
			this.aString12 = arg1.method3674();
		} else {
			@Pc(101) int local101;
			@Pc(119) int local119;
			if (arg0 == 3) {
				local101 = arg1.method3642();
				this.anIntArrayArray10 = new int[local101][3];
				for (local119 = 0; local119 < local101; local119++) {
					this.anIntArrayArray10[local119][0] = arg1.method3698();
					this.anIntArrayArray10[local119][1] = arg1.method3671();
					this.anIntArrayArray10[local119][2] = arg1.method3671();
				}
			} else if (arg0 == 4) {
				local101 = arg1.method3642();
				this.anIntArrayArray9 = new int[local101][3];
				for (local119 = 0; local119 < local101; local119++) {
					this.anIntArrayArray9[local119][0] = arg1.method3698();
					this.anIntArrayArray9[local119][1] = arg1.method3671();
					this.anIntArrayArray9[local119][2] = arg1.method3671();
				}
			} else if (arg0 == 5) {
				arg1.method3698();
			} else if (arg0 == 6) {
				arg1.method3642();
			} else if (arg0 == 7) {
				arg1.method3642();
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method3642();
					return;
				}
				if (arg0 != 10) {
					if (arg0 == 12) {
						arg1.method3671();
						return;
					}
					if (arg0 != 13) {
						if (arg0 != 14) {
							if (arg0 == 15) {
								arg1.method3698();
								return;
							}
							if (arg0 == 17) {
								this.anInt1478 = arg1.method3698();
							} else if (arg0 == 18) {
								local101 = arg1.method3642();
								this.anIntArray80 = new int[local101];
								this.anIntArray83 = new int[local101];
								this.aStringArray4 = new String[local101];
								this.anIntArray79 = new int[local101];
								for (local119 = 0; local119 < local101; local119++) {
									this.anIntArray83[local119] = arg1.method3671();
									this.anIntArray79[local119] = arg1.method3671();
									this.anIntArray80[local119] = arg1.method3671();
									this.aStringArray4[local119] = arg1.method3661();
								}
								return;
							} else if (arg0 == 19) {
								local101 = arg1.method3642();
								this.anIntArray81 = new int[local101];
								this.aStringArray3 = new String[local101];
								this.anIntArray78 = new int[local101];
								this.anIntArray84 = new int[local101];
								for (local119 = 0; local119 < local101; local119++) {
									this.anIntArray78[local119] = arg1.method3671();
									this.anIntArray81[local119] = arg1.method3671();
									this.anIntArray84[local119] = arg1.method3671();
									this.aStringArray3[local119] = arg1.method3661();
								}
								return;
							} else if (arg0 == 249) {
								local101 = arg1.method3642();
								if (this.aClass335_10 == null) {
									local119 = Static209.method2991(local101);
									this.aClass335_10 = new Class335(local119);
								}
								for (local119 = 0; local119 < local101; local119++) {
									@Pc(256) boolean local256 = arg1.method3642() == 1;
									@Pc(260) int local260 = arg1.method3633();
									@Pc(269) Class5 local269;
									if (local256) {
										local269 = new Class5_Sub44(arg1.method3661());
									} else {
										local269 = new Class5_Sub43(arg1.method3671());
									}
									this.aClass335_10.method7770((long) local260, local269);
								}
								return;
							}
							return;
						}
						local101 = arg1.method3642();
						this.anIntArrayArray8 = new int[local101][2];
						for (local119 = 0; local119 < local101; local119++) {
							this.anIntArrayArray8[local119][0] = arg1.method3642();
							this.anIntArrayArray8[local119][1] = arg1.method3642();
						}
						return;
					}
					local101 = arg1.method3642();
					this.anIntArray82 = new int[local101];
					for (local119 = 0; local119 < local101; local119++) {
						this.anIntArray82[local119] = arg1.method3698();
					}
					return;
				}
				local101 = arg1.method3642();
				this.anIntArray85 = new int[local101];
				for (local119 = 0; local119 < local101; local119++) {
					this.anIntArray85[local119] = arg1.method3671();
				}
				return;
			}
		}
	}
}
