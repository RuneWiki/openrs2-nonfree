import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class223 {

	@OriginalMember(owner = "client!si", name = "g", descriptor = "I")
	public final int anInt6416;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6416 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
