import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class58_Sub2_Sub1 extends Class58_Sub2 {

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!df;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	private final int anInt1971;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	private final int anInt1966;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_7;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	private final int anInt1964;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	private final int anInt1970;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	private final int anInt1965;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	private final int anInt1967;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!kw;IIIIII)V")
	public Class58_Sub2_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1971 = arg4;
		this.anInt1966 = arg5;
		this.aClass39_Sub2_7 = arg0;
		this.anInt1964 = arg2;
		this.anInt1970 = arg6;
		this.anInt1965 = arg1;
		this.anInt1967 = arg3;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Lclient!df;")
	@Override
	public Interface4 method1912() {
		if (this.anInterface4_1 == null) {
			Static285.anIntArray462[1] = this.anInt1964;
			Static285.anIntArray462[4] = this.anInt1966;
			Static285.anIntArray462[5] = this.anInt1970;
			Static285.anIntArray462[2] = this.anInt1967;
			Static285.anIntArray462[0] = this.anInt1965;
			Static285.anIntArray462[3] = this.anInt1971;
			@Pc(48) Interface12 local48 = this.aClass39_Sub2_7.anInterface12_15;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local48.method2572(Static285.anIntArray462[local54])) {
					return null;
				}
				@Pc(72) Class204 local72 = local48.method2573(Static285.anIntArray462[local54]);
				@Pc(79) int local79 = local72.aBoolean454 ? 64 : 128;
				if (local52 < local79) {
					local52 = local79;
				}
				if (local72.aByte81 > 0) {
					local50 = true;
				}
			}
			for (@Pc(104) int local104 = 0; local104 < 6; local104++) {
				Static237.anIntArrayArray47[local104] = local48.method2571(local52, local52, 1.0F, Static285.anIntArray462[local104], false);
			}
			this.anInterface4_1 = this.aClass39_Sub2_7.method6147(local52, local50, Static237.anIntArrayArray47);
		}
		return this.anInterface4_1;
	}
}
