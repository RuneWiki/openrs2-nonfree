import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!e", name = "K", descriptor = "I")
	protected int anInt1086;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "[I")
	protected int[] anIntArray92;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "I")
	protected int anInt1088;

	@OriginalMember(owner = "client!e", name = "M", descriptor = "I")
	private int anInt1087 = -1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)I")
	@Override
	public final int method4581() {
		return this.anInt1087;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public final void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1087 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	@Override
	public final void method4580() {
		super.method4580();
		this.anIntArray92 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344 && this.method964()) {
			@Pc(33) int[] local33 = local19[1];
			@Pc(37) int[] local37 = local19[2];
			@Pc(53) int local53 = (Static202.anInt4038 == this.anInt1086 ? arg0 : arg0 * this.anInt1086 / Static202.anInt4038) * this.anInt1088;
			@Pc(57) int[] local57 = local19[0];
			@Pc(63) int local63;
			@Pc(76) int local76;
			if (this.anInt1088 == Static299.anInt5670) {
				for (local63 = 0; local63 < Static299.anInt5670; local63++) {
					local76 = this.anIntArray92[local53++];
					local37[local63] = (local76 & 0xFF) << 4;
					local33[local63] = local76 >> 4 & 0xFF0;
					local57[local63] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static299.anInt5670; local63++) {
					local76 = local63 * this.anInt1088 / Static299.anInt5670;
					@Pc(128) int local128 = this.anIntArray92[local53 + local76];
					local37[local63] = (local128 & 0xFF) << 4;
					local33[local63] = local128 >> 4 & 0xFF0;
					local57[local63] = local128 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(I)Z")
	protected final boolean method964() {
		if (this.anIntArray92 != null) {
			return true;
		} else if (this.anInt1087 >= 0) {
			@Pc(37) Class1_Sub1_Sub3_Sub2 local37 = Static175.anInt3623 >= 0 ? Static210.method3325(Static61.aClass138_14, Static175.anInt3623, this.anInt1087) : Static156.method2667(Static61.aClass138_14, this.anInt1087);
			local37.method3475();
			this.anInt1086 = local37.anInt5887;
			this.anIntArray92 = local37.anIntArray344;
			this.anInt1088 = local37.anInt5875;
			return true;
		} else {
			return false;
		}
	}
}
