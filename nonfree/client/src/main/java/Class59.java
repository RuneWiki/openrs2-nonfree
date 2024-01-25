import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class Class59 {

	static {
		new Class159(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!th;B)Lclient!th;")
	public abstract Class4_Sub4_Sub20 method1865(@OriginalArg(0) Class4_Sub4_Sub20 arg0);
}
