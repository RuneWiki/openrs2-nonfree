import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class130 {

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	private final int anInt3632;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public final int anInt3625;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(II)V")
	public Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3632 = arg0;
		this.anInt3625 = arg1;
	}

	@OriginalMember(owner = "client!gr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)I")
	public int method3269() {
		return this.anInt3632;
	}
}
