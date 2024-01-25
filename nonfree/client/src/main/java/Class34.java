import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class34 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public final int anInt808;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt808 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
