import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class3_Sub1_Sub37 extends Class3_Sub1 {

	@OriginalMember(owner = "client!uv", name = "I", descriptor = "I")
	private int anInt9771 = 1365;

	@OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
	private int anInt9773 = 20;

	@OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
	private int anInt9772 = 0;

	@OriginalMember(owner = "client!uv", name = "P", descriptor = "I")
	private int anInt9776 = 0;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt9771 = arg1.method6535();
		} else if (arg0 == 1) {
			this.anInt9773 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anInt9776 = arg1.method6535();
		} else if (arg0 == 3) {
			this.anInt9772 = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			for (@Pc(25) int local25 = 0; local25 < Static131.anInt2935; local25++) {
				@Pc(39) int local39 = (Static361.anIntArray460[local25] << 12) / this.anInt9771 + this.anInt9776;
				@Pc(51) int local51 = (Static324.anIntArray440[arg0] << 12) / this.anInt9771 + this.anInt9772;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local65 + local71 < 16384 && this.anInt9773 > local73) {
					local59 = local51 + (local57 * local59 >> 12) * 2;
					local57 = local65 + local39 - local71;
					local73++;
					local71 = local59 * local59 >> 12;
					local65 = local57 * local57 >> 12;
				}
				local19[local25] = local73 >= this.anInt9773 - 1 ? 0 : (local73 << 12) / this.anInt9773;
			}
		}
		return local19;
	}
}
