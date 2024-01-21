import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class41 {

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Lclient!d;")
	public Class8_Sub6 aClass8_Sub6_1 = null;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	public int anInt1604 = -1;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "[I")
	public final int[] anIntArray197;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
	public final int[] anIntArray201;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "[I")
	public final int[] anIntArray203;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
	public final int[] anIntArray198;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([BLclient!d;)V")
	public Class41(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class8_Sub6 arg1) {
		this.aClass8_Sub6_1 = arg1;
		@Pc(18) Class8_Sub20 local18 = new Class8_Sub20(arg0);
		@Pc(23) Class8_Sub20 local23 = new Class8_Sub20(arg0);
		local18.anInt2853 = 2;
		@Pc(30) int local30 = local18.method1872();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2853 = local18.anInt2853 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1872();
			if (local47 > 0) {
				if (this.aClass8_Sub6_1.anIntArray66[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass8_Sub6_1.anIntArray66[local59] == 0) {
							Static65.anIntArray196[local34] = local59;
							Static65.anIntArray200[local34] = 0;
							Static65.anIntArray199[local34] = 0;
							Static65.anIntArray202[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static65.anIntArray196[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass8_Sub6_1.anIntArray66[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static65.anIntArray200[local34] = local94;
				} else {
					Static65.anIntArray200[local34] = local23.method1888();
				}
				if ((local47 & 0x2) == 0) {
					Static65.anIntArray199[local34] = local94;
				} else {
					Static65.anIntArray199[local34] = local23.method1888();
				}
				if ((local47 & 0x4) == 0) {
					Static65.anIntArray202[local34] = local94;
				} else {
					Static65.anIntArray202[local34] = local23.method1888();
				}
				local32 = local42;
				local34++;
				if (this.aClass8_Sub6_1.anIntArray66[local42] == 5) {
					this.aBoolean65 = true;
				}
			}
		}
		if (local23.anInt2853 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1604 = local34;
		this.anIntArray197 = new int[local34];
		this.anIntArray201 = new int[local34];
		this.anIntArray203 = new int[local34];
		this.anIntArray198 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray197[local47] = Static65.anIntArray196[local47];
			this.anIntArray201[local47] = Static65.anIntArray200[local47];
			this.anIntArray203[local47] = Static65.anIntArray199[local47];
			this.anIntArray198[local47] = Static65.anIntArray202[local47];
		}
	}
}
