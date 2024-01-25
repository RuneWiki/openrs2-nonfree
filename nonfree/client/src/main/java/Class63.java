import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class63 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public int anInt1745;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	public int anInt1746;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public int anInt1747;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class63() {
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!eg;)V")
	public Class63(@OriginalArg(0) Class63 arg0) {
		this.anInt1747 = arg0.anInt1747;
		this.anInt1745 = arg0.anInt1745;
		this.anInt1746 = arg0.anInt1746;
	}
}
