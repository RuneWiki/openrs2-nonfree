import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class3_Sub1_Sub36 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
	private int anInt8228 = 4096;

	@OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
	private int anInt8229 = 0;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8229 = arg0.method3109();
		} else if (arg1 == 1) {
			this.anInt8228 = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(30) int[] local30 = this.method7765(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static206.anInt4182; local32++) {
				@Pc(38) int local38 = local30[local32];
				local18[local32] = local38 >= this.anInt8229 && local38 <= this.anInt8228 ? 4096 : 0;
			}
		}
		return local18;
	}
}
