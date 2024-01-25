import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class209_Sub2_Sub2 extends Class209_Sub2 {

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "[J")
	public static final long[] aLongArray17 = new long[256];

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "Lclient!hda;")
	private Class46_Sub4 aClass46_Sub4_2;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
	private final int anInt9710;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_44;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
	private final int anInt9708;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	private final int anInt9712;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	private final int anInt9707;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
	private final int anInt9709;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
	private final int anInt9715;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray17[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!lj;IIIIII)V")
	public Class209_Sub2_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9710 = arg6;
		this.aClass78_Sub3_44 = arg0;
		this.anInt9708 = arg2;
		this.anInt9712 = arg3;
		this.anInt9707 = arg5;
		this.anInt9709 = arg4;
		this.anInt9715 = arg1;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)Lclient!hda;")
	@Override
	public Class46_Sub4 method7881() {
		if (this.aClass46_Sub4_2 == null) {
			@Pc(12) Interface9 local12 = this.aClass78_Sub3_44.anInterface9_13;
			Static463.anIntArray508[5] = this.anInt9710;
			Static463.anIntArray508[3] = this.anInt9709;
			Static463.anIntArray508[1] = this.anInt9708;
			Static463.anIntArray508[0] = this.anInt9715;
			Static463.anIntArray508[2] = this.anInt9712;
			Static463.anIntArray508[4] = this.anInt9707;
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local12.method949(Static463.anIntArray508[local48])) {
					return null;
				}
				@Pc(66) Class17 local66 = local12.method947(Static463.anIntArray508[local48]);
				@Pc(73) int local73 = local66.aBoolean33 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte16 > 0) {
					local44 = 1;
				}
			}
			for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
				Static56.anIntArrayArray2[local95] = local12.method948(false, Static463.anIntArray508[local95], local46, 1.0F, local46);
			}
			this.aClass46_Sub4_2 = new Class46_Sub4(this.aClass78_Sub3_44, 6407, local46, local44 != 0, Static56.anIntArrayArray2);
		}
		return this.aClass46_Sub4_2;
	}
}
