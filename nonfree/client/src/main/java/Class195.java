import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class195 implements Interface13 {

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
	public final int anInt5692;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class195(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5692 = arg1;
	}

	@OriginalMember(owner = "client!maa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
