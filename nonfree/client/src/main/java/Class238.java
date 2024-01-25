import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class238 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
	private int[] anIntArray665;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
	private int[] anIntArray666;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "[I")
	private int[] anIntArray667;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray44;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "[I")
	private int[] anIntArray668;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "[I")
	private int[] anIntArray669;

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Lclient!cp;")
	private Class44 aClass44_38;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "[I")
	private int[] anIntArray670;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "[I")
	private int[] anIntArray671;

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "Ljava/lang/String;")
	private String aString62;

	@OriginalMember(owner = "client!vl", name = "v", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "[I")
	private int[] anIntArray672;

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
	public int anInt6187 = -1;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!rp;BI)V")
	private void method5531(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString62 = arg0.method2792();
		} else if (arg1 == 2) {
			this.aString63 = arg0.method2792();
		} else {
			@Pc(27) int local27;
			@Pc(34) int local34;
			if (arg1 == 3) {
				local27 = arg0.method2739();
				this.anIntArrayArray56 = new int[local27][3];
				for (local34 = 0; local34 < local27; local34++) {
					this.anIntArrayArray56[local34][0] = arg0.method2767();
					this.anIntArrayArray56[local34][1] = arg0.method2726();
					this.anIntArrayArray56[local34][2] = arg0.method2726();
				}
			} else if (arg1 == 4) {
				local27 = arg0.method2739();
				this.anIntArrayArray55 = new int[local27][3];
				for (local34 = 0; local34 < local27; local34++) {
					this.anIntArrayArray55[local34][0] = arg0.method2767();
					this.anIntArrayArray55[local34][1] = arg0.method2726();
					this.anIntArrayArray55[local34][2] = arg0.method2726();
				}
			} else if (arg1 == 5) {
				arg0.method2767();
			} else if (arg1 == 6) {
				arg0.method2739();
			} else if (arg1 == 7) {
				arg0.method2739();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method2739();
				} else if (arg1 == 10) {
					local27 = arg0.method2739();
					this.anIntArray672 = new int[local27];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArray672[local34] = arg0.method2726();
					}
				} else if (arg1 == 12) {
					arg0.method2726();
				} else if (arg1 == 13) {
					local27 = arg0.method2739();
					this.anIntArray667 = new int[local27];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArray667[local34] = arg0.method2767();
					}
				} else if (arg1 == 14) {
					local27 = arg0.method2739();
					this.anIntArrayArray57 = new int[local27][2];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArrayArray57[local34][0] = arg0.method2739();
						this.anIntArrayArray57[local34][1] = arg0.method2739();
					}
				} else if (arg1 == 15) {
					arg0.method2767();
				} else if (arg1 == 17) {
					this.anInt6187 = arg0.method2767();
				} else if (arg1 == 18) {
					local27 = arg0.method2739();
					this.anIntArray665 = new int[local27];
					this.anIntArray670 = new int[local27];
					this.aStringArray44 = new String[local27];
					this.anIntArray668 = new int[local27];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArray665[local34] = arg0.method2726();
						this.anIntArray670[local34] = arg0.method2726();
						this.anIntArray668[local34] = arg0.method2726();
						this.aStringArray44[local34] = arg0.method2788();
					}
				} else if (arg1 == 19) {
					local27 = arg0.method2739();
					this.anIntArray669 = new int[local27];
					this.anIntArray671 = new int[local27];
					this.aStringArray43 = new String[local27];
					this.anIntArray666 = new int[local27];
					for (local34 = 0; local34 < local27; local34++) {
						this.anIntArray671[local34] = arg0.method2726();
						this.anIntArray669[local34] = arg0.method2726();
						this.anIntArray666[local34] = arg0.method2726();
						this.aStringArray43[local34] = arg0.method2788();
					}
				} else if (arg1 == 249) {
					local27 = arg0.method2739();
					if (this.aClass44_38 == null) {
						local34 = Static304.method2746(local27);
						this.aClass44_38 = new Class44(local34);
					}
					for (local34 = 0; local34 < local27; local34++) {
						@Pc(247) boolean local247 = arg0.method2739() == 1;
						@Pc(251) int local251 = arg0.method2786();
						@Pc(260) Class3 local260;
						if (local247) {
							local260 = new Class3_Sub20(arg0.method2788());
						} else {
							local260 = new Class3_Sub28(arg0.method2726());
						}
						this.aClass44_38.method948((long) local251, local260);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public void method5532() {
		if (this.aString63 == null) {
			this.aString63 = this.aString62;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!rp;)V")
	public void method5536(@OriginalArg(1) Class3_Sub5 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2739();
			if (local17 == 0) {
				return;
			}
			this.method5531(arg0, local17);
		}
	}
}
