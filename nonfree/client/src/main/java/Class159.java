import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class159 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "[I")
	private int[] anIntArray629;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "[I")
	private int[] anIntArray630;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "[I")
	private int[] anIntArray631;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "Ljava/lang/String;")
	private String aString297;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "[I")
	private int[] anIntArray632;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!os", name = "q", descriptor = "[I")
	private int[] anIntArray633;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Ljava/lang/String;")
	private String aString298;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "[I")
	private int[] anIntArray634;

	@OriginalMember(owner = "client!os", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "[I")
	private int[] anIntArray635;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "Lclient!aj;")
	private Class10 aClass10_37;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "[I")
	private int[] anIntArray636;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "I")
	public int anInt4708 = -1;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ap;II)V")
	private void method4097(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString298 = arg0.method2770();
		} else if (arg1 == 2) {
			this.aString297 = arg0.method2770();
		} else {
			@Pc(23) int local23;
			@Pc(30) int local30;
			if (arg1 == 3) {
				local23 = arg0.method2772();
				this.anIntArrayArray37 = new int[local23][3];
				for (local30 = 0; local30 < local23; local30++) {
					this.anIntArrayArray37[local30][0] = arg0.method2764();
					this.anIntArrayArray37[local30][1] = arg0.method2767();
					this.anIntArrayArray37[local30][2] = arg0.method2767();
				}
			} else if (arg1 == 4) {
				local23 = arg0.method2772();
				this.anIntArrayArray38 = new int[local23][3];
				for (local30 = 0; local30 < local23; local30++) {
					this.anIntArrayArray38[local30][0] = arg0.method2764();
					this.anIntArrayArray38[local30][1] = arg0.method2767();
					this.anIntArrayArray38[local30][2] = arg0.method2767();
				}
			} else if (arg1 == 5) {
				arg0.method2764();
			} else if (arg1 == 6) {
				arg0.method2772();
			} else if (arg1 == 7) {
				arg0.method2772();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method2772();
				} else if (arg1 == 10) {
					local23 = arg0.method2772();
					this.anIntArray629 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray629[local30] = arg0.method2767();
					}
				} else if (arg1 == 12) {
					arg0.method2767();
				} else if (arg1 == 13) {
					local23 = arg0.method2772();
					this.anIntArray631 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray631[local30] = arg0.method2764();
					}
				} else if (arg1 == 14) {
					local23 = arg0.method2772();
					this.anIntArrayArray39 = new int[local23][2];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArrayArray39[local30][0] = arg0.method2772();
						this.anIntArrayArray39[local30][1] = arg0.method2772();
					}
				} else if (arg1 == 15) {
					arg0.method2764();
				} else if (arg1 == 17) {
					this.anInt4708 = arg0.method2764();
				} else if (arg1 == 18) {
					local23 = arg0.method2772();
					this.anIntArray633 = new int[local23];
					this.aStringArray42 = new String[local23];
					this.anIntArray632 = new int[local23];
					this.anIntArray635 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray635[local30] = arg0.method2767();
						this.anIntArray633[local30] = arg0.method2767();
						this.anIntArray632[local30] = arg0.method2767();
						this.aStringArray42[local30] = arg0.method2782();
					}
				} else if (arg1 == 19) {
					local23 = arg0.method2772();
					this.anIntArray634 = new int[local23];
					this.aStringArray41 = new String[local23];
					this.anIntArray630 = new int[local23];
					this.anIntArray636 = new int[local23];
					for (local30 = 0; local30 < local23; local30++) {
						this.anIntArray630[local30] = arg0.method2767();
						this.anIntArray636[local30] = arg0.method2767();
						this.anIntArray634[local30] = arg0.method2767();
						this.aStringArray41[local30] = arg0.method2782();
					}
				} else if (arg1 == 249) {
					local23 = arg0.method2772();
					if (this.aClass10_37 == null) {
						local30 = Static271.method4522(local23);
						this.aClass10_37 = new Class10(local30);
					}
					for (local30 = 0; local30 < local23; local30++) {
						@Pc(241) boolean local241 = arg0.method2772() == 1;
						@Pc(245) int local245 = arg0.method2791();
						@Pc(254) Class7 local254;
						if (local241) {
							local254 = new Class7_Sub30(arg0.method2782());
						} else {
							local254 = new Class7_Sub10(arg0.method2767());
						}
						this.aClass10_37.method161((long) local245, local254);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public void method4100() {
		if (this.aString297 == null) {
			this.aString297 = this.aString298;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!ap;)V")
	public void method4102(@OriginalArg(1) Class7_Sub3 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method2772();
			if (local8 == 0) {
				return;
			}
			this.method4097(arg0, local8);
		}
	}
}
