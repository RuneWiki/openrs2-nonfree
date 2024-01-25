import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class32 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public int anInt1340;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public int anInt1341;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	public int anInt1343;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class32() {
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class32(@OriginalArg(0) Class32 arg0) {
		this.anInt1341 = arg0.anInt1341;
		this.anInt1343 = arg0.anInt1343;
		this.anInt1340 = arg0.anInt1340;
		this.anInt1342 = arg0.anInt1342;
	}
}
