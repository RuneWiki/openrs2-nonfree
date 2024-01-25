import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class204 {

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray22;

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "Ljava/lang/String;")
	private String aString42;

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "Lclient!hd;")
	private Class128 aClass128_27;

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!mba", name = "q", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!mba", name = "r", descriptor = "[I")
	private int[] anIntArray418;

	@OriginalMember(owner = "client!mba", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray23;

	@OriginalMember(owner = "client!mba", name = "t", descriptor = "[I")
	private int[] anIntArray419;

	@OriginalMember(owner = "client!mba", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!mba", name = "w", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
	public int anInt5581 = -1;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method4802(@OriginalArg(1) Class6_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString43 = arg0.method6029();
		} else if (arg1 == 2) {
			this.aString42 = arg0.method6029();
		} else {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (arg1 == 3) {
				local21 = arg0.method6069();
				this.anIntArrayArray51 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray51[local28][0] = arg0.method6003();
					this.anIntArrayArray51[local28][1] = arg0.method6036();
					this.anIntArrayArray51[local28][2] = arg0.method6036();
				}
			} else if (arg1 == 4) {
				local21 = arg0.method6069();
				this.anIntArrayArray49 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray49[local28][0] = arg0.method6003();
					this.anIntArrayArray49[local28][1] = arg0.method6036();
					this.anIntArrayArray49[local28][2] = arg0.method6036();
				}
			} else if (arg1 == 5) {
				arg0.method6003();
			} else if (arg1 == 6) {
				arg0.method6069();
			} else if (arg1 == 7) {
				arg0.method6069();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method6069();
				} else if (arg1 == 10) {
					local21 = arg0.method6069();
					this.anIntArray418 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray418[local28] = arg0.method6036();
					}
				} else if (arg1 == 12) {
					arg0.method6036();
				} else if (arg1 == 13) {
					local21 = arg0.method6069();
					this.anIntArray413 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray413[local28] = arg0.method6003();
					}
				} else if (arg1 == 14) {
					local21 = arg0.method6069();
					this.anIntArrayArray50 = new int[local21][2];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArrayArray50[local28][0] = arg0.method6069();
						this.anIntArrayArray50[local28][1] = arg0.method6069();
					}
				} else if (arg1 == 15) {
					arg0.method6003();
				} else if (arg1 == 17) {
					this.anInt5581 = arg0.method6003();
				} else if (arg1 == 18) {
					local21 = arg0.method6069();
					this.anIntArray420 = new int[local21];
					this.aStringArray22 = new String[local21];
					this.anIntArray416 = new int[local21];
					this.anIntArray415 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray420[local28] = arg0.method6036();
						this.anIntArray416[local28] = arg0.method6036();
						this.anIntArray415[local28] = arg0.method6036();
						this.aStringArray22[local28] = arg0.method6044();
					}
				} else if (arg1 == 19) {
					local21 = arg0.method6069();
					this.anIntArray417 = new int[local21];
					this.anIntArray419 = new int[local21];
					this.anIntArray414 = new int[local21];
					this.aStringArray23 = new String[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray417[local28] = arg0.method6036();
						this.anIntArray419[local28] = arg0.method6036();
						this.anIntArray414[local28] = arg0.method6036();
						this.aStringArray23[local28] = arg0.method6044();
					}
				} else if (arg1 == 249) {
					local21 = arg0.method6069();
					if (this.aClass128_27 == null) {
						local28 = Static253.method4296(local21);
						this.aClass128_27 = new Class128(local28);
					}
					for (local28 = 0; local28 < local21; local28++) {
						@Pc(314) boolean local314 = arg0.method6069() == 1;
						@Pc(318) int local318 = arg0.method6031();
						@Pc(327) Class6 local327;
						if (local314) {
							local327 = new Class6_Sub25(arg0.method6044());
						} else {
							local327 = new Class6_Sub35(arg0.method6036());
						}
						this.aClass128_27.method3267(local327, (long) local318);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method4803(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6069();
			if (local17 == 0) {
				return;
			}
			this.method4802(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
	public void method4805() {
		if (this.aString42 == null) {
			this.aString42 = this.aString43;
		}
	}
}
