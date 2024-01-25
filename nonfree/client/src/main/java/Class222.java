import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public final class Class222 {

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "I")
	public final int anInt5477;

	@OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
	public final int anInt5483;

	@OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
	public final int anInt5480;

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
	public final int anInt5479;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(IIII)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5477 = arg2;
		this.anInt5483 = arg3;
		this.anInt5480 = arg0;
		this.anInt5479 = arg1;
	}

	@OriginalMember(owner = "client!mha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
