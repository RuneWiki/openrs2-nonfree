import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class37 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public int anInt1318;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public int anInt1320;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public int anInt1321;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public int anInt1325;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class37() {
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class37(@OriginalArg(0) Class37 arg0) {
		this.anInt1318 = arg0.anInt1318;
		this.anInt1321 = arg0.anInt1321;
		this.anInt1325 = arg0.anInt1325;
		this.anInt1320 = arg0.anInt1320;
	}
}
