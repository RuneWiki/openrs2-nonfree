import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public final class Class37 {

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
	public int anInt944;

	@OriginalMember(owner = "client!bia", name = "c", descriptor = "B")
	private byte aByte28;

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
	public int anInt945;

	@OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!bia", name = "k", descriptor = "I")
	public int anInt950;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "()V")
	public Class37() {
	}

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!ud;)V")
	public Class37(@OriginalArg(0) Class2_Sub34 arg0) {
		this.aByte28 = arg0.method6908();
		this.anInt950 = arg0.method6884();
		this.anInt947 = arg0.method6865();
		this.anInt945 = arg0.method6865();
		this.anInt944 = arg0.method6865();
		this.anInt946 = arg0.method6865();
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)I")
	public int method842() {
		return this.aByte28 & 0x7;
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)I")
	public int method843() {
		return (this.aByte28 & 0x8) == 8 ? 1 : 0;
	}
}
