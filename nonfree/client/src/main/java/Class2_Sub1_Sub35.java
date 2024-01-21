import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ue", name = "mb", descriptor = "I")
	private int anInt4006;

	@OriginalMember(owner = "client!ue", name = "nb", descriptor = "I")
	private int anInt4007;

	@OriginalMember(owner = "client!ue", name = "rb", descriptor = "I")
	private int anInt4010;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2748(arg0.method2341());
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	private void method2748(@OriginalArg(0) int arg0) {
		this.anInt4006 = (arg0 & 0xFF) << 4;
		this.anInt4007 = arg0 >> 4 & 0xFF0;
		this.anInt4010 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(27) int[] local27 = local7[0];
			@Pc(31) int[] local31 = local7[1];
			@Pc(35) int[] local35 = local7[2];
			for (@Pc(37) int local37 = 0; local37 < Static129.anInt3118; local37++) {
				local27[local37] = this.anInt4010;
				local31[local37] = this.anInt4007;
				local35[local37] = this.anInt4006;
			}
		}
		return local7;
	}
}
