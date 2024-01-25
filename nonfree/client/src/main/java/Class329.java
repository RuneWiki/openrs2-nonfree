import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class329 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
	public final int anInt9452;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public final int anInt9450;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public final int anInt9455;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public final int anInt9457;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIII)V")
	public Class329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9452 = arg2;
		this.anInt9450 = arg0;
		this.anInt9455 = arg1;
		this.anInt9457 = arg3;
	}

	@OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
