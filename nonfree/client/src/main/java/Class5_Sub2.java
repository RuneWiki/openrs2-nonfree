import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!eea", name = "u", descriptor = "I")
	private int anInt2990;

	@OriginalMember(owner = "client!eea", name = "x", descriptor = "I")
	private int anInt2993;

	@OriginalMember(owner = "client!eea", name = "y", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!eea", name = "E", descriptor = "I")
	private int anInt2998;

	@OriginalMember(owner = "client!eea", name = "G", descriptor = "I")
	private int anInt2999;

	@OriginalMember(owner = "client!eea", name = "D", descriptor = "I")
	private final int anInt2997;

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "I")
	private final int anInt2988;

	@OriginalMember(owner = "client!eea", name = "v", descriptor = "I")
	private final int anInt2991;

	@OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
	private int anInt2992;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2997 = (int) (arg7 * 4096.0F);
		this.anInt2988 = (int) (arg6 * 4096.0F);
		this.anInt2992 = this.anInt2991 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method5029() {
		this.anInt2992 = this.anInt2991;
		this.anInt2993 >>= 0x4;
		if (this.anInt2993 < 0) {
			this.anInt2993 = 0;
		} else if (this.anInt2993 > 255) {
			this.anInt2993 = 255;
		}
		this.method2408((byte) this.anInt2993, this.anInt2990++);
		this.anInt2993 = 0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BZI)V")
	protected void method2408(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray39[arg1] = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5021() {
		this.anInt2990 = 0;
		this.anInt2993 = 0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2998 = this.anInt2988 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2998 = this.anInt2998 * this.anInt2998 >> 12;
			this.anInt2999 = 4096;
			this.anInt2993 = this.anInt2998;
			return;
		}
		this.anInt2999 = this.anInt2997 * this.anInt2998 >> 12;
		if (this.anInt2999 < 0) {
			this.anInt2999 = 0;
		} else if (this.anInt2999 > 4096) {
			this.anInt2999 = 4096;
		}
		this.anInt2998 = this.anInt2988 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt2998 = this.anInt2998 * this.anInt2998 >> 12;
		this.anInt2998 = this.anInt2999 * this.anInt2998 >> 12;
		this.anInt2993 += this.anInt2992 * this.anInt2998 >> 12;
		this.anInt2992 = this.anInt2992 * this.anInt2991 >> 12;
	}
}
