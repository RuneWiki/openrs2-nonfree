import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class191 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
	private int[] anIntArray451;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "Lclient!mt;")
	private Class164 aClass164_28;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Ljava/lang/String;")
	private String aString51;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
	private int[] anIntArray453;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
	private int[] anIntArray454;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "[I")
	private int[] anIntArray455;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
	private int[] anIntArray456;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
	private int[] anIntArray457;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "Ljava/lang/String;")
	private String aString52;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
	private int[] anIntArray458;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
	public int anInt5120 = -1;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!gk;Z)V")
	public void method4042(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3981();
			if (local5 == 0) {
				return;
			}
			this.method4045(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method4045(@OriginalArg(1) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString51 = arg0.method3987();
		} else if (arg1 == 2) {
			this.aString52 = arg0.method3987();
		} else {
			@Pc(29) int local29;
			@Pc(36) int local36;
			if (arg1 == 3) {
				local29 = arg0.method3981();
				this.anIntArrayArray44 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray44[local36][0] = arg0.method3943();
					this.anIntArrayArray44[local36][1] = arg0.method3938();
					this.anIntArrayArray44[local36][2] = arg0.method3938();
				}
			} else if (arg1 == 4) {
				local29 = arg0.method3981();
				this.anIntArrayArray45 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray45[local36][0] = arg0.method3943();
					this.anIntArrayArray45[local36][1] = arg0.method3938();
					this.anIntArrayArray45[local36][2] = arg0.method3938();
				}
			} else if (arg1 == 5) {
				arg0.method3943();
			} else if (arg1 == 6) {
				arg0.method3981();
			} else if (arg1 == 7) {
				arg0.method3981();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method3981();
				} else if (arg1 == 10) {
					local29 = arg0.method3981();
					this.anIntArray457 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray457[local36] = arg0.method3938();
					}
				} else if (arg1 == 12) {
					arg0.method3938();
				} else if (arg1 == 13) {
					local29 = arg0.method3981();
					this.anIntArray455 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray455[local36] = arg0.method3943();
					}
				} else if (arg1 == 14) {
					local29 = arg0.method3981();
					this.anIntArrayArray46 = new int[local29][2];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArrayArray46[local36][0] = arg0.method3981();
						this.anIntArrayArray46[local36][1] = arg0.method3981();
					}
				} else if (arg1 == 15) {
					arg0.method3943();
				} else if (arg1 == 17) {
					this.anInt5120 = arg0.method3943();
				} else if (arg1 == 18) {
					local29 = arg0.method3981();
					this.anIntArray451 = new int[local29];
					this.aStringArray40 = new String[local29];
					this.anIntArray458 = new int[local29];
					this.anIntArray452 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray451[local36] = arg0.method3938();
						this.anIntArray458[local36] = arg0.method3938();
						this.anIntArray452[local36] = arg0.method3938();
						this.aStringArray40[local36] = arg0.method3986();
					}
				} else if (arg1 == 19) {
					local29 = arg0.method3981();
					this.anIntArray456 = new int[local29];
					this.anIntArray454 = new int[local29];
					this.anIntArray453 = new int[local29];
					this.aStringArray41 = new String[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray453[local36] = arg0.method3938();
						this.anIntArray456[local36] = arg0.method3938();
						this.anIntArray454[local36] = arg0.method3938();
						this.aStringArray41[local36] = arg0.method3986();
					}
				} else if (arg1 == 249) {
					local29 = arg0.method3981();
					if (this.aClass164_28 == null) {
						local36 = Static444.method5654(local29);
						this.aClass164_28 = new Class164(local36);
					}
					for (local36 = 0; local36 < local29; local36++) {
						@Pc(313) boolean local313 = arg0.method3981() == 1;
						@Pc(317) int local317 = arg0.method3975();
						@Pc(326) Class7 local326;
						if (local313) {
							local326 = new Class7_Sub17(arg0.method3986());
						} else {
							local326 = new Class7_Sub2(arg0.method3938());
						}
						this.aClass164_28.method3508((long) local317, local326);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	public void method4046() {
		if (this.aString52 == null) {
			this.aString52 = this.aString51;
		}
	}
}
