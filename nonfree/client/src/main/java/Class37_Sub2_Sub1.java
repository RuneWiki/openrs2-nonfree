import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class37_Sub2_Sub1 extends Class37_Sub2 {

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "Lclient!oq;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	private final int anInt8065;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
	private final int anInt8068;

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
	private final int anInt8074;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
	private final int anInt8073;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
	private final int anInt8067;

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_19;

	@OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
	private final int anInt8076;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!en;IIIIII)V")
	public Class37_Sub2_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8065 = arg6;
		this.anInt8068 = arg2;
		this.anInt8074 = arg1;
		this.anInt8073 = arg5;
		this.anInt8067 = arg3;
		this.aClass100_Sub1_19 = arg0;
		this.anInt8076 = arg4;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Lclient!oq;")
	@Override
	public Interface20 method6642() {
		if (this.anInterface20_1 == null) {
			Static58.anIntArray72[1] = this.anInt8068;
			Static58.anIntArray72[0] = this.anInt8074;
			Static58.anIntArray72[3] = this.anInt8076;
			Static58.anIntArray72[5] = this.anInt8065;
			@Pc(38) Interface5 local38 = this.aClass100_Sub1_19.anInterface5_10;
			Static58.anIntArray72[2] = this.anInt8067;
			Static58.anIntArray72[4] = this.anInt8073;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local38.method914(Static58.anIntArray72[local54])) {
					return null;
				}
				@Pc(72) Class343 local72 = local38.method917(Static58.anIntArray72[local54]);
				@Pc(79) int local79 = local72.aBoolean700 ? 64 : 128;
				if (local72.aByte116 > 0) {
					local50 = true;
				}
				if (local52 < local79) {
					local52 = local79;
				}
			}
			for (@Pc(104) int local104 = 0; local104 < 6; local104++) {
				Static129.anIntArrayArray12[local104] = local38.method916(Static58.anIntArray72[local104], 1.0F, false, local52, local52);
			}
			this.anInterface20_1 = this.aClass100_Sub1_19.method4759(local50, local52, Static129.anIntArrayArray12);
		}
		return this.anInterface20_1;
	}
}
