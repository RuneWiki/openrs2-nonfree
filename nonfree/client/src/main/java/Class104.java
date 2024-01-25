import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class104 {

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
	public final int anInt3889;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
	public final int anInt3888;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
	public final int anInt3887;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	public final int anInt3886;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IIII)V")
	public Class104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3889 = arg0;
		this.anInt3888 = arg2;
		this.anInt3887 = arg1;
		this.anInt3886 = arg3;
	}

	@OriginalMember(owner = "client!fq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
