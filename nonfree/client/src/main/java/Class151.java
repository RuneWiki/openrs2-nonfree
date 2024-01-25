import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class151 {

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
	public final int anInt4087;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4087 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
