import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class3_Sub1_Sub20 extends Class3_Sub1 {

	@OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
	private int anInt2908;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2908 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(29) int local29 = Static22.anIntArray152[arg0];
			for (@Pc(31) int local31 = 0; local31 < Static129.anInt3285; local31++) {
				@Pc(37) int local37 = Static146.anIntArray618[local31];
				@Pc(73) int local73;
				if (this.anInt2908 < local37 && 4096 - this.anInt2908 > local37 && 2048 - this.anInt2908 < local29 && local29 < this.anInt2908 + 2048) {
					local73 = 2048 - local37;
					local73 = local73 >= 0 ? local73 : -local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt2908;
					local21[local31] = 4096 - local73;
				} else if (local37 > 2048 - this.anInt2908 && local37 < this.anInt2908 + 2048) {
					local73 = local29 - 2048;
					local73 = local73 < 0 ? -local73 : local73;
					local73 -= this.anInt2908;
					local73 <<= 0xC;
					local21[local31] = local73 / (2048 - this.anInt2908);
				} else if (this.anInt2908 > local29 || local29 > 4096 - this.anInt2908) {
					local73 = local37 - 2048;
					@Pc(174) int local174 = local73 < 0 ? -local73 : local73;
					@Pc(179) int local179 = local174 - this.anInt2908;
					@Pc(183) int local183 = local179 << 12;
					local21[local31] = local183 / (2048 - this.anInt2908);
				} else if (local37 >= this.anInt2908 && local37 <= 4096 - this.anInt2908) {
					local21[local31] = 0;
				} else {
					local73 = 2048 - local29;
					local73 = local73 < 0 ? -local73 : local73;
					local73 <<= 0xC;
					local73 /= 2048 - this.anInt2908;
					local21[local31] = 4096 - local73;
				}
			}
		}
		return local21;
	}
}
