import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class308 {

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "[I")
	public int[] anIntArray487;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
	public int anInt8969 = -1;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	public int anInt8968 = 0;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
	public int anInt8971 = -1;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	public int anInt8970 = -1;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!rba;)V")
	public void method7497(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5322(-24);
			if (local17 == 0) {
				return;
			}
			this.method7498(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!rba;I)V")
	private void method7498(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt8969 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anIntArray487 = new int[arg1.method5322(-82)];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray487.length; local21++) {
				this.anIntArray487[local21] = arg1.method5272();
			}
		} else if (arg0 == 3) {
			this.anInt8970 = arg1.method5322(-39);
		} else if (arg0 == 4) {
			this.anInt8968 = arg1.method5322(-44);
		} else if (arg0 == 5) {
			this.anInt8971 = arg1.method5272();
		}
	}
}
