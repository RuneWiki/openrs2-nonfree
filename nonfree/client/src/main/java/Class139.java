import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public final class Class139 {

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
	public final int anInt3378;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(I)V")
	public Class139(@OriginalArg(0) int arg0) {
		this.anInt3378 = arg0;
	}

	@OriginalMember(owner = "client!gja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
