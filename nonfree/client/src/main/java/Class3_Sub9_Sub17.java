import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class3_Sub9_Sub17 extends Class3_Sub9 {

	@OriginalMember(owner = "client!go", name = "F", descriptor = "I")
	private int anInt3981 = 4;

	@OriginalMember(owner = "client!go", name = "I", descriptor = "I")
	private int anInt3984 = 4;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(28) int local28 = Static62.anInt1251 / this.anInt3984;
			@Pc(33) int local33 = Static452.anInt7497 / this.anInt3981;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local33 > 0) {
				local39 = arg0 % local33;
				local49 = this.method9162(local39 * Static452.anInt7497 / local33, 0);
			} else {
				local49 = this.method9162(0, 0);
			}
			for (local39 = 0; local39 < Static62.anInt1251; local39++) {
				if (local28 <= 0) {
					local11[local39] = local49[0];
				} else {
					@Pc(78) int local78 = local39 % local28;
					local11[local39] = local49[local78 * Static62.anInt1251 / local28];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(25) int local25 = Static62.anInt1251 / this.anInt3984;
			@Pc(30) int local30 = Static452.anInt7497 / this.anInt3981;
			@Pc(43) int[][] local43;
			if (local30 <= 0) {
				local43 = this.method9167(0, 0);
			} else {
				@Pc(49) int local49 = arg0 % local30;
				local43 = this.method9167(0, Static452.anInt7497 * local49 / local30);
			}
			@Pc(63) int[] local63 = local43[0];
			@Pc(67) int[] local67 = local43[1];
			@Pc(71) int[] local71 = local43[2];
			@Pc(75) int[] local75 = local11[0];
			@Pc(79) int[] local79 = local11[1];
			@Pc(83) int[] local83 = local11[2];
			for (@Pc(85) int local85 = 0; local85 < Static62.anInt1251; local85++) {
				@Pc(102) int local102;
				if (local25 > 0) {
					@Pc(96) int local96 = local85 % local25;
					local102 = Static62.anInt1251 * local96 / local25;
				} else {
					local102 = 0;
				}
				local75[local85] = local63[local102];
				local79[local85] = local67[local102];
				local83[local85] = local71[local102];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3984 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt3981 = arg0.method8632();
		}
	}
}
