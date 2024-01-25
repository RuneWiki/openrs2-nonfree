import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class262 {

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
	public final int anInt7897;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!ge;")
	private final Class114 aClass114_16;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	private final int anInt7896;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public final int anInt7894;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IILclient!ge;)V")
	public Class262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2) {
		this.anInt7897 = arg0;
		this.aClass114_16 = arg2;
		this.anInt7896 = arg1;
		this.anInt7894 = this.anInt7896 * this.aClass114_16.anInt3379;
		if (this.anInt7897 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ri", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
