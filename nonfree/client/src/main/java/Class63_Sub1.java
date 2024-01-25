import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!oga", name = "u", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
	private int anInt7008;

	@OriginalMember(owner = "client!oga", name = "s", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
	private int anInt7013;

	@OriginalMember(owner = "client!oga", name = "y", descriptor = "[I")
	private final int[] anIntArray577 = new int[this.anInt7103];

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray4[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class63_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt7103 > local15; local15++) {
			this.anIntArray577[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5902() {
		this.anInt7008 = 0;
		this.anInt7013 = 0;
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)V")
	@Override
	protected final void method5904() {
		this.anInt7008 = Math.abs(this.anInt7008);
		if (this.anInt7008 >= 4096) {
			this.anInt7008 = 4095;
		}
		this.method5837((byte) (this.anInt7008 >> 4), this.anInt7013++);
		this.anInt7008 = 0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method5905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7008 += this.anIntArray577[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BIB)V")
	protected void method5837(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray82[this.anInt7013++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}
}
