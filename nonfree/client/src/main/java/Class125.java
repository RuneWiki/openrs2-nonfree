import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class125 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "Lclient!waa;")
	private Class350 aClass350_13;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	public int anInt3517 = -1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public void method3150() {
		if (this.aString30 == null) {
			this.aString30 = this.aString31;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!un;I)V")
	public void method3151(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4905();
			if (local15 == 0) {
				return;
			}
			this.method3152(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BILclient!un;)V")
	private void method3152(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.aString31 = arg1.method4933();
		} else if (arg0 == 2) {
			this.aString30 = arg1.method4933();
		} else {
			@Pc(31) int local31;
			@Pc(38) int local38;
			if (arg0 == 3) {
				local31 = arg1.method4905();
				this.anIntArrayArray23 = new int[local31][3];
				for (local38 = 0; local38 < local31; local38++) {
					this.anIntArrayArray23[local38][0] = arg1.method4936();
					this.anIntArrayArray23[local38][1] = arg1.method4931();
					this.anIntArrayArray23[local38][2] = arg1.method4931();
				}
			} else if (arg0 == 4) {
				local31 = arg1.method4905();
				this.anIntArrayArray24 = new int[local31][3];
				for (local38 = 0; local38 < local31; local38++) {
					this.anIntArrayArray24[local38][0] = arg1.method4936();
					this.anIntArrayArray24[local38][1] = arg1.method4931();
					this.anIntArrayArray24[local38][2] = arg1.method4931();
				}
			} else if (arg0 == 5) {
				arg1.method4936();
			} else if (arg0 == 6) {
				arg1.method4905();
			} else if (arg0 == 7) {
				arg1.method4905();
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method4905();
					return;
				}
				if (arg0 == 10) {
					local31 = arg1.method4905();
					this.anIntArray169 = new int[local31];
					for (local38 = 0; local38 < local31; local38++) {
						this.anIntArray169[local38] = arg1.method4931();
					}
					return;
				}
				if (arg0 == 12) {
					arg1.method4931();
					return;
				}
				if (arg0 != 13) {
					if (arg0 != 14) {
						if (arg0 != 15) {
							if (arg0 == 17) {
								this.anInt3517 = arg1.method4936();
								return;
							}
							if (arg0 == 18) {
								local31 = arg1.method4905();
								this.anIntArray171 = new int[local31];
								this.aStringArray19 = new String[local31];
								this.anIntArray168 = new int[local31];
								this.anIntArray167 = new int[local31];
								for (local38 = 0; local38 < local31; local38++) {
									this.anIntArray168[local38] = arg1.method4931();
									this.anIntArray171[local38] = arg1.method4931();
									this.anIntArray167[local38] = arg1.method4931();
									this.aStringArray19[local38] = arg1.method4920();
								}
							} else if (arg0 == 19) {
								local31 = arg1.method4905();
								this.anIntArray172 = new int[local31];
								this.aStringArray20 = new String[local31];
								this.anIntArray173 = new int[local31];
								this.anIntArray174 = new int[local31];
								for (local38 = 0; local38 < local31; local38++) {
									this.anIntArray173[local38] = arg1.method4931();
									this.anIntArray172[local38] = arg1.method4931();
									this.anIntArray174[local38] = arg1.method4931();
									this.aStringArray20[local38] = arg1.method4920();
								}
								return;
							} else if (arg0 == 249) {
								local31 = arg1.method4905();
								if (this.aClass350_13 == null) {
									local38 = Static341.method5553(local31);
									this.aClass350_13 = new Class350(local38);
								}
								for (local38 = 0; local38 < local31; local38++) {
									@Pc(262) boolean local262 = arg1.method4905() == 1;
									@Pc(266) int local266 = arg1.method4934();
									@Pc(275) Class4 local275;
									if (local262) {
										local275 = new Class4_Sub50(arg1.method4920());
									} else {
										local275 = new Class4_Sub38(arg1.method4931());
									}
									this.aClass350_13.method8199((long) local266, local275);
								}
								return;
							}
							return;
						}
						arg1.method4936();
						return;
					}
					local31 = arg1.method4905();
					this.anIntArrayArray25 = new int[local31][2];
					for (local38 = 0; local38 < local31; local38++) {
						this.anIntArrayArray25[local38][0] = arg1.method4905();
						this.anIntArrayArray25[local38][1] = arg1.method4905();
					}
					return;
				}
				local31 = arg1.method4905();
				this.anIntArray170 = new int[local31];
				for (local38 = 0; local38 < local31; local38++) {
					this.anIntArray170[local38] = arg1.method4936();
				}
				return;
			}
		}
	}
}
