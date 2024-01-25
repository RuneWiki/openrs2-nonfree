import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class12_Sub1_Sub1 extends Class12_Sub1 {

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!uia;")
	private Interface23 anInterface23_1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_3;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	private final int anInt261;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	private final int anInt262;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	private final int anInt260;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	private final int anInt257;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	private final int anInt263;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	private final int anInt258;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!pga;IIIIII)V")
	public Class12_Sub1_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass95_Sub3_3 = arg0;
		this.anInt261 = arg4;
		this.anInt262 = arg1;
		this.anInt260 = arg5;
		this.anInt257 = arg3;
		this.anInt263 = arg6;
		this.anInt258 = arg2;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lclient!uia;")
	@Override
	public Interface23 method262() {
		if (this.anInterface23_1 == null) {
			Static74.anIntArray104[4] = this.anInt260;
			Static74.anIntArray104[1] = this.anInt258;
			Static74.anIntArray104[0] = this.anInt262;
			Static74.anIntArray104[5] = this.anInt263;
			Static74.anIntArray104[2] = this.anInt257;
			@Pc(37) Interface6 local37 = this.aClass95_Sub3_3.anInterface6_27;
			Static74.anIntArray104[3] = this.anInt261;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local37.method1493(Static74.anIntArray104[local48])) {
					return null;
				}
				@Pc(66) Class175 local66 = local37.method1492(Static74.anIntArray104[local48]);
				@Pc(73) int local73 = local66.aBoolean309 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte55 > 0) {
					local44 = true;
				}
			}
			for (@Pc(92) int local92 = 0; local92 < 6; local92++) {
				Static514.anIntArrayArray53[local92] = local37.method1489(false, local46, 1.0F, local46, Static74.anIntArray104[local92]);
			}
			this.anInterface23_1 = this.aClass95_Sub3_3.method7043(local46, Static514.anIntArrayArray53, local44);
		}
		return this.anInterface23_1;
	}
}
