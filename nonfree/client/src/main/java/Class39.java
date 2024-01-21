import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class39 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!gd;")
	public Class10_Sub6 aClass10_Sub6_1 = null;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	public int anInt1571 = -1;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
	public final int[] anIntArray174;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "[I")
	public final int[] anIntArray177;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "[I")
	public final int[] anIntArray181;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
	public final int[] anIntArray178;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([BLclient!gd;)V")
	public Class39(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class10_Sub6 arg1) {
		this.aClass10_Sub6_1 = arg1;
		@Pc(18) Class10_Sub10 local18 = new Class10_Sub10(arg0);
		@Pc(23) Class10_Sub10 local23 = new Class10_Sub10(arg0);
		local18.anInt1957 = 2;
		@Pc(30) int local30 = local18.method1111();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1957 = local18.anInt1957 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1111();
			if (local47 > 0) {
				if (this.aClass10_Sub6_1.anIntArray103[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass10_Sub6_1.anIntArray103[local59] == 0) {
							Static59.anIntArray179[local34] = local59;
							Static59.anIntArray175[local34] = 0;
							Static59.anIntArray180[local34] = 0;
							Static59.anIntArray176[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static59.anIntArray179[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass10_Sub6_1.anIntArray103[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static59.anIntArray175[local34] = local94;
				} else {
					Static59.anIntArray175[local34] = local23.method1121();
				}
				if ((local47 & 0x2) == 0) {
					Static59.anIntArray180[local34] = local94;
				} else {
					Static59.anIntArray180[local34] = local23.method1121();
				}
				if ((local47 & 0x4) == 0) {
					Static59.anIntArray176[local34] = local94;
				} else {
					Static59.anIntArray176[local34] = local23.method1121();
				}
				local32 = local42;
				local34++;
				if (this.aClass10_Sub6_1.anIntArray103[local42] == 5) {
					this.aBoolean76 = true;
				}
			}
		}
		if (local23.anInt1957 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1571 = local34;
		this.anIntArray174 = new int[local34];
		this.anIntArray177 = new int[local34];
		this.anIntArray181 = new int[local34];
		this.anIntArray178 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray174[local47] = Static59.anIntArray179[local47];
			this.anIntArray177[local47] = Static59.anIntArray175[local47];
			this.anIntArray181[local47] = Static59.anIntArray180[local47];
			this.anIntArray178[local47] = Static59.anIntArray176[local47];
		}
	}
}
