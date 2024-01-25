import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class80 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "Lclient!oj;")
	private Class234 aClass234_12;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
	public int anInt1890 = -1;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!jr;I)V")
	private void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.aString8 = arg1.method5999();
		} else if (arg0 == 2) {
			this.aString9 = arg1.method5999();
		} else {
			@Pc(30) int local30;
			@Pc(37) int local37;
			if (arg0 == 3) {
				local30 = arg1.method6019();
				this.anIntArrayArray13 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray13[local37][0] = arg1.method6044();
					this.anIntArrayArray13[local37][1] = arg1.method6015();
					this.anIntArrayArray13[local37][2] = arg1.method6015();
				}
			} else if (arg0 == 4) {
				local30 = arg1.method6019();
				this.anIntArrayArray12 = new int[local30][3];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArrayArray12[local37][0] = arg1.method6044();
					this.anIntArrayArray12[local37][1] = arg1.method6015();
					this.anIntArrayArray12[local37][2] = arg1.method6015();
				}
			} else if (arg0 == 5) {
				arg1.method6044();
			} else if (arg0 == 6) {
				arg1.method6019();
			} else if (arg0 == 7) {
				arg1.method6019();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method6019();
					return;
				}
				if (arg0 != 10) {
					if (arg0 == 12) {
						arg1.method6015();
						return;
					}
					if (arg0 != 13) {
						if (arg0 == 14) {
							local30 = arg1.method6019();
							this.anIntArrayArray14 = new int[local30][2];
							for (local37 = 0; local37 < local30; local37++) {
								this.anIntArrayArray14[local37][0] = arg1.method6019();
								this.anIntArrayArray14[local37][1] = arg1.method6019();
							}
							return;
						}
						if (arg0 == 15) {
							arg1.method6044();
							return;
						}
						if (arg0 == 17) {
							this.anInt1890 = arg1.method6044();
							return;
						}
						if (arg0 != 18) {
							if (arg0 == 19) {
								local30 = arg1.method6019();
								this.anIntArray156 = new int[local30];
								this.anIntArray158 = new int[local30];
								this.aStringArray7 = new String[local30];
								this.anIntArray163 = new int[local30];
								for (local37 = 0; local37 < local30; local37++) {
									this.anIntArray158[local37] = arg1.method6015();
									this.anIntArray163[local37] = arg1.method6015();
									this.anIntArray156[local37] = arg1.method6015();
									this.aStringArray7[local37] = arg1.method6040();
								}
							} else if (arg0 == 249) {
								local30 = arg1.method6019();
								if (this.aClass234_12 == null) {
									local37 = Static14.method5936(local30);
									this.aClass234_12 = new Class234(local37);
								}
								for (local37 = 0; local37 < local30; local37++) {
									@Pc(218) boolean local218 = arg1.method6019() == 1;
									@Pc(224) int local224 = arg1.method6037();
									@Pc(233) Class6 local233;
									if (local218) {
										local233 = new Class6_Sub36(arg1.method6040());
									} else {
										local233 = new Class6_Sub14(arg1.method6015());
									}
									this.aClass234_12.method5466((long) local224, local233);
								}
								return;
							}
							return;
						}
						local30 = arg1.method6019();
						this.aStringArray6 = new String[local30];
						this.anIntArray159 = new int[local30];
						this.anIntArray160 = new int[local30];
						this.anIntArray161 = new int[local30];
						for (local37 = 0; local37 < local30; local37++) {
							this.anIntArray161[local37] = arg1.method6015();
							this.anIntArray159[local37] = arg1.method6015();
							this.anIntArray160[local37] = arg1.method6015();
							this.aStringArray6[local37] = arg1.method6040();
						}
						return;
					}
					local30 = arg1.method6019();
					this.anIntArray157 = new int[local30];
					for (local37 = 0; local37 < local30; local37++) {
						this.anIntArray157[local37] = arg1.method6044();
					}
					return;
				}
				local30 = arg1.method6019();
				this.anIntArray162 = new int[local30];
				for (local37 = 0; local37 < local30; local37++) {
					this.anIntArray162[local37] = arg1.method6015();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!jr;)V")
	public void method1710(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6019();
			if (local5 == 0) {
				return;
			}
			this.method1707(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
	public void method1711() {
		if (this.aString9 == null) {
			this.aString9 = this.aString8;
		}
	}
}
