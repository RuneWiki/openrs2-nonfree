import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class137 {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	private final int anInt3217;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "Lclient!kn;")
	private final Class206 aClass206_4;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	public final int anInt3222;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public final int anInt3219;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IILclient!kn;)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2) {
		this.anInt3217 = arg1;
		this.aClass206_4 = arg2;
		this.anInt3222 = arg0;
		this.anInt3219 = this.anInt3217 * this.aClass206_4.anInt5575;
		if (this.anInt3222 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
