import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class45 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!gg;")
	public Class2_Sub9 aClass2_Sub9_1 = null;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	public int anInt1879 = -1;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
	public final int[] anIntArray205;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
	public final int[] anIntArray200;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public final int[] anIntArray198;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "[I")
	public final int[] anIntArray204;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([BLclient!gg;)V")
	public Class45(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		this.aClass2_Sub9_1 = arg1;
		@Pc(18) Class2_Sub11 local18 = new Class2_Sub11(arg0);
		@Pc(23) Class2_Sub11 local23 = new Class2_Sub11(arg0);
		local18.anInt2077 = 2;
		@Pc(30) int local30 = local18.method1461();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2077 = local18.anInt2077 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1461();
			if (local47 > 0) {
				if (this.aClass2_Sub9_1.anIntArray166[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub9_1.anIntArray166[local59] == 0) {
							Static82.anIntArray201[local34] = local59;
							Static82.anIntArray199[local34] = 0;
							Static82.anIntArray203[local34] = 0;
							Static82.anIntArray202[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static82.anIntArray201[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub9_1.anIntArray166[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static82.anIntArray199[local34] = local94;
				} else {
					Static82.anIntArray199[local34] = local23.method1464();
				}
				if ((local47 & 0x2) == 0) {
					Static82.anIntArray203[local34] = local94;
				} else {
					Static82.anIntArray203[local34] = local23.method1464();
				}
				if ((local47 & 0x4) == 0) {
					Static82.anIntArray202[local34] = local94;
				} else {
					Static82.anIntArray202[local34] = local23.method1464();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub9_1.anIntArray166[local42] == 5) {
					this.aBoolean82 = true;
				}
			}
		}
		if (local23.anInt2077 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1879 = local34;
		this.anIntArray205 = new int[local34];
		this.anIntArray200 = new int[local34];
		this.anIntArray198 = new int[local34];
		this.anIntArray204 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray205[local47] = Static82.anIntArray201[local47];
			this.anIntArray200[local47] = Static82.anIntArray199[local47];
			this.anIntArray198[local47] = Static82.anIntArray203[local47];
			this.anIntArray204[local47] = Static82.anIntArray202[local47];
		}
	}
}
