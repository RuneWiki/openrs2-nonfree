import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class358 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
	public final int anInt9319;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public final int anInt9313;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public final int anInt9314;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public final int anInt9317;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIII)V")
	public Class358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9319 = arg3;
		this.anInt9313 = arg1;
		this.anInt9314 = arg2;
		this.anInt9317 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
