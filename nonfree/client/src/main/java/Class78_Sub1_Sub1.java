import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class78_Sub1_Sub1 extends Class78_Sub1 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!il;")
	private Class13_Sub4 aClass13_Sub4_1;

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_14;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
	private final int anInt1872;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
	private final int anInt1871;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	private final int anInt1866;

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
	private final int anInt1867;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
	private final int anInt1865;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
	private final int anInt1868;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!ht;IIIIII)V")
	public Class78_Sub1_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass109_Sub1_14 = arg0;
		this.anInt1872 = arg6;
		this.anInt1871 = arg4;
		this.anInt1866 = arg1;
		this.anInt1867 = arg5;
		this.anInt1865 = arg2;
		this.anInt1868 = arg3;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Lclient!il;")
	@Override
	public Class13_Sub4 method3277() {
		if (this.aClass13_Sub4_1 == null) {
			Static13.anIntArray21[4] = this.anInt1867;
			@Pc(22) Interface7 local22 = this.aClass109_Sub1_14.anInterface7_9;
			Static13.anIntArray21[5] = this.anInt1872;
			Static13.anIntArray21[1] = this.anInt1865;
			Static13.anIntArray21[2] = this.anInt1868;
			Static13.anIntArray21[0] = this.anInt1866;
			Static13.anIntArray21[3] = this.anInt1871;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local22.method4837(Static13.anIntArray21[local53])) {
					return null;
				}
				@Pc(71) Class151 local71 = local22.method4836(Static13.anIntArray21[local53]);
				@Pc(78) int local78 = local71.aBoolean295 ? 64 : 128;
				if (local71.aByte54 > 0) {
					local49 = true;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static167.anIntArrayArray89[local94] = local22.method4839(false, local51, 1.0F, local51, Static13.anIntArray21[local94]);
			}
			this.aClass13_Sub4_1 = new Class13_Sub4(this.aClass109_Sub1_14, 6407, local51, local49, Static167.anIntArrayArray89);
		}
		return this.aClass13_Sub4_1;
	}
}
