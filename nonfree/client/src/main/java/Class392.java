import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class392 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
	public final int anInt10782;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(II)V")
	public Class392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10782 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
