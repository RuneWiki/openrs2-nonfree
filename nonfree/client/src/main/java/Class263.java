import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class263 {

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
	public int anInt7311;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	public int anInt7314;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
	public int anInt7315;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public int anInt7316;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public int anInt7317;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public int anInt7318;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
	public int anInt7320;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	public int anInt7321;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
	public int anInt7322;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public int anInt7323;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	public int anInt7324;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	public int anInt7325;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!oj;)Z")
	public boolean method6314(@OriginalArg(1) Class263 arg0) {
		return this.anInt7316 == arg0.anInt7316 && arg0.anInt7321 == this.anInt7321 && arg0.anInt7322 == this.anInt7322;
	}
}
