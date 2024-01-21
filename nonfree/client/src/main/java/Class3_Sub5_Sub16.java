import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public class Class3_Sub5_Sub16 extends Class3_Sub5 {

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
	protected int[] anIntArray393;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
	protected int anInt3069;

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
	protected int anInt3075;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
	private int anInt3065;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)I")
	@Override
	public final int method3170() {
		return this.anInt3065;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160 && this.method2209()) {
			@Pc(23) int[] local23 = local11[2];
			@Pc(39) int local39 = this.anInt3075 * (Static88.anInt1834 == this.anInt3069 ? arg0 : this.anInt3069 * arg0 / Static88.anInt1834);
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (this.anInt3075 == Static104.anInt2195) {
				for (local53 = 0; local53 < Static104.anInt2195; local53++) {
					local61 = this.anIntArray393[local39++];
					local23[local53] = (local61 & 0xFF) << 4;
					local47[local53] = local61 >> 4 & 0xFF0;
					local43[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static104.anInt2195; local53++) {
					local61 = local53 * this.anInt3075 / Static104.anInt2195;
					@Pc(114) int local114 = this.anIntArray393[local39 + local61];
					local23[local53] = (local114 & 0xFF) << 4;
					local47[local53] = local114 >> 4 & 0xFF0;
					local43[local53] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public final void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3065 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Z")
	protected final boolean method2209() {
		if (this.anIntArray393 != null) {
			return true;
		} else if (this.anInt3065 >= 0) {
			@Pc(24) Class3_Sub1_Sub4_Sub4 local24 = Static120.method1829(Static150.aClass1_27, this.anInt3065);
			local24.method2584();
			this.anIntArray393 = local24.anIntArray449;
			this.anInt3069 = local24.anInt3599;
			this.anInt3075 = local24.anInt3602;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	@Override
	public final void method3166() {
		super.method3166();
		this.anIntArray393 = null;
	}
}
