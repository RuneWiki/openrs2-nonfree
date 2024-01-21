import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kb", name = "jb", descriptor = "Z")
	private boolean aBoolean94;

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "Z")
	private boolean aBoolean93;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(34) int[][] local34 = this.method2991(this.aBoolean93 ? Static78.anInt2044 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[2];
			@Pc(58) int[] local58 = local16[1];
			@Pc(63) int local63;
			if (this.aBoolean94) {
				for (local63 = 0; local63 < Static129.anInt3118; local63++) {
					local50[local63] = local38[Static8.anInt230 - local63];
					local58[local63] = local42[Static8.anInt230 - local63];
					local54[local63] = local46[Static8.anInt230 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static129.anInt3118; local63++) {
					local50[local63] = local38[local63];
					local58[local63] = local42[local63];
					local54[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean94 = arg0.method2387() == 1;
		} else if (arg1 == 1) {
			this.aBoolean93 = arg0.method2387() == 1;
		} else if (arg1 == 2) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(34) int[] local34 = this.method2980(0, this.aBoolean93 ? Static78.anInt2044 - arg0 : arg0);
			if (this.aBoolean94) {
				for (@Pc(39) int local39 = 0; local39 < Static129.anInt3118; local39++) {
					local16[local39] = local34[Static8.anInt230 - local39];
				}
			} else {
				Static186.method1564(local34, 0, local16, 0, Static129.anInt3118);
			}
		}
		return local16;
	}
}
