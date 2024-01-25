import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class169 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[F")
	public static final float[] aFloatArray33;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[F")
	public static final float[] aFloatArray32;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "[S")
	public short[] aShortArray76;

	static {
		new Class209("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
		aFloatArray33 = new float[16384];
		aFloatArray32 = new float[16384];
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray32[local15] = (float) Math.sin((double) local15 * local13);
			aFloatArray33[local15] = (float) Math.cos((double) local15 * local13);
		}
	}
}
