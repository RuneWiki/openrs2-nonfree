import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class17 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public int anInt260;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "I")
	public int anInt261;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public int anInt262;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "I")
	public int anInt263;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "I")
	public int anInt264;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "I")
	public int anInt266;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "I")
	public int anInt267;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "I")
	public int anInt268;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	public int anInt271;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!an;)Z")
	public boolean method263(@OriginalArg(1) Class17 arg0) {
		return arg0.anInt264 == this.anInt264 && this.anInt271 == arg0.anInt271 && arg0.anInt263 == this.anInt263;
	}
}
