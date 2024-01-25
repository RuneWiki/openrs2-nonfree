import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class225 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public final int anInt6371;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class225(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6371 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
	public int method5539() {
		return this.anInt6371;
	}

	@OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
