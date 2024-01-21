import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class3_Sub5_Sub24 extends Class3_Sub5 {

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
	private int anInt3185;

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
	private int anInt3189;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		Static153.method447();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(27) int local27 = Static94.anIntArray277[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static104.anInt2195; local35++) {
				@Pc(41) int local41 = Static124.anIntArray355[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(73) int local73;
				if (this.anInt3179 == 0) {
					local73 = this.anInt3185 * (local41 - local27);
				} else {
					@Pc(63) int local63 = local33 * local33 + local47 * local47 >> 12;
					local73 = (int) (Math.sqrt((double) ((float) local63 / 4096.0F)) * 4096.0D);
					local73 = (int) ((double) (local73 * this.anInt3185) * 3.141592653589793D);
				}
				local73 -= local73 & 0xFFFFF000;
				if (this.anInt3189 == 0) {
					local73 = Static51.anIntArray160[local73 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3189 == 2) {
					local73 -= 2048;
					if (local73 < 0) {
						local73 = -local73;
					}
					local73 = 2048 - local73 << 1;
				}
				local19[local35] = local73;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3179 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt3189 = arg1.method2107();
		} else if (arg0 == 3) {
			this.anInt3185 = arg1.method2107();
		}
	}
}
