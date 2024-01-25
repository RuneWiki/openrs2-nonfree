import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class409 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
	public final int anInt11285;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(II)V")
	public Class409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt11285 = arg1;
	}

	@OriginalMember(owner = "client!wv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
