import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class305 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
	public int anInt9017;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
	public int anInt9018;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
	public int anInt9019;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "()V")
	public Class305() {
	}

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!sda;)V")
	public Class305(@OriginalArg(0) Class305 arg0) {
		this.anInt9017 = arg0.anInt9017;
		this.anInt9018 = arg0.anInt9018;
		this.anInt9019 = arg0.anInt9019;
	}
}
