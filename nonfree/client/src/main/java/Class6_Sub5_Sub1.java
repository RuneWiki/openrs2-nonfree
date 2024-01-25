import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public class Class6_Sub5_Sub1 extends Class6_Sub5 {

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
	protected int anInt643;

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
	protected int anInt644;

	@OriginalMember(owner = "client!jj", name = "V", descriptor = "[I")
	protected int[] anIntArray24;

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
	private int anInt648 = -1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public final void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt648 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)Z")
	protected final boolean method578() {
		if (this.anIntArray24 != null) {
			return true;
		} else if (this.anInt648 >= 0) {
			@Pc(27) Class194 local27 = Static147.anInt2987 < 0 ? Static458.method4486(Static370.aClass100_75, this.anInt648) : Static458.method4494(Static370.aClass100_75, Static147.anInt2987, this.anInt648);
			local27.method4484();
			this.anIntArray24 = local27.method4490();
			this.anInt644 = local27.anInt5383;
			this.anInt643 = local27.anInt5386;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)I")
	@Override
	public final int method6539() {
		return this.anInt648;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6541() {
		super.method6541();
		this.anIntArray24 = null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291 && this.method578()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(56) int local56 = (Static235.anInt4304 == this.anInt643 ? arg0 : this.anInt643 * arg0 / Static235.anInt4304) * this.anInt644;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt644 == Static240.anInt4386) {
				for (local62 = 0; local62 < Static240.anInt4386; local62++) {
					local71 = this.anIntArray24[local56++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static240.anInt4386; local62++) {
					local71 = local62 * this.anInt644 / Static240.anInt4386;
					@Pc(79) int local79 = this.anIntArray24[local56 + local71];
					local36[local62] = (local79 & 0xFF) << 4;
					local32[local62] = local79 >> 4 & 0xFF0;
					local28[local62] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
