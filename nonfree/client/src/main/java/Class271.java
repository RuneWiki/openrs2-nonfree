import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class271 {

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
	public int anInt8269;

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
	public int anInt8270;

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
	public int anInt8271;

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
	public int anInt8272;

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
	public int anInt8273;

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
	public int anInt8274;

	@OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
	public int anInt8275;

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
	public int anInt8276;

	@OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
	public int anInt8277;

	@OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
	public int anInt8278;

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
	public int anInt8279;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
	public int anInt8280;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!qda;B)Z")
	public boolean method6842(@OriginalArg(0) Class271 arg0) {
		return arg0.anInt8274 == this.anInt8274 && arg0.anInt8270 == this.anInt8270 && this.anInt8275 == arg0.anInt8275;
	}
}
