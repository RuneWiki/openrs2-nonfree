import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class182 {

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
	public final int anInt5127;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V")
	public Class182(@OriginalArg(0) int arg0) {
		this.anInt5127 = arg0;
	}

	@OriginalMember(owner = "client!kca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
