import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class AnimFrame {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
	public static int[] anIntArray96 = new int[500];
	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
	public static int[] anIntArray97 = new int[500];
	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
	public static int[] anIntArray99 = new int[500];
	@OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
	public static int[] anIntArray101 = new int[500];
	@OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
	public int anInt881 = -1;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!nb;")
	public AnimBase aClass4_Sub16_1 = null;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "[I")
	public final int[] anIntArray102;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
	public final int[] anIntArray100;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "[I")
	public final int[] anIntArray103;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "[I")
	public final int[] anIntArray98;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([BLclient!nb;)V")
	public AnimFrame(@OriginalArg(0) byte[] arg0, @OriginalArg(1) AnimBase arg1) {
		this.aClass4_Sub16_1 = arg1;
		@Pc(18) Packet local18 = new Packet(arg0);
		@Pc(23) Packet local23 = new Packet(arg0);
		local18.anInt1099 = 2;
		@Pc(30) int local30 = local18.method719();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1099 = local18.anInt1099 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method719();
			if (local47 > 0) {
				if (this.aClass4_Sub16_1.anIntArray200[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass4_Sub16_1.anIntArray200[local59] == 0) {
							anIntArray97[local34] = local59;
							anIntArray101[local34] = 0;
							anIntArray99[local34] = 0;
							anIntArray96[local34] = 0;
							local34++;
							break;
						}
					}
				}
				anIntArray97[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass4_Sub16_1.anIntArray200[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					anIntArray101[local34] = local94;
				} else {
					anIntArray101[local34] = local23.method703();
				}
				if ((local47 & 0x2) == 0) {
					anIntArray99[local34] = local94;
				} else {
					anIntArray99[local34] = local23.method703();
				}
				if ((local47 & 0x4) == 0) {
					anIntArray96[local34] = local94;
				} else {
					anIntArray96[local34] = local23.method703();
				}
				local32 = local42;
				local34++;
				if (this.aClass4_Sub16_1.anIntArray200[local42] == 5) {
					this.aBoolean93 = true;
				}
			}
		}
		if (local23.anInt1099 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt881 = local34;
		this.anIntArray102 = new int[local34];
		this.anIntArray100 = new int[local34];
		this.anIntArray103 = new int[local34];
		this.anIntArray98 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray102[local47] = anIntArray97[local47];
			this.anIntArray100[local47] = anIntArray101[local47];
			this.anIntArray103[local47] = anIntArray99[local47];
			this.anIntArray98[local47] = anIntArray96[local47];
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	public static void method576() {
		anIntArray97 = null;
		anIntArray101 = null;
		anIntArray99 = null;
		anIntArray96 = null;
	}
}
