import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class382 {

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "[I")
	private int[] anIntArray672;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "[I")
	private int[] anIntArray673;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "[I")
	private int[] anIntArray674;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "Lclient!dfa;")
	private Class74 aClass74_75;

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "[I")
	private int[] anIntArray675;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "[I")
	private int[] anIntArray676;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "Ljava/lang/String;")
	private String aString126;

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "[I")
	private int[] anIntArray677;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Ljava/lang/String;")
	private String aString127;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "[I")
	private int[] anIntArray678;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray44;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "[I")
	private int[] anIntArray679;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
	public int anInt10168 = -1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	public void method8762() {
		if (this.aString127 == null) {
			this.aString127 = this.aString126;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method8763(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.aString126 = arg1.method2998();
		} else if (arg0 == 2) {
			this.aString127 = arg1.method2998();
		} else {
			@Pc(102) int local102;
			@Pc(109) int local109;
			if (arg0 == 3) {
				local102 = arg1.method3030();
				this.anIntArrayArray57 = new int[local102][3];
				for (local109 = 0; local109 < local102; local109++) {
					this.anIntArrayArray57[local109][0] = arg1.method3018();
					this.anIntArrayArray57[local109][1] = arg1.method3015();
					this.anIntArrayArray57[local109][2] = arg1.method3015();
				}
			} else if (arg0 == 4) {
				local102 = arg1.method3030();
				this.anIntArrayArray58 = new int[local102][3];
				for (local109 = 0; local109 < local102; local109++) {
					this.anIntArrayArray58[local109][0] = arg1.method3018();
					this.anIntArrayArray58[local109][1] = arg1.method3015();
					this.anIntArrayArray58[local109][2] = arg1.method3015();
				}
			} else if (arg0 == 5) {
				arg1.method3018();
			} else if (arg0 == 6) {
				arg1.method3030();
			} else if (arg0 == 7) {
				arg1.method3030();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method3030();
				} else if (arg0 == 10) {
					local102 = arg1.method3030();
					this.anIntArray679 = new int[local102];
					for (local109 = 0; local109 < local102; local109++) {
						this.anIntArray679[local109] = arg1.method3015();
					}
				} else if (arg0 == 12) {
					arg1.method3015();
				} else if (arg0 == 13) {
					local102 = arg1.method3030();
					this.anIntArray675 = new int[local102];
					for (local109 = 0; local109 < local102; local109++) {
						this.anIntArray675[local109] = arg1.method3018();
					}
				} else if (arg0 == 14) {
					local102 = arg1.method3030();
					this.anIntArrayArray56 = new int[local102][2];
					for (local109 = 0; local109 < local102; local109++) {
						this.anIntArrayArray56[local109][0] = arg1.method3030();
						this.anIntArrayArray56[local109][1] = arg1.method3030();
					}
				} else if (arg0 == 15) {
					arg1.method3018();
				} else if (arg0 == 17) {
					this.anInt10168 = arg1.method3018();
				} else if (arg0 == 18) {
					local102 = arg1.method3030();
					this.aStringArray43 = new String[local102];
					this.anIntArray677 = new int[local102];
					this.anIntArray673 = new int[local102];
					this.anIntArray676 = new int[local102];
					for (local109 = 0; local109 < local102; local109++) {
						this.anIntArray677[local109] = arg1.method3015();
						this.anIntArray676[local109] = arg1.method3015();
						this.anIntArray673[local109] = arg1.method3015();
						this.aStringArray43[local109] = arg1.method3046();
					}
				} else if (arg0 == 19) {
					local102 = arg1.method3030();
					this.aStringArray44 = new String[local102];
					this.anIntArray674 = new int[local102];
					this.anIntArray678 = new int[local102];
					this.anIntArray672 = new int[local102];
					for (local109 = 0; local109 < local102; local109++) {
						this.anIntArray678[local109] = arg1.method3015();
						this.anIntArray672[local109] = arg1.method3015();
						this.anIntArray674[local109] = arg1.method3015();
						this.aStringArray44[local109] = arg1.method3046();
					}
				} else if (arg0 == 249) {
					local102 = arg1.method3030();
					if (this.aClass74_75 == null) {
						local109 = Static314.method4970(local102);
						this.aClass74_75 = new Class74(local109);
					}
					for (local109 = 0; local109 < local102; local109++) {
						@Pc(228) boolean local228 = arg1.method3030() == 1;
						@Pc(232) int local232 = arg1.method2987();
						@Pc(241) Class6 local241;
						if (local228) {
							local241 = new Class6_Sub43(arg1.method3046());
						} else {
							local241 = new Class6_Sub6(arg1.method3015());
						}
						this.aClass74_75.method1399(local241, (long) local232);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!jc;)V")
	public void method8765(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3030();
			if (local9 == 0) {
				return;
			}
			this.method8763(local9, arg0);
		}
	}
}
