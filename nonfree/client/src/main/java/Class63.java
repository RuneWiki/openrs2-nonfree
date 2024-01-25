import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class63 {

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "Lclient!bc;")
	private Class25 aClass25_10;

	@OriginalMember(owner = "client!dk", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!dk", name = "y", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
	public int anInt2293 = -1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method2091(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString27 = arg0.method6514();
		} else if (arg1 == 2) {
			this.aString26 = arg0.method6514();
		} else {
			@Pc(65) int local65;
			@Pc(71) int local71;
			if (arg1 == 3) {
				local65 = arg0.method6538();
				this.anIntArrayArray17 = new int[local65][3];
				for (local71 = 0; local71 < local65; local71++) {
					this.anIntArrayArray17[local71][0] = arg0.method6535();
					this.anIntArrayArray17[local71][1] = arg0.method6497();
					this.anIntArrayArray17[local71][2] = arg0.method6497();
				}
			} else if (arg1 == 4) {
				local65 = arg0.method6538();
				this.anIntArrayArray18 = new int[local65][3];
				for (local71 = 0; local71 < local65; local71++) {
					this.anIntArrayArray18[local71][0] = arg0.method6535();
					this.anIntArrayArray18[local71][1] = arg0.method6497();
					this.anIntArrayArray18[local71][2] = arg0.method6497();
				}
			} else if (arg1 == 5) {
				arg0.method6535();
			} else if (arg1 == 6) {
				arg0.method6538();
			} else if (arg1 == 7) {
				arg0.method6538();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method6538();
				} else if (arg1 == 10) {
					local65 = arg0.method6538();
					this.anIntArray112 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray112[local71] = arg0.method6497();
					}
				} else if (arg1 == 12) {
					arg0.method6497();
				} else if (arg1 == 13) {
					local65 = arg0.method6538();
					this.anIntArray114 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray114[local71] = arg0.method6535();
					}
				} else if (arg1 == 14) {
					local65 = arg0.method6538();
					this.anIntArrayArray19 = new int[local65][2];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArrayArray19[local71][0] = arg0.method6538();
						this.anIntArrayArray19[local71][1] = arg0.method6538();
					}
				} else if (arg1 == 15) {
					arg0.method6535();
				} else if (arg1 == 17) {
					this.anInt2293 = arg0.method6535();
				} else if (arg1 == 18) {
					local65 = arg0.method6538();
					this.anIntArray117 = new int[local65];
					this.aStringArray8 = new String[local65];
					this.anIntArray115 = new int[local65];
					this.anIntArray111 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray115[local71] = arg0.method6497();
						this.anIntArray117[local71] = arg0.method6497();
						this.anIntArray111[local71] = arg0.method6497();
						this.aStringArray8[local71] = arg0.method6536();
					}
				} else if (arg1 == 19) {
					local65 = arg0.method6538();
					this.anIntArray116 = new int[local65];
					this.anIntArray113 = new int[local65];
					this.aStringArray9 = new String[local65];
					this.anIntArray110 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray116[local71] = arg0.method6497();
						this.anIntArray110[local71] = arg0.method6497();
						this.anIntArray113[local71] = arg0.method6497();
						this.aStringArray9[local71] = arg0.method6536();
					}
				} else if (arg1 == 249) {
					local65 = arg0.method6538();
					if (this.aClass25_10 == null) {
						local71 = Static178.method3152(local65);
						this.aClass25_10 = new Class25(local71);
					}
					for (local71 = 0; local71 < local65; local71++) {
						@Pc(188) boolean local188 = arg0.method6538() == 1;
						@Pc(192) int local192 = arg0.method6506();
						@Pc(201) Class3 local201;
						if (local188) {
							local201 = new Class3_Sub31(arg0.method6536());
						} else {
							local201 = new Class3_Sub48(arg0.method6497());
						}
						this.aClass25_10.method945(local201, (long) local192);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method2092() {
		if (this.aString26 == null) {
			this.aString26 = this.aString27;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!fd;B)V")
	public void method2094(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6538();
			if (local9 == 0) {
				return;
			}
			this.method2091(arg0, local9);
		}
	}
}
