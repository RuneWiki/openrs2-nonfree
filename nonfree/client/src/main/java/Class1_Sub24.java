import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "[I")
	public static final int[] anIntArray464 = new int[32];

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
	public int anInt4085;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	public int anInt4086;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	public int anInt4087;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
	public int anInt4089;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
	public int anInt4092;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
	public int anInt4093;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
	public int anInt4095;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
	public int anInt4096;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
	public int anInt4100;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	public int anInt4101;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
	public int anInt4094 = -1;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
	public int anInt4098 = 0;

	static {
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			anIntArray464[local29] = local27 - 1;
			local27 += local27;
		}
	}
}
