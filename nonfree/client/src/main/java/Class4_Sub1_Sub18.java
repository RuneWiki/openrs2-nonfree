import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public class Class4_Sub1_Sub18 extends Class4_Sub1 {

	@OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
	protected int anInt10284;

	@OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
	protected int anInt10286;

	@OriginalMember(owner = "client!kt", name = "L", descriptor = "[I")
	protected int[] anIntArray556;

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
	private int anInt10287 = -1;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub18() {
		super(0, false);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8386() {
		super.method8386();
		this.anIntArray556 = null;
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(B)Z")
	protected final boolean method8397() {
		if (this.anIntArray556 != null) {
			return true;
		} else if (this.anInt10287 >= 0) {
			@Pc(24) Class261 local24 = Static117.anInt2698 < 0 ? Static598.method6323(Static12.aClass176_7, this.anInt10287) : Static598.method6312(Static12.aClass176_7, Static117.anInt2698, this.anInt10287);
			local24.method6314();
			this.anIntArray556 = local24.method6321();
			this.anInt10286 = local24.anInt7655;
			this.anInt10284 = local24.anInt7660;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public final void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt10287 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)I")
	@Override
	public final int method8390() {
		return this.anInt10287;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194 && this.method8397()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = (this.anInt10284 == Static477.anInt8774 ? arg0 : arg0 * this.anInt10284 / Static477.anInt8774) * this.anInt10286;
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (Static376.anInt7260 == this.anInt10286) {
				for (local61 = 0; local61 < Static376.anInt7260; local61++) {
					local70 = this.anIntArray556[local51++];
					local31[local61] = (local70 & 0xFF) << 4;
					local27[local61] = local70 >> 4 & 0xFF0;
					local23[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static376.anInt7260; local61++) {
					local70 = local61 * this.anInt10286 / Static376.anInt7260;
					@Pc(77) int local77 = this.anIntArray556[local70 + local51];
					local31[local61] = (local77 & 0xFF) << 4;
					local27[local61] = local77 >> 4 & 0xFF0;
					local23[local61] = local77 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
