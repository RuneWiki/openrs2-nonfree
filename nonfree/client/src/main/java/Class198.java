import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class198 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[F")
	public static final float[] aFloatArray37;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "[F")
	public static final float[] aFloatArray38;

	static {
		new Class306("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
		aFloatArray37 = new float[16384];
		aFloatArray38 = new float[16384];
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray38[local15] = (float) Math.sin(local13 * (double) local15);
			aFloatArray37[local15] = (float) Math.cos((double) local15 * local13);
		}
	}
}
