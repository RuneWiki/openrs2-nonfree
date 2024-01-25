import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class228 {

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
	public final int anInt6952;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class228(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6952 = arg1;
	}

	@OriginalMember(owner = "client!nca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)I")
	public int method5980() {
		return this.anInt6952;
	}
}
