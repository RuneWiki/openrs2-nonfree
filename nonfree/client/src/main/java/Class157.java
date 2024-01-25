import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class157 {

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	public final int anInt3847;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3847 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
