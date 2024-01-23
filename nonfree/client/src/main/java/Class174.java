import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class174 {

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "[I")
	public static int[] anIntArray505 = new int[256];

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	public int anInt5813;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	public int anInt5814;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
	public int anInt5817;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public int anInt5818;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
	public int anInt5819;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "B")
	private byte aByte25;

	static {
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(20) int local20 = local15;
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				if ((local20 & 0x1) == 1) {
					local20 = local20 >>> 1 ^ 0xEDB88320;
				} else {
					local20 >>>= 0x1;
				}
			}
			anIntArray505[local15] = local20;
		}
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class174() {
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class174(@OriginalArg(0) Class2_Sub26 arg0) {
		this.aByte25 = arg0.method4220();
		this.anInt5814 = arg0.method4242();
		this.anInt5819 = arg0.method4228();
		this.anInt5813 = arg0.method4228();
		this.anInt5817 = arg0.method4228();
		this.anInt5818 = arg0.method4228();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)I")
	public int method4656() {
		return (this.aByte25 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)I")
	public int method4658() {
		return this.aByte25 & 0x7;
	}
}
