import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class2_Sub3_Sub38 extends Class2_Sub3 {

	@OriginalMember(owner = "client!vn", name = "R", descriptor = "Z")
	public static boolean aBoolean474 = true;

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
	private int anInt6977 = 4;

	@OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
	private int anInt6978 = 4;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 10)
	public Class2_Sub3_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IB)[[I", line = 13)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(25) int local25 = Static211.anInt4031 / this.anInt6978;
			@Pc(30) int local30 = Static23.anInt638 / this.anInt6977;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method6484(0, Static23.anInt638 * local39 / local30);
			} else {
				local49 = this.method6484(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static211.anInt4031; local83++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local25;
					local89 = Static211.anInt4031 * local95 / local25;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)[I", line = 82)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(28) int local28 = Static211.anInt4031 / this.anInt6978;
			@Pc(33) int local33 = Static23.anInt638 / this.anInt6977;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local33 > 0) {
				local39 = arg0 % local33;
				local49 = this.method6474(0, local39 * Static23.anInt638 / local33);
			} else {
				local49 = this.method6474(0, 0);
			}
			for (local39 = 0; local39 < Static211.anInt4031; local39++) {
				if (local28 > 0) {
					@Pc(67) int local67 = local39 % local28;
					local11[local39] = local49[local67 * Static211.anInt4031 / local28];
				} else {
					local11[local39] = local49[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!bt;I)V", line = 151)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt6978 = arg1.method4816();
		} else if (arg0 == 1) {
			this.anInt6977 = arg1.method4816();
		}
	}
}
