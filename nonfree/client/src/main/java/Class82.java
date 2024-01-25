import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class82 {

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public final int anInt3195;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this.anInt3195 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
