import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class84 {

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "[B")
	public static final byte[] aByteArray62 = new byte[32896];

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	public final int anInt2345;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	public final int anInt2341;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public final int anInt2340;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	public final int anInt2344;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray62[local10++] = (byte) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIII)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2345 = arg3;
		this.anInt2341 = arg2;
		this.anInt2340 = arg0;
		this.anInt2344 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Lclient!fj;")
	public Class84 method1710(@OriginalArg(0) int arg0) {
		return new Class84(this.anInt2340, arg0, this.anInt2341, this.anInt2345);
	}
}
