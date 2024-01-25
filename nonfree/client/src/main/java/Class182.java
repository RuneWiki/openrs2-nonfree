import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class182 {

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "[I")
	private int[] anIntArray368;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "Lclient!cb;")
	private Class42 aClass42_22;

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray26;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "[I")
	private int[] anIntArray369;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "[I")
	private int[] anIntArray371;

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!lba", name = "w", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!lba", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
	public int anInt5368 = -1;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZLclient!co;I)V")
	private void method4498(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString56 = arg0.method4211();
		} else if (arg1 == 2) {
			this.aString55 = arg0.method4211();
		} else {
			@Pc(67) int local67;
			@Pc(73) int local73;
			if (arg1 == 3) {
				local67 = arg0.method4220();
				this.anIntArrayArray40 = new int[local67][3];
				for (local73 = 0; local73 < local67; local73++) {
					this.anIntArrayArray40[local73][0] = arg0.method4227();
					this.anIntArrayArray40[local73][1] = arg0.method4230();
					this.anIntArrayArray40[local73][2] = arg0.method4230();
				}
			} else if (arg1 == 4) {
				local67 = arg0.method4220();
				this.anIntArrayArray39 = new int[local67][3];
				for (local73 = 0; local73 < local67; local73++) {
					this.anIntArrayArray39[local73][0] = arg0.method4227();
					this.anIntArrayArray39[local73][1] = arg0.method4230();
					this.anIntArrayArray39[local73][2] = arg0.method4230();
				}
			} else if (arg1 == 5) {
				arg0.method4227();
			} else if (arg1 == 6) {
				arg0.method4220();
			} else if (arg1 == 7) {
				arg0.method4220();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4220();
				} else if (arg1 == 10) {
					local67 = arg0.method4220();
					this.anIntArray372 = new int[local67];
					for (local73 = 0; local73 < local67; local73++) {
						this.anIntArray372[local73] = arg0.method4230();
					}
				} else if (arg1 == 12) {
					arg0.method4230();
				} else if (arg1 == 13) {
					local67 = arg0.method4220();
					this.anIntArray375 = new int[local67];
					for (local73 = 0; local73 < local67; local73++) {
						this.anIntArray375[local73] = arg0.method4227();
					}
				} else if (arg1 == 14) {
					local67 = arg0.method4220();
					this.anIntArrayArray38 = new int[local67][2];
					for (local73 = 0; local73 < local67; local73++) {
						this.anIntArrayArray38[local73][0] = arg0.method4220();
						this.anIntArrayArray38[local73][1] = arg0.method4220();
					}
				} else if (arg1 == 15) {
					arg0.method4227();
				} else if (arg1 == 17) {
					this.anInt5368 = arg0.method4227();
				} else if (arg1 == 18) {
					local67 = arg0.method4220();
					this.aStringArray26 = new String[local67];
					this.anIntArray370 = new int[local67];
					this.anIntArray373 = new int[local67];
					this.anIntArray368 = new int[local67];
					for (local73 = 0; local73 < local67; local73++) {
						this.anIntArray368[local73] = arg0.method4230();
						this.anIntArray370[local73] = arg0.method4230();
						this.anIntArray373[local73] = arg0.method4230();
						this.aStringArray26[local73] = arg0.method4234();
					}
				} else if (arg1 == 19) {
					local67 = arg0.method4220();
					this.aStringArray25 = new String[local67];
					this.anIntArray371 = new int[local67];
					this.anIntArray374 = new int[local67];
					this.anIntArray369 = new int[local67];
					for (local73 = 0; local73 < local67; local73++) {
						this.anIntArray371[local73] = arg0.method4230();
						this.anIntArray369[local73] = arg0.method4230();
						this.anIntArray374[local73] = arg0.method4230();
						this.aStringArray25[local73] = arg0.method4234();
					}
				} else if (arg1 == 249) {
					local67 = arg0.method4220();
					if (this.aClass42_22 == null) {
						local73 = Static179.method3071(local67);
						this.aClass42_22 = new Class42(local73);
					}
					for (local73 = 0; local73 < local67; local73++) {
						@Pc(342) boolean local342 = arg0.method4220() == 1;
						@Pc(346) int local346 = arg0.method4182();
						@Pc(355) Class5 local355;
						if (local342) {
							local355 = new Class5_Sub50(arg0.method4234());
						} else {
							local355 = new Class5_Sub27(arg0.method4230());
						}
						this.aClass42_22.method1106((long) local346, local355);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public void method4499() {
		if (this.aString55 == null) {
			this.aString55 = this.aString56;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!co;)V")
	public void method4500(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4220();
			if (local7 == 0) {
				return;
			}
			this.method4498(arg0, local7);
		}
	}
}
