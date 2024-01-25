import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class183 {

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "[I")
	public static final int[] anIntArray434 = new int[16384];

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "[I")
	public static final int[] anIntArray433 = new int[16384];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
	public boolean aBoolean330;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Z")
	public boolean aBoolean331;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Z")
	public boolean aBoolean332;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Z")
	public boolean aBoolean333;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "B")
	public byte aByte76;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public int anInt4980;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	public int anInt4981;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
	public boolean aBoolean335;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "B")
	public byte aByte79;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "Z")
	public boolean aBoolean336;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "B")
	public byte aByte80;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Z")
	public boolean aBoolean337;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "Z")
	public boolean aBoolean338;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "B")
	public byte aByte81;

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			anIntArray433[local17] = (int) (Math.sin((double) local17 * local15) * 32768.0D);
			anIntArray434[local17] = (int) (Math.cos(local15 * (double) local17) * 32768.0D);
		}
		new Class7("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}
}
