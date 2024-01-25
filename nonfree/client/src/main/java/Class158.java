import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class158 {

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
	private final int anInt5023;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(II)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5023 = arg0;
	}

	@OriginalMember(owner = "client!kca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)I")
	public int method4210() {
		return this.anInt5023;
	}
}
