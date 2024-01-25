import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class6_Sub1_Sub10 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
	private int anInt2832 = 32768;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2832 = arg0.method8363() << 4;
		} else if (arg1 == 1) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(27) int[] local27 = this.method8963(1, arg0);
			@Pc(33) int[] local33 = this.method8963(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static479.anInt8231; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = this.anInt2832 * local33[local35] >> 12;
				@Pc(62) int local62 = local54 * Static404.anIntArray300[local45] >> 12;
				@Pc(70) int local70 = local54 * Static164.anIntArray710[local45] >> 12;
				@Pc(79) int local79 = Static413.anInt7225 & local35 + (local62 >> 12);
				@Pc(87) int local87 = Static476.anInt8174 & arg0 + (local70 >> 12);
				@Pc(93) int[] local93 = this.method8963(0, local87);
				local17[local35] = local93[local79];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(21) int[] local21 = this.method8963(1, arg0);
			@Pc(27) int[] local27 = this.method8963(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static479.anInt8231; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt2832 * local27[local41] >> 12;
				@Pc(70) int local70 = Static404.anIntArray300[local53] * local62 >> 12;
				@Pc(78) int local78 = local62 * Static164.anIntArray710[local53] >> 12;
				@Pc(86) int local86 = local41 + (local70 >> 12) & Static413.anInt7225;
				@Pc(95) int local95 = arg0 + (local78 >> 12) & Static476.anInt8174;
				@Pc(101) int[][] local101 = this.method8959(local95, 0);
				local31[local41] = local101[0][local86];
				local35[local41] = local101[1][local86];
				local39[local41] = local101[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		Static364.method5249();
	}
}
