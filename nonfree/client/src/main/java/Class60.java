import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class60 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public int anInt1620;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public int anInt1621;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "I")
	public int anInt1622;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	public int anInt1623;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class60() {
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class60(@OriginalArg(0) Class60 arg0) {
		this.anInt1622 = arg0.anInt1622;
		this.anInt1620 = arg0.anInt1620;
		this.anInt1621 = arg0.anInt1621;
		this.anInt1623 = arg0.anInt1623;
	}
}
