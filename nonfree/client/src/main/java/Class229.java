import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class229 {

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
	public final int anInt6240;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6240 = arg1;
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)I")
	public int method5511() {
		return this.anInt6240;
	}

	@OriginalMember(owner = "client!maa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
