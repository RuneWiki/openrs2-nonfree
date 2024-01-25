import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class216 {

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "[Lclient!fa;")
	public static final Class99[] aClass99Array1 = new Class99[5];

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	public final int anInt5436;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	public final int anInt5440;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	public final int anInt5437;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public final int anInt5434;

	static {
		for (@Pc(16) int local16 = 0; local16 < aClass99Array1.length; local16++) {
			aClass99Array1[local16] = new Class99();
		}
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIII)V")
	public Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5436 = arg1;
		this.anInt5440 = arg3;
		this.anInt5437 = arg2;
		this.anInt5434 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
