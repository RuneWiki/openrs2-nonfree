import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Sound extends Linkable {

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public int anInt1364;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	protected Sound() {
	}
}
