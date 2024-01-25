import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class61 {

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "[I")
	public static final int[] anIntArray120 = new int[256];

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	public int anInt1408;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	public int anInt1411;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "B")
	private byte aByte34;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
	public int anInt1413;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	public int anInt1414;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
	public int anInt1415;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray120[local6] = local9;
		}
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
	public Class61() {
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!mo;)V")
	public Class61(@OriginalArg(0) Class1_Sub35 arg0) {
		this.aByte34 = arg0.method5751();
		this.anInt1408 = arg0.method5771();
		this.anInt1414 = arg0.method5804();
		this.anInt1415 = arg0.method5804();
		this.anInt1411 = arg0.method5804();
		this.anInt1413 = arg0.method5804();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
	public int method1228() {
		return this.aByte34 & 0x7;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)I")
	public int method1229() {
		return (this.aByte34 & 0x8) == 8 ? 1 : 0;
	}
}
