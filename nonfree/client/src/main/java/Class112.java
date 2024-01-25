import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class112 {

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
	public int anInt2708;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "Z")
	public boolean aBoolean272 = false;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	public int anInt2710 = 43594;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
	public int anInt2711 = 443;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!ht;I)Z")
	public boolean method2162(@OriginalArg(0) Class112 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt2708 == arg0.anInt2708 && this.aString28.equals(arg0.aString28);
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)I")
	public int method2164() {
		return this.aBoolean272 ? this.anInt2711 : this.anInt2710;
	}
}
