import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public final class Class228 {

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "I")
	public final int anInt6295;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(II)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6295 = arg1;
	}

	@OriginalMember(owner = "client!mha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
