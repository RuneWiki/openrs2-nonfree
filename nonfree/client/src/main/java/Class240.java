import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class240 {

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Ljava/lang/String;")
	private String aString61;

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray85;

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "[I")
	private int[] anIntArray668;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "[I")
	private int[] anIntArray669;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Lclient!ba;")
	private Class17 aClass17_28;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray86;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "[I")
	private int[] anIntArray670;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray35;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "[I")
	private int[] anIntArray671;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "Ljava/lang/String;")
	private String aString62;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "[I")
	private int[] anIntArray672;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "[I")
	private int[] anIntArray673;

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36;

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "[I")
	private int[] anIntArray674;

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "[I")
	private int[] anIntArray675;

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
	public int anInt6881 = -1;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method5759(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3922();
			if (local15 == 0) {
				return;
			}
			this.method5760(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method5760(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString61 = arg0.method3932();
		} else if (arg1 == 2) {
			this.aString62 = arg0.method3932();
		} else {
			@Pc(38) int local38;
			@Pc(45) int local45;
			if (arg1 == 3) {
				local38 = arg0.method3922();
				this.anIntArrayArray85 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray85[local45][0] = arg0.method3967();
					this.anIntArrayArray85[local45][1] = arg0.method3925();
					this.anIntArrayArray85[local45][2] = arg0.method3925();
				}
			} else if (arg1 == 4) {
				local38 = arg0.method3922();
				this.anIntArrayArray87 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray87[local45][0] = arg0.method3967();
					this.anIntArrayArray87[local45][1] = arg0.method3925();
					this.anIntArrayArray87[local45][2] = arg0.method3925();
				}
			} else if (arg1 == 5) {
				arg0.method3967();
			} else if (arg1 == 6) {
				arg0.method3922();
			} else if (arg1 == 7) {
				arg0.method3922();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method3922();
					return;
				}
				if (arg1 != 10) {
					if (arg1 == 12) {
						arg0.method3925();
						return;
					}
					if (arg1 != 13) {
						if (arg1 != 14) {
							if (arg1 == 15) {
								arg0.method3967();
								return;
							}
							if (arg1 == 17) {
								this.anInt6881 = arg0.method3967();
								return;
							}
							if (arg1 == 18) {
								local38 = arg0.method3922();
								this.aStringArray35 = new String[local38];
								this.anIntArray675 = new int[local38];
								this.anIntArray669 = new int[local38];
								this.anIntArray672 = new int[local38];
								for (local45 = 0; local45 < local38; local45++) {
									this.anIntArray675[local45] = arg0.method3925();
									this.anIntArray669[local45] = arg0.method3925();
									this.anIntArray672[local45] = arg0.method3925();
									this.aStringArray35[local45] = arg0.method3954();
								}
							} else if (arg1 == 19) {
								local38 = arg0.method3922();
								this.anIntArray671 = new int[local38];
								this.anIntArray673 = new int[local38];
								this.anIntArray674 = new int[local38];
								this.aStringArray36 = new String[local38];
								for (local45 = 0; local45 < local38; local45++) {
									this.anIntArray671[local45] = arg0.method3925();
									this.anIntArray673[local45] = arg0.method3925();
									this.anIntArray674[local45] = arg0.method3925();
									this.aStringArray36[local45] = arg0.method3954();
								}
								return;
							} else if (arg1 == 249) {
								local38 = arg0.method3922();
								if (this.aClass17_28 == null) {
									local45 = Static352.method5306(local38);
									this.aClass17_28 = new Class17(local45);
								}
								for (local45 = 0; local45 < local38; local45++) {
									@Pc(301) boolean local301 = arg0.method3922() == 1;
									@Pc(305) int local305 = arg0.method3920();
									@Pc(316) Class1 local316;
									if (local301) {
										local316 = new Class1_Sub25(arg0.method3954());
									} else {
										local316 = new Class1_Sub9(arg0.method3925());
									}
									this.aClass17_28.method737(local316, (long) local305);
								}
								return;
							}
							return;
						}
						local38 = arg0.method3922();
						this.anIntArrayArray86 = new int[local38][2];
						for (local45 = 0; local45 < local38; local45++) {
							this.anIntArrayArray86[local45][0] = arg0.method3922();
							this.anIntArrayArray86[local45][1] = arg0.method3922();
						}
						return;
					}
					local38 = arg0.method3922();
					this.anIntArray668 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray668[local45] = arg0.method3967();
					}
					return;
				}
				local38 = arg0.method3922();
				this.anIntArray670 = new int[local38];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArray670[local45] = arg0.method3925();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V")
	public void method5764() {
		if (this.aString62 == null) {
			this.aString62 = this.aString61;
		}
	}
}
