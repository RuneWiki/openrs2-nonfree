import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class2_Sub4_Sub5 extends Class2_Sub4 {

	@OriginalMember(owner = "client!daa", name = "G", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!daa", name = "H", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(34) int[][] local34 = this.method7567(this.aBoolean93 ? Static407.anInt6676 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean94) {
				for (local63 = 0; local63 < Static143.anInt7434; local63++) {
					local50[local63] = local38[Static464.anInt7427 - local63];
					local54[local63] = local42[Static464.anInt7427 - local63];
					local58[local63] = local46[Static464.anInt7427 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static143.anInt7434; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(35) int[] local35 = this.method7568(this.aBoolean93 ? Static407.anInt6676 - arg0 : arg0, 0);
			if (this.aBoolean94) {
				for (@Pc(40) int local40 = 0; local40 < Static143.anInt7434; local40++) {
					local11[local40] = local35[Static464.anInt7427 - local40];
				}
			} else {
				Static598.method4262(local35, 0, local11, 0, Static143.anInt7434);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean94 = arg1.method4464() == 1;
		} else if (arg0 == 1) {
			this.aBoolean93 = arg1.method4464() == 1;
		} else if (arg0 == 2) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}
}
