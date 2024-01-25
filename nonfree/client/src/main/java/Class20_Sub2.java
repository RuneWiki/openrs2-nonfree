import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
	private int anInt6563;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "[B")
	private byte[] aByteArray93;

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
	private int anInt6567;

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "[I")
	private final int[] anIntArray505 = new int[this.anInt6549];

	static {
		new Class159("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class20_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt6549 > local15; local15++) {
			this.anIntArray505[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method5498() {
		this.anInt6567 = Math.abs(this.anInt6567);
		if (this.anInt6567 >= 4096) {
			this.anInt6567 = 4095;
		}
		this.method5511(this.anInt6563++, (byte) (this.anInt6567 >> 4));
		this.anInt6567 = 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)V")
	protected void method5511(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray93[this.anInt6563++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5502() {
		this.anInt6563 = 0;
		this.anInt6567 = 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6567 += arg0 * this.anIntArray505[arg1] >> 12;
	}
}
