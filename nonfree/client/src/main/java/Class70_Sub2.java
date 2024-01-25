import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
	private int anInt7442;

	@OriginalMember(owner = "client!rq", name = "u", descriptor = "I")
	private int anInt7447;

	@OriginalMember(owner = "client!rq", name = "t", descriptor = "[I")
	private final int[] anIntArray703 = new int[this.anInt7436];

	static {
		new Class158("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class70_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < super.anInt7436; local13++) {
			this.anIntArray703[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5662() {
		this.anInt7447 = Math.abs(this.anInt7447);
		if (this.anInt7447 >= 4096) {
			this.anInt7447 = 4095;
		}
		this.method5672(this.anInt7442++, (byte) (this.anInt7447 >> 4));
		this.anInt7447 = 0;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5666() {
		this.anInt7447 = 0;
		this.anInt7442 = 0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7447 += this.anIntArray703[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIB)V")
	protected void method5672(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray86[this.anInt7442++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
