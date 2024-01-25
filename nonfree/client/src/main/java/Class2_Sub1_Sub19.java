import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
	private int anInt3810 = 4096;

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
	private int anInt3809 = 4096;

	@OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
	private int anInt3811 = 4096;

	static {
		new Class62("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt3809 = arg1.method5753();
		} else if (arg0 == 1) {
			this.anInt3810 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt3811 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(26) int[][] local26 = this.method6061(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static391.anInt7118; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local62 == local66) {
					local42[local52] = this.anInt3809 * local58 >> 12;
					local46[local52] = this.anInt3810 * local62 >> 12;
					local50[local52] = this.anInt3811 * local66 >> 12;
				} else {
					local42[local52] = this.anInt3809;
					local46[local52] = this.anInt3810;
					local50[local52] = this.anInt3811;
				}
			}
		}
		return local16;
	}
}
