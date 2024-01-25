import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class141_Sub1_Sub2 extends Class141_Sub1 {

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "Lclient!ea;")
	private Class64_Sub1 aClass64_Sub1_2;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
	private final int anInt4457;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	private final int anInt4451;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	private final int anInt4455;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
	private final int anInt4456;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	private final int anInt4450;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_26;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
	private final int anInt4454;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!na;IIIIII)V")
	public Class141_Sub1_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4457 = arg1;
		this.anInt4451 = arg3;
		this.anInt4455 = arg6;
		this.anInt4456 = arg2;
		this.anInt4450 = arg4;
		this.aClass75_Sub2_26 = arg0;
		this.anInt4454 = arg5;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Lclient!ea;")
	@Override
	public Class64_Sub1 method3562() {
		if (this.aClass64_Sub1_2 == null) {
			Static133.anIntArray472[5] = this.anInt4455;
			@Pc(24) Interface7 local24 = this.aClass75_Sub2_26.anInterface7_8;
			Static133.anIntArray472[1] = this.anInt4456;
			Static133.anIntArray472[4] = this.anInt4454;
			Static133.anIntArray472[3] = this.anInt4450;
			Static133.anIntArray472[0] = this.anInt4457;
			Static133.anIntArray472[2] = this.anInt4451;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local24.method1168(Static133.anIntArray472[local55])) {
					return null;
				}
				@Pc(73) Class257 local73 = local24.method1170(Static133.anIntArray472[local55]);
				@Pc(80) int local80 = local73.aBoolean493 ? 64 : 128;
				if (local73.aByte91 > 0) {
					local51 = true;
				}
				if (local80 > local53) {
					local53 = local80;
				}
			}
			for (@Pc(96) int local96 = 0; local96 < 6; local96++) {
				Static439.anIntArrayArray181[local96] = local24.method1171(false, 1.0F, Static133.anIntArray472[local96], local53, local53);
			}
			this.aClass64_Sub1_2 = new Class64_Sub1(this.aClass75_Sub2_26, 6407, local53, local51, Static439.anIntArrayArray181);
		}
		return this.aClass64_Sub1_2;
	}
}
