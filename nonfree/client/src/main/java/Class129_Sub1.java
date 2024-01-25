import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
	private int anInt5034;

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
	private int anInt5036;

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "[I")
	private final int[] anIntArray624 = new int[this.anInt5971];

	static {
		new Class221("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class129_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5971 > local15; local15++) {
			this.anIntArray624[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5034 += this.anIntArray624[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5187() {
		this.anInt5034 = Math.abs(this.anInt5034);
		if (this.anInt5034 >= 4096) {
			this.anInt5034 = 4095;
		}
		this.method4378(this.anInt5036++, (byte) (this.anInt5034 >> 4));
		this.anInt5034 = 0;
	}

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V")
	@Override
	protected final void method5193() {
		this.anInt5034 = 0;
		this.anInt5036 = 0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)V")
	protected void method4378(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray79[this.anInt5036++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
