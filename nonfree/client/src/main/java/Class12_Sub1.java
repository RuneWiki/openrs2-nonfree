import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!s", name = "s", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "[I")
	private final int[] anIntArray15 = new int[this.anInt4637];

	static {
		new Class117("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt4637; local15++) {
			this.anIntArray15[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4109() {
		this.anInt211 = Math.abs(this.anInt211);
		if (this.anInt211 >= 4096) {
			this.anInt211 = 4095;
		}
		this.method163(this.anInt217++, (byte) (this.anInt211 >> 4));
		this.anInt211 = 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V")
	protected void method163(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray2[this.anInt217++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4099() {
		this.anInt217 = 0;
		this.anInt211 = 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt211 += arg0 * this.anIntArray15[arg1] >> 12;
	}
}
