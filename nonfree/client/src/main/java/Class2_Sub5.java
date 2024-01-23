import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "[I")
	public static int[] anIntArray51 = new int[4096];

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	public int anInt392;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	public int anInt393;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	public int anInt394;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	public int anInt395;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
	public int anInt397;

	static {
		for (@Pc(27) int local27 = 0; local27 < 4096; local27++) {
			anIntArray51[local27] = Static185.method4393(local27);
		}
	}
}
