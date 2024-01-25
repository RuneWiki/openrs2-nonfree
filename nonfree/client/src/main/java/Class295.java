import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public final class Class295 {

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "[I")
	private int[] anIntArray482;

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "Lclient!pfa;")
	private Class253 aClass253_32;

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "Ljava/lang/String;")
	private String aString89;

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!ria", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28;

	@OriginalMember(owner = "client!ria", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!ria", name = "q", descriptor = "Ljava/lang/String;")
	private String aString90;

	@OriginalMember(owner = "client!ria", name = "r", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!ria", name = "t", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!ria", name = "w", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!ria", name = "y", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!ria", name = "z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray29;

	@OriginalMember(owner = "client!ria", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
	public int anInt8684 = -1;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(BLclient!ig;)V")
	public void method7176(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method7180(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
	public void method7179() {
		if (this.aString90 == null) {
			this.aString90 = this.aString89;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZLclient!ig;)V")
	private void method7180(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.aString89 = arg1.method8569();
		} else if (arg0 == 2) {
			this.aString90 = arg1.method8569();
		} else {
			@Pc(40) int local40;
			@Pc(47) int local47;
			if (arg0 == 3) {
				local40 = arg1.method8525();
				this.anIntArrayArray49 = new int[local40][3];
				for (local47 = 0; local47 < local40; local47++) {
					this.anIntArrayArray49[local47][0] = arg1.method8578();
					this.anIntArrayArray49[local47][1] = arg1.method8540();
					this.anIntArrayArray49[local47][2] = arg1.method8540();
				}
			} else if (arg0 == 4) {
				local40 = arg1.method8525();
				this.anIntArrayArray50 = new int[local40][3];
				for (local47 = 0; local47 < local40; local47++) {
					this.anIntArrayArray50[local47][0] = arg1.method8578();
					this.anIntArrayArray50[local47][1] = arg1.method8540();
					this.anIntArrayArray50[local47][2] = arg1.method8540();
				}
			} else if (arg0 == 5) {
				arg1.method8578();
			} else if (arg0 == 6) {
				arg1.method8525();
			} else if (arg0 == 7) {
				arg1.method8525();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method8525();
					return;
				}
				if (arg0 != 10) {
					if (arg0 == 12) {
						arg1.method8540();
						return;
					}
					if (arg0 == 13) {
						local40 = arg1.method8525();
						this.anIntArray483 = new int[local40];
						for (local47 = 0; local47 < local40; local47++) {
							this.anIntArray483[local47] = arg1.method8578();
						}
						return;
					}
					if (arg0 != 14) {
						if (arg0 == 15) {
							arg1.method8578();
							return;
						}
						if (arg0 == 17) {
							this.anInt8684 = arg1.method8578();
							return;
						}
						if (arg0 == 18) {
							local40 = arg1.method8525();
							this.anIntArray488 = new int[local40];
							this.anIntArray486 = new int[local40];
							this.aStringArray28 = new String[local40];
							this.anIntArray487 = new int[local40];
							for (local47 = 0; local47 < local40; local47++) {
								this.anIntArray487[local47] = arg1.method8540();
								this.anIntArray488[local47] = arg1.method8540();
								this.anIntArray486[local47] = arg1.method8540();
								this.aStringArray28[local47] = arg1.method8570();
							}
						} else if (arg0 == 19) {
							local40 = arg1.method8525();
							this.anIntArray485 = new int[local40];
							this.anIntArray482 = new int[local40];
							this.anIntArray484 = new int[local40];
							this.aStringArray29 = new String[local40];
							for (local47 = 0; local47 < local40; local47++) {
								this.anIntArray485[local47] = arg1.method8540();
								this.anIntArray482[local47] = arg1.method8540();
								this.anIntArray484[local47] = arg1.method8540();
								this.aStringArray29[local47] = arg1.method8570();
							}
							return;
						} else if (arg0 == 249) {
							local40 = arg1.method8525();
							if (this.aClass253_32 == null) {
								local47 = Static629.method8469(local40);
								this.aClass253_32 = new Class253(local47);
							}
							for (local47 = 0; local47 < local40; local47++) {
								@Pc(276) boolean local276 = arg1.method8525() == 1;
								@Pc(280) int local280 = arg1.method8560();
								@Pc(289) Class8 local289;
								if (local276) {
									local289 = new Class8_Sub28(arg1.method8570());
								} else {
									local289 = new Class8_Sub17(arg1.method8540());
								}
								this.aClass253_32.method6591(local289, (long) local280);
							}
							return;
						}
						return;
					}
					local40 = arg1.method8525();
					this.anIntArrayArray48 = new int[local40][2];
					for (local47 = 0; local47 < local40; local47++) {
						this.anIntArrayArray48[local47][0] = arg1.method8525();
						this.anIntArrayArray48[local47][1] = arg1.method8525();
					}
					return;
				}
				local40 = arg1.method8525();
				this.anIntArray489 = new int[local40];
				for (local47 = 0; local47 < local40; local47++) {
					this.anIntArray489[local47] = arg1.method8540();
				}
				return;
			}
		}
	}
}
