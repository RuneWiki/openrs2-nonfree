import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class85 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public int anInt3702;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	public int anInt3704;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public int anInt3705;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	public int anInt3708;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class85() {
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!rh;)V")
	public Class85(@OriginalArg(0) Class85 arg0) {
		this.anInt3708 = arg0.anInt3708;
		this.anInt3705 = arg0.anInt3705;
		this.anInt3702 = arg0.anInt3702;
		this.anInt3704 = arg0.anInt3704;
	}
}
