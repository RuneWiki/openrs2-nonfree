import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class54 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public int anInt1511;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
	public int anInt1512;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public int anInt1513;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
	public int anInt1514;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class54() {
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!dm;)V")
	public Class54(@OriginalArg(0) Class54 arg0) {
		this.anInt1512 = arg0.anInt1512;
		this.anInt1514 = arg0.anInt1514;
		this.anInt1511 = arg0.anInt1511;
		this.anInt1513 = arg0.anInt1513;
	}
}
