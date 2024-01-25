import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class241 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
	public int anInt7142;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
	public int anInt7143;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public int anInt7144;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
	public int anInt7145;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class241() {
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!ut;)V")
	public Class241(@OriginalArg(0) Class241 arg0) {
		this.anInt7145 = arg0.anInt7145;
		this.anInt7144 = arg0.anInt7144;
		this.anInt7142 = arg0.anInt7142;
		this.anInt7143 = arg0.anInt7143;
	}
}
