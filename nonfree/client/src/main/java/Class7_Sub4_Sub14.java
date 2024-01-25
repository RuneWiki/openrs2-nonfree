import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class7_Sub4_Sub14 extends Class7_Sub4 {

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
	private int anInt3190 = 0;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	private int anInt3191 = 1365;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
	private int anInt3186 = 20;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
	private int anInt3194 = 0;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3191 = arg0.method2764();
		} else if (arg1 == 1) {
			this.anInt3186 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt3190 = arg0.method2764();
		} else if (arg1 == 3) {
			this.anInt3194 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			for (@Pc(25) int local25 = 0; local25 < Static201.anInt4174; local25++) {
				@Pc(39) int local39 = this.anInt3190 + (Static129.anIntArray375[local25] << 12) / this.anInt3191;
				@Pc(52) int local52 = (Static314.anIntArray756[arg0] << 12) / this.anInt3191 + this.anInt3194;
				@Pc(58) int local58 = local39;
				@Pc(60) int local60 = local52;
				@Pc(66) int local66 = local39 * local39 >> 12;
				@Pc(72) int local72 = local52 * local52 >> 12;
				@Pc(74) int local74;
				for (local74 = 0; local72 + local66 < 16384 && this.anInt3186 > local74; local74++) {
					local60 = local52 + (local58 * local60 >> 12) * 2;
					local58 = local66 + local39 - local72;
					local72 = local60 * local60 >> 12;
					local66 = local58 * local58 >> 12;
				}
				local19[local25] = local74 < this.anInt3186 - 1 ? (local74 << 12) / this.anInt3186 : 0;
			}
		}
		return local19;
	}
}
