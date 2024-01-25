import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class300 {

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
	public int anInt7971;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
	public int anInt7972;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
	public int anInt7973;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
	public int anInt7974;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class300() {
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!pt;)V")
	public Class300(@OriginalArg(0) Class300 arg0) {
		this.anInt7972 = arg0.anInt7972;
		this.anInt7971 = arg0.anInt7971;
		this.anInt7974 = arg0.anInt7974;
		this.anInt7973 = arg0.anInt7973;
	}
}
