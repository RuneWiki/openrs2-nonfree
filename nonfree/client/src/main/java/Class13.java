import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class13 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public int anInt653 = -1;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!gb;")
	public Class1_Sub10 aClass1_Sub10_1 = null;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
	public final int[] anIntArray71;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
	public final int[] anIntArray67;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
	public final int[] anIntArray73;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[I")
	public final int[] anIntArray74;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([BLclient!gb;)V")
	public Class13(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub10 arg1) {
		this.aClass1_Sub10_1 = arg1;
		@Pc(18) Class1_Sub19 local18 = new Class1_Sub19(arg0);
		@Pc(23) Class1_Sub19 local23 = new Class1_Sub19(arg0);
		local18.anInt3111 = 2;
		@Pc(30) int local30 = local18.method2072();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt3111 = local18.anInt3111 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method2072();
			if (local47 > 0) {
				if (this.aClass1_Sub10_1.anIntArray118[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub10_1.anIntArray118[local59] == 0) {
							Static18.anIntArray68[local34] = local59;
							Static18.anIntArray72[local34] = 0;
							Static18.anIntArray69[local34] = 0;
							Static18.anIntArray70[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static18.anIntArray68[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub10_1.anIntArray118[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static18.anIntArray72[local34] = local94;
				} else {
					Static18.anIntArray72[local34] = local23.method2060();
				}
				if ((local47 & 0x2) == 0) {
					Static18.anIntArray69[local34] = local94;
				} else {
					Static18.anIntArray69[local34] = local23.method2060();
				}
				if ((local47 & 0x4) == 0) {
					Static18.anIntArray70[local34] = local94;
				} else {
					Static18.anIntArray70[local34] = local23.method2060();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub10_1.anIntArray118[local42] == 5) {
					this.aBoolean31 = true;
				}
			}
		}
		if (local23.anInt3111 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt653 = local34;
		this.anIntArray71 = new int[local34];
		this.anIntArray67 = new int[local34];
		this.anIntArray73 = new int[local34];
		this.anIntArray74 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray71[local47] = Static18.anIntArray68[local47];
			this.anIntArray67[local47] = Static18.anIntArray72[local47];
			this.anIntArray73[local47] = Static18.anIntArray69[local47];
			this.anIntArray74[local47] = Static18.anIntArray70[local47];
		}
	}
}
