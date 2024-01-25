import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class3_Sub3_Sub32 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
	private int anInt5864 = 20;

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
	private int anInt5868 = 0;

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
	private int anInt5867 = 1365;

	@OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
	private int anInt5872 = 0;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			for (@Pc(22) int local22 = 0; local22 < Static131.anInt2755; local22++) {
				@Pc(36) int local36 = this.anInt5872 + (Static151.anIntArray211[local22] << 12) / this.anInt5867;
				@Pc(48) int local48 = this.anInt5868 + (Static269.anIntArray433[arg0] << 12) / this.anInt5867;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70;
				for (local70 = 0; local62 + local68 < 16384 && this.anInt5864 > local70; local70++) {
					local56 = (local54 * local56 >> 12) * 2 + local48;
					local54 = local62 + local36 - local68;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local16[local22] = this.anInt5864 - 1 > local70 ? (local70 << 12) / this.anInt5864 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5867 = arg0.method3649();
		} else if (arg1 == 1) {
			this.anInt5864 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt5872 = arg0.method3649();
		} else if (arg1 == 3) {
			this.anInt5868 = arg0.method3649();
		}
	}
}
