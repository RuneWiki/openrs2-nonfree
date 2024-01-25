import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
	private int anInt5047 = 20;

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
	private int anInt5048 = 0;

	@OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
	private int anInt5050 = 1365;

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
	private int anInt5051 = 0;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5050 = arg0.method5968();
		} else if (arg1 == 1) {
			this.anInt5047 = arg0.method5968();
		} else if (arg1 == 2) {
			this.anInt5051 = arg0.method5968();
		} else if (arg1 == 3) {
			this.anInt5048 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			for (@Pc(24) int local24 = 0; local24 < Static597.anInt10025; local24++) {
				@Pc(38) int local38 = this.anInt5051 + (Static352.anIntArray331[local24] << 12) / this.anInt5050;
				@Pc(51) int local51 = (Static493.anIntArray476[arg0] << 12) / this.anInt5050 + this.anInt5048;
				@Pc(57) int local57 = local38;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local38 * local38 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local71 + local65 < 16384 && local73 < this.anInt5047) {
					local59 = local51 + (local59 * local57 >> 12) * 2;
					local57 = local65 + local38 - local71;
					local65 = local57 * local57 >> 12;
					local73++;
					local71 = local59 * local59 >> 12;
				}
				local13[local24] = this.anInt5047 - 1 <= local73 ? 0 : (local73 << 12) / this.anInt5047;
			}
		}
		return local13;
	}
}
