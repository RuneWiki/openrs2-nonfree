import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class272 {

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "[B")
	public static final byte[] aByteArray73 = new byte[32896];

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	public int anInt7419;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
	public int anInt7420;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "B")
	private byte aByte107;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	public int anInt7424;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	public int anInt7425;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	public int anInt7426;

	static {
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < 256; local57++) {
			for (@Pc(60) int local60 = 0; local60 <= local57; local60++) {
				aByteArray73[local55++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local60 * local60 + local57 * local57 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class272() {
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class272(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aByte107 = arg0.method3027();
		this.anInt7419 = arg0.method3018();
		this.anInt7426 = arg0.method3015();
		this.anInt7425 = arg0.method3015();
		this.anInt7420 = arg0.method3015();
		this.anInt7424 = arg0.method3015();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	public int method6600() {
		return this.aByte107 & 0x7;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I")
	public int method6602() {
		return (this.aByte107 & 0x8) == 8 ? 1 : 0;
	}
}
