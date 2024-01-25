import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class140 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	public final int anInt3878;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3878 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
