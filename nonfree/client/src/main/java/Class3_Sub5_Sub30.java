import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class3_Sub5_Sub30 extends Class3_Sub5 {

	@OriginalMember(owner = "client!si", name = "P", descriptor = "I")
	private int anInt3749;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(33) int[] local33 = this.method3167(Static23.anInt543 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method3167(arg0, 0);
			@Pc(49) int[] local49 = this.method3167(Static23.anInt543 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static104.anInt2195; local51++) {
				@Pc(65) int local65 = (local49[local51] - local33[local51]) * this.anInt3749;
				@Pc(84) int local84 = this.anInt3749 * (local39[Static112.anInt2517 & local51 + 1] - local39[Static112.anInt2517 & local51 - 1]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(94) int local94 = local88 * local88 >> 12;
				@Pc(98) int local98 = local65 >> 12;
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local94 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129 = local118 == 0 ? 0 : 16777216 / local118;
				local19[local51] = 4096 - local129;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3749 = arg1.method2111();
		}
	}
}
