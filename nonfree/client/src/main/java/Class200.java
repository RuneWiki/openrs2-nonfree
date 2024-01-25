import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class200 {

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "[I")
	private int[] anIntArray670;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
	private int[] anIntArray671;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
	private int[] anIntArray672;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray202;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
	private int[] anIntArray673;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Ljava/lang/String;")
	private String aString275;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray39;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray203;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray204;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "[I")
	private int[] anIntArray674;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "[I")
	private int[] anIntArray675;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "[I")
	private int[] anIntArray676;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Ljava/lang/String;")
	private String aString276;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "[I")
	private int[] anIntArray677;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "Lclient!jj;")
	private Class108 aClass108_32;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
	public int anInt5934 = -1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public void method5353() {
		if (this.aString275 == null) {
			this.aString275 = this.aString276;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ec;B)V")
	public void method5354(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3972();
			if (local5 == 0) {
				return;
			}
			this.method5358(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method5358(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString276 = arg0.method4013();
		} else if (arg1 == 2) {
			this.aString275 = arg0.method4013();
		} else {
			@Pc(25) int local25;
			@Pc(32) int local32;
			if (arg1 == 3) {
				local25 = arg0.method3972();
				this.anIntArrayArray203 = new int[local25][3];
				for (local32 = 0; local32 < local25; local32++) {
					this.anIntArrayArray203[local32][0] = arg0.method4021();
					this.anIntArrayArray203[local32][1] = arg0.method3979();
					this.anIntArrayArray203[local32][2] = arg0.method3979();
				}
			} else if (arg1 == 4) {
				local25 = arg0.method3972();
				this.anIntArrayArray202 = new int[local25][3];
				for (local32 = 0; local32 < local25; local32++) {
					this.anIntArrayArray202[local32][0] = arg0.method4021();
					this.anIntArrayArray202[local32][1] = arg0.method3979();
					this.anIntArrayArray202[local32][2] = arg0.method3979();
				}
			} else if (arg1 == 5) {
				arg0.method4021();
			} else if (arg1 == 6) {
				arg0.method3972();
			} else if (arg1 == 7) {
				arg0.method3972();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method3972();
				} else if (arg1 == 10) {
					local25 = arg0.method3972();
					this.anIntArray675 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray675[local32] = arg0.method3979();
					}
				} else if (arg1 == 12) {
					arg0.method3979();
				} else if (arg1 == 13) {
					local25 = arg0.method3972();
					this.anIntArray674 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray674[local32] = arg0.method4021();
					}
				} else if (arg1 == 14) {
					local25 = arg0.method3972();
					this.anIntArrayArray204 = new int[local25][2];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArrayArray204[local32][0] = arg0.method3972();
						this.anIntArrayArray204[local32][1] = arg0.method3972();
					}
				} else if (arg1 == 15) {
					arg0.method4021();
				} else if (arg1 == 17) {
					this.anInt5934 = arg0.method4021();
				} else if (arg1 == 18) {
					local25 = arg0.method3972();
					this.anIntArray676 = new int[local25];
					this.anIntArray677 = new int[local25];
					this.aStringArray39 = new String[local25];
					this.anIntArray672 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray676[local32] = arg0.method3979();
						this.anIntArray677[local32] = arg0.method3979();
						this.anIntArray672[local32] = arg0.method3979();
						this.aStringArray39[local32] = arg0.method4023();
					}
				} else if (arg1 == 19) {
					local25 = arg0.method3972();
					this.anIntArray673 = new int[local25];
					this.anIntArray671 = new int[local25];
					this.anIntArray670 = new int[local25];
					this.aStringArray40 = new String[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray670[local32] = arg0.method3979();
						this.anIntArray671[local32] = arg0.method3979();
						this.anIntArray673[local32] = arg0.method3979();
						this.aStringArray40[local32] = arg0.method4023();
					}
				} else if (arg1 == 249) {
					local25 = arg0.method3972();
					if (this.aClass108_32 == null) {
						local32 = Static247.method4066(local25);
						this.aClass108_32 = new Class108(local32);
					}
					for (local32 = 0; local32 < local25; local32++) {
						@Pc(366) boolean local366 = arg0.method3972() == 1;
						@Pc(370) int local370 = arg0.method3996();
						@Pc(379) Class6 local379;
						if (local366) {
							local379 = new Class6_Sub24(arg0.method4023());
						} else {
							local379 = new Class6_Sub43(arg0.method3979());
						}
						this.aClass108_32.method2898((long) local370, local379);
					}
				}
			}
		}
	}
}
