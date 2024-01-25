import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class64 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!eq;")
	private Class99 aClass99_20;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	public int anInt2494 = -1;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public void method2327() {
		if (this.aString16 == null) {
			this.aString16 = this.aString17;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!cea;IB)V")
	private void method2329(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString17 = arg0.method8367();
		} else if (arg1 == 2) {
			this.aString16 = arg0.method8367();
		} else {
			@Pc(38) int local38;
			@Pc(45) int local45;
			if (arg1 == 3) {
				local38 = arg0.method8383();
				this.anIntArrayArray8 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray8[local45][0] = arg0.method8326();
					this.anIntArrayArray8[local45][1] = arg0.method8381();
					this.anIntArrayArray8[local45][2] = arg0.method8381();
				}
			} else if (arg1 == 4) {
				local38 = arg0.method8383();
				this.anIntArrayArray7 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray7[local45][0] = arg0.method8326();
					this.anIntArrayArray7[local45][1] = arg0.method8381();
					this.anIntArrayArray7[local45][2] = arg0.method8381();
				}
			} else if (arg1 == 5) {
				arg0.method8326();
			} else if (arg1 == 6) {
				arg0.method8383();
				return;
			} else if (arg1 == 7) {
				arg0.method8383();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method8383();
					return;
				}
				if (arg1 == 10) {
					local38 = arg0.method8383();
					this.anIntArray113 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray113[local45] = arg0.method8381();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method8381();
					return;
				}
				if (arg1 != 13) {
					if (arg1 == 14) {
						local38 = arg0.method8383();
						this.anIntArrayArray9 = new int[local38][2];
						for (local45 = 0; local45 < local38; local45++) {
							this.anIntArrayArray9[local45][0] = arg0.method8383();
							this.anIntArrayArray9[local45][1] = arg0.method8383();
						}
					} else if (arg1 == 15) {
						arg0.method8326();
						return;
					} else if (arg1 == 17) {
						this.anInt2494 = arg0.method8326();
						return;
					} else if (arg1 == 18) {
						local38 = arg0.method8383();
						this.anIntArray115 = new int[local38];
						this.aStringArray11 = new String[local38];
						this.anIntArray112 = new int[local38];
						this.anIntArray109 = new int[local38];
						for (local45 = 0; local45 < local38; local45++) {
							this.anIntArray115[local45] = arg0.method8381();
							this.anIntArray109[local45] = arg0.method8381();
							this.anIntArray112[local45] = arg0.method8381();
							this.aStringArray11[local45] = arg0.method8373();
						}
						return;
					} else if (arg1 == 19) {
						local38 = arg0.method8383();
						this.aStringArray12 = new String[local38];
						this.anIntArray110 = new int[local38];
						this.anIntArray114 = new int[local38];
						this.anIntArray108 = new int[local38];
						for (local45 = 0; local45 < local38; local45++) {
							this.anIntArray114[local45] = arg0.method8381();
							this.anIntArray108[local45] = arg0.method8381();
							this.anIntArray110[local45] = arg0.method8381();
							this.aStringArray12[local45] = arg0.method8373();
						}
						return;
					} else if (arg1 == 249) {
						local38 = arg0.method8383();
						if (this.aClass99_20 == null) {
							local45 = Static231.method4407(local38);
							this.aClass99_20 = new Class99(local45);
						}
						for (local45 = 0; local45 < local38; local45++) {
							@Pc(351) boolean local351 = arg0.method8383() == 1;
							@Pc(355) int local355 = arg0.method8347();
							@Pc(364) Class2 local364;
							if (local351) {
								local364 = new Class2_Sub12(arg0.method8373());
							} else {
								local364 = new Class2_Sub43(arg0.method8381());
							}
							this.aClass99_20.method3059((long) local355, local364);
						}
						return;
					}
					return;
				}
				local38 = arg0.method8383();
				this.anIntArray111 = new int[local38];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArray111[local45] = arg0.method8326();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!cea;)V")
	public void method2330(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8383();
			if (local17 == 0) {
				return;
			}
			this.method2329(arg0, local17);
		}
	}
}
