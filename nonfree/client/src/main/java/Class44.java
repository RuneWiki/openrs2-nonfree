import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class44 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public int anInt1869;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	public int anInt1871;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	public int anInt1872;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public int anInt1875;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class44() {
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!k;)V")
	public Class44(@OriginalArg(0) Class44 arg0) {
		this.anInt1872 = arg0.anInt1872;
		this.anInt1875 = arg0.anInt1875;
		this.anInt1869 = arg0.anInt1869;
		this.anInt1871 = arg0.anInt1871;
	}
}
