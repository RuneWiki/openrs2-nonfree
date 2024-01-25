import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class155 {

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
	public int anInt4152;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "Ljava/lang/String;")
	public String aString38;

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
	public int anInt4150 = 443;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "Z")
	private boolean aBoolean306 = true;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Z")
	private boolean aBoolean305 = false;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
	public int anInt4155 = 43594;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V")
	public void method3615() {
		if (!this.aBoolean306) {
			this.aBoolean306 = true;
			this.aBoolean305 = true;
		} else if (this.aBoolean305) {
			this.aBoolean305 = false;
		} else {
			this.aBoolean306 = false;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!hu;)Z")
	public boolean method3616(@OriginalArg(1) Class155 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt4152 == this.anInt4152 && this.aString38.equals(arg0.aString38);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!qg;)Lclient!sq;")
	public Class319 method3617(@OriginalArg(1) Class286 arg0) {
		return arg0.method6581(this.aBoolean305, this.aString38, this.aBoolean306 ? this.anInt4150 : this.anInt4155);
	}
}
