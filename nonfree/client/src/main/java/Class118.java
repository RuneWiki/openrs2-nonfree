import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class118 {

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
	public int anInt3339;

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
	public int anInt3340;

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
	public int anInt3341;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	public Class118() {
	}

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!gba;)V")
	public Class118(@OriginalArg(0) Class118 arg0) {
		this.anInt3339 = arg0.anInt3339;
		this.anInt3341 = arg0.anInt3341;
		this.anInt3340 = arg0.anInt3340;
	}
}
