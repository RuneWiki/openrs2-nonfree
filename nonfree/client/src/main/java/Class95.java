import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class95 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
	public final int anInt3203;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(II)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3203 = arg1;
	}

	@OriginalMember(owner = "client!eu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
