import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	private int anInt1309;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private int anInt1312;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt1313 = -1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	@Override
	public void method8763() {
		super.method8763();
		this.anIntArray87 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	@Override
	public void method8766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method8766(arg0, arg1);
		if (this.anInt1313 >= 0 && Static473.anInterface9_11 != null) {
			@Pc(29) int local29 = Static473.anInterface9_11.method1558(this.anInt1313).aBoolean236 ? 64 : 128;
			this.anIntArray87 = Static473.anInterface9_11.method1555(this.anInt1313, 1.0F, false, local29, local29);
			this.anInt1309 = local29;
			this.anInt1312 = local29;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1313 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	@Override
	public int method8774() {
		return this.anInt1313;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(41) int local41 = (Static355.anInt5410 == this.anInt1312 ? arg0 : this.anInt1312 * arg0 / Static355.anInt5410) * this.anInt1309;
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt1309 == Static269.anInt4330) {
				for (local59 = 0; local59 < Static269.anInt4330; local59++) {
					local68 = this.anIntArray87[local41++];
					local53[local59] = (local68 & 0xFF) << 4;
					local49[local59] = local68 >> 4 & 0xFF0;
					local45[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static269.anInt4330; local59++) {
					local68 = local59 * this.anInt1309 / Static269.anInt4330;
					@Pc(75) int local75 = this.anIntArray87[local68 + local41];
					local53[local59] = (local75 & 0xFF) << 4;
					local49[local59] = local75 >> 4 & 0xFF0;
					local45[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
