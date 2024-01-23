import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
	private int anInt1501 = 0;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
	private int anInt1494 = 4096;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(23) int[] local23 = this.method4464(arg0, 0);
			for (@Pc(25) int local25 = 0; local25 < Static6.anInt4960; local25++) {
				@Pc(32) int local32 = local23[local25];
				local13[local25] = this.anInt1501 <= local32 && this.anInt1494 >= local32 ? 4096 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1501 = arg0.method1879();
		} else if (arg1 == 1) {
			this.anInt1494 = arg0.method1879();
		}
	}
}
