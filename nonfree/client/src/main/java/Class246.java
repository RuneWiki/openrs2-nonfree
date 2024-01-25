import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class246 {

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public final int anInt6833;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public final int anInt6831;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public final int anInt6827;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public final int anInt6829;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIII)V")
	public Class246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6833 = arg0;
		this.anInt6831 = arg2;
		this.anInt6827 = arg3;
		this.anInt6829 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
