import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class64 {

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "[J")
	public static final long[] aLongArray3 = new long[256];

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!qr;")
	public Class273 aClass273_1;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "Lclient!gw;")
	public Class3_Sub16 aClass3_Sub16_1;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "Lclient!bp;")
	public Class3_Sub6_Sub1 aClass3_Sub6_Sub1_1;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!pda;")
	public Class3_Sub14_Sub2 aClass3_Sub14_Sub2_1;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public final int anInt2300;

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
	public final int anInt2303;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public final int anInt2297;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public final int anInt2299;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "B")
	public final byte aByte22;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	public int anInt2302;

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(13) long local13 = (long) local9;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1L) == 1L) {
					local13 = local13 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local13 >>>= 0x1;
				}
			}
			aLongArray3[local9] = local13;
		}
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(BIIIII)V")
	public Class64(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2300 = arg1;
		this.anInt2303 = arg5;
		this.anInt2297 = arg4;
		this.anInt2299 = arg2;
		this.aByte22 = arg0;
		this.anInt2302 = arg3;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z")
	public boolean method2100() {
		return this.aByte22 == 2 || this.aByte22 == 3;
	}
}
