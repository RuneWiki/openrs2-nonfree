import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class184 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
	public final int anInt5783;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(II)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5783 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
