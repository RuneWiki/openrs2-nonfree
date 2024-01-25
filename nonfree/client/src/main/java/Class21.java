import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class21 {

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public int anInt404 = 443;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public int anInt411 = 43594;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!bc;)Z")
	public boolean method329(@OriginalArg(1) Class21 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt407 == arg0.anInt407 && this.aString5.equals(arg0.aString5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)I")
	public int method330() {
		return this.aBoolean34 ? this.anInt404 : this.anInt411;
	}
}
