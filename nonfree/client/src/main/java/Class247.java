import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class247 {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[F")
	public static final float[] aFloatArray15;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "[F")
	public static final float[] aFloatArray16;

	static {
		new Class189("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
		aFloatArray15 = new float[16384];
		aFloatArray16 = new float[16384];
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray15[local15] = (float) Math.sin((double) local15 * local13);
			aFloatArray16[local15] = (float) Math.cos((double) local15 * local13);
		}
	}
}
