import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class5_Sub6_Sub24 extends Class5_Sub6 {

	@OriginalMember(owner = "client!mba", name = "F", descriptor = "I")
	private int anInt6268 = 0;

	@OriginalMember(owner = "client!mba", name = "H", descriptor = "I")
	private int anInt6269 = 1;

	@OriginalMember(owner = "client!mba", name = "E", descriptor = "I")
	private int anInt6267 = 0;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
	@Override
	public void method8118() {
		Static648.method8531();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(24) int local24 = Static508.anIntArray471[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static421.anInt7443; local32++) {
				@Pc(38) int local38 = Static207.anIntArray185[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(57) int local57;
				if (this.anInt6267 == 0) {
					local57 = (local38 - local24) * this.anInt6269;
				} else {
					@Pc(69) int local69 = local30 * local30 + local44 * local44 >> 12;
					local57 = (int) (Math.sqrt((double) ((float) local69 / 4096.0F)) * 4096.0D);
					local57 = (int) ((double) (this.anInt6269 * local57) * 3.141592653589793D);
				}
				local57 -= local57 & 0xFFFFF000;
				if (this.anInt6268 == 0) {
					local57 = Static377.anIntArray369[local57 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6268 == 2) {
					local57 -= 2048;
					if (local57 < 0) {
						local57 = -local57;
					}
					local57 = 2048 - local57 << 1;
				}
				local16[local32] = local57;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6267 = arg0.method3642();
		} else if (arg1 == 1) {
			this.anInt6268 = arg0.method3642();
		} else if (arg1 == 3) {
			this.anInt6269 = arg0.method3642();
		}
	}
}
