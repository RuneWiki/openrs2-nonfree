import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!sca", name = "K", descriptor = "[I")
	public static final int[] anIntArray203 = new int[16384];

	@OriginalMember(owner = "client!sca", name = "M", descriptor = "[I")
	public static final int[] anIntArray204 = new int[16384];

	@OriginalMember(owner = "client!sca", name = "C", descriptor = "I")
	private int anInt4503;

	@OriginalMember(owner = "client!sca", name = "D", descriptor = "I")
	private int anInt4504;

	@OriginalMember(owner = "client!sca", name = "E", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!sca", name = "A", descriptor = "[I")
	private final int[] anIntArray202 = new int[this.anInt8630];

	static {
		@Pc(25) double local25 = 3.834951969714103E-4D;
		for (@Pc(27) int local27 = 0; local27 < 16384; local27++) {
			anIntArray204[local27] = (int) (Math.sin(local25 * (double) local27) * 16384.0D);
			anIntArray203[local27] = (int) (Math.cos(local25 * (double) local27) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt8630; local15++) {
			this.anIntArray202[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7634() {
		this.anInt4504 = Math.abs(this.anInt4504);
		if (this.anInt4504 >= 4096) {
			this.anInt4504 = 4095;
		}
		this.method4063(this.anInt4503++, (byte) (this.anInt4504 >> 4));
		this.anInt4504 = 0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZII)V")
	@Override
	protected final void method7633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4504 += this.anIntArray202[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7636() {
		this.anInt4503 = 0;
		this.anInt4504 = 0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IBZ)V")
	protected void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray34[this.anInt4503++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
