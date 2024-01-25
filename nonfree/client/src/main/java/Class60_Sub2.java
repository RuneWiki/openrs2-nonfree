import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!qha", name = "E", descriptor = "I")
	private int anInt10641;

	@OriginalMember(owner = "client!qha", name = "G", descriptor = "I")
	private int anInt10642;

	@OriginalMember(owner = "client!qha", name = "H", descriptor = "[B")
	private byte[] aByteArray112;

	@OriginalMember(owner = "client!qha", name = "I", descriptor = "[I")
	private final int[] anIntArray605 = new int[this.anInt10636];

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class60_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt10636; local15++) {
			this.anIntArray605[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8966(@OriginalArg(0) int arg0) {
		if (arg0 != -1815138708) {
			return;
		}
		this.anInt10642 = Math.abs(this.anInt10642);
		if (this.anInt10642 >= 4096) {
			this.anInt10642 = 4095;
		}
		this.method8980((byte) (this.anInt10642 >> 4), this.anInt10641++);
		this.anInt10642 = 0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8968() {
		this.anInt10641 = 0;
		this.anInt10642 = 0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BII)V")
	protected void method8980(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray112[this.anInt10641++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method8975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10642 += this.anIntArray605[arg1] * arg0 >> 12;
	}
}
