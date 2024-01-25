import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class241 {

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljava/lang/String;")
	private String aString60;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
	private int[] anIntArray464;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "[I")
	private int[] anIntArray466;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!ub;")
	private Class240 aClass240_35;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "[I")
	private int[] anIntArray467;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray39;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "[I")
	private int[] anIntArray470;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Ljava/lang/String;")
	private String aString61;

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public int anInt6975 = -1;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!md;)V")
	private void method5458(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.aString60 = arg1.method3729();
		} else if (arg0 == 2) {
			this.aString61 = arg1.method3729();
		} else {
			@Pc(27) int local27;
			@Pc(34) int local34;
			if (arg0 == 3) {
				local27 = arg1.method3737();
				this.anIntArrayArray50 = new int[local27][3];
				for (local34 = 0; local34 < local27; local34++) {
					this.anIntArrayArray50[local34][0] = arg1.method3711();
					this.anIntArrayArray50[local34][1] = arg1.method3731();
					this.anIntArrayArray50[local34][2] = arg1.method3731();
				}
			} else if (arg0 == 4) {
				local27 = arg1.method3737();
				this.anIntArrayArray52 = new int[local27][3];
				for (local34 = 0; local34 < local27; local34++) {
					this.anIntArrayArray52[local34][0] = arg1.method3711();
					this.anIntArrayArray52[local34][1] = arg1.method3731();
					this.anIntArrayArray52[local34][2] = arg1.method3731();
				}
			} else if (arg0 == 5) {
				arg1.method3711();
			} else if (arg0 == 6) {
				arg1.method3737();
			} else if (arg0 == 7) {
				arg1.method3737();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method3737();
				} else if (arg0 == 10) {
					local27 = arg1.method3737();
					this.anIntArray465 = new int[local27];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArray465[local34] = arg1.method3731();
					}
				} else if (arg0 == 12) {
					arg1.method3731();
				} else if (arg0 == 13) {
					local27 = arg1.method3737();
					this.anIntArray466 = new int[local27];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArray466[local34] = arg1.method3711();
					}
				} else if (arg0 == 14) {
					local27 = arg1.method3737();
					this.anIntArrayArray51 = new int[local27][2];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArrayArray51[local34][0] = arg1.method3737();
						this.anIntArrayArray51[local34][1] = arg1.method3737();
					}
				} else if (arg0 == 15) {
					arg1.method3711();
				} else if (arg0 == 17) {
					this.anInt6975 = arg1.method3711();
				} else if (arg0 == 18) {
					local27 = arg1.method3737();
					this.anIntArray464 = new int[local27];
					this.anIntArray467 = new int[local27];
					this.aStringArray39 = new String[local27];
					this.anIntArray468 = new int[local27];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArray468[local34] = arg1.method3731();
						this.anIntArray464[local34] = arg1.method3731();
						this.anIntArray467[local34] = arg1.method3731();
						this.aStringArray39[local34] = arg1.method3717();
					}
				} else if (arg0 == 19) {
					local27 = arg1.method3737();
					this.anIntArray469 = new int[local27];
					this.anIntArray471 = new int[local27];
					this.anIntArray470 = new int[local27];
					this.aStringArray40 = new String[local27];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArray469[local34] = arg1.method3731();
						this.anIntArray471[local34] = arg1.method3731();
						this.anIntArray470[local34] = arg1.method3731();
						this.aStringArray40[local34] = arg1.method3717();
					}
				} else if (arg0 == 249) {
					local27 = arg1.method3737();
					if (this.aClass240_35 == null) {
						local34 = Static316.method4530(local27);
						this.aClass240_35 = new Class240(local34);
					}
					for (local34 = 0; local34 < local27; local34++) {
						@Pc(305) boolean local305 = arg1.method3737() == 1;
						@Pc(309) int local309 = arg1.method3748();
						@Pc(318) Class2 local318;
						if (local305) {
							local318 = new Class2_Sub31(arg1.method3717());
						} else {
							local318 = new Class2_Sub16(arg1.method3731());
						}
						this.aClass240_35.method5430((long) local309, local318);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLclient!md;)V")
	public void method5459(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3737();
			if (local9 == 0) {
				return;
			}
			this.method5458(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public void method5465() {
		if (this.aString61 == null) {
			this.aString61 = this.aString60;
		}
	}
}
