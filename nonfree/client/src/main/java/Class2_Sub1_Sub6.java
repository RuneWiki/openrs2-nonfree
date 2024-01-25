import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
	protected int anInt7724;

	@OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
	protected int anInt7730;

	@OriginalMember(owner = "client!bn", name = "U", descriptor = "[I")
	protected int[] anIntArray507;

	@OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
	private int anInt7729 = -1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375 && this.method5987()) {
			@Pc(30) int[] local30 = local18[0];
			@Pc(34) int[] local34 = local18[1];
			@Pc(38) int[] local38 = local18[2];
			@Pc(54) int local54 = (this.anInt7724 == Static266.anInt4930 ? arg0 : arg0 * this.anInt7724 / Static266.anInt4930) * this.anInt7730;
			@Pc(60) int local60;
			@Pc(69) int local69;
			if (this.anInt7730 == Static131.anInt2581) {
				for (local60 = 0; local60 < Static131.anInt2581; local60++) {
					local69 = this.anIntArray507[local54++];
					local38[local60] = (local69 & 0xFF) << 4;
					local34[local60] = local69 >> 4 & 0xFF0;
					local30[local60] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static131.anInt2581; local60++) {
					local69 = this.anInt7730 * local60 / Static131.anInt2581;
					@Pc(76) int local76 = this.anIntArray507[local54 + local69];
					local38[local60] = (local76 & 0xFF) << 4;
					local34[local60] = local76 >> 4 & 0xFF0;
					local30[local60] = local76 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(B)Z")
	protected final boolean method5987() {
		if (this.anIntArray507 != null) {
			return true;
		} else if (this.anInt7729 >= 0) {
			@Pc(30) Class89 local30 = Static313.anInt5470 < 0 ? Static456.method1768(Static156.aClass188_44, this.anInt7729) : Static456.method1764(Static156.aClass188_44, Static313.anInt5470, this.anInt7729);
			local30.method1765();
			this.anIntArray507 = local30.method1771();
			this.anInt7730 = local30.anInt2413;
			this.anInt7724 = local30.anInt2412;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public final void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt7729 = arg1.method3711();
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V")
	@Override
	public final void method6038() {
		super.method6038();
		this.anIntArray507 = null;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I")
	@Override
	public final int method6028() {
		return this.anInt7729;
	}
}
