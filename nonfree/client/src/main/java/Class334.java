import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public final class Class334 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
	public int anInt9371;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
	public int anInt9372;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
	public int anInt9373;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
	public int anInt9374;

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
	public int anInt9375;

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
	public int anInt9376;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
	public int anInt9377;

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
	public int anInt9379;

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
	public int anInt9380;

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
	public int anInt9381;

	@OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
	public int anInt9383;

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
	public int anInt9385;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILclient!tea;)Z")
	public boolean method7909(@OriginalArg(1) Class334 arg0) {
		return this.anInt9375 == arg0.anInt9375 && this.anInt9381 == arg0.anInt9381 && arg0.anInt9377 == this.anInt9377;
	}
}
