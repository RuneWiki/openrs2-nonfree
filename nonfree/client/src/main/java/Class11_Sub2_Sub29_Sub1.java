import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class11_Sub2_Sub29_Sub1 extends Class11_Sub2_Sub29 {

	@OriginalMember(owner = "client!pm", name = "bb", descriptor = "[I")
	public static final int[] anIntArray384 = new int[4096];

	static {
		for (@Pc(8) int local8 = 0; local8 < 4096; local8++) {
			anIntArray384[local8] = Static347.method5635(local8);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85 && this.method4304()) {
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			@Pc(46) int local46 = super.anInt4923 * (arg0 % super.anInt4923);
			for (@Pc(48) int local48 = 0; local48 < Static339.anInt6549; local48++) {
				@Pc(60) int local60 = super.anIntArray383[local48 % super.anInt4919 + local46];
				local38[local48] = (local60 & 0xFF) << 4;
				local34[local48] = local60 >> 4 & 0xFF0;
				local30[local48] = local60 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
