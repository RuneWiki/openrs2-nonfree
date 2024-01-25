import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class137 {

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
	public final int anInt3868;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString45;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class137(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3868 = arg1;
		this.aString45 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
