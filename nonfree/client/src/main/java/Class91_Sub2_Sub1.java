import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class91_Sub2_Sub1 extends Class91_Sub2 {

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!np;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "I")
	private final int anInt9509;

	@OriginalMember(owner = "client!um", name = "j", descriptor = "I")
	private final int anInt9505;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "I")
	private final int anInt9506;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "I")
	private final int anInt9510;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "I")
	private final int anInt9508;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_20;

	@OriginalMember(owner = "client!um", name = "o", descriptor = "I")
	private final int anInt9507;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!rv;IIIIII)V")
	public Class91_Sub2_Sub1(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9509 = arg5;
		this.anInt9505 = arg2;
		this.anInt9506 = arg3;
		this.anInt9510 = arg6;
		this.anInt9508 = arg4;
		this.aClass126_Sub2_20 = arg0;
		this.anInt9507 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Lclient!np;")
	@Override
	public Interface18 method8163() {
		if (this.anInterface18_1 == null) {
			@Pc(12) Interface8 local12 = this.aClass126_Sub2_20.anInterface8_10;
			Static550.anIntArray516[4] = this.anInt9509;
			Static550.anIntArray516[3] = this.anInt9508;
			Static550.anIntArray516[1] = this.anInt9505;
			Static550.anIntArray516[5] = this.anInt9510;
			Static550.anIntArray516[2] = this.anInt9506;
			Static550.anIntArray516[0] = this.anInt9507;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local12.method7811(Static550.anIntArray516[local48])) {
					return null;
				}
				@Pc(66) Class321 local66 = local12.method7813(Static550.anIntArray516[local48]);
				@Pc(73) int local73 = local66.aBoolean729 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte114 > 0) {
					local44 = true;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static436.anIntArrayArray42[local98] = local12.method7812(local46, 1.0F, false, Static550.anIntArray516[local98], local46);
			}
			this.anInterface18_1 = this.aClass126_Sub2_20.method5458(local44, Static436.anIntArrayArray42, local46);
		}
		return this.anInterface18_1;
	}
}
