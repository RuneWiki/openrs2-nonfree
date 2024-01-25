import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub2_Sub32 extends Class2_Sub2 {

	@OriginalMember(owner = "client!u", name = "I", descriptor = "Z")
	private boolean aBoolean666 = true;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "Z")
	private boolean aBoolean667 = true;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(28) int[] local28 = this.method7951(this.aBoolean666 ? Static28.anInt6368 - arg0 : arg0, 0);
			if (this.aBoolean667) {
				for (@Pc(33) int local33 = 0; local33 < Static153.anInt3070; local33++) {
					local11[local33] = local28[Static431.anInt7305 - local33];
				}
			} else {
				Static598.method1132(local28, 0, local11, 0, Static153.anInt3070);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean667 = arg0.method4325() == 1;
		} else if (arg1 == 1) {
			this.aBoolean666 = arg0.method4325() == 1;
		} else if (arg1 == 2) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(34) int[][] local34 = this.method7947(0, this.aBoolean666 ? Static28.anInt6368 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean667) {
				for (local63 = 0; local63 < Static153.anInt3070; local63++) {
					local50[local63] = local38[Static431.anInt7305 - local63];
					local54[local63] = local42[Static431.anInt7305 - local63];
					local58[local63] = local46[Static431.anInt7305 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static153.anInt3070; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}
}
