import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public class Class2_Sub6_Sub4 extends Class2_Sub6 {

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
	protected int anInt1012;

	@OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
	protected int anInt1019;

	@OriginalMember(owner = "client!nq", name = "R", descriptor = "[I")
	protected int[] anIntArray140;

	@OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
	private int anInt1023 = -1;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public final void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1023 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443 && this.method975()) {
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			@Pc(57) int local57 = (this.anInt1012 == Static372.anInt6520 ? arg0 : this.anInt1012 * arg0 / Static372.anInt6520) * this.anInt1019;
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (Static151.anInt2711 == this.anInt1019) {
				for (local67 = 0; local67 < Static151.anInt2711; local67++) {
					local75 = this.anIntArray140[local57++];
					local41[local67] = (local75 & 0xFF) << 4;
					local37[local67] = local75 >> 4 & 0xFF0;
					local33[local67] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static151.anInt2711; local67++) {
					local75 = local67 * this.anInt1019 / Static151.anInt2711;
					@Pc(127) int local127 = this.anIntArray140[local75 + local57];
					local41[local67] = (local127 & 0xFF) << 4;
					local37[local67] = local127 >> 4 & 0xFF0;
					local33[local67] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5633() {
		super.method5633();
		this.anIntArray140 = null;
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)Z")
	protected final boolean method975() {
		if (this.anIntArray140 != null) {
			return true;
		} else if (this.anInt1023 >= 0) {
			@Pc(27) Class224 local27 = Static163.anInt2947 < 0 ? Static404.method5316(Static343.aClass71_84, this.anInt1023) : Static404.method5304(Static343.aClass71_84, Static163.anInt2947, this.anInt1023);
			local27.method5306();
			this.anIntArray140 = local27.method5307();
			this.anInt1012 = local27.anInt6142;
			this.anInt1019 = local27.anInt6145;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)I")
	@Override
	public final int method5638() {
		return this.anInt1023;
	}
}
