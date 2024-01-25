import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class234 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	public final int anInt6927;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class234(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6927 = arg1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	public int method5421() {
		return this.anInt6927;
	}

	@OriginalMember(owner = "client!ub", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
