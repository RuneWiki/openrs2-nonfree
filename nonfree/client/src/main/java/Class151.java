import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class151 {

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	private final int anInt3558;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public final int anInt3555;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(II)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3558 = arg0;
		this.anInt3555 = arg1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
	public int method3270() {
		return this.anInt3558;
	}

	@OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
