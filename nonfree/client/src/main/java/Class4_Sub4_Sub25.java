import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public class Class4_Sub4_Sub25 extends Class4_Sub4 {

	@OriginalMember(owner = "client!nfa", name = "K", descriptor = "[I")
	protected int[] anIntArray681;

	@OriginalMember(owner = "client!nfa", name = "M", descriptor = "I")
	protected int anInt8982;

	@OriginalMember(owner = "client!nfa", name = "Q", descriptor = "I")
	protected int anInt8984;

	@OriginalMember(owner = "client!nfa", name = "T", descriptor = "I")
	private int anInt8986 = -1;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub25() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392 && this.method7382()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(53) int local53 = this.anInt8984 * (this.anInt8982 == Static278.anInt5214 ? arg0 : arg0 * this.anInt8982 / Static278.anInt5214);
			@Pc(59) int local59;
			@Pc(67) int local67;
			if (this.anInt8984 == Static560.anInt9394) {
				for (local59 = 0; local59 < Static560.anInt9394; local59++) {
					local67 = this.anIntArray681[local53++];
					local37[local59] = (local67 & 0xFF) << 4;
					local33[local59] = local67 >> 4 & 0xFF0;
					local29[local59] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static560.anInt9394; local59++) {
					local67 = this.anInt8984 * local59 / Static560.anInt9394;
					@Pc(116) int local116 = this.anIntArray681[local53 + local67];
					local37[local59] = (local116 & 0xFF) << 4;
					local33[local59] = local116 >> 4 & 0xFF0;
					local29[local59] = local116 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)I")
	@Override
	public final int method7888() {
		return this.anInt8986;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
	@Override
	public final void method7882() {
		super.method7882();
		this.anIntArray681 = null;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public final void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt8986 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)Z")
	protected final boolean method7382() {
		if (this.anIntArray681 != null) {
			return true;
		} else if (this.anInt8986 >= 0) {
			@Pc(34) Class268 local34 = Static210.anInt4324 >= 0 ? Static607.method5872(Static230.aClass31_52, Static210.anInt4324, this.anInt8986) : Static607.method5882(Static230.aClass31_52, this.anInt8986);
			local34.method5875();
			this.anIntArray681 = local34.method5873();
			this.anInt8982 = local34.anInt7060;
			this.anInt8984 = local34.anInt7058;
			return true;
		} else {
			return false;
		}
	}
}
