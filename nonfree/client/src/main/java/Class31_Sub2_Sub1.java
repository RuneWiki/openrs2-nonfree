import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class31_Sub2_Sub1 extends Class31_Sub2 {

	@OriginalMember(owner = "client!efa", name = "t", descriptor = "Lclient!td;")
	private Interface24 anInterface24_1;

	@OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
	private final int anInt3130;

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "I")
	private final int anInt3129;

	@OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
	private final int anInt3131;

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
	private final int anInt3126;

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
	private final int anInt3125;

	@OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
	private final int anInt3132;

	@OriginalMember(owner = "client!efa", name = "k", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_4;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!uv;IIIIII)V")
	public Class31_Sub2_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3130 = arg2;
		this.anInt3129 = arg5;
		this.anInt3131 = arg1;
		this.anInt3126 = arg3;
		this.anInt3125 = arg4;
		this.anInt3132 = arg6;
		this.aClass5_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Lclient!td;")
	@Override
	public Interface24 method2624() {
		if (this.anInterface24_1 == null) {
			Static327.anIntArray306[4] = this.anInt3129;
			Static327.anIntArray306[3] = this.anInt3125;
			Static327.anIntArray306[1] = this.anInt3130;
			Static327.anIntArray306[2] = this.anInt3126;
			Static327.anIntArray306[0] = this.anInt3131;
			@Pc(37) Interface7 local37 = this.aClass5_Sub2_4.anInterface7_10;
			Static327.anIntArray306[5] = this.anInt3132;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local37.method6928(Static327.anIntArray306[local48])) {
					return null;
				}
				@Pc(66) Class254 local66 = local37.method6931(Static327.anIntArray306[local48]);
				@Pc(73) int local73 = local66.aBoolean616 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte99 > 0) {
					local44 = true;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static41.anIntArrayArray4[local98] = local37.method6929(Static327.anIntArray306[local98], local46, 1.0F, false, local46);
			}
			this.anInterface24_1 = this.aClass5_Sub2_4.method3937(local44, Static41.anIntArrayArray4, local46);
		}
		return this.anInterface24_1;
	}
}
