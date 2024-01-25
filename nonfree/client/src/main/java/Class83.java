import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class83 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public int anInt2268;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public int anInt2269;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public int anInt2270;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	public int anInt2271;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public int anInt2272;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public int anInt2276;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
	public int anInt2278;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
	public int anInt2281;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
	public int anInt2282;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!dh;)Z")
	public boolean method2041(@OriginalArg(1) Class83 arg0) {
		return this.anInt2284 == arg0.anInt2284 && this.anInt2283 == arg0.anInt2283 && arg0.anInt2268 == this.anInt2268;
	}
}
