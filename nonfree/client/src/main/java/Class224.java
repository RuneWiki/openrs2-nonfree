import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class224 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	public final int anInt6057;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(II)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6057 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
