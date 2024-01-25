import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class185_Sub2_Sub1 extends Class185_Sub2 {

	@OriginalMember(owner = "client!ofa", name = "v", descriptor = "Lclient!oda;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!ofa", name = "A", descriptor = "I")
	private final int anInt7084;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "I")
	private final int anInt7075;

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
	private final int anInt7087;

	@OriginalMember(owner = "client!ofa", name = "s", descriptor = "I")
	private final int anInt7076;

	@OriginalMember(owner = "client!ofa", name = "B", descriptor = "I")
	private final int anInt7077;

	@OriginalMember(owner = "client!ofa", name = "z", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_16;

	@OriginalMember(owner = "client!ofa", name = "E", descriptor = "I")
	private final int anInt7083;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lclient!gca;IIIIII)V")
	public Class185_Sub2_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7084 = arg3;
		this.anInt7075 = arg1;
		this.anInt7087 = arg6;
		this.anInt7076 = arg2;
		this.anInt7077 = arg4;
		this.aClass100_Sub1_16 = arg0;
		this.anInt7083 = arg5;
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)Lclient!oda;")
	@Override
	public Interface22 method6157() {
		if (this.anInterface22_1 == null) {
			Static615.anIntArray551[2] = this.anInt7084;
			@Pc(17) Interface7 local17 = this.aClass100_Sub1_16.anInterface7_12;
			Static615.anIntArray551[1] = this.anInt7076;
			Static615.anIntArray551[4] = this.anInt7083;
			Static615.anIntArray551[3] = this.anInt7077;
			Static615.anIntArray551[0] = this.anInt7075;
			Static615.anIntArray551[5] = this.anInt7087;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local17.method7421(Static615.anIntArray551[local48])) {
					return null;
				}
				@Pc(69) Class44 local69 = local17.method7423(Static615.anIntArray551[local48]);
				@Pc(77) int local77 = local69.aBoolean62 ? 64 : 128;
				if (local69.aByte21 > 0) {
					local44 = true;
				}
				if (local46 < local77) {
					local46 = local77;
				}
			}
			for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
				Static504.anIntArrayArray52[local93] = local17.method7424(local46, false, local46, Static615.anIntArray551[local93], 1.0F);
			}
			this.anInterface22_1 = this.aClass100_Sub1_16.method7879(Static504.anIntArrayArray52, local44, local46);
		}
		return this.anInterface22_1;
	}
}
