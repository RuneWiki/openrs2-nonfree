import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
	private int anInt1302;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
	private int anInt1303;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "[I")
	private final int[] anIntArray81 = new int[this.anInt4890];

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4890 > local15; local15++) {
			this.anIntArray81[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1302 += this.anIntArray81[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4147() {
		this.anInt1303 = 0;
		this.anInt1302 = 0;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4151() {
		this.anInt1302 = Math.abs(this.anInt1302);
		if (this.anInt1302 >= 4096) {
			this.anInt1302 = 4095;
		}
		this.method1199(this.anInt1303++, (byte) (this.anInt1302 >> 4));
		this.anInt1302 = 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIB)V")
	protected void method1199(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray16[this.anInt1303++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
