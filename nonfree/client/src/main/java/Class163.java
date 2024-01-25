import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class163 {

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "[J")
	public static final long[] aLongArray6 = new long[256];

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
	public final int anInt4727;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "Z")
	public final boolean aBoolean305;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "B")
	public final byte aByte65;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "B")
	public final byte aByte64;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray6[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.anInt4727 = arg0;
		this.aShort68 = (short) arg6;
		this.aBoolean305 = arg9;
		this.aByte65 = (byte) arg7;
		this.aShort67 = (short) arg5;
		this.aShort66 = (short) arg4;
		this.aByte64 = (byte) arg8;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIII)Lclient!lv;")
	public Class163 method3644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new Class163(arg0, arg3, arg2, arg1, this.aShort66, this.aShort67, this.aShort68, this.aByte65, this.aByte64, this.aBoolean305);
	}
}
