import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class365 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
	public final int anInt10078;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V")
	public Class365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10078 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
