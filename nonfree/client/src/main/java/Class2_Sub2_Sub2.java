import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
	protected int anInt748;

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "[I")
	protected int[] anIntArray43;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
	protected int anInt757;

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
	private int anInt754 = -1;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
	@Override
	public final int method7940() {
		return this.anInt754;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public final void method7939() {
		super.method7939();
		this.anIntArray43 = null;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Z")
	protected final boolean method538() {
		if (this.anIntArray43 != null) {
			return true;
		} else if (this.anInt754 >= 0) {
			@Pc(27) Class13 local27 = Static337.anInt6204 >= 0 ? Static596.method247(Static229.aClass259_72, Static337.anInt6204, this.anInt754) : Static596.method253(Static229.aClass259_72, this.anInt754);
			local27.method249();
			this.anIntArray43 = local27.method257();
			this.anInt748 = local27.anInt428;
			this.anInt757 = local27.anInt427;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public final void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt754 = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653 && this.method538()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = this.anInt757 * (Static377.anInt6692 == this.anInt748 ? arg0 : this.anInt748 * arg0 / Static377.anInt6692);
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (this.anInt757 == Static153.anInt3070) {
				for (local57 = 0; local57 < Static153.anInt3070; local57++) {
					local66 = this.anIntArray43[local51++];
					local31[local57] = (local66 & 0xFF) << 4;
					local27[local57] = local66 >> 4 & 0xFF0;
					local23[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static153.anInt3070; local57++) {
					local66 = local57 * this.anInt757 / Static153.anInt3070;
					@Pc(73) int local73 = this.anIntArray43[local51 + local66];
					local31[local57] = (local73 & 0xFF) << 4;
					local27[local57] = local73 >> 4 & 0xFF0;
					local23[local57] = local73 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
