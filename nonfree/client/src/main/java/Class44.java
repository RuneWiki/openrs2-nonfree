import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class44 {

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public int anInt1724;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public int anInt1725;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	public int anInt1731;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class44() {
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!le;)V")
	public Class44(@OriginalArg(0) Class44 arg0) {
		this.anInt1731 = arg0.anInt1731;
		this.anInt1724 = arg0.anInt1724;
		this.anInt1723 = arg0.anInt1723;
		this.anInt1725 = arg0.anInt1725;
	}
}
