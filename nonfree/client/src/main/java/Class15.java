import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class15 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!nc;")
	public Class1_Sub10 aClass1_Sub10_1 = null;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public int anInt733 = -1;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
	public final int[] anIntArray101;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
	public final int[] anIntArray100;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
	public final int[] anIntArray98;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "[I")
	public final int[] anIntArray102;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([BLclient!nc;)V")
	public Class15(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub10 arg1) {
		this.aClass1_Sub10_1 = arg1;
		@Pc(18) Class1_Sub5 local18 = new Class1_Sub5(arg0);
		@Pc(23) Class1_Sub5 local23 = new Class1_Sub5(arg0);
		local18.anInt1266 = 2;
		@Pc(30) int local30 = local18.method716();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1266 = local18.anInt1266 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method716();
			if (local47 > 0) {
				if (this.aClass1_Sub10_1.anIntArray232[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub10_1.anIntArray232[local59] == 0) {
							Static22.anIntArray96[local34] = local59;
							Static22.anIntArray103[local34] = 0;
							Static22.anIntArray99[local34] = 0;
							Static22.anIntArray97[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static22.anIntArray96[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub10_1.anIntArray232[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static22.anIntArray103[local34] = local94;
				} else {
					Static22.anIntArray103[local34] = local23.method706();
				}
				if ((local47 & 0x2) == 0) {
					Static22.anIntArray99[local34] = local94;
				} else {
					Static22.anIntArray99[local34] = local23.method706();
				}
				if ((local47 & 0x4) == 0) {
					Static22.anIntArray97[local34] = local94;
				} else {
					Static22.anIntArray97[local34] = local23.method706();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub10_1.anIntArray232[local42] == 5) {
					this.aBoolean35 = true;
				}
			}
		}
		if (local23.anInt1266 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt733 = local34;
		this.anIntArray101 = new int[local34];
		this.anIntArray100 = new int[local34];
		this.anIntArray98 = new int[local34];
		this.anIntArray102 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray101[local47] = Static22.anIntArray96[local47];
			this.anIntArray100[local47] = Static22.anIntArray103[local47];
			this.anIntArray98[local47] = Static22.anIntArray99[local47];
			this.anIntArray102[local47] = Static22.anIntArray97[local47];
		}
	}
}
