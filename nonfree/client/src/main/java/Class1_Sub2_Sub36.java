import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
	private int anInt4191;

	@OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
	private int anInt4195;

	@OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
	private int anInt4197;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		this.anInt4191 = this.anInt4197 - this.anInt4195;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(23) int[][] local23 = this.method3390(arg0, 0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local13[2];
			for (@Pc(49) int local49 = 0; local49 < Static22.anInt596; local49++) {
				local39[local49] = this.anInt4195 + (this.anInt4191 * local27[local49] >> 12);
				local43[local49] = this.anInt4195 + (local31[local49] * this.anInt4191 >> 12);
				local47[local49] = this.anInt4195 + (local35[local49] * this.anInt4191 >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(27) int[] local27 = this.method3401(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static22.anInt596; local29++) {
				local17[local29] = this.anInt4195 + (local27[local29] * this.anInt4191 >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4195 = arg1.method1280();
		} else if (arg0 == 1) {
			this.anInt4197 = arg1.method1280();
		} else if (arg0 == 2) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}
}
