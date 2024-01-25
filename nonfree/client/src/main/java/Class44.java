import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class44 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
	public int anInt1130;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	public int anInt1131;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
	public int anInt1132;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class44() {
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!cs;)V")
	public Class44(@OriginalArg(0) Class44 arg0) {
		this.anInt1130 = arg0.anInt1130;
		this.anInt1132 = arg0.anInt1132;
		this.anInt1131 = arg0.anInt1131;
	}
}
