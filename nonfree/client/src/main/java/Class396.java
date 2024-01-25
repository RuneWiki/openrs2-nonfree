import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public final class Class396 {

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
	public final int anInt10768;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(II)V")
	public Class396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10768 = arg0;
	}

	@OriginalMember(owner = "client!wda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
