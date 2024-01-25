import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class259 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray50;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "Lclient!dea;")
	private Class68 aClass68_61;

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "Ljava/lang/String;")
	private String aString87;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "[I")
	private int[] anIntArray555;

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "[I")
	private int[] anIntArray556;

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray51;

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "[I")
	private int[] anIntArray557;

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "[I")
	private int[] anIntArray559;

	@OriginalMember(owner = "client!qu", name = "s", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "client!qu", name = "t", descriptor = "[I")
	private int[] anIntArray560;

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!qu", name = "v", descriptor = "[I")
	private int[] anIntArray561;

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
	public int anInt7726 = -1;

	static {
		new Class88("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!daa;I)V")
	private void method6433(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.aString88 = arg1.method5169();
		} else if (arg0 == 2) {
			this.aString87 = arg1.method5169();
		} else {
			@Pc(30) int local30;
			@Pc(37) int local37;
			if (arg0 == 3) {
				local30 = arg1.method5216();
				this.anIntArrayArray72 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray72[local37][0] = arg1.method5199();
					this.anIntArrayArray72[local37][1] = arg1.method5225();
					this.anIntArrayArray72[local37][2] = arg1.method5225();
				}
			} else if (arg0 == 4) {
				local30 = arg1.method5216();
				this.anIntArrayArray74 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray74[local37][0] = arg1.method5199();
					this.anIntArrayArray74[local37][1] = arg1.method5225();
					this.anIntArrayArray74[local37][2] = arg1.method5225();
				}
			} else if (arg0 == 5) {
				arg1.method5199();
			} else if (arg0 == 6) {
				arg1.method5216();
			} else if (arg0 == 7) {
				arg1.method5216();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5216();
				} else if (arg0 == 10) {
					local30 = arg1.method5216();
					this.anIntArray557 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray557[local37] = arg1.method5225();
					}
				} else if (arg0 == 12) {
					arg1.method5225();
				} else if (arg0 == 13) {
					local30 = arg1.method5216();
					this.anIntArray559 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray559[local37] = arg1.method5199();
					}
				} else if (arg0 == 14) {
					local30 = arg1.method5216();
					this.anIntArrayArray73 = new int[local30][2];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArrayArray73[local37][0] = arg1.method5216();
						this.anIntArrayArray73[local37][1] = arg1.method5216();
					}
				} else if (arg0 == 15) {
					arg1.method5199();
				} else if (arg0 == 17) {
					this.anInt7726 = arg1.method5199();
				} else if (arg0 == 18) {
					local30 = arg1.method5216();
					this.anIntArray556 = new int[local30];
					this.anIntArray554 = new int[local30];
					this.aStringArray50 = new String[local30];
					this.anIntArray560 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray560[local37] = arg1.method5225();
						this.anIntArray556[local37] = arg1.method5225();
						this.anIntArray554[local37] = arg1.method5225();
						this.aStringArray50[local37] = arg1.method5206();
					}
				} else if (arg0 == 19) {
					local30 = arg1.method5216();
					this.anIntArray558 = new int[local30];
					this.anIntArray555 = new int[local30];
					this.anIntArray561 = new int[local30];
					this.aStringArray51 = new String[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray555[local37] = arg1.method5225();
						this.anIntArray561[local37] = arg1.method5225();
						this.anIntArray558[local37] = arg1.method5225();
						this.aStringArray51[local37] = arg1.method5206();
					}
				} else if (arg0 == 249) {
					local30 = arg1.method5216();
					if (this.aClass68_61 == null) {
						local37 = Static37.method6277(local30);
						this.aClass68_61 = new Class68(local37);
					}
					for (local37 = 0; local37 < local30; local37++) {
						@Pc(297) boolean local297 = arg1.method5216() == 1;
						@Pc(301) int local301 = arg1.method5195();
						@Pc(310) Class12 local310;
						if (local297) {
							local310 = new Class12_Sub16(arg1.method5206());
						} else {
							local310 = new Class12_Sub18(arg1.method5225());
						}
						this.aClass68_61.method1916(local310, (long) local301);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!daa;B)V")
	public void method6434(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5216();
			if (local9 == 0) {
				return;
			}
			this.method6433(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	public void method6435() {
		if (this.aString87 == null) {
			this.aString87 = this.aString88;
		}
	}
}
