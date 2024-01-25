import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class4_Sub4_Sub36 extends Class4_Sub4 {

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
	private int anInt7896 = 0;

	@OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
	private int anInt7897 = 20;

	@OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
	private int anInt7895 = 0;

	@OriginalMember(owner = "client!rp", name = "F", descriptor = "I")
	private int anInt7891 = 1365;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			for (@Pc(25) int local25 = 0; local25 < Static560.anInt9394; local25++) {
				@Pc(39) int local39 = this.anInt7895 + (Static80.anIntArray212[local25] << 12) / this.anInt7891;
				@Pc(51) int local51 = (Static450.anIntArray619[arg0] << 12) / this.anInt7891 + this.anInt7896;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local71 + local65 < 16384 && this.anInt7897 > local73) {
					local59 = (local59 * local57 >> 12) * 2 + local51;
					local57 = local65 + local39 - local71;
					local71 = local59 * local59 >> 12;
					local73++;
					local65 = local57 * local57 >> 12;
				}
				local11[local25] = local73 < this.anInt7897 - 1 ? (local73 << 12) / this.anInt7897 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7891 = arg1.method5982();
		} else if (arg0 == 1) {
			this.anInt7897 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt7895 = arg1.method5982();
		} else if (arg0 == 3) {
			this.anInt7896 = arg1.method5982();
		}
	}
}
