import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!oi", name = "P", descriptor = "[I")
	protected int[] anIntArray133;

	@OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
	protected int anInt1552;

	@OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
	protected int anInt1556;

	@OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
	private int anInt1551 = -1;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public final void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1551 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	@Override
	public final void method5842() {
		super.method5842();
		this.anIntArray133 = null;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I")
	@Override
	public final int method5837() {
		return this.anInt1551;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375 && this.method1321()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(55) int local55 = (Static51.anInt1129 == this.anInt1556 ? arg0 : this.anInt1556 * arg0 / Static51.anInt1129) * this.anInt1552;
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (this.anInt1552 == Static429.anInt6518) {
				for (local65 = 0; local65 < Static429.anInt6518; local65++) {
					local74 = this.anIntArray133[local55++];
					local39[local65] = (local74 & 0xFF) << 4;
					local35[local65] = local74 >> 4 & 0xFF0;
					local31[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static429.anInt6518; local65++) {
					local74 = local65 * this.anInt1552 / Static429.anInt6518;
					@Pc(81) int local81 = this.anIntArray133[local74 + local55];
					local39[local65] = (local81 & 0xFF) << 4;
					local35[local65] = local81 >> 4 & 0xFF0;
					local31[local65] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z")
	protected final boolean method1321() {
		if (this.anIntArray133 != null) {
			return true;
		} else if (this.anInt1551 >= 0) {
			@Pc(29) Class85 local29 = Static129.anInt2791 < 0 ? Static459.method2066(Static33.aClass160_5, this.anInt1551) : Static459.method2069(Static33.aClass160_5, Static129.anInt2791, this.anInt1551);
			local29.method2063();
			this.anIntArray133 = local29.method2064();
			this.anInt1552 = local29.anInt2652;
			this.anInt1556 = local29.anInt2649;
			return true;
		} else {
			return false;
		}
	}
}
