import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public abstract class Class60 {

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "[B")
	public static byte[] aByteArray54;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
	public int anInt3989;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	public int anInt3990;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	public int anInt3991;

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
	public int anInt3993;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
	public int anInt3994;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
	public int anInt3995;

	static {
		@Pc(4) int local4 = 0;
		aByteArray54 = new byte[32896];
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			for (@Pc(12) int local12 = 0; local12 <= local9; local12++) {
				aByteArray54[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	protected Class60() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	public abstract void method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
	public abstract void method2741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
