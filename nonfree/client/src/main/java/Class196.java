import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class196 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "[I")
	private int[] anIntArray318;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!lk;")
	private Class209 aClass209_28;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	public int anInt5374 = -1;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!gga;I)V")
	public void method4557(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8374();
			if (local5 == 0) {
				return;
			}
			this.method4559(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public void method4558() {
		if (this.aString69 == null) {
			this.aString69 = this.aString70;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!gga;I)V")
	private void method4559(@OriginalArg(1) Class6_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString70 = arg0.method8379();
		} else if (arg1 == 2) {
			this.aString69 = arg0.method8379();
		} else {
			@Pc(34) int local34;
			@Pc(41) int local41;
			if (arg1 == 3) {
				local34 = arg0.method8374();
				this.anIntArrayArray29 = new int[local34][3];
				for (local41 = 0; local41 < local34; local41++) {
					this.anIntArrayArray29[local41][0] = arg0.method8363();
					this.anIntArrayArray29[local41][1] = arg0.method8369();
					this.anIntArrayArray29[local41][2] = arg0.method8369();
				}
			} else if (arg1 == 4) {
				local34 = arg0.method8374();
				this.anIntArrayArray28 = new int[local34][3];
				for (local41 = 0; local41 < local34; local41++) {
					this.anIntArrayArray28[local41][0] = arg0.method8363();
					this.anIntArrayArray28[local41][1] = arg0.method8369();
					this.anIntArrayArray28[local41][2] = arg0.method8369();
				}
			} else if (arg1 == 5) {
				arg0.method8363();
			} else if (arg1 == 6) {
				arg0.method8374();
			} else if (arg1 == 7) {
				arg0.method8374();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method8374();
				} else if (arg1 == 10) {
					local34 = arg0.method8374();
					this.anIntArray318 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray318[local41] = arg0.method8369();
					}
				} else if (arg1 == 12) {
					arg0.method8369();
				} else if (arg1 == 13) {
					local34 = arg0.method8374();
					this.anIntArray322 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray322[local41] = arg0.method8363();
					}
				} else if (arg1 == 14) {
					local34 = arg0.method8374();
					this.anIntArrayArray30 = new int[local34][2];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArrayArray30[local41][0] = arg0.method8374();
						this.anIntArrayArray30[local41][1] = arg0.method8374();
					}
				} else if (arg1 == 15) {
					arg0.method8363();
				} else if (arg1 == 17) {
					this.anInt5374 = arg0.method8363();
				} else if (arg1 == 18) {
					local34 = arg0.method8374();
					this.aStringArray42 = new String[local34];
					this.anIntArray323 = new int[local34];
					this.anIntArray320 = new int[local34];
					this.anIntArray319 = new int[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray319[local41] = arg0.method8369();
						this.anIntArray320[local41] = arg0.method8369();
						this.anIntArray323[local41] = arg0.method8369();
						this.aStringArray42[local41] = arg0.method8354();
					}
				} else if (arg1 == 19) {
					local34 = arg0.method8374();
					this.anIntArray317 = new int[local34];
					this.anIntArray321 = new int[local34];
					this.anIntArray324 = new int[local34];
					this.aStringArray41 = new String[local34];
					for (local41 = 0; local41 < local34; local41++) {
						this.anIntArray321[local41] = arg0.method8369();
						this.anIntArray317[local41] = arg0.method8369();
						this.anIntArray324[local41] = arg0.method8369();
						this.aStringArray41[local41] = arg0.method8354();
					}
				} else if (arg1 == 249) {
					local34 = arg0.method8374();
					if (this.aClass209_28 == null) {
						local41 = Static655.method8912(local34);
						this.aClass209_28 = new Class209(local41);
					}
					for (local41 = 0; local41 < local34; local41++) {
						@Pc(245) boolean local245 = arg0.method8374() == 1;
						@Pc(249) int local249 = arg0.method8344();
						@Pc(258) Class6 local258;
						if (local245) {
							local258 = new Class6_Sub16(arg0.method8354());
						} else {
							local258 = new Class6_Sub36(arg0.method8369());
						}
						this.aClass209_28.method5035((long) local249, local258);
					}
				}
			}
		}
	}
}
