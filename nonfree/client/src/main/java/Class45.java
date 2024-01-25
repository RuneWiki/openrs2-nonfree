import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class45 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "[Lclient!wp;")
	public static final Class217[] aClass217Array1 = new Class217[5];

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass217Array1.length; local4++) {
			aClass217Array1[local4] = new Class217();
		}
		new Class34(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}
}
