import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class51 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	public int anInt1589;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
	public int anInt1585 = 443;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
	public int anInt1587 = 43594;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public void method1489() {
		if (!this.aBoolean129) {
			this.aBoolean128 = true;
			this.aBoolean129 = true;
		} else if (this.aBoolean128) {
			this.aBoolean128 = false;
		} else {
			this.aBoolean129 = false;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!pi;I)Lclient!bp;")
	public Class39 method1491(@OriginalArg(0) Class258 arg0) {
		return arg0.method5891(this.aBoolean128, this.aBoolean129 ? this.anInt1585 : this.anInt1587, this.aString8);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!cj;)Z")
	public boolean method1492(@OriginalArg(1) Class51 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt1589 == this.anInt1589 && this.aString8.equals(arg0.aString8);
		}
	}
}
