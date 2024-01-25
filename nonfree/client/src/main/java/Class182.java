import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class182 {

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "[I")
	public static final int[] anIntArray625 = new int[99];

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Z")
	public boolean aBoolean361;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "S")
	public short aShort70;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Z")
	public boolean aBoolean362;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "Z")
	public boolean aBoolean364;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "Z")
	public boolean aBoolean365;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "Z")
	public boolean aBoolean366;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "Z")
	public boolean aBoolean367;

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "Z")
	public boolean aBoolean368;

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Z")
	public boolean aBoolean369;

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "B")
	public byte aByte52;

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "B")
	public byte aByte53;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 99; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) (Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D + (double) local13);
			local6 += local26;
			anIntArray625[local8] = local6 / 4;
		}
	}
}
