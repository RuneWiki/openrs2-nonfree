import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class25 {

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!ba;")
	public Class2_Sub2 aClass2_Sub2_1 = null;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public int anInt1000 = -1;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
	public final int[] anIntArray146;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
	public final int[] anIntArray149;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
	public final int[] anIntArray144;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
	public final int[] anIntArray147;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([BLclient!ba;)V")
	public Class25(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		this.aClass2_Sub2_1 = arg1;
		@Pc(18) Class2_Sub5 local18 = new Class2_Sub5(arg0);
		@Pc(23) Class2_Sub5 local23 = new Class2_Sub5(arg0);
		local18.anInt1772 = 2;
		@Pc(30) int local30 = local18.method1281();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1772 = local18.anInt1772 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1281();
			if (local47 > 0) {
				if (this.aClass2_Sub2_1.anIntArray28[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub2_1.anIntArray28[local59] == 0) {
							Static33.anIntArray142[local34] = local59;
							Static33.anIntArray148[local34] = 0;
							Static33.anIntArray143[local34] = 0;
							Static33.anIntArray145[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static33.anIntArray142[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub2_1.anIntArray28[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static33.anIntArray148[local34] = local94;
				} else {
					Static33.anIntArray148[local34] = local23.method1251();
				}
				if ((local47 & 0x2) == 0) {
					Static33.anIntArray143[local34] = local94;
				} else {
					Static33.anIntArray143[local34] = local23.method1251();
				}
				if ((local47 & 0x4) == 0) {
					Static33.anIntArray145[local34] = local94;
				} else {
					Static33.anIntArray145[local34] = local23.method1251();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub2_1.anIntArray28[local42] == 5) {
					this.aBoolean58 = true;
				}
			}
		}
		if (local23.anInt1772 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1000 = local34;
		this.anIntArray146 = new int[local34];
		this.anIntArray149 = new int[local34];
		this.anIntArray144 = new int[local34];
		this.anIntArray147 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray146[local47] = Static33.anIntArray142[local47];
			this.anIntArray149[local47] = Static33.anIntArray148[local47];
			this.anIntArray144[local47] = Static33.anIntArray143[local47];
			this.anIntArray147[local47] = Static33.anIntArray145[local47];
		}
	}
}
