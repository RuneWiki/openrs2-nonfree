import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
	private int anInt2486;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
	private int anInt2488;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "[I")
	private final int[] anIntArray189 = new int[this.anInt3258];

	static {
		new Class96("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class107_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt3258; local15++) {
			this.anIntArray189[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method2827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2488 += this.anIntArray189[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V")
	protected void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray25[this.anInt2486++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	@Override
	protected final void method2824() {
		this.anInt2486 = 0;
		this.anInt2488 = 0;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	@Override
	protected final void method2822() {
		this.anInt2488 = Math.abs(this.anInt2488);
		if (this.anInt2488 >= 4096) {
			this.anInt2488 = 4095;
		}
		this.method2090(this.anInt2486++, (byte) (this.anInt2488 >> 4));
		this.anInt2488 = 0;
	}
}
