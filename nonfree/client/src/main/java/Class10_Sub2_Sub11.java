import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class10_Sub2_Sub11 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
	private int anInt2106 = 0;

	@OriginalMember(owner = "client!ev", name = "L", descriptor = "I")
	private int anInt2107 = 20;

	@OriginalMember(owner = "client!ev", name = "S", descriptor = "I")
	private int anInt2113 = 0;

	@OriginalMember(owner = "client!ev", name = "U", descriptor = "I")
	private int anInt2114 = 1365;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2114 = arg1.method2485();
		} else if (arg0 == 1) {
			this.anInt2107 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt2113 = arg1.method2485();
		} else if (arg0 == 3) {
			this.anInt2106 = arg1.method2485();
		}
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			for (@Pc(22) int local22 = 0; local22 < Static121.anInt2458; local22++) {
				@Pc(36) int local36 = this.anInt2113 + (Static182.anIntArray374[local22] << 12) / this.anInt2114;
				@Pc(48) int local48 = (Static67.anIntArray106[arg0] << 12) / this.anInt2114 + this.anInt2106;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70;
				for (local70 = 0; local62 + local68 < 16384 && this.anInt2107 > local70; local70++) {
					local56 = local48 + (local54 * local56 >> 12) * 2;
					local54 = local36 + local62 - local68;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local16[local22] = local70 >= this.anInt2107 - 1 ? 0 : (local70 << 12) / this.anInt2107;
			}
		}
		return local16;
	}
}
