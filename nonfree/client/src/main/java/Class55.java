import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class55 {

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!id;")
	public Class2_Sub6 aClass2_Sub6_1 = null;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "I")
	public int anInt1664 = -1;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "[I")
	public final int[] anIntArray207;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "[I")
	public final int[] anIntArray204;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
	public final int[] anIntArray202;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "[I")
	public final int[] anIntArray205;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BLclient!id;)V")
	public Class55(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		this.aClass2_Sub6_1 = arg1;
		@Pc(18) Class2_Sub4 local18 = new Class2_Sub4(arg0);
		@Pc(23) Class2_Sub4 local23 = new Class2_Sub4(arg0);
		local18.anInt1298 = 2;
		@Pc(30) int local30 = local18.method933();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1298 = local18.anInt1298 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method933();
			if (local47 > 0) {
				if (this.aClass2_Sub6_1.anIntArray134[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub6_1.anIntArray134[local59] == 0) {
							Static74.anIntArray201[local34] = local59;
							Static74.anIntArray208[local34] = 0;
							Static74.anIntArray206[local34] = 0;
							Static74.anIntArray203[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static74.anIntArray201[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub6_1.anIntArray134[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static74.anIntArray208[local34] = local94;
				} else {
					Static74.anIntArray208[local34] = local23.method946();
				}
				if ((local47 & 0x2) == 0) {
					Static74.anIntArray206[local34] = local94;
				} else {
					Static74.anIntArray206[local34] = local23.method946();
				}
				if ((local47 & 0x4) == 0) {
					Static74.anIntArray203[local34] = local94;
				} else {
					Static74.anIntArray203[local34] = local23.method946();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub6_1.anIntArray134[local42] == 5) {
					this.aBoolean62 = true;
				}
			}
		}
		if (local23.anInt1298 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1664 = local34;
		this.anIntArray207 = new int[local34];
		this.anIntArray204 = new int[local34];
		this.anIntArray202 = new int[local34];
		this.anIntArray205 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray207[local47] = Static74.anIntArray201[local47];
			this.anIntArray204[local47] = Static74.anIntArray208[local47];
			this.anIntArray202[local47] = Static74.anIntArray206[local47];
			this.anIntArray205[local47] = Static74.anIntArray203[local47];
		}
	}
}
