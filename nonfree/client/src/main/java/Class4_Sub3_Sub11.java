import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class4_Sub3_Sub11 extends Class4_Sub3 {

	@OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
	private int anInt2703 = 4096;

	@OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
	private int anInt2702 = 0;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2702 = arg1.method4560();
		} else if (arg0 == 1) {
			this.anInt2703 = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(30) int[] local30 = this.method6337(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static304.anInt5637; local32++) {
				@Pc(38) int local38 = local30[local32];
				local11[local32] = this.anInt2702 <= local38 && this.anInt2703 >= local38 ? 4096 : 0;
			}
		}
		return local11;
	}
}
