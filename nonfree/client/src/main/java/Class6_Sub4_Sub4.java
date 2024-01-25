import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public class Class6_Sub4_Sub4 extends Class6_Sub4 {

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
	protected int anInt1810;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
	protected int anInt1811;

	@OriginalMember(owner = "client!tn", name = "K", descriptor = "[I")
	protected int[] anIntArray122;

	@OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
	private int anInt1818 = -1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)I")
	@Override
	public final int method8316() {
		return this.anInt1818;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Z")
	protected final boolean method1506() {
		if (this.anIntArray122 != null) {
			return true;
		} else if (this.anInt1818 >= 0) {
			@Pc(32) Class98 local32 = Static648.anInt10742 >= 0 ? Static651.method2404(Static488.aClass353_135, Static648.anInt10742, this.anInt1818) : Static651.method2396(Static488.aClass353_135, this.anInt1818);
			local32.method2394();
			this.anIntArray122 = local32.method2406();
			this.anInt1811 = local32.anInt2796;
			this.anInt1810 = local32.anInt2799;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613 && this.method1506()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(53) int local53 = this.anInt1811 * (this.anInt1810 == Static429.anInt7811 ? arg0 : arg0 * this.anInt1810 / Static429.anInt7811);
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (Static6.anInt111 == this.anInt1811) {
				for (local63 = 0; local63 < Static6.anInt111; local63++) {
					local71 = this.anIntArray122[local53++];
					local37[local63] = (local71 & 0xFF) << 4;
					local33[local63] = local71 >> 4 & 0xFF0;
					local29[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static6.anInt111; local63++) {
					local71 = this.anInt1811 * local63 / Static6.anInt111;
					@Pc(119) int local119 = this.anIntArray122[local53 + local71];
					local37[local63] = (local119 & 0xFF) << 4;
					local33[local63] = local119 >> 4 & 0xFF0;
					local29[local63] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	@Override
	public final void method8322() {
		super.method8322();
		this.anIntArray122 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public final void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt1818 = arg1.method8571();
		}
	}
}
