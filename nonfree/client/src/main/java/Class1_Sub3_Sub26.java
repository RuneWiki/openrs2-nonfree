import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub3_Sub26 extends Class1_Sub3 {

	@OriginalMember(owner = "client!m", name = "R", descriptor = "[I")
	public static int[] anIntArray276 = new int[256];

	@OriginalMember(owner = "client!m", name = "V", descriptor = "I")
	private int anInt2529 = 4096;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray276[local6] = local9;
		}
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2529 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(27) int[] local27 = this.method3468(arg0 - 1 & Static171.anInt3496, 0);
			@Pc(33) int[] local33 = this.method3468(arg0, 0);
			@Pc(43) int[] local43 = this.method3468(Static171.anInt3496 & arg0 + 1, 0);
			for (@Pc(45) int local45 = 0; local45 < Static76.anInt1531; local45++) {
				@Pc(59) int local59 = (local43[local45] - local27[local45]) * this.anInt2529;
				@Pc(79) int local79 = this.anInt2529 * (local33[Static121.anInt2385 & local45 + 1] - local33[local45 - 1 & Static121.anInt2385]);
				@Pc(83) int local83 = local59 >> 12;
				@Pc(87) int local87 = local79 >> 12;
				@Pc(93) int local93 = local83 * local83 >> 12;
				@Pc(99) int local99 = local87 * local87 >> 12;
				@Pc(114) int local114 = (int) (Math.sqrt((double) ((float) (local99 + local93 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(125) int local125 = local114 == 0 ? 0 : 16777216 / local114;
				local13[local45] = 4096 - local125;
			}
		}
		return local13;
	}
}
