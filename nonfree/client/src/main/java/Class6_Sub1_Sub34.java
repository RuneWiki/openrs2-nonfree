import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class6_Sub1_Sub34 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
	private int anInt9314 = 0;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	private int anInt9318 = 0;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
	private int anInt9320 = 20;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
	private int anInt9315 = 1365;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9315 = arg1.method8220();
		} else if (arg0 == 1) {
			this.anInt9320 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt9318 = arg1.method8220();
		} else if (arg0 == 3) {
			this.anInt9314 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			for (@Pc(22) int local22 = 0; local22 < Static53.anInt1787; local22++) {
				@Pc(36) int local36 = (Static12.anIntArray15[local22] << 12) / this.anInt9315 + this.anInt9318;
				@Pc(48) int local48 = this.anInt9314 + (Static603.anIntArray549[arg0] << 12) / this.anInt9315;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && local70 < this.anInt9320) {
					local56 = (local54 * local56 >> 12) * 2 + local48;
					local54 = local36 + local62 - local68;
					local62 = local54 * local54 >> 12;
					local70++;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = this.anInt9320 - 1 > local70 ? (local70 << 12) / this.anInt9320 : 0;
			}
		}
		return local16;
	}
}
