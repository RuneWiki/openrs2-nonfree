import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class216 {

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	public final int anInt6089;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(II)V")
	public Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6089 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
