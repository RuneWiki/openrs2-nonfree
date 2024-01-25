import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class31 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Lclient!he;")
	private Class128 aClass128_3;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	public int anInt712 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!rg;I)V")
	private void method616(@OriginalArg(1) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString7 = arg0.method8555();
		} else if (arg1 == 2) {
			this.aString8 = arg0.method8555();
		} else {
			@Pc(121) int local121;
			@Pc(139) int local139;
			if (arg1 == 3) {
				local121 = arg0.method8604();
				this.anIntArrayArray8 = new int[local121][3];
				for (local139 = 0; local139 < local121; local139++) {
					this.anIntArrayArray8[local139][0] = arg0.method8571();
					this.anIntArrayArray8[local139][1] = arg0.method8579();
					this.anIntArrayArray8[local139][2] = arg0.method8579();
				}
			} else if (arg1 == 4) {
				local121 = arg0.method8604();
				this.anIntArrayArray7 = new int[local121][3];
				for (local139 = 0; local139 < local121; local139++) {
					this.anIntArrayArray7[local139][0] = arg0.method8571();
					this.anIntArrayArray7[local139][1] = arg0.method8579();
					this.anIntArrayArray7[local139][2] = arg0.method8579();
				}
			} else if (arg1 == 5) {
				arg0.method8571();
			} else if (arg1 == 6) {
				arg0.method8604();
			} else if (arg1 == 7) {
				arg0.method8604();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method8604();
				} else if (arg1 == 10) {
					local121 = arg0.method8604();
					this.anIntArray43 = new int[local121];
					for (local139 = 0; local139 < local121; local139++) {
						this.anIntArray43[local139] = arg0.method8579();
					}
				} else if (arg1 == 12) {
					arg0.method8579();
				} else if (arg1 == 13) {
					local121 = arg0.method8604();
					this.anIntArray47 = new int[local121];
					for (local139 = 0; local139 < local121; local139++) {
						this.anIntArray47[local139] = arg0.method8571();
					}
				} else if (arg1 == 14) {
					local121 = arg0.method8604();
					this.anIntArrayArray6 = new int[local121][2];
					for (local139 = 0; local139 < local121; local139++) {
						this.anIntArrayArray6[local139][0] = arg0.method8604();
						this.anIntArrayArray6[local139][1] = arg0.method8604();
					}
				} else if (arg1 == 15) {
					arg0.method8571();
				} else if (arg1 == 17) {
					this.anInt712 = arg0.method8571();
				} else if (arg1 == 18) {
					local121 = arg0.method8604();
					this.anIntArray41 = new int[local121];
					this.aStringArray4 = new String[local121];
					this.anIntArray49 = new int[local121];
					this.anIntArray48 = new int[local121];
					for (local139 = 0; local139 < local121; local139++) {
						this.anIntArray48[local139] = arg0.method8579();
						this.anIntArray41[local139] = arg0.method8579();
						this.anIntArray49[local139] = arg0.method8579();
						this.aStringArray4[local139] = arg0.method8611();
					}
				} else if (arg1 == 19) {
					local121 = arg0.method8604();
					this.anIntArray45 = new int[local121];
					this.anIntArray44 = new int[local121];
					this.aStringArray3 = new String[local121];
					this.anIntArray46 = new int[local121];
					for (local139 = 0; local139 < local121; local139++) {
						this.anIntArray46[local139] = arg0.method8579();
						this.anIntArray44[local139] = arg0.method8579();
						this.anIntArray45[local139] = arg0.method8579();
						this.aStringArray3[local139] = arg0.method8611();
					}
				} else if (arg1 == 249) {
					local121 = arg0.method8604();
					if (this.aClass128_3 == null) {
						local139 = Static567.method8129(local121);
						this.aClass128_3 = new Class128(local139);
					}
					for (local139 = 0; local139 < local121; local139++) {
						@Pc(279) boolean local279 = arg0.method8604() == 1;
						@Pc(283) int local283 = arg0.method8606();
						@Pc(292) Class6 local292;
						if (local279) {
							local292 = new Class6_Sub18(arg0.method8611());
						} else {
							local292 = new Class6_Sub48(arg0.method8579());
						}
						this.aClass128_3.method3551((long) local283, local292);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method617(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8604();
			if (local11 == 0) {
				return;
			}
			this.method616(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public void method618() {
		if (this.aString8 == null) {
			this.aString8 = this.aString7;
		}
	}
}
