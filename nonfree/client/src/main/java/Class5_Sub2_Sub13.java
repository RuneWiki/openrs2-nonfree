import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class5_Sub2_Sub13 extends Class5_Sub2 {

	@OriginalMember(owner = "client!er", name = "P", descriptor = "I")
	private int anInt1885 = 32768;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub13() {
		super(3, false);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(21) int[] local21 = this.method5808(1, arg0);
			@Pc(27) int[] local27 = this.method5808(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static15.anInt493; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt1885 * local27[local29] >> 12;
				@Pc(56) int local56 = local48 * Static73.anIntArray94[local39] >> 12;
				@Pc(64) int local64 = Static228.anIntArray320[local39] * local48 >> 12;
				@Pc(72) int local72 = Static317.anInt6151 & (local56 >> 12) + local29;
				@Pc(80) int local80 = Static19.anInt547 & arg0 + (local64 >> 12);
				@Pc(86) int[] local86 = this.method5808(0, local80);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		Static10.method307();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1885 = arg0.method1845() << 4;
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(29) int[] local29 = this.method5808(1, arg0);
			@Pc(35) int[] local35 = this.method5808(2, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static15.anInt493; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt1885 * local35[local49] >> 12;
				@Pc(78) int local78 = local70 * Static73.anIntArray94[local61] >> 12;
				@Pc(86) int local86 = local70 * Static228.anIntArray320[local61] >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static317.anInt6151;
				@Pc(102) int local102 = Static19.anInt547 & (local86 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method5818(local102, 0);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}
}
