import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public final class Class234 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "I")
	public final int anInt6004;

	@OriginalMember(owner = "client!us", name = "d", descriptor = "I")
	private final int anInt6007;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(II)V")
	public Class234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6004 = arg1;
		this.anInt6007 = arg0;
	}

	@OriginalMember(owner = "client!us", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)I")
	public int method5350() {
		return this.anInt6007;
	}
}
