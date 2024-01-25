import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class227 {

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
	public final int anInt5962;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
	public Class227(@OriginalArg(0) int arg0) {
		this.anInt5962 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
