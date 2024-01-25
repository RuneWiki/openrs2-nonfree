import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class200 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
	private int[] anIntArray482;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray60;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray178;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Ljava/lang/String;")
	private String aString60;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray179;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!va;")
	private Class199 aClass199_31;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Ljava/lang/String;")
	private String aString61;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray61;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray180;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
	public int anInt6647 = -1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!dg;)V")
	public void method5756(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4421();
			if (local5 == 0) {
				return;
			}
			this.method5762(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method5759() {
		if (this.aString60 == null) {
			this.aString60 = this.aString61;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!dg;)V")
	private void method5762(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.aString61 = arg1.method4408();
		} else if (arg0 == 2) {
			this.aString60 = arg1.method4408();
		} else {
			@Pc(41) int local41;
			@Pc(48) int local48;
			if (arg0 == 3) {
				local41 = arg1.method4421();
				this.anIntArrayArray179 = new int[local41][3];
				for (local48 = 0; local48 < local41; local48++) {
					this.anIntArrayArray179[local48][0] = arg1.method4464();
					this.anIntArrayArray179[local48][1] = arg1.method4444();
					this.anIntArrayArray179[local48][2] = arg1.method4444();
				}
			} else if (arg0 == 4) {
				local41 = arg1.method4421();
				this.anIntArrayArray178 = new int[local41][3];
				for (local48 = 0; local48 < local41; local48++) {
					this.anIntArrayArray178[local48][0] = arg1.method4464();
					this.anIntArrayArray178[local48][1] = arg1.method4444();
					this.anIntArrayArray178[local48][2] = arg1.method4444();
				}
			} else if (arg0 == 5) {
				arg1.method4464();
			} else if (arg0 == 6) {
				arg1.method4421();
			} else if (arg0 == 7) {
				arg1.method4421();
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method4421();
					return;
				}
				if (arg0 == 10) {
					local41 = arg1.method4421();
					this.anIntArray482 = new int[local41];
					for (local48 = 0; local48 < local41; local48++) {
						this.anIntArray482[local48] = arg1.method4444();
					}
					return;
				}
				if (arg0 == 12) {
					arg1.method4444();
					return;
				}
				if (arg0 == 13) {
					local41 = arg1.method4421();
					this.anIntArray485 = new int[local41];
					for (local48 = 0; local48 < local41; local48++) {
						this.anIntArray485[local48] = arg1.method4464();
					}
					return;
				}
				if (arg0 != 14) {
					if (arg0 == 15) {
						arg1.method4464();
						return;
					}
					if (arg0 == 17) {
						this.anInt6647 = arg1.method4464();
						return;
					}
					if (arg0 == 18) {
						local41 = arg1.method4421();
						this.anIntArray487 = new int[local41];
						this.anIntArray489 = new int[local41];
						this.anIntArray486 = new int[local41];
						this.aStringArray60 = new String[local41];
						for (local48 = 0; local48 < local41; local48++) {
							this.anIntArray489[local48] = arg1.method4444();
							this.anIntArray487[local48] = arg1.method4444();
							this.anIntArray486[local48] = arg1.method4444();
							this.aStringArray60[local48] = arg1.method4409();
						}
						return;
					}
					if (arg0 == 19) {
						local41 = arg1.method4421();
						this.anIntArray488 = new int[local41];
						this.anIntArray483 = new int[local41];
						this.anIntArray484 = new int[local41];
						this.aStringArray61 = new String[local41];
						for (local48 = 0; local48 < local41; local48++) {
							this.anIntArray488[local48] = arg1.method4444();
							this.anIntArray483[local48] = arg1.method4444();
							this.anIntArray484[local48] = arg1.method4444();
							this.aStringArray61[local48] = arg1.method4409();
						}
					} else if (arg0 == 249) {
						local41 = arg1.method4421();
						if (this.aClass199_31 == null) {
							local48 = Static216.method3815(local41);
							this.aClass199_31 = new Class199(local48);
						}
						for (local48 = 0; local48 < local41; local48++) {
							@Pc(313) boolean local313 = arg1.method4421() == 1;
							@Pc(317) int local317 = arg1.method4463();
							@Pc(328) Class2 local328;
							if (local313) {
								local328 = new Class2_Sub24(arg1.method4409());
							} else {
								local328 = new Class2_Sub42(arg1.method4444());
							}
							this.aClass199_31.method5749(local328, (long) local317);
						}
						return;
					}
					return;
				}
				local41 = arg1.method4421();
				this.anIntArrayArray180 = new int[local41][2];
				for (local48 = 0; local48 < local41; local48++) {
					this.anIntArrayArray180[local48][0] = arg1.method4421();
					this.anIntArrayArray180[local48][1] = arg1.method4421();
				}
				return;
			}
		}
	}
}
