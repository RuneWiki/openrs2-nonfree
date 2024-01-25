import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public final class Class384 {

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
	public final int anInt10297;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(II)V")
	public Class384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10297 = arg1;
	}

	@OriginalMember(owner = "client!ww", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
