import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class30 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public int anInt1123;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public int anInt1124;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	public int anInt1125;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public int anInt1129;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class30() {
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!ha;)V")
	public Class30(@OriginalArg(0) Class30 arg0) {
		this.anInt1129 = arg0.anInt1129;
		this.anInt1125 = arg0.anInt1125;
		this.anInt1123 = arg0.anInt1123;
		this.anInt1124 = arg0.anInt1124;
	}
}
