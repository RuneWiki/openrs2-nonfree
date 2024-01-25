import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class11_Sub2_Sub30 extends Class11_Sub2 {

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	private int anInt5138 = 3072;

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
	private int anInt5145 = 2048;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	private int anInt5137 = 1024;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5137 = arg0.method5187();
		} else if (arg1 == 1) {
			this.anInt5138 = arg0.method5187();
		} else if (arg1 == 2) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.anInt5145 = this.anInt5138 - this.anInt5137;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(27) int[][] local27 = this.method5715(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static339.anInt6549; local53++) {
				local43[local53] = (this.anInt5145 * local31[local53] >> 12) + this.anInt5137;
				local47[local53] = this.anInt5137 + (this.anInt5145 * local35[local53] >> 12);
				local51[local53] = (this.anInt5145 * local39[local53] >> 12) + this.anInt5137;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(26) int[] local26 = this.method5710(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static339.anInt6549; local28++) {
				local11[local28] = (local26[local28] * this.anInt5145 >> 12) + this.anInt5137;
			}
		}
		return local11;
	}
}
