import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class184 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	private final int anInt5594;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public final int anInt5598;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(II)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5594 = arg0;
		this.anInt5598 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)I")
	public int method4515() {
		return this.anInt5594;
	}
}
