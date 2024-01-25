import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class112 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public int anInt3444;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public int anInt3445;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	public int anInt3446;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public int anInt3447;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class112() {
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class112(@OriginalArg(0) Class112 arg0) {
		this.anInt3444 = arg0.anInt3444;
		this.anInt3446 = arg0.anInt3446;
		this.anInt3447 = arg0.anInt3447;
		this.anInt3445 = arg0.anInt3445;
	}
}
