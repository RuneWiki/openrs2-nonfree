import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class38 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "Lclient!wk;")
	private Class246 aClass246_5;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray30;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray31;

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
	public int anInt965 = -1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!kk;I)V")
	private void method808(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString13 = arg0.method5314();
		} else if (arg1 == 2) {
			this.aString12 = arg0.method5314();
		} else {
			@Pc(35) int local35;
			@Pc(42) int local42;
			if (arg1 == 3) {
				local35 = arg0.method5350();
				this.anIntArrayArray7 = new int[local35][3];
				for (local42 = 0; local42 < local35; local42++) {
					this.anIntArrayArray7[local42][0] = arg0.method5312();
					this.anIntArrayArray7[local42][1] = arg0.method5346();
					this.anIntArrayArray7[local42][2] = arg0.method5346();
				}
			} else if (arg1 == 4) {
				local35 = arg0.method5350();
				this.anIntArrayArray9 = new int[local35][3];
				for (local42 = 0; local42 < local35; local42++) {
					this.anIntArrayArray9[local42][0] = arg0.method5312();
					this.anIntArrayArray9[local42][1] = arg0.method5346();
					this.anIntArrayArray9[local42][2] = arg0.method5346();
				}
				return;
			} else if (arg1 == 5) {
				arg0.method5312();
				return;
			} else if (arg1 == 6) {
				arg0.method5350();
				return;
			} else if (arg1 == 7) {
				arg0.method5350();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method5350();
					return;
				}
				if (arg1 != 10) {
					if (arg1 == 12) {
						arg0.method5346();
						return;
					}
					if (arg1 == 13) {
						local35 = arg0.method5350();
						this.anIntArray191 = new int[local35];
						for (local42 = 0; local42 < local35; local42++) {
							this.anIntArray191[local42] = arg0.method5312();
						}
						return;
					}
					if (arg1 == 14) {
						local35 = arg0.method5350();
						this.anIntArrayArray8 = new int[local35][2];
						for (local42 = 0; local42 < local35; local42++) {
							this.anIntArrayArray8[local42][0] = arg0.method5350();
							this.anIntArrayArray8[local42][1] = arg0.method5350();
						}
						return;
					}
					if (arg1 == 15) {
						arg0.method5312();
						return;
					}
					if (arg1 == 17) {
						this.anInt965 = arg0.method5312();
						return;
					}
					if (arg1 == 18) {
						local35 = arg0.method5350();
						this.anIntArray194 = new int[local35];
						this.aStringArray31 = new String[local35];
						this.anIntArray193 = new int[local35];
						this.anIntArray195 = new int[local35];
						for (local42 = 0; local42 < local35; local42++) {
							this.anIntArray193[local42] = arg0.method5346();
							this.anIntArray195[local42] = arg0.method5346();
							this.anIntArray194[local42] = arg0.method5346();
							this.aStringArray31[local42] = arg0.method5364();
						}
					} else if (arg1 == 19) {
						local35 = arg0.method5350();
						this.anIntArray197 = new int[local35];
						this.aStringArray30 = new String[local35];
						this.anIntArray199 = new int[local35];
						this.anIntArray192 = new int[local35];
						for (local42 = 0; local42 < local35; local42++) {
							this.anIntArray197[local42] = arg0.method5346();
							this.anIntArray192[local42] = arg0.method5346();
							this.anIntArray199[local42] = arg0.method5346();
							this.aStringArray30[local42] = arg0.method5364();
						}
						return;
					} else if (arg1 == 249) {
						local35 = arg0.method5350();
						if (this.aClass246_5 == null) {
							local42 = Static6.method148(local35);
							this.aClass246_5 = new Class246(local42);
						}
						for (local42 = 0; local42 < local35; local42++) {
							@Pc(318) boolean local318 = arg0.method5350() == 1;
							@Pc(322) int local322 = arg0.method5356();
							@Pc(331) Class2 local331;
							if (local318) {
								local331 = new Class2_Sub8(arg0.method5364());
							} else {
								local331 = new Class2_Sub14(arg0.method5346());
							}
							this.aClass246_5.method5609(local331, (long) local322);
						}
						return;
					}
					return;
				}
				local35 = arg0.method5350();
				this.anIntArray198 = new int[local35];
				for (local42 = 0; local42 < local35; local42++) {
					this.anIntArray198[local42] = arg0.method5346();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLclient!kk;)V")
	public void method810(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5350();
			if (local11 == 0) {
				return;
			}
			this.method808(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public void method811() {
		if (this.aString12 == null) {
			this.aString12 = this.aString13;
		}
	}
}
