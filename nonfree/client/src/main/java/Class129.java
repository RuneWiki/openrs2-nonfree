import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class129 {

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
	public final int anInt4505;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(II)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4505 = arg1;
	}

	@OriginalMember(owner = "client!hda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
