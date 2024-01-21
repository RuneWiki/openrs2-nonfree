import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	protected int anInt2113;

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "[I")
	protected int[] anIntArray207;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
	protected int anInt2116;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
	private int anInt2121 = -1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92 && this.method1677()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = (Static102.anInt2347 == this.anInt2113 ? arg0 : this.anInt2113 * arg0 / Static102.anInt2347) * this.anInt2116;
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (Static135.anInt2897 == this.anInt2116) {
				for (local61 = 0; local61 < Static135.anInt2897; local61++) {
					local69 = this.anIntArray207[local51++];
					local31[local61] = (local69 & 0xFF) << 4;
					local27[local61] = local69 >> 4 & 0xFF0;
					local23[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static135.anInt2897; local61++) {
					local69 = this.anInt2116 * local61 / Static135.anInt2897;
					@Pc(117) int local117 = this.anIntArray207[local69 + local51];
					local31[local61] = (local117 & 0xFF) << 4;
					local27[local61] = local117 >> 4 & 0xFF0;
					local23[local61] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	@Override
	public final void method3257() {
		super.method3257();
		this.anIntArray207 = null;
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)Z")
	protected final boolean method1677() {
		if (this.anIntArray207 != null) {
			return true;
		} else if (this.anInt2121 >= 0) {
			@Pc(25) Class2_Sub2_Sub17_Sub1 local25 = Static150.method2342(this.anInt2121, Static138.aClass28_140);
			local25.method1918();
			this.anIntArray207 = local25.anIntArray252;
			this.anInt2116 = local25.anInt2527;
			this.anInt2113 = local25.anInt2524;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
	@Override
	public final int method3261() {
		return this.anInt2121;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public final void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2121 = arg0.method269();
		}
	}
}
