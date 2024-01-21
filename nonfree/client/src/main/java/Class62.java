import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class62 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!wf;")
	public Class1_Sub25 aClass1_Sub25_1 = null;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public int anInt3644 = -1;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
	public final int[] anIntArray327;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
	public final int[] anIntArray325;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
	public final int[] anIntArray321;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
	public final int[] anIntArray326;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([BLclient!wf;)V")
	public Class62(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub25 arg1) {
		this.aClass1_Sub25_1 = arg1;
		@Pc(18) Class1_Sub6 local18 = new Class1_Sub6(arg0);
		@Pc(23) Class1_Sub6 local23 = new Class1_Sub6(arg0);
		local18.anInt839 = 2;
		@Pc(30) int local30 = local18.method544();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt839 = local18.anInt839 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method544();
			if (local47 > 0) {
				if (this.aClass1_Sub25_1.anIntArray431[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub25_1.anIntArray431[local59] == 0) {
							Static128.anIntArray324[local34] = local59;
							Static128.anIntArray323[local34] = 0;
							Static128.anIntArray320[local34] = 0;
							Static128.anIntArray322[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static128.anIntArray324[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub25_1.anIntArray431[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static128.anIntArray323[local34] = local94;
				} else {
					Static128.anIntArray323[local34] = local23.method525();
				}
				if ((local47 & 0x2) == 0) {
					Static128.anIntArray320[local34] = local94;
				} else {
					Static128.anIntArray320[local34] = local23.method525();
				}
				if ((local47 & 0x4) == 0) {
					Static128.anIntArray322[local34] = local94;
				} else {
					Static128.anIntArray322[local34] = local23.method525();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub25_1.anIntArray431[local42] == 5) {
					this.aBoolean157 = true;
				}
			}
		}
		if (local23.anInt839 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3644 = local34;
		this.anIntArray327 = new int[local34];
		this.anIntArray325 = new int[local34];
		this.anIntArray321 = new int[local34];
		this.anIntArray326 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray327[local47] = Static128.anIntArray324[local47];
			this.anIntArray325[local47] = Static128.anIntArray323[local47];
			this.anIntArray321[local47] = Static128.anIntArray320[local47];
			this.anIntArray326[local47] = Static128.anIntArray322[local47];
		}
	}
}
