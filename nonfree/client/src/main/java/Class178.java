import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class178 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public final int anInt5301;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public final int anInt5300;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public final int anInt5307;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	public final int anInt5302;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIII)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5301 = arg2;
		this.anInt5300 = arg0;
		this.anInt5307 = arg3;
		this.anInt5302 = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
