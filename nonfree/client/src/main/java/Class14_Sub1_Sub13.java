import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fka")
public final class Class14_Sub1_Sub13 extends Class14_Sub1 {

	@OriginalMember(owner = "client!fka", name = "E", descriptor = "I")
	private int anInt3222 = 20;

	@OriginalMember(owner = "client!fka", name = "J", descriptor = "I")
	private int anInt3226 = 0;

	@OriginalMember(owner = "client!fka", name = "M", descriptor = "I")
	private int anInt3229 = 0;

	@OriginalMember(owner = "client!fka", name = "L", descriptor = "I")
	private int anInt3228 = 1365;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			for (@Pc(25) int local25 = 0; local25 < Static371.anInt6835; local25++) {
				@Pc(39) int local39 = (Static160.anIntArray258[local25] << 12) / this.anInt3228 + this.anInt3229;
				@Pc(51) int local51 = this.anInt3226 + (Static336.anIntArray458[arg0] << 12) / this.anInt3228;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local71 + local65 < 16384 && local73 < this.anInt3222) {
					local59 = local51 + (local59 * local57 >> 12) * 2;
					local57 = local39 + local65 - local71;
					local71 = local59 * local59 >> 12;
					local73++;
					local65 = local57 * local57 >> 12;
				}
				local11[local25] = local73 >= this.anInt3222 - 1 ? 0 : (local73 << 12) / this.anInt3222;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3228 = arg0.method5900();
		} else if (arg1 == 1) {
			this.anInt3222 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt3229 = arg0.method5900();
		} else if (arg1 == 3) {
			this.anInt3226 = arg0.method5900();
		}
	}
}
