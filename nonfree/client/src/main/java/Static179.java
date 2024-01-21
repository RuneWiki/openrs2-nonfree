import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!si", name = "k", descriptor = "I")
	public static int anInt1325;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!si", name = "p", descriptor = "[I")
	public static final int[] anIntArray74 = new int[200];

	@OriginalMember(owner = "client!si", name = "q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_610 = Static193.method3027("Sprites geladen)3");

	@OriginalMember(owner = "client!si", name = "r", descriptor = "Z")
	public static final boolean aBoolean80 = false;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "I")
	public static int anInt1329 = 0;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public static void method959() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
	public static void method961() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static35.anInt770 - 1; local13++) {
				if (Static55.aShortArray13[local13] < 1000 && Static55.aShortArray13[local13 + 1] > 1000) {
					local7 = false;
					@Pc(35) Class70 local35 = Static49.aClass70Array21[local13];
					Static49.aClass70Array21[local13] = Static49.aClass70Array21[local13 + 1];
					Static49.aClass70Array21[local13 + 1] = local35;
					@Pc(53) Class70 local53 = Static136.aClass70Array48[local13];
					Static136.aClass70Array48[local13] = Static136.aClass70Array48[local13 + 1];
					Static136.aClass70Array48[local13 + 1] = local53;
					@Pc(71) int local71 = Static155.anIntArray233[local13];
					Static155.anIntArray233[local13] = Static155.anIntArray233[local13 + 1];
					Static155.anIntArray233[local13 + 1] = local71;
					@Pc(89) int local89 = Static175.anIntArray293[local13];
					Static175.anIntArray293[local13] = Static175.anIntArray293[local13 + 1];
					Static175.anIntArray293[local13 + 1] = local89;
					@Pc(107) short local107 = Static55.aShortArray13[local13];
					Static55.aShortArray13[local13] = Static55.aShortArray13[local13 + 1];
					Static55.aShortArray13[local13 + 1] = local107;
					@Pc(125) long local125 = Static95.aLongArray3[local13];
					Static95.aLongArray3[local13] = Static95.aLongArray3[local13 + 1];
					Static95.aLongArray3[local13 + 1] = local125;
				}
			}
		}
	}
}
