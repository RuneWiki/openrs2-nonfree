import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!na", name = "w", descriptor = "I")
	private int anInt798;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
	private final int[] anIntArray120 = new int[this.anInt2756];

	static {
		new Class169("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt2756; local15++) {
			this.anIntArray120[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
	protected void method616(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray14[this.anInt803++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	@Override
	protected final void method2274() {
		this.anInt803 = 0;
		this.anInt798 = 0;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
	@Override
	protected final void method2278() {
		this.anInt798 = Math.abs(this.anInt798);
		if (this.anInt798 >= 4096) {
			this.anInt798 = 4095;
		}
		this.method616(this.anInt803++, (byte) (this.anInt798 >> 4));
		this.anInt798 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	@Override
	protected final void method2279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt798 += this.anIntArray120[arg0] * arg1 >> 12;
	}
}
