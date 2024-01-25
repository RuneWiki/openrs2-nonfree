import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class138 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray49;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!fa;")
	private Class77 aClass77_24;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "Ljava/lang/String;")
	private String aString36;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray50;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "Ljava/lang/String;")
	private String aString37;

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
	public int anInt3492 = -1;

	static {
		new Class169("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!re;BI)V")
	private void method2847(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString36 = arg0.method5189();
		} else if (arg1 == 2) {
			this.aString37 = arg0.method5189();
		} else {
			@Pc(94) int local94;
			@Pc(100) int local100;
			if (arg1 == 3) {
				local94 = arg0.method5174();
				this.anIntArrayArray40 = new int[local94][3];
				for (local100 = 0; local100 < local94; local100++) {
					this.anIntArrayArray40[local100][0] = arg0.method5177();
					this.anIntArrayArray40[local100][1] = arg0.method5150();
					this.anIntArrayArray40[local100][2] = arg0.method5150();
				}
			} else if (arg1 == 4) {
				local94 = arg0.method5174();
				this.anIntArrayArray38 = new int[local94][3];
				for (local100 = 0; local100 < local94; local100++) {
					this.anIntArrayArray38[local100][0] = arg0.method5177();
					this.anIntArrayArray38[local100][1] = arg0.method5150();
					this.anIntArrayArray38[local100][2] = arg0.method5150();
				}
			} else if (arg1 == 5) {
				arg0.method5177();
			} else if (arg1 == 6) {
				arg0.method5174();
			} else if (arg1 == 7) {
				arg0.method5174();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5174();
				} else if (arg1 == 10) {
					local94 = arg0.method5174();
					this.anIntArray411 = new int[local94];
					for (local100 = 0; local100 < local94; local100++) {
						this.anIntArray411[local100] = arg0.method5150();
					}
				} else if (arg1 == 12) {
					arg0.method5150();
				} else if (arg1 == 13) {
					local94 = arg0.method5174();
					this.anIntArray412 = new int[local94];
					for (local100 = 0; local100 < local94; local100++) {
						this.anIntArray412[local100] = arg0.method5177();
					}
				} else if (arg1 == 14) {
					local94 = arg0.method5174();
					this.anIntArrayArray39 = new int[local94][2];
					for (local100 = 0; local100 < local94; local100++) {
						this.anIntArrayArray39[local100][0] = arg0.method5174();
						this.anIntArrayArray39[local100][1] = arg0.method5174();
					}
				} else if (arg1 == 15) {
					arg0.method5177();
				} else if (arg1 == 17) {
					this.anInt3492 = arg0.method5177();
				} else if (arg1 == 18) {
					local94 = arg0.method5174();
					this.anIntArray413 = new int[local94];
					this.anIntArray416 = new int[local94];
					this.aStringArray49 = new String[local94];
					this.anIntArray409 = new int[local94];
					for (local100 = 0; local100 < local94; local100++) {
						this.anIntArray413[local100] = arg0.method5150();
						this.anIntArray416[local100] = arg0.method5150();
						this.anIntArray409[local100] = arg0.method5150();
						this.aStringArray49[local100] = arg0.method5128();
					}
				} else if (arg1 == 19) {
					local94 = arg0.method5174();
					this.anIntArray415 = new int[local94];
					this.anIntArray417 = new int[local94];
					this.anIntArray414 = new int[local94];
					this.aStringArray50 = new String[local94];
					for (local100 = 0; local100 < local94; local100++) {
						this.anIntArray414[local100] = arg0.method5150();
						this.anIntArray417[local100] = arg0.method5150();
						this.anIntArray415[local100] = arg0.method5150();
						this.aStringArray50[local100] = arg0.method5128();
					}
				} else if (arg1 == 249) {
					local94 = arg0.method5174();
					if (this.aClass77_24 == null) {
						local100 = Static183.method1325(local94);
						this.aClass77_24 = new Class77(local100);
					}
					for (local100 = 0; local100 < local94; local100++) {
						@Pc(227) boolean local227 = arg0.method5174() == 1;
						@Pc(231) int local231 = arg0.method5159();
						@Pc(240) Class1 local240;
						if (local227) {
							local240 = new Class1_Sub8(arg0.method5128());
						} else {
							local240 = new Class1_Sub30(arg0.method5150());
						}
						this.aClass77_24.method1370((long) local231, local240);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLclient!re;)V")
	public void method2850(@OriginalArg(1) Class1_Sub33 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5174();
			if (local5 == 0) {
				return;
			}
			this.method2847(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	public void method2852() {
		if (this.aString37 == null) {
			this.aString37 = this.aString36;
		}
	}
}
