import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "[B")
	public static final byte[] aByteArray73;

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
	private int anInt7368 = 1365;

	@OriginalMember(owner = "client!nv", name = "M", descriptor = "I")
	private int anInt7374 = 0;

	@OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
	private int anInt7375 = 20;

	@OriginalMember(owner = "client!nv", name = "P", descriptor = "I")
	private int anInt7376 = 0;

	static {
		@Pc(1) int local1 = 0;
		aByteArray73 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray73[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7368 = arg1.method8414();
		} else if (arg0 == 1) {
			this.anInt7375 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt7376 = arg1.method8414();
		} else if (arg0 == 3) {
			this.anInt7374 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			for (@Pc(25) int local25 = 0; local25 < Static164.anInt8839; local25++) {
				@Pc(39) int local39 = this.anInt7376 + (Static352.anIntArray400[local25] << 12) / this.anInt7368;
				@Pc(51) int local51 = (Static328.anIntArray387[arg0] << 12) / this.anInt7368 + this.anInt7374;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local71 + local65 < 16384 && local73 < this.anInt7375) {
					local59 = local51 + (local57 * local59 >> 12) * 2;
					local57 = local39 + local65 - local71;
					local71 = local59 * local59 >> 12;
					local73++;
					local65 = local57 * local57 >> 12;
				}
				local19[local25] = local73 < this.anInt7375 - 1 ? (local73 << 12) / this.anInt7375 : 0;
			}
		}
		return local19;
	}
}
