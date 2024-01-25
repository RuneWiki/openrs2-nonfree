import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class20 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Lclient!qh;")
	private Class199 aClass199_14;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "I")
	public int anInt463 = -1;

	static {
		new Class119("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ug;I)V")
	private void method361(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.aString6 = arg1.method5369();
		} else if (arg0 == 2) {
			this.aString7 = arg1.method5369();
		} else {
			@Pc(34) int local34;
			@Pc(41) int local41;
			if (arg0 == 3) {
				local34 = arg1.method5337();
				this.anIntArrayArray6 = new int[local34][3];
				for (local41 = 0; local41 < local34; local41++) {
					this.anIntArrayArray6[local41][0] = arg1.method5335();
					this.anIntArrayArray6[local41][1] = arg1.method5355();
					this.anIntArrayArray6[local41][2] = arg1.method5355();
				}
			} else if (arg0 == 4) {
				local34 = arg1.method5337();
				this.anIntArrayArray7 = new int[local34][3];
				for (local41 = 0; local41 < local34; local41++) {
					this.anIntArrayArray7[local41][0] = arg1.method5335();
					this.anIntArrayArray7[local41][1] = arg1.method5355();
					this.anIntArrayArray7[local41][2] = arg1.method5355();
				}
			} else if (arg0 == 5) {
				arg1.method5335();
			} else if (arg0 == 6) {
				arg1.method5337();
			} else if (arg0 == 7) {
				arg1.method5337();
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5337();
					return;
				}
				if (arg0 == 10) {
					local34 = arg1.method5337();
					this.anIntArray27 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray27[local41] = arg1.method5355();
					}
					return;
				}
				if (arg0 == 12) {
					arg1.method5355();
					return;
				}
				if (arg0 == 13) {
					local34 = arg1.method5337();
					this.anIntArray22 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray22[local41] = arg1.method5335();
					}
					return;
				}
				if (arg0 != 14) {
					if (arg0 == 15) {
						arg1.method5335();
						return;
					}
					if (arg0 == 17) {
						this.anInt463 = arg1.method5335();
						return;
					}
					if (arg0 == 18) {
						local34 = arg1.method5337();
						this.anIntArray24 = new int[local34];
						this.anIntArray25 = new int[local34];
						this.aStringArray6 = new String[local34];
						this.anIntArray29 = new int[local34];
						for (local41 = 0; local41 < local34; local41++) {
							this.anIntArray24[local41] = arg1.method5355();
							this.anIntArray29[local41] = arg1.method5355();
							this.anIntArray25[local41] = arg1.method5355();
							this.aStringArray6[local41] = arg1.method5381();
						}
						return;
					}
					if (arg0 == 19) {
						local34 = arg1.method5337();
						this.anIntArray23 = new int[local34];
						this.anIntArray28 = new int[local34];
						this.anIntArray26 = new int[local34];
						this.aStringArray5 = new String[local34];
						for (local41 = 0; local41 < local34; local41++) {
							this.anIntArray23[local41] = arg1.method5355();
							this.anIntArray26[local41] = arg1.method5355();
							this.anIntArray28[local41] = arg1.method5355();
							this.aStringArray5[local41] = arg1.method5381();
						}
					} else if (arg0 == 249) {
						local34 = arg1.method5337();
						if (this.aClass199_14 == null) {
							local41 = Static191.method2740(local34);
							this.aClass199_14 = new Class199(local41);
						}
						for (local41 = 0; local41 < local34; local41++) {
							@Pc(299) boolean local299 = arg1.method5337() == 1;
							@Pc(303) int local303 = arg1.method5345();
							@Pc(312) Class1 local312;
							if (local299) {
								local312 = new Class1_Sub33(arg1.method5381());
							} else {
								local312 = new Class1_Sub26(arg1.method5355());
							}
							this.aClass199_14.method4383((long) local303, local312);
						}
						return;
					}
					return;
				}
				local34 = arg1.method5337();
				this.anIntArrayArray5 = new int[local34][2];
				for (local41 = 0; local41 < local34; local41++) {
					this.anIntArrayArray5[local41][0] = arg1.method5337();
					this.anIntArrayArray5[local41][1] = arg1.method5337();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method362(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method361(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public void method363() {
		if (this.aString7 == null) {
			this.aString7 = this.aString6;
		}
	}
}
