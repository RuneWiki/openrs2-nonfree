import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public final class Class357 {

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
	public final int anInt9412;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(II)V")
	public Class357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9412 = arg1;
	}

	@OriginalMember(owner = "client!wea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
