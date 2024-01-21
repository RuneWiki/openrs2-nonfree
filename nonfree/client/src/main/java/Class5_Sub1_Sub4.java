import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "[I")
	public static int[] anIntArray83 = new int[99];

	@OriginalMember(owner = "client!db", name = "O", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!db", name = "W", descriptor = "[Lclient!vc;")
	public Class71[] aClass71Array6;

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "[I")
	public int[] anIntArray82;

	static {
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < 99; local27++) {
			@Pc(32) int local32 = local27 + 1;
			@Pc(45) int local45 = (int) ((double) local32 + Math.pow(2.0D, (double) local32 / 7.0D) * 300.0D);
			local25 += local45;
			anIntArray83[local27] = local25 / 4;
		}
	}
}
