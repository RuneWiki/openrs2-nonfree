import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class240 {

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
	public final int anInt6237;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class240(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6237 = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
	public int method5515() {
		return this.anInt6237;
	}
}
