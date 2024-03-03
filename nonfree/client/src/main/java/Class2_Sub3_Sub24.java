import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class2_Sub3_Sub24 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	public static int anInt4945 = 0;

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
	public static int anInt4949 = 0;

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "[B")
	public static final byte[] aByteArray60 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "Lclient!h;")
	public static final Class89 aClass89_180 = new Class89(92, 6);

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
	public static final int[] anIntArray338 = new int[25];

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 71)
	public Class2_Sub3_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I", line = 33)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(27) int[][] local27 = this.method6484(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static211.anInt4031; local41++) {
				local11[local41] = (local39[local41] + local35[local41] + local31[local41]) / 3;
			}
		}
		return local11;
	}
}
