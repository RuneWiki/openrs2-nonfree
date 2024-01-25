import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class191 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray123;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "[I")
	private int[] anIntArray301;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Ljava/lang/String;")
	private String aString50;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!wa;")
	private Class257 aClass257_22;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Ljava/lang/String;")
	private String aString51;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray124;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray125;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	public int anInt5125 = -1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!dh;B)V")
	private void method4006(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.aString50 = arg1.method4456();
		} else if (arg0 == 2) {
			this.aString51 = arg1.method4456();
		} else {
			@Pc(65) int local65;
			@Pc(71) int local71;
			if (arg0 == 3) {
				local65 = arg1.method4463();
				this.anIntArrayArray124 = new int[local65][3];
				for (local71 = 0; local71 < local65; local71++) {
					this.anIntArrayArray124[local71][0] = arg1.method4485();
					this.anIntArrayArray124[local71][1] = arg1.method4487();
					this.anIntArrayArray124[local71][2] = arg1.method4487();
				}
			} else if (arg0 == 4) {
				local65 = arg1.method4463();
				this.anIntArrayArray125 = new int[local65][3];
				for (local71 = 0; local71 < local65; local71++) {
					this.anIntArrayArray125[local71][0] = arg1.method4485();
					this.anIntArrayArray125[local71][1] = arg1.method4487();
					this.anIntArrayArray125[local71][2] = arg1.method4487();
				}
			} else if (arg0 == 5) {
				arg1.method4485();
			} else if (arg0 == 6) {
				arg1.method4463();
			} else if (arg0 == 7) {
				arg1.method4463();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method4463();
				} else if (arg0 == 10) {
					local65 = arg1.method4463();
					this.anIntArray302 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray302[local71] = arg1.method4487();
					}
				} else if (arg0 == 12) {
					arg1.method4487();
				} else if (arg0 == 13) {
					local65 = arg1.method4463();
					this.anIntArray305 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray305[local71] = arg1.method4485();
					}
				} else if (arg0 == 14) {
					local65 = arg1.method4463();
					this.anIntArrayArray123 = new int[local65][2];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArrayArray123[local71][0] = arg1.method4463();
						this.anIntArrayArray123[local71][1] = arg1.method4463();
					}
				} else if (arg0 == 15) {
					arg1.method4485();
				} else if (arg0 == 17) {
					this.anInt5125 = arg1.method4485();
				} else if (arg0 == 18) {
					local65 = arg1.method4463();
					this.anIntArray308 = new int[local65];
					this.aStringArray43 = new String[local65];
					this.anIntArray303 = new int[local65];
					this.anIntArray304 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray304[local71] = arg1.method4487();
						this.anIntArray308[local71] = arg1.method4487();
						this.anIntArray303[local71] = arg1.method4487();
						this.aStringArray43[local71] = arg1.method4484();
					}
				} else if (arg0 == 19) {
					local65 = arg1.method4463();
					this.anIntArray306 = new int[local65];
					this.anIntArray307 = new int[local65];
					this.aStringArray42 = new String[local65];
					this.anIntArray301 = new int[local65];
					for (local71 = 0; local71 < local65; local71++) {
						this.anIntArray306[local71] = arg1.method4487();
						this.anIntArray301[local71] = arg1.method4487();
						this.anIntArray307[local71] = arg1.method4487();
						this.aStringArray42[local71] = arg1.method4484();
					}
				} else if (arg0 == 249) {
					local65 = arg1.method4463();
					if (this.aClass257_22 == null) {
						local71 = Static88.method1286(local65);
						this.aClass257_22 = new Class257(local71);
					}
					for (local71 = 0; local71 < local65; local71++) {
						@Pc(162) boolean local162 = arg1.method4463() == 1;
						@Pc(166) int local166 = arg1.method4493();
						@Pc(175) Class1 local175;
						if (local162) {
							local175 = new Class1_Sub40(arg1.method4484());
						} else {
							local175 = new Class1_Sub6(arg1.method4487());
						}
						this.aClass257_22.method5504(local175, (long) local166);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public void method4007() {
		if (this.aString51 == null) {
			this.aString51 = this.aString50;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLclient!dh;)V")
	public void method4009(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4463();
			if (local11 == 0) {
				return;
			}
			this.method4006(local11, arg0);
		}
	}
}
