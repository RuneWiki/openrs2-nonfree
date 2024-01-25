import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class61 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "Lclient!cja;")
	private Class62 aClass62_9;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
	public int anInt1755 = -1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!fca;B)V")
	public void method1677(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4888();
			if (local9 == 0) {
				return;
			}
			this.method1679(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	public void method1678() {
		if (this.aString17 == null) {
			this.aString17 = this.aString18;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!fca;II)V")
	private void method1679(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString18 = arg0.method4890();
		} else if (arg1 == 2) {
			this.aString17 = arg0.method4890();
		} else {
			@Pc(32) int local32;
			@Pc(39) int local39;
			if (arg1 == 3) {
				local32 = arg0.method4888();
				this.anIntArrayArray25 = new int[local32][3];
				for (local39 = 0; local39 < local32; local39++) {
					this.anIntArrayArray25[local39][0] = arg0.method4858();
					this.anIntArrayArray25[local39][1] = arg0.method4868();
					this.anIntArrayArray25[local39][2] = arg0.method4868();
				}
			} else if (arg1 == 4) {
				local32 = arg0.method4888();
				this.anIntArrayArray24 = new int[local32][3];
				for (local39 = 0; local39 < local32; local39++) {
					this.anIntArrayArray24[local39][0] = arg0.method4858();
					this.anIntArrayArray24[local39][1] = arg0.method4868();
					this.anIntArrayArray24[local39][2] = arg0.method4868();
				}
			} else if (arg1 == 5) {
				arg0.method4858();
			} else if (arg1 == 6) {
				arg0.method4888();
			} else if (arg1 == 7) {
				arg0.method4888();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4888();
					return;
				}
				if (arg1 == 10) {
					local32 = arg0.method4888();
					this.anIntArray113 = new int[local32];
					for (local39 = 0; local39 < local32; local39++) {
						this.anIntArray113[local39] = arg0.method4868();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method4868();
					return;
				}
				if (arg1 != 13) {
					if (arg1 == 14) {
						local32 = arg0.method4888();
						this.anIntArrayArray23 = new int[local32][2];
						for (local39 = 0; local39 < local32; local39++) {
							this.anIntArrayArray23[local39][0] = arg0.method4888();
							this.anIntArrayArray23[local39][1] = arg0.method4888();
						}
						return;
					}
					if (arg1 == 15) {
						arg0.method4858();
						return;
					}
					if (arg1 == 17) {
						this.anInt1755 = arg0.method4858();
						return;
					}
					if (arg1 == 18) {
						local32 = arg0.method4888();
						this.anIntArray114 = new int[local32];
						this.anIntArray120 = new int[local32];
						this.aStringArray13 = new String[local32];
						this.anIntArray117 = new int[local32];
						for (local39 = 0; local39 < local32; local39++) {
							this.anIntArray114[local39] = arg0.method4868();
							this.anIntArray117[local39] = arg0.method4868();
							this.anIntArray120[local39] = arg0.method4868();
							this.aStringArray13[local39] = arg0.method4847();
						}
						return;
					}
					if (arg1 == 19) {
						local32 = arg0.method4888();
						this.anIntArray115 = new int[local32];
						this.anIntArray119 = new int[local32];
						this.anIntArray116 = new int[local32];
						this.aStringArray14 = new String[local32];
						for (local39 = 0; local39 < local32; local39++) {
							this.anIntArray119[local39] = arg0.method4868();
							this.anIntArray115[local39] = arg0.method4868();
							this.anIntArray116[local39] = arg0.method4868();
							this.aStringArray14[local39] = arg0.method4847();
						}
					} else if (arg1 == 249) {
						local32 = arg0.method4888();
						if (this.aClass62_9 == null) {
							local39 = Static527.method7377(local32);
							this.aClass62_9 = new Class62(local39);
						}
						for (local39 = 0; local39 < local32; local39++) {
							@Pc(362) boolean local362 = arg0.method4888() == 1;
							@Pc(366) int local366 = arg0.method4862();
							@Pc(375) Class3 local375;
							if (local362) {
								local375 = new Class3_Sub40(arg0.method4847());
							} else {
								local375 = new Class3_Sub53(arg0.method4868());
							}
							this.aClass62_9.method1686((long) local366, local375);
						}
						return;
					}
					return;
				}
				local32 = arg0.method4888();
				this.anIntArray118 = new int[local32];
				for (local39 = 0; local39 < local32; local39++) {
					this.anIntArray118[local39] = arg0.method4858();
				}
				return;
			}
		}
	}
}
