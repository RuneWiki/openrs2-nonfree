import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class319 {

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "[Lclient!cc;")
	private static final Class42[] aClass42Array1 = new Class42[32];

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Ljava/lang/String;")
	public String aString85;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public int anInt9320;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Z")
	private boolean aBoolean682 = false;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	public int anInt9315 = 43594;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	public int anInt9319 = 443;

	static {
		@Pc(89) Class42[] local89 = Static88.method1783();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass42Array1[local89[local91].anInt1132] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!wh;I)Z")
	public boolean method7697(@OriginalArg(0) Class319 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt9320 == this.anInt9320 && this.aString85.equals(arg0.aString85);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public void method7698() {
		if (!this.aBoolean682) {
			this.aBoolean683 = true;
			this.aBoolean682 = true;
		} else if (this.aBoolean683) {
			this.aBoolean683 = false;
		} else {
			this.aBoolean682 = false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!tq;)Lclient!oc;")
	public Class212 method7699(@OriginalArg(1) Class285 arg0) {
		return arg0.method7044(this.aBoolean682 ? this.anInt9319 : this.anInt9315, this.aBoolean683, this.aString85);
	}
}
