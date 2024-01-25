import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class147 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!rt;")
	private final Class298 aClass298_7;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
	public final int anInt3991;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	private final int anInt3988;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public final int anInt3987;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IILclient!rt;)V")
	public Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class298 arg2) {
		this.aClass298_7 = arg2;
		this.anInt3991 = arg0;
		this.anInt3988 = arg1;
		this.anInt3987 = this.anInt3988 * this.aClass298_7.anInt7812;
		if (this.anInt3991 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ij", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
