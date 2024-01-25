import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class136 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
	public final int anInt3863;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class136(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3863 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
