import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class127 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public static int anInt3416 = 0;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	public static int anInt3419 = 0;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!nk;")
	public static Class161 aClass161_7 = null;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public final int anInt3423;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 225)
	public Class127(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3423 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "toString", descriptor = "()Ljava/lang/String;", line = 195)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
