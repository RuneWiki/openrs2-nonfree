import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
	private int anInt1689;

	@OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
	private int anInt1690;

	@OriginalMember(owner = "client!gi", name = "eb", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
	private int anInt1695 = -1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175 && this.method1234()) {
			@Pc(31) int local31 = (this.anInt1690 == Static53.anInt1436 ? arg0 : this.anInt1690 * arg0 / Static53.anInt1436) * this.anInt1689;
			@Pc(35) int[] local35 = local7[0];
			@Pc(39) int[] local39 = local7[1];
			@Pc(43) int[] local43 = local7[2];
			@Pc(49) int local49;
			@Pc(57) int local57;
			if (Static105.anInt2391 == this.anInt1689) {
				for (local49 = 0; local49 < Static105.anInt2391; local49++) {
					local57 = this.anIntArray197[local31++];
					local43[local49] = (local57 & 0xFF) << 4;
					local39[local49] = local57 >> 4 & 0xFF0;
					local35[local49] = local57 >> 12 & 0xFF0;
				}
			} else {
				for (local49 = 0; local49 < Static105.anInt2391; local49++) {
					local57 = this.anInt1689 * local49 / Static105.anInt2391;
					@Pc(109) int local109 = this.anIntArray197[local57 + local31];
					local43[local49] = (local109 & 0xFF) << 4;
					local39[local49] = local109 >> 4 & 0xFF0;
					local35[local49] = local109 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)I")
	@Override
	public int method3504() {
		return this.anInt1695;
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)Z")
	private boolean method1234() {
		if (this.anIntArray197 != null) {
			return true;
		} else if (this.anInt1695 >= 0) {
			@Pc(16) int local16 = Static105.anInt2391;
			@Pc(18) int local18 = Static53.anInt1436;
			@Pc(28) int local28 = Static104.anInterface1_2.method1248(this.anInt1695) ? 64 : 128;
			this.anIntArray197 = Static104.anInterface1_2.method1247(this.anInt1695);
			this.anInt1690 = local28;
			this.anInt1689 = local28;
			Static23.method1993(local16, local18);
			return this.anIntArray197 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	@Override
	public void method3509() {
		super.method3509();
		this.anIntArray197 = null;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1695 = arg0.method946();
		}
	}
}
