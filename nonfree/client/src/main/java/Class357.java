import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class357 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray34;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
	private int[] anIntArray853;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Ljava/lang/String;")
	private String aString115;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Ljava/lang/String;")
	private String aString116;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "[I")
	private int[] anIntArray854;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "[I")
	private int[] anIntArray855;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray35;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "[I")
	private int[] anIntArray856;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
	private int[] anIntArray857;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "[I")
	private int[] anIntArray858;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "[I")
	private int[] anIntArray859;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Lclient!ee;")
	private Class83 aClass83_44;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "[I")
	private int[] anIntArray860;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public int anInt9957 = -1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLclient!jp;)V")
	private void method8756(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.aString116 = arg1.method8584();
		} else if (arg0 == 2) {
			this.aString115 = arg1.method8584();
		} else {
			@Pc(69) int local69;
			@Pc(75) int local75;
			if (arg0 == 3) {
				local69 = arg1.method8632();
				this.anIntArrayArray60 = new int[local69][3];
				for (local75 = 0; local75 < local69; local75++) {
					this.anIntArrayArray60[local75][0] = arg1.method8593();
					this.anIntArrayArray60[local75][1] = arg1.method8618();
					this.anIntArrayArray60[local75][2] = arg1.method8618();
				}
			} else if (arg0 == 4) {
				local69 = arg1.method8632();
				this.anIntArrayArray59 = new int[local69][3];
				for (local75 = 0; local75 < local69; local75++) {
					this.anIntArrayArray59[local75][0] = arg1.method8593();
					this.anIntArrayArray59[local75][1] = arg1.method8618();
					this.anIntArrayArray59[local75][2] = arg1.method8618();
				}
			} else if (arg0 == 5) {
				arg1.method8593();
			} else if (arg0 == 6) {
				arg1.method8632();
			} else if (arg0 == 7) {
				arg1.method8632();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method8632();
				} else if (arg0 == 10) {
					local69 = arg1.method8632();
					this.anIntArray853 = new int[local69];
					for (local75 = 0; local75 < local69; local75++) {
						this.anIntArray853[local75] = arg1.method8618();
					}
				} else if (arg0 == 12) {
					arg1.method8618();
				} else if (arg0 == 13) {
					local69 = arg1.method8632();
					this.anIntArray859 = new int[local69];
					for (local75 = 0; local75 < local69; local75++) {
						this.anIntArray859[local75] = arg1.method8593();
					}
				} else if (arg0 == 14) {
					local69 = arg1.method8632();
					this.anIntArrayArray61 = new int[local69][2];
					for (local75 = 0; local75 < local69; local75++) {
						this.anIntArrayArray61[local75][0] = arg1.method8632();
						this.anIntArrayArray61[local75][1] = arg1.method8632();
					}
				} else if (arg0 == 15) {
					arg1.method8593();
				} else if (arg0 == 17) {
					this.anInt9957 = arg1.method8593();
				} else if (arg0 == 18) {
					local69 = arg1.method8632();
					this.anIntArray858 = new int[local69];
					this.anIntArray857 = new int[local69];
					this.aStringArray34 = new String[local69];
					this.anIntArray860 = new int[local69];
					for (local75 = 0; local75 < local69; local75++) {
						this.anIntArray857[local75] = arg1.method8618();
						this.anIntArray858[local75] = arg1.method8618();
						this.anIntArray860[local75] = arg1.method8618();
						this.aStringArray34[local75] = arg1.method8613();
					}
				} else if (arg0 == 19) {
					local69 = arg1.method8632();
					this.anIntArray856 = new int[local69];
					this.aStringArray35 = new String[local69];
					this.anIntArray855 = new int[local69];
					this.anIntArray854 = new int[local69];
					for (local75 = 0; local75 < local69; local75++) {
						this.anIntArray856[local75] = arg1.method8618();
						this.anIntArray855[local75] = arg1.method8618();
						this.anIntArray854[local75] = arg1.method8618();
						this.aStringArray35[local75] = arg1.method8613();
					}
				} else if (arg0 == 249) {
					local69 = arg1.method8632();
					if (this.aClass83_44 == null) {
						local75 = Static282.method4521(local69);
						this.aClass83_44 = new Class83(local75);
					}
					for (local75 = 0; local75 < local69; local75++) {
						@Pc(167) boolean local167 = arg1.method8632() == 1;
						@Pc(171) int local171 = arg1.method8607();
						@Pc(180) Class3 local180;
						if (local167) {
							local180 = new Class3_Sub49(arg1.method8613());
						} else {
							local180 = new Class3_Sub33(arg1.method8618());
						}
						this.aClass83_44.method2377((long) local171, local180);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!jp;Z)V")
	public void method8757(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8632();
			if (local9 == 0) {
				return;
			}
			this.method8756(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public void method8758() {
		if (this.aString115 == null) {
			this.aString115 = this.aString116;
		}
	}
}
