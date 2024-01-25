import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class137 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	public int anInt3623;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	public int anInt3624;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public int anInt3625;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class137() {
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class137(@OriginalArg(0) Class137 arg0) {
		this.anInt3624 = arg0.anInt3624;
		this.anInt3623 = arg0.anInt3623;
		this.anInt3625 = arg0.anInt3625;
	}
}
