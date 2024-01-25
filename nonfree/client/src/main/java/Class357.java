import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class357 implements Interface15 {

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public final int anInt9853;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class357(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt9853 = arg1;
	}

	@OriginalMember(owner = "client!ul", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
