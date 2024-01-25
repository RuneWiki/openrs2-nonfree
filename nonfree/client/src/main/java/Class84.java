import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class84 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "Lclient!lb;")
	private Class174 aClass174_5;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
	public int anInt2865 = -1;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BILclient!gw;)V")
	private void method2666(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.aString16 = arg1.method3050();
		} else if (arg0 == 2) {
			this.aString17 = arg1.method3050();
		} else {
			@Pc(86) int local86;
			@Pc(93) int local93;
			if (arg0 == 3) {
				local86 = arg1.method3043();
				this.anIntArrayArray26 = new int[local86][3];
				for (local93 = 0; local93 < local86; local93++) {
					this.anIntArrayArray26[local93][0] = arg1.method3056();
					this.anIntArrayArray26[local93][1] = arg1.method3037();
					this.anIntArrayArray26[local93][2] = arg1.method3037();
				}
			} else if (arg0 == 4) {
				local86 = arg1.method3043();
				this.anIntArrayArray28 = new int[local86][3];
				for (local93 = 0; local93 < local86; local93++) {
					this.anIntArrayArray28[local93][0] = arg1.method3056();
					this.anIntArrayArray28[local93][1] = arg1.method3037();
					this.anIntArrayArray28[local93][2] = arg1.method3037();
				}
			} else if (arg0 == 5) {
				arg1.method3056();
			} else if (arg0 == 6) {
				arg1.method3043();
			} else if (arg0 == 7) {
				arg1.method3043();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method3043();
				} else if (arg0 == 10) {
					local86 = arg1.method3043();
					this.anIntArray215 = new int[local86];
					for (local93 = 0; local93 < local86; local93++) {
						this.anIntArray215[local93] = arg1.method3037();
					}
				} else if (arg0 == 12) {
					arg1.method3037();
				} else if (arg0 == 13) {
					local86 = arg1.method3043();
					this.anIntArray214 = new int[local86];
					for (local93 = 0; local93 < local86; local93++) {
						this.anIntArray214[local93] = arg1.method3056();
					}
				} else if (arg0 == 14) {
					local86 = arg1.method3043();
					this.anIntArrayArray27 = new int[local86][2];
					for (local93 = 0; local93 < local86; local93++) {
						this.anIntArrayArray27[local93][0] = arg1.method3043();
						this.anIntArrayArray27[local93][1] = arg1.method3043();
					}
				} else if (arg0 == 15) {
					arg1.method3056();
				} else if (arg0 == 17) {
					this.anInt2865 = arg1.method3056();
				} else if (arg0 == 18) {
					local86 = arg1.method3043();
					this.anIntArray213 = new int[local86];
					this.anIntArray216 = new int[local86];
					this.aStringArray10 = new String[local86];
					this.anIntArray210 = new int[local86];
					for (local93 = 0; local93 < local86; local93++) {
						this.anIntArray210[local93] = arg1.method3037();
						this.anIntArray216[local93] = arg1.method3037();
						this.anIntArray213[local93] = arg1.method3037();
						this.aStringArray10[local93] = arg1.method3034();
					}
				} else if (arg0 == 19) {
					local86 = arg1.method3043();
					this.anIntArray211 = new int[local86];
					this.anIntArray209 = new int[local86];
					this.anIntArray212 = new int[local86];
					this.aStringArray11 = new String[local86];
					for (local93 = 0; local93 < local86; local93++) {
						this.anIntArray209[local93] = arg1.method3037();
						this.anIntArray211[local93] = arg1.method3037();
						this.anIntArray212[local93] = arg1.method3037();
						this.aStringArray11[local93] = arg1.method3034();
					}
				} else if (arg0 == 249) {
					local86 = arg1.method3043();
					if (this.aClass174_5 == null) {
						local93 = Static117.method2662(local86);
						this.aClass174_5 = new Class174(local93);
					}
					for (local93 = 0; local93 < local86; local93++) {
						@Pc(167) boolean local167 = arg1.method3043() == 1;
						@Pc(171) int local171 = arg1.method3039();
						@Pc(182) Class1 local182;
						if (local167) {
							local182 = new Class1_Sub24(arg1.method3034());
						} else {
							local182 = new Class1_Sub33(arg1.method3037());
						}
						this.aClass174_5.method4420(local182, (long) local171);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!gw;)V")
	public void method2667(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3043();
			if (local11 == 0) {
				return;
			}
			this.method2666(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	public void method2668() {
		if (this.aString17 == null) {
			this.aString17 = this.aString16;
		}
	}
}
