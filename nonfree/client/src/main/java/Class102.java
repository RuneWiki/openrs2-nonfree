import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class102 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!bj;")
	private Class27 aClass27_19;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray27;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	public int anInt2417 = -1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public void method2135() {
		if (this.aString16 == null) {
			this.aString16 = this.aString17;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLclient!lh;)V")
	public void method2137(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method2138(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lh;II)V")
	private void method2138(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString17 = arg0.method4109();
		} else if (arg1 == 2) {
			this.aString16 = arg0.method4109();
		} else {
			@Pc(80) int local80;
			@Pc(86) int local86;
			if (arg1 == 3) {
				local80 = arg0.method4130();
				this.anIntArrayArray71 = new int[local80][3];
				for (local86 = 0; local86 < local80; local86++) {
					this.anIntArrayArray71[local86][0] = arg0.method4093();
					this.anIntArrayArray71[local86][1] = arg0.method4087();
					this.anIntArrayArray71[local86][2] = arg0.method4087();
				}
			} else if (arg1 == 4) {
				local80 = arg0.method4130();
				this.anIntArrayArray73 = new int[local80][3];
				for (local86 = 0; local86 < local80; local86++) {
					this.anIntArrayArray73[local86][0] = arg0.method4093();
					this.anIntArrayArray73[local86][1] = arg0.method4087();
					this.anIntArrayArray73[local86][2] = arg0.method4087();
				}
			} else if (arg1 == 5) {
				arg0.method4093();
			} else if (arg1 == 6) {
				arg0.method4130();
			} else if (arg1 == 7) {
				arg0.method4130();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4130();
				} else if (arg1 == 10) {
					local80 = arg0.method4130();
					this.anIntArray235 = new int[local80];
					for (local86 = 0; local86 < local80; local86++) {
						this.anIntArray235[local86] = arg0.method4087();
					}
				} else if (arg1 == 12) {
					arg0.method4087();
				} else if (arg1 == 13) {
					local80 = arg0.method4130();
					this.anIntArray231 = new int[local80];
					for (local86 = 0; local86 < local80; local86++) {
						this.anIntArray231[local86] = arg0.method4093();
					}
				} else if (arg1 == 14) {
					local80 = arg0.method4130();
					this.anIntArrayArray72 = new int[local80][2];
					for (local86 = 0; local86 < local80; local86++) {
						this.anIntArrayArray72[local86][0] = arg0.method4130();
						this.anIntArrayArray72[local86][1] = arg0.method4130();
					}
				} else if (arg1 == 15) {
					arg0.method4093();
				} else if (arg1 == 17) {
					this.anInt2417 = arg0.method4093();
				} else if (arg1 == 18) {
					local80 = arg0.method4130();
					this.aStringArray27 = new String[local80];
					this.anIntArray230 = new int[local80];
					this.anIntArray233 = new int[local80];
					this.anIntArray234 = new int[local80];
					for (local86 = 0; local86 < local80; local86++) {
						this.anIntArray234[local86] = arg0.method4087();
						this.anIntArray230[local86] = arg0.method4087();
						this.anIntArray233[local86] = arg0.method4087();
						this.aStringArray27[local86] = arg0.method4137();
					}
				} else if (arg1 == 19) {
					local80 = arg0.method4130();
					this.anIntArray232 = new int[local80];
					this.anIntArray236 = new int[local80];
					this.aStringArray28 = new String[local80];
					this.anIntArray237 = new int[local80];
					for (local86 = 0; local86 < local80; local86++) {
						this.anIntArray236[local86] = arg0.method4087();
						this.anIntArray237[local86] = arg0.method4087();
						this.anIntArray232[local86] = arg0.method4087();
						this.aStringArray28[local86] = arg0.method4137();
					}
				} else if (arg1 == 249) {
					local80 = arg0.method4130();
					if (this.aClass27_19 == null) {
						local86 = Static100.method1552(local80);
						this.aClass27_19 = new Class27(local86);
					}
					for (local86 = 0; local86 < local80; local86++) {
						@Pc(284) boolean local284 = arg0.method4130() == 1;
						@Pc(290) int local290 = arg0.method4142();
						@Pc(299) Class1 local299;
						if (local284) {
							local299 = new Class1_Sub35(arg0.method4137());
						} else {
							local299 = new Class1_Sub13(arg0.method4087());
						}
						this.aClass27_19.method564((long) local290, local299);
					}
				}
			}
		}
	}
}
