import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class3_Sub1_Sub35 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
	private int anInt8218 = 1365;

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
	private int anInt8219 = 20;

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
	private int anInt8223 = 0;

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
	private int anInt8224 = 0;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			for (@Pc(17) int local17 = 0; local17 < Static307.anInt4846; local17++) {
				@Pc(31) int local31 = this.anInt8224 + (Static241.anIntArray759[local17] << 12) / this.anInt8218;
				@Pc(43) int local43 = (Static402.anIntArray741[arg0] << 12) / this.anInt8218 + this.anInt8223;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local57 + local63 < 16384 && local65 < this.anInt8219) {
					local51 = local43 + (local51 * local49 >> 12) * 2;
					local49 = local31 + local57 - local63;
					local65++;
					local63 = local51 * local51 >> 12;
					local57 = local49 * local49 >> 12;
				}
				local11[local17] = this.anInt8219 - 1 <= local65 ? 0 : (local65 << 12) / this.anInt8219;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt8218 = arg1.method7591();
		} else if (arg0 == 1) {
			this.anInt8219 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt8224 = arg1.method7591();
		} else if (arg0 == 3) {
			this.anInt8223 = arg1.method7591();
		}
	}
}
