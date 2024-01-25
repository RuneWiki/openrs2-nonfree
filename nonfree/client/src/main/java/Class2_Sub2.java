import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!jq", name = "H", descriptor = "[I")
	public static final int[] anIntArray468 = new int[256];

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	private int anInt7443;

	@OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
	private int anInt7445;

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "[I")
	private final int[] anIntArray467 = new int[this.anInt7428];

	static {
		for (@Pc(50) int local50 = 0; local50 < 256; local50++) {
			@Pc(53) int local53 = local50;
			for (@Pc(55) int local55 = 0; local55 < 8; local55++) {
				if ((local53 & 0x1) == 1) {
					local53 = local53 >>> 1 ^ 0xEDB88320;
				} else {
					local53 >>>= 0x1;
				}
			}
			anIntArray468[local50] = local53;
		}
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt7428; local15++) {
			this.anIntArray467[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6200() {
		this.anInt7443 = 0;
		this.anInt7445 = 0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BII)V")
	protected void method6207(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray83[this.anInt7445++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
	@Override
	protected final void method6198() {
		this.anInt7443 = Math.abs(this.anInt7443);
		if (this.anInt7443 >= 4096) {
			this.anInt7443 = 4095;
		}
		this.method6207((byte) (this.anInt7443 >> 4), this.anInt7445++);
		this.anInt7443 = 0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7443 += arg0 * this.anIntArray467[arg1] >> 12;
	}
}
