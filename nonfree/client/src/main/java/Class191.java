import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class191 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public int anInt6118;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	public int anInt6119;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public int anInt6120;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	public int anInt6122;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "I")
	public int anInt6123;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "I")
	public int anInt6124;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	public int anInt6125;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public int anInt6127;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public int anInt6128;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "I")
	public int anInt6129;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public int anInt6130;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	public int anInt6131;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!l;I)Z")
	public boolean method5199(@OriginalArg(0) Class191 arg0) {
		return arg0.anInt6123 == this.anInt6123 && this.anInt6129 == arg0.anInt6129 && arg0.anInt6130 == this.anInt6130;
	}
}
