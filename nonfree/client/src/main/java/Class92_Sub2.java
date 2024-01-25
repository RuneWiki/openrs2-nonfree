import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
	private int anInt4771;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
	private int anInt4772;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "[I")
	private final int[] anIntArray358 = new int[this.anInt4761];

	static {
		new Class198("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class92_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4761 > local15; local15++) {
			this.anIntArray358[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method3781() {
		this.anInt4772 = Math.abs(this.anInt4772);
		if (this.anInt4772 >= 4096) {
			this.anInt4772 = 4095;
		}
		this.method3788((byte) (this.anInt4772 >> 4), this.anInt4771++);
		this.anInt4772 = 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BIB)V")
	protected void method3788(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray65[this.anInt4771++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3783() {
		this.anInt4772 = 0;
		this.anInt4771 = 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4772 += arg0 * this.anIntArray358[arg1] >> 12;
	}
}
