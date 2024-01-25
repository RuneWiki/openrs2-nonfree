import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
	private int anInt5440 = 1365;

	@OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
	private int anInt5441 = 0;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
	private int anInt5439 = 0;

	@OriginalMember(owner = "client!qn", name = "S", descriptor = "I")
	private int anInt5444 = 20;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			for (@Pc(25) int local25 = 0; local25 < Static434.anInt4326; local25++) {
				@Pc(39) int local39 = this.anInt5439 + (Static280.anIntArray238[local25] << 12) / this.anInt5440;
				@Pc(51) int local51 = this.anInt5441 + (Static221.anIntArray194[arg0] << 12) / this.anInt5440;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local65 + local71 < 16384 && this.anInt5444 > local73) {
					local59 = (local57 * local59 >> 12) * 2 + local51;
					local57 = local39 + local65 - local71;
					local73++;
					local71 = local59 * local59 >> 12;
					local65 = local57 * local57 >> 12;
				}
				local11[local25] = local73 >= this.anInt5444 - 1 ? 0 : (local73 << 12) / this.anInt5444;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5440 = arg1.method4485();
		} else if (arg0 == 1) {
			this.anInt5444 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt5439 = arg1.method4485();
		} else if (arg0 == 3) {
			this.anInt5441 = arg1.method4485();
		}
	}
}
