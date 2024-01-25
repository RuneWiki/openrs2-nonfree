import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public class Class2_Sub15_Sub7 extends Class2_Sub15 {

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
	protected int anInt8299;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "[I")
	protected int[] anIntArray417;

	@OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
	protected int anInt8308;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
	private int anInt8306 = -1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub7() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Z")
	protected final boolean method7428() {
		if (this.anIntArray417 != null) {
			return true;
		} else if (this.anInt8306 >= 0) {
			@Pc(30) Class67 local30 = Static378.anInt7175 >= 0 ? Static676.method1693(Static285.aClass124_61, Static378.anInt7175, this.anInt8306) : Static676.method1689(Static285.aClass124_61, this.anInt8306);
			local30.method1687();
			this.anIntArray417 = local30.method1685();
			this.anInt8308 = local30.anInt1759;
			this.anInt8299 = local30.anInt1761;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64 && this.method7428()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = this.anInt8299 * (this.anInt8308 == Static667.anInt10615 ? arg0 : this.anInt8308 * arg0 / Static667.anInt10615);
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (Static329.anInt6017 == this.anInt8299) {
				for (local58 = 0; local58 < Static329.anInt6017; local58++) {
					local67 = this.anIntArray417[local52++];
					local36[local58] = (local67 & 0xFF) << 4;
					local32[local58] = local67 >> 4 & 0xFF0;
					local28[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static329.anInt6017; local58++) {
					local67 = this.anInt8299 * local58 / Static329.anInt6017;
					@Pc(74) int local74 = this.anIntArray417[local52 + local67];
					local36[local58] = (local74 & 0xFF) << 4;
					local32[local58] = local74 >> 4 & 0xFF0;
					local28[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public final void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8306 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	@Override
	public final void method9720() {
		super.method9720();
		this.anIntArray417 = null;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	@Override
	public final int method9726() {
		return this.anInt8306;
	}
}
