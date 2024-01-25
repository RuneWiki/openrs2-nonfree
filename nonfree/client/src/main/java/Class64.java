import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class64 implements Interface14 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	public final int anInt1786;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class64(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1786 = arg1;
	}

	@OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
