import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class115 {

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
	public final int anInt2910;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	private final int anInt2909;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!hk;")
	private final Class158 aClass158_6;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public final int anInt2905;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IILclient!hk;)V")
	public Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.anInt2910 = arg0;
		this.anInt2909 = arg1;
		this.aClass158_6 = arg2;
		this.anInt2905 = this.aClass158_6.anInt3816 * this.anInt2909;
		if (this.anInt2910 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
