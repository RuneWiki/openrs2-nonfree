import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class6_Sub1_Sub16 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hda", name = "F", descriptor = "I")
	private int anInt4142;

	@OriginalMember(owner = "client!hda", name = "G", descriptor = "I")
	private int anInt4143;

	@OriginalMember(owner = "client!hda", name = "I", descriptor = "I")
	private int anInt4145;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(I)V")
	private Class6_Sub1_Sub16(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3642(arg0);
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub16() {
		this(0);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.method3642(arg1.method4949());
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static289.anInt5549; local34++) {
				local24[local34] = this.anInt4145;
				local28[local34] = this.anInt4143;
				local32[local34] = this.anInt4142;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)V")
	private void method3642(@OriginalArg(0) int arg0) {
		this.anInt4142 = (arg0 & 0xFF) << 4;
		this.anInt4143 = arg0 >> 4 & 0xFF0;
		this.anInt4145 = arg0 >> 12 & 0xFF0;
	}
}
