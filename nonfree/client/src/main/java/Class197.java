import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class197 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	public static final int[] anIntArray448 = new int[256];

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!jj;")
	public Class6_Sub18 aClass6_Sub18_1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!vm;")
	public Class6_Sub5_Sub4 aClass6_Sub5_Sub4_3;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!hq;")
	public Class109 aClass109_1;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!gu;")
	public Class6_Sub4_Sub1 aClass6_Sub4_Sub1_1;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public final int anInt4987;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public final int anInt4984;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	public final int anInt4986;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public final int anInt4985;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public int anInt4983;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray448[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(BIIIII)V")
	public Class197(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aByte62 = arg0;
		this.anInt4987 = arg5;
		this.anInt4984 = arg1;
		this.anInt4986 = arg2;
		this.anInt4985 = arg4;
		this.anInt4983 = arg3;
	}
}
