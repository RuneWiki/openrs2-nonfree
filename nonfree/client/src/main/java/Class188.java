import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class188 implements Interface3 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public final int anInt5470;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class188(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5470 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
