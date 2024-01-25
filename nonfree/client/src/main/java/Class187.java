import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class187 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
	public final int anInt5376;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V")
	public Class187(@OriginalArg(0) int arg0) {
		this.anInt5376 = arg0;
	}

	@OriginalMember(owner = "client!kca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
