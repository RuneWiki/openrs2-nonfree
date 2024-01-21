import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public class Class2_Sub4_Sub12 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "[I")
	protected int[] anIntArray401;

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
	protected int anInt4463;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
	protected int anInt4470;

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
	private int anInt4462 = -1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176 && this.method3135()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(48) int local48 = this.anInt4470 * (this.anInt4463 == Static38.anInt3056 ? arg0 : this.anInt4463 * arg0 / Static38.anInt3056);
			@Pc(52) int[] local52 = local11[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (Static118.anInt2608 == this.anInt4470) {
				for (local58 = 0; local58 < Static118.anInt2608; local58++) {
					local66 = this.anIntArray401[local48++];
					local52[local58] = (local66 & 0xFF) << 4;
					local32[local58] = local66 >> 4 & 0xFF0;
					local28[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static118.anInt2608; local58++) {
					local66 = this.anInt4470 * local58 / Static118.anInt2608;
					@Pc(114) int local114 = this.anIntArray401[local66 + local48];
					local52[local58] = (local114 & 0xFF) << 4;
					local32[local58] = local114 >> 4 & 0xFF0;
					local28[local58] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	@Override
	public final void method3123() {
		super.method3123();
		this.anIntArray401 = null;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)Z")
	protected final boolean method3135() {
		if (this.anIntArray401 != null) {
			return true;
		} else if (this.anInt4462 >= 0) {
			@Pc(20) Class2_Sub1_Sub2_Sub1 local20 = Static83.method1172(Static26.aClass71_35, this.anInt4462);
			local20.method297();
			this.anInt4470 = local20.anInt403;
			this.anInt4463 = local20.anInt401;
			this.anIntArray401 = local20.anIntArray32;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public final void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4462 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I")
	@Override
	public final int method3128() {
		return this.anInt4462;
	}
}
