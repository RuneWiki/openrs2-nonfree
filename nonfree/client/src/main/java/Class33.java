import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class33 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public int anInt1144 = -1;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!ve;")
	public Class2_Sub24 aClass2_Sub24_1 = null;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
	public final int[] anIntArray120;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
	public final int[] anIntArray123;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "[I")
	public final int[] anIntArray121;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
	public final int[] anIntArray125;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([BLclient!ve;)V")
	public Class33(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		this.aClass2_Sub24_1 = arg1;
		@Pc(18) Class2_Sub9 local18 = new Class2_Sub9(arg0);
		@Pc(23) Class2_Sub9 local23 = new Class2_Sub9(arg0);
		local18.anInt976 = 2;
		@Pc(30) int local30 = local18.method640();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt976 = local18.anInt976 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method640();
			if (local47 > 0) {
				if (this.aClass2_Sub24_1.anIntArray345[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub24_1.anIntArray345[local59] == 0) {
							Static44.anIntArray124[local34] = local59;
							Static44.anIntArray127[local34] = 0;
							Static44.anIntArray122[local34] = 0;
							Static44.anIntArray126[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static44.anIntArray124[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub24_1.anIntArray345[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static44.anIntArray127[local34] = local94;
				} else {
					Static44.anIntArray127[local34] = local23.method641();
				}
				if ((local47 & 0x2) == 0) {
					Static44.anIntArray122[local34] = local94;
				} else {
					Static44.anIntArray122[local34] = local23.method641();
				}
				if ((local47 & 0x4) == 0) {
					Static44.anIntArray126[local34] = local94;
				} else {
					Static44.anIntArray126[local34] = local23.method641();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub24_1.anIntArray345[local42] == 5) {
					this.aBoolean80 = true;
				}
			}
		}
		if (local23.anInt976 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1144 = local34;
		this.anIntArray120 = new int[local34];
		this.anIntArray123 = new int[local34];
		this.anIntArray121 = new int[local34];
		this.anIntArray125 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray120[local47] = Static44.anIntArray124[local47];
			this.anIntArray123[local47] = Static44.anIntArray127[local47];
			this.anIntArray121[local47] = Static44.anIntArray122[local47];
			this.anIntArray125[local47] = Static44.anIntArray126[local47];
		}
	}
}
