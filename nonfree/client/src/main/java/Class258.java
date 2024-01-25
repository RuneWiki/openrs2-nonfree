import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class258 {

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
	public final int anInt6580;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class258(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6580 = arg1;
	}

	@OriginalMember(owner = "client!nda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)I")
	public int method5719() {
		return this.anInt6580;
	}
}
