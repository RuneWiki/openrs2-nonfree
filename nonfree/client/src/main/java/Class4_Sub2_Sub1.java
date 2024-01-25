import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "Lclient!sq;")
	private Interface24 anInterface24_1;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
	private final int anInt8023;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	private final int anInt8020;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	private final int anInt8018;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
	private final int anInt8021;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
	private final int anInt8022;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
	private final int anInt8019;

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_17;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!bm;IIIIII)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8023 = arg3;
		this.anInt8020 = arg5;
		this.anInt8018 = arg2;
		this.anInt8021 = arg4;
		this.anInt8022 = arg6;
		this.anInt8019 = arg1;
		this.aClass33_Sub1_17 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)Lclient!sq;")
	@Override
	public Interface24 method6710() {
		if (this.anInterface24_1 == null) {
			Static363.anIntArray408[3] = this.anInt8021;
			Static363.anIntArray408[2] = this.anInt8023;
			Static363.anIntArray408[1] = this.anInt8018;
			Static363.anIntArray408[5] = this.anInt8022;
			@Pc(32) Interface5 local32 = this.aClass33_Sub1_17.anInterface5_11;
			Static363.anIntArray408[0] = this.anInt8019;
			Static363.anIntArray408[4] = this.anInt8020;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local32.method6867(Static363.anIntArray408[local48])) {
					return null;
				}
				@Pc(66) Class156 local66 = local32.method6869(Static363.anIntArray408[local48]);
				@Pc(73) int local73 = local66.aBoolean494 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte70 > 0) {
					local44 = true;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static22.anIntArrayArray3[local98] = local32.method6868(false, 1.0F, local46, Static363.anIntArray408[local98], local46);
			}
			this.anInterface24_1 = this.aClass33_Sub1_17.method2035(local46, Static22.anIntArrayArray3, local44);
		}
		return this.anInterface24_1;
	}
}
