import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class361 {

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
	public final int anInt10185;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(II)V")
	public Class361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10185 = arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
