import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class138 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Lclient!vg;")
	private Class252 aClass252_26;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Ljava/lang/String;")
	private String aString40;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray26;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public int anInt3655 = -1;

	static {
		new Class198("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	public void method2893() {
		if (this.aString40 == null) {
			this.aString40 = this.aString41;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method2894(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5539();
			if (local17 == 0) {
				return;
			}
			this.method2895(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLclient!fh;I)V")
	private void method2895(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString41 = arg0.method5601();
		} else if (arg1 == 2) {
			this.aString40 = arg0.method5601();
		} else {
			@Pc(38) int local38;
			@Pc(45) int local45;
			if (arg1 == 3) {
				local38 = arg0.method5539();
				this.anIntArrayArray28 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray28[local45][0] = arg0.method5598();
					this.anIntArrayArray28[local45][1] = arg0.method5603();
					this.anIntArrayArray28[local45][2] = arg0.method5603();
				}
			} else if (arg1 == 4) {
				local38 = arg0.method5539();
				this.anIntArrayArray27 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray27[local45][0] = arg0.method5598();
					this.anIntArrayArray27[local45][1] = arg0.method5603();
					this.anIntArrayArray27[local45][2] = arg0.method5603();
				}
			} else if (arg1 == 5) {
				arg0.method5598();
			} else if (arg1 == 6) {
				arg0.method5539();
			} else if (arg1 == 7) {
				arg0.method5539();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5539();
				} else if (arg1 == 10) {
					local38 = arg0.method5539();
					this.anIntArray226 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray226[local45] = arg0.method5603();
					}
				} else if (arg1 == 12) {
					arg0.method5603();
				} else if (arg1 == 13) {
					local38 = arg0.method5539();
					this.anIntArray227 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray227[local45] = arg0.method5598();
					}
				} else if (arg1 == 14) {
					local38 = arg0.method5539();
					this.anIntArrayArray26 = new int[local38][2];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArrayArray26[local45][0] = arg0.method5539();
						this.anIntArrayArray26[local45][1] = arg0.method5539();
					}
				} else if (arg1 == 15) {
					arg0.method5598();
				} else if (arg1 == 17) {
					this.anInt3655 = arg0.method5598();
				} else if (arg1 == 18) {
					local38 = arg0.method5539();
					this.anIntArray225 = new int[local38];
					this.anIntArray224 = new int[local38];
					this.anIntArray230 = new int[local38];
					this.aStringArray25 = new String[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray225[local45] = arg0.method5603();
						this.anIntArray230[local45] = arg0.method5603();
						this.anIntArray224[local45] = arg0.method5603();
						this.aStringArray25[local45] = arg0.method5549();
					}
				} else if (arg1 == 19) {
					local38 = arg0.method5539();
					this.anIntArray228 = new int[local38];
					this.aStringArray26 = new String[local38];
					this.anIntArray229 = new int[local38];
					this.anIntArray231 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray229[local45] = arg0.method5603();
						this.anIntArray231[local45] = arg0.method5603();
						this.anIntArray228[local45] = arg0.method5603();
						this.aStringArray26[local45] = arg0.method5549();
					}
				} else if (arg1 == 249) {
					local38 = arg0.method5539();
					if (this.aClass252_26 == null) {
						local45 = Static331.method4084(local38);
						this.aClass252_26 = new Class252(local45);
					}
					for (local45 = 0; local45 < local38; local45++) {
						@Pc(363) boolean local363 = arg0.method5539() == 1;
						@Pc(367) int local367 = arg0.method5541();
						@Pc(376) Class5 local376;
						if (local363) {
							local376 = new Class5_Sub13(arg0.method5549());
						} else {
							local376 = new Class5_Sub34(arg0.method5603());
						}
						this.aClass252_26.method5658(local376, (long) local367);
					}
				}
			}
		}
	}
}
