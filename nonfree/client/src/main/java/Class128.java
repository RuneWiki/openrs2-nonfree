import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class128 {

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
	public final int anInt3034;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(II)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3034 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
