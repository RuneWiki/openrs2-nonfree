import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class240 implements Interface6 {

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
	public final int anInt6252;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class240(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6252 = arg1;
	}

	@OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
