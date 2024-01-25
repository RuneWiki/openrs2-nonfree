import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class142 {

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "Lclient!gca;")
	private Class118 aClass118_17;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray15;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray16;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Ljava/lang/String;")
	private String aString33;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "Ljava/lang/String;")
	private String aString34;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public int anInt3590 = -1;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLclient!vj;)V")
	public void method3016(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8547();
			if (local9 == 0) {
				return;
			}
			this.method3018(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public void method3017() {
		if (this.aString34 == null) {
			this.aString34 = this.aString33;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!vj;I)V")
	private void method3018(@OriginalArg(1) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString33 = arg0.method8519();
		} else if (arg1 == 2) {
			this.aString34 = arg0.method8519();
		} else {
			@Pc(32) int local32;
			@Pc(39) int local39;
			if (arg1 == 3) {
				local32 = arg0.method8547();
				this.anIntArrayArray13 = new int[local32][3];
				for (local39 = 0; local39 < local32; local39++) {
					this.anIntArrayArray13[local39][0] = arg0.method8546();
					this.anIntArrayArray13[local39][1] = arg0.method8542();
					this.anIntArrayArray13[local39][2] = arg0.method8542();
				}
			} else if (arg1 == 4) {
				local32 = arg0.method8547();
				this.anIntArrayArray14 = new int[local32][3];
				for (local39 = 0; local39 < local32; local39++) {
					this.anIntArrayArray14[local39][0] = arg0.method8546();
					this.anIntArrayArray14[local39][1] = arg0.method8542();
					this.anIntArrayArray14[local39][2] = arg0.method8542();
				}
			} else if (arg1 == 5) {
				arg0.method8546();
			} else if (arg1 == 6) {
				arg0.method8547();
			} else if (arg1 == 7) {
				arg0.method8547();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method8547();
					return;
				}
				if (arg1 == 10) {
					local32 = arg0.method8547();
					this.anIntArray240 = new int[local32];
					for (local39 = 0; local39 < local32; local39++) {
						this.anIntArray240[local39] = arg0.method8542();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method8542();
					return;
				}
				if (arg1 == 13) {
					local32 = arg0.method8547();
					this.anIntArray243 = new int[local32];
					for (local39 = 0; local39 < local32; local39++) {
						this.anIntArray243[local39] = arg0.method8546();
					}
					return;
				}
				if (arg1 != 14) {
					if (arg1 == 15) {
						arg0.method8546();
						return;
					}
					if (arg1 == 17) {
						this.anInt3590 = arg0.method8546();
						return;
					}
					if (arg1 == 18) {
						local32 = arg0.method8547();
						this.anIntArray247 = new int[local32];
						this.aStringArray15 = new String[local32];
						this.anIntArray241 = new int[local32];
						this.anIntArray246 = new int[local32];
						for (local39 = 0; local39 < local32; local39++) {
							this.anIntArray247[local39] = arg0.method8542();
							this.anIntArray241[local39] = arg0.method8542();
							this.anIntArray246[local39] = arg0.method8542();
							this.aStringArray15[local39] = arg0.method8549();
						}
						return;
					}
					if (arg1 == 19) {
						local32 = arg0.method8547();
						this.anIntArray245 = new int[local32];
						this.anIntArray242 = new int[local32];
						this.anIntArray244 = new int[local32];
						this.aStringArray16 = new String[local32];
						for (local39 = 0; local39 < local32; local39++) {
							this.anIntArray244[local39] = arg0.method8542();
							this.anIntArray245[local39] = arg0.method8542();
							this.anIntArray242[local39] = arg0.method8542();
							this.aStringArray16[local39] = arg0.method8549();
						}
					} else if (arg1 == 249) {
						local32 = arg0.method8547();
						if (this.aClass118_17 == null) {
							local39 = Static350.method4699(local32);
							this.aClass118_17 = new Class118(local39);
						}
						for (local39 = 0; local39 < local32; local39++) {
							@Pc(363) boolean local363 = arg0.method8547() == 1;
							@Pc(367) int local367 = arg0.method8539();
							@Pc(376) Class2 local376;
							if (local363) {
								local376 = new Class2_Sub29(arg0.method8549());
							} else {
								local376 = new Class2_Sub30(arg0.method8542());
							}
							this.aClass118_17.method2601(local376, (long) local367);
						}
						return;
					}
					return;
				}
				local32 = arg0.method8547();
				this.anIntArrayArray15 = new int[local32][2];
				for (local39 = 0; local39 < local32; local39++) {
					this.anIntArrayArray15[local39][0] = arg0.method8547();
					this.anIntArrayArray15[local39][1] = arg0.method8547();
				}
				return;
			}
		}
	}
}
