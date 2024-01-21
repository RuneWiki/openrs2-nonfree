import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "[J")
	public static final long[] aLongArray2 = new long[256];

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
	private final int anInt2863;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
	private final int anInt2857;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
	private final int anInt2854;

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
	private final int anInt2866;

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(18) long local18 = (long) local14;
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				if ((local18 & 0x1L) == 1L) {
					local18 = local18 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local18 >>>= 0x1;
				}
			}
			aLongArray2[local14] = local18;
		}
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIIII)V")
	public Class35_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2863 = arg0;
		this.anInt2857 = arg1;
		this.anInt2854 = arg3;
		this.anInt2866 = arg2;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt2863 >> 12;
		@Pc(25) int local25 = this.anInt2866 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt2854 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt2857 * arg0 >> 12;
		Static193.method2909(local32, local39, super.anInt4071, local18, super.anInt4073, local25);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZII)V")
	@Override
	public void method3114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2863 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt2866 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt2854 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt2857 >> 12;
		Static196.method2941(super.anInt4070, local10, local22, local36, local29);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	@Override
	public void method3115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2863 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2866 >> 12;
		@Pc(31) int local31 = this.anInt2857 * arg1 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt2854 >> 12;
		Static55.method1048(local31, local38, super.anInt4071, super.anInt4073, super.anInt4070, local10, local17);
	}
}
