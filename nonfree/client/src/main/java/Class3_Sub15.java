import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "[I")
	public static final int[] anIntArray173 = new int[32];

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
	public int anInt2010;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
	public int anInt2011;

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
	public int anInt2012;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
	public int anInt2013;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
	public int anInt2014;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
	public int anInt2015;

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
	public int anInt2018;

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
	public int anInt2020;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
	public int anInt2022;

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
	public int anInt2023;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
	public int anInt2016 = 0;

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
	public int anInt2021 = -1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray173[local6] = local4 - 1;
			local4 += local4;
		}
	}
}
