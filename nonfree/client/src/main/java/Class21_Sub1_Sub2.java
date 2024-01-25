import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class21_Sub1_Sub2 extends Class21_Sub1 {

	@OriginalMember(owner = "client!th", name = "s", descriptor = "Lclient!ef;")
	private Class65_Sub1 aClass65_Sub1_2;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	private final int anInt6722;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_32;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	private final int anInt6719;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	private final int anInt6728;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	private final int anInt6723;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	private final int anInt6731;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	private final int anInt6729;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!bo;IIIIII)V")
	public Class21_Sub1_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6722 = arg5;
		this.aClass26_Sub1_32 = arg0;
		this.anInt6719 = arg2;
		this.anInt6728 = arg1;
		this.anInt6723 = arg6;
		this.anInt6731 = arg4;
		this.anInt6729 = arg3;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lclient!ef;")
	@Override
	public Class65_Sub1 method5279() {
		if (this.aClass65_Sub1_2 == null) {
			Static354.anIntArray420[2] = this.anInt6729;
			Static354.anIntArray420[3] = this.anInt6731;
			Static354.anIntArray420[0] = this.anInt6728;
			Static354.anIntArray420[1] = this.anInt6719;
			Static354.anIntArray420[4] = this.anInt6722;
			@Pc(37) Interface8 local37 = this.aClass26_Sub1_32.anInterface8_5;
			Static354.anIntArray420[5] = this.anInt6723;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local37.method3835(Static354.anIntArray420[local48])) {
					return null;
				}
				@Pc(66) Class178 local66 = local37.method3836(Static354.anIntArray420[local48]);
				@Pc(73) int local73 = local66.aBoolean432 ? 64 : 128;
				if (local66.aByte58 > 0) {
					local44 = true;
				}
				if (local73 > local46) {
					local46 = local73;
				}
			}
			for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
				Static292.anIntArrayArray42[local93] = local37.method3832(1.0F, Static354.anIntArray420[local93], false, local46, local46);
			}
			this.aClass65_Sub1_2 = new Class65_Sub1(this.aClass26_Sub1_32, 6407, local46, local44, Static292.anIntArrayArray42);
		}
		return this.aClass65_Sub1_2;
	}
}
