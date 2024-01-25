import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class126 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public final int anInt4274;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4274 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
