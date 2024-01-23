import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class8_Sub3_Sub37 extends Class8_Sub3 {

	@OriginalMember(owner = "client!un", name = "I", descriptor = "I")
	private int anInt5393 = 0;

	@OriginalMember(owner = "client!un", name = "J", descriptor = "I")
	private int anInt5394 = 1365;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "I")
	private int anInt5398 = 0;

	@OriginalMember(owner = "client!un", name = "O", descriptor = "I")
	private int anInt5399 = 20;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			for (@Pc(24) int local24 = 0; local24 < Static239.anInt4789; local24++) {
				@Pc(44) int local44 = (Static171.anIntArray258[local24] << 12) / this.anInt5394 + this.anInt5393;
				@Pc(57) int local57 = (Static33.anIntArray50[arg0] << 12) / this.anInt5394 + this.anInt5398;
				@Pc(59) int local59 = local44;
				@Pc(61) int local61 = local57;
				@Pc(67) int local67 = 0;
				@Pc(73) int local73 = local57 * local57 >> 12;
				@Pc(79) int local79 = local44 * local44 >> 12;
				while (local79 + local73 < 16384 && this.anInt5399 > local67) {
					local67++;
					local61 = (local59 * local61 >> 12) * 2 + local57;
					local59 = local79 + local44 - local73;
					local79 = local59 * local59 >> 12;
					local73 = local61 * local61 >> 12;
				}
				local17[local24] = local67 < this.anInt5399 - 1 ? (local67 << 12) / this.anInt5399 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5394 = arg1.method2375();
		} else if (arg0 == 1) {
			this.anInt5399 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt5393 = arg1.method2375();
		} else if (arg0 == 3) {
			this.anInt5398 = arg1.method2375();
		}
	}
}
