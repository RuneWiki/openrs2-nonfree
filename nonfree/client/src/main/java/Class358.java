import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class358 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public final int anInt9944;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(II)V")
	public Class358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9944 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
