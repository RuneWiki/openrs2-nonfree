import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public class Class4_Sub3_Sub17 extends Class4_Sub3 {

	@OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
	protected int anInt5971;

	@OriginalMember(owner = "client!jv", name = "N", descriptor = "I")
	protected int anInt5972;

	@OriginalMember(owner = "client!jv", name = "P", descriptor = "[I")
	protected int[] anIntArray486;

	@OriginalMember(owner = "client!jv", name = "F", descriptor = "I")
	private int anInt5967 = -1;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189 && this.method4947()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = (Static191.anInt3822 == this.anInt5971 ? arg0 : this.anInt5971 * arg0 / Static191.anInt3822) * this.anInt5972;
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (this.anInt5972 == Static304.anInt5637) {
				for (local61 = 0; local61 < Static304.anInt5637; local61++) {
					local69 = this.anIntArray486[local51++];
					local31[local61] = (local69 & 0xFF) << 4;
					local27[local61] = local69 >> 4 & 0xFF0;
					local23[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static304.anInt5637; local61++) {
					local69 = this.anInt5972 * local61 / Static304.anInt5637;
					@Pc(121) int local121 = this.anIntArray486[local69 + local51];
					local31[local61] = (local121 & 0xFF) << 4;
					local27[local61] = local121 >> 4 & 0xFF0;
					local23[local61] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)Z")
	protected final boolean method4947() {
		if (this.anIntArray486 != null) {
			return true;
		} else if (this.anInt5967 >= 0) {
			@Pc(33) Class98 local33 = Static283.anInt1662 >= 0 ? Static472.method2850(Static21.aClass38_5, Static283.anInt1662, this.anInt5967) : Static472.method2846(Static21.aClass38_5, this.anInt5967);
			local33.method2848();
			this.anIntArray486 = local33.method2837();
			this.anInt5972 = local33.anInt3171;
			this.anInt5971 = local33.anInt3175;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	@Override
	public final void method6334() {
		super.method6334();
		this.anIntArray486 = null;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public final void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5967 = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I")
	@Override
	public final int method6332() {
		return this.anInt5967;
	}
}
