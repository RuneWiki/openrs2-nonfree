import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class137 {

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "Ljava/lang/String;")
	private String aString51;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray26;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "Ljava/lang/String;")
	private String aString52;

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "[I")
	private int[] anIntArray334;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "Lclient!sl;")
	private Class310 aClass310_14;

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!hu", name = "z", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
	public int anInt4186 = -1;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!qh;)V")
	public void method3702(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3118();
			if (local9 == 0) {
				return;
			}
			this.method3707(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
	public void method3705() {
		if (this.aString52 == null) {
			this.aString52 = this.aString51;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!qh;II)V")
	private void method3707(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString51 = arg0.method3125();
		} else if (arg1 == 2) {
			this.aString52 = arg0.method3125();
		} else {
			@Pc(93) int local93;
			@Pc(99) int local99;
			if (arg1 == 3) {
				local93 = arg0.method3118();
				this.anIntArrayArray31 = new int[local93][3];
				for (local99 = 0; local99 < local93; local99++) {
					this.anIntArrayArray31[local99][0] = arg0.method3109();
					this.anIntArrayArray31[local99][1] = arg0.method3116();
					this.anIntArrayArray31[local99][2] = arg0.method3116();
				}
			} else if (arg1 == 4) {
				local93 = arg0.method3118();
				this.anIntArrayArray30 = new int[local93][3];
				for (local99 = 0; local99 < local93; local99++) {
					this.anIntArrayArray30[local99][0] = arg0.method3109();
					this.anIntArrayArray30[local99][1] = arg0.method3116();
					this.anIntArrayArray30[local99][2] = arg0.method3116();
				}
			} else if (arg1 == 5) {
				arg0.method3109();
				return;
			} else if (arg1 == 6) {
				arg0.method3118();
				return;
			} else if (arg1 == 7) {
				arg0.method3118();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method3118();
					return;
				}
				if (arg1 == 10) {
					local93 = arg0.method3118();
					this.anIntArray334 = new int[local93];
					for (local99 = 0; local99 < local93; local99++) {
						this.anIntArray334[local99] = arg0.method3116();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method3116();
					return;
				}
				if (arg1 != 13) {
					if (arg1 == 14) {
						local93 = arg0.method3118();
						this.anIntArrayArray29 = new int[local93][2];
						for (local99 = 0; local99 < local93; local99++) {
							this.anIntArrayArray29[local99][0] = arg0.method3118();
							this.anIntArrayArray29[local99][1] = arg0.method3118();
						}
						return;
					}
					if (arg1 == 15) {
						arg0.method3109();
						return;
					}
					if (arg1 == 17) {
						this.anInt4186 = arg0.method3109();
					} else if (arg1 == 18) {
						local93 = arg0.method3118();
						this.anIntArray336 = new int[local93];
						this.anIntArray335 = new int[local93];
						this.aStringArray26 = new String[local93];
						this.anIntArray337 = new int[local93];
						for (local99 = 0; local99 < local93; local99++) {
							this.anIntArray337[local99] = arg0.method3116();
							this.anIntArray335[local99] = arg0.method3116();
							this.anIntArray336[local99] = arg0.method3116();
							this.aStringArray26[local99] = arg0.method3133();
						}
						return;
					} else if (arg1 == 19) {
						local93 = arg0.method3118();
						this.aStringArray25 = new String[local93];
						this.anIntArray338 = new int[local93];
						this.anIntArray332 = new int[local93];
						this.anIntArray333 = new int[local93];
						for (local99 = 0; local99 < local93; local99++) {
							this.anIntArray333[local99] = arg0.method3116();
							this.anIntArray338[local99] = arg0.method3116();
							this.anIntArray332[local99] = arg0.method3116();
							this.aStringArray25[local99] = arg0.method3133();
						}
						return;
					} else if (arg1 == 249) {
						local93 = arg0.method3118();
						if (this.aClass310_14 == null) {
							local99 = Static114.method2375(local93);
							this.aClass310_14 = new Class310(local99);
						}
						for (local99 = 0; local99 < local93; local99++) {
							@Pc(342) boolean local342 = arg0.method3118() == 1;
							@Pc(346) int local346 = arg0.method3126();
							@Pc(355) Class3 local355;
							if (local342) {
								local355 = new Class3_Sub51(arg0.method3133());
							} else {
								local355 = new Class3_Sub4(arg0.method3116());
							}
							this.aClass310_14.method6603(local355, (long) local346);
						}
						return;
					}
					return;
				}
				local93 = arg0.method3118();
				this.anIntArray331 = new int[local93];
				for (local99 = 0; local99 < local93; local99++) {
					this.anIntArray331[local99] = arg0.method3109();
				}
				return;
			}
		}
	}
}
