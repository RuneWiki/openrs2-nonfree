import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "[B")
	public static final byte[] aByteArray13 = new byte[32896];

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	private final int anInt2759;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
	private final int anInt2764;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	private final int anInt2765;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	private final int anInt2758;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray13[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIII)V")
	public Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2759 = arg2;
		this.anInt2764 = arg1;
		this.anInt2765 = arg3;
		this.anInt2758 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V")
	@Override
	public void method6729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2758 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2759 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2764 >> 12;
		@Pc(36) int local36 = this.anInt2765 * arg1 >> 12;
		Static371.method5425(local24, super.anInt8330, local10, local36, local17);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)V")
	@Override
	public void method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
