import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class90 {

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
	public static final int[] anIntArray100 = new int[256];

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	private int anInt2866;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "J")
	private long aLong57;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray100[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!je;)V")
	public Class90(@OriginalArg(0) Class156 arg0) {
		this.anInt2866 = 1;
		this.aLong57 = arg0.anInt4910;
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([Lclient!je;)V")
	public Class90(@OriginalArg(0) Class156[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method2366(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)I")
	public int method2365() {
		return this.anInt2866;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!je;)V")
	private void method2366(@OriginalArg(1) Class156 arg0) {
		this.aLong57 |= arg0.anInt4910 << this.anInt2866++ * Static248.anInt4911;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)I")
	private int method2367(@OriginalArg(1) int arg0) {
		return (int) (this.aLong57 >> Static248.anInt4911 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lclient!je;")
	public Class156 method2368(@OriginalArg(1) int arg0) {
		return Static248.method3936(this.method2367(arg0));
	}
}
