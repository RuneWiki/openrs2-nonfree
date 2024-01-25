import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
	private int anInt6002 = 1;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
	private int anInt6003 = 0;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
	private int anInt6001 = 0;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		Static535.method7879();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6001 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt6003 = arg1.method6538();
		} else if (arg0 == 3) {
			this.anInt6002 = arg1.method6538();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(19) int local19 = Static324.anIntArray440[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static131.anInt2935; local27++) {
				@Pc(33) int local33 = Static361.anIntArray460[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(62) int local62;
				if (this.anInt6001 == 0) {
					local62 = (local33 - local19) * this.anInt6002;
				} else {
					@Pc(52) int local52 = local25 * local25 + local39 * local39 >> 12;
					local62 = (int) (Math.sqrt((double) ((float) local52 / 4096.0F)) * 4096.0D);
					local62 = (int) ((double) (this.anInt6002 * local62) * 3.141592653589793D);
				}
				local62 -= local62 & 0xFFFFF000;
				if (this.anInt6003 == 0) {
					local62 = Static413.anIntArray500[local62 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6003 == 2) {
					local62 -= 2048;
					if (local62 < 0) {
						local62 = -local62;
					}
					local62 = 2048 - local62 << 1;
				}
				local11[local27] = local62;
			}
		}
		return local11;
	}
}
