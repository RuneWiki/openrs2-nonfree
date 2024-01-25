import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class103 {

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	public final int anInt3138;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(II)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3138 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
