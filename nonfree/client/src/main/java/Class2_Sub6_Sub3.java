import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public class Class2_Sub6_Sub3 extends Class2_Sub6 {

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "[I")
	protected int[] anIntArray257;

	@OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
	protected int anInt3751;

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
	protected int anInt3752;

	@OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
	private int anInt3746 = -1;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public final void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt3746 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8471() {
		super.method8471();
		this.anIntArray257 = null;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88 && this.method3177()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = (this.anInt3751 == Static262.anInt5589 ? arg0 : arg0 * this.anInt3751 / Static262.anInt5589) * this.anInt3752;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt3752 == Static51.anInt1085) {
				for (local62 = 0; local62 < Static51.anInt1085; local62++) {
					local71 = this.anIntArray257[local56++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static51.anInt1085; local62++) {
					local71 = this.anInt3752 * local62 / Static51.anInt1085;
					@Pc(78) int local78 = this.anIntArray257[local71 + local56];
					local36[local62] = (local78 & 0xFF) << 4;
					local32[local62] = local78 >> 4 & 0xFF0;
					local28[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)I")
	@Override
	public final int method8463() {
		return this.anInt3746;
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)Z")
	protected final boolean method3177() {
		if (this.anIntArray257 != null) {
			return true;
		} else if (this.anInt3746 >= 0) {
			@Pc(30) Class329 local30 = Static491.anInt8075 >= 0 ? Static655.method7423(Static113.aClass380_36, Static491.anInt8075, this.anInt3746) : Static655.method7414(Static113.aClass380_36, this.anInt3746);
			local30.method7412();
			this.anIntArray257 = local30.method7418();
			this.anInt3752 = local30.anInt8813;
			this.anInt3751 = local30.anInt8812;
			return true;
		} else {
			return false;
		}
	}
}
