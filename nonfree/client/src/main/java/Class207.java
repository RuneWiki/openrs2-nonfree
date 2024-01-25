import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class207 {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Lclient!gn;")
	private Class136 aClass136_27;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Ljava/lang/String;")
	private String aString92;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "Ljava/lang/String;")
	private String aString93;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
	public int anInt5849 = -1;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	public void method4986() {
		if (this.aString92 == null) {
			this.aString92 = this.aString93;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!rba;II)V")
	private void method4987(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString93 = arg0.method5269();
		} else if (arg1 == 2) {
			this.aString92 = arg0.method5269();
		} else {
			@Pc(86) int local86;
			@Pc(92) int local92;
			if (arg1 == 3) {
				local86 = arg0.method5322(-56);
				this.anIntArrayArray29 = new int[local86][3];
				for (local92 = 0; local92 < local86; local92++) {
					this.anIntArrayArray29[local92][0] = arg0.method5272();
					this.anIntArrayArray29[local92][1] = arg0.method5312();
					this.anIntArrayArray29[local92][2] = arg0.method5312();
				}
			} else if (arg1 == 4) {
				local86 = arg0.method5322(-40);
				this.anIntArrayArray30 = new int[local86][3];
				for (local92 = 0; local92 < local86; local92++) {
					this.anIntArrayArray30[local92][0] = arg0.method5272();
					this.anIntArrayArray30[local92][1] = arg0.method5312();
					this.anIntArrayArray30[local92][2] = arg0.method5312();
				}
			} else if (arg1 == 5) {
				arg0.method5272();
			} else if (arg1 == 6) {
				arg0.method5322(-20);
				return;
			} else if (arg1 == 7) {
				arg0.method5322(-57);
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5322(-7);
					return;
				}
				if (arg1 == 10) {
					local86 = arg0.method5322(-115);
					this.anIntArray327 = new int[local86];
					for (local92 = 0; local92 < local86; local92++) {
						this.anIntArray327[local92] = arg0.method5312();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method5312();
					return;
				}
				if (arg1 != 13) {
					if (arg1 == 14) {
						local86 = arg0.method5322(-86);
						this.anIntArrayArray31 = new int[local86][2];
						for (local92 = 0; local92 < local86; local92++) {
							this.anIntArrayArray31[local92][0] = arg0.method5322(-34);
							this.anIntArrayArray31[local92][1] = arg0.method5322(-116);
						}
						return;
					}
					if (arg1 == 15) {
						arg0.method5272();
						return;
					}
					if (arg1 == 17) {
						this.anInt5849 = arg0.method5272();
					} else if (arg1 == 18) {
						local86 = arg0.method5322(-109);
						this.anIntArray328 = new int[local86];
						this.anIntArray325 = new int[local86];
						this.anIntArray324 = new int[local86];
						this.aStringArray20 = new String[local86];
						for (local92 = 0; local92 < local86; local92++) {
							this.anIntArray328[local92] = arg0.method5312();
							this.anIntArray325[local92] = arg0.method5312();
							this.anIntArray324[local92] = arg0.method5312();
							this.aStringArray20[local92] = arg0.method5295();
						}
						return;
					} else if (arg1 == 19) {
						local86 = arg0.method5322(-76);
						this.aStringArray21 = new String[local86];
						this.anIntArray326 = new int[local86];
						this.anIntArray332 = new int[local86];
						this.anIntArray323 = new int[local86];
						for (local92 = 0; local92 < local86; local92++) {
							this.anIntArray332[local92] = arg0.method5312();
							this.anIntArray326[local92] = arg0.method5312();
							this.anIntArray323[local92] = arg0.method5312();
							this.aStringArray21[local92] = arg0.method5295();
						}
						return;
					} else if (arg1 == 249) {
						local86 = arg0.method5322(-68);
						if (this.aClass136_27 == null) {
							local92 = Static60.method735(local86);
							this.aClass136_27 = new Class136(local92);
						}
						for (local92 = 0; local92 < local86; local92++) {
							@Pc(377) boolean local377 = arg0.method5322(-61) == 1;
							@Pc(381) int local381 = arg0.method5307();
							@Pc(390) Class3 local390;
							if (local377) {
								local390 = new Class3_Sub30(arg0.method5295());
							} else {
								local390 = new Class3_Sub42(arg0.method5312());
							}
							this.aClass136_27.method3508((long) local381, local390);
						}
						return;
					}
					return;
				}
				local86 = arg0.method5322(-32);
				this.anIntArray329 = new int[local86];
				for (local92 = 0; local92 < local86; local92++) {
					this.anIntArray329[local92] = arg0.method5272();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLclient!rba;)V")
	public void method4989(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5322(-35);
			if (local16 == 0) {
				return;
			}
			this.method4987(arg0, local16);
		}
	}
}
