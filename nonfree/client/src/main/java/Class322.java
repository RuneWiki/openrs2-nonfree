import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class322 {

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	private final int anInt8817;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public final int anInt8818;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V")
	public Class322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8817 = arg0;
		this.anInt8818 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
	public int method7719() {
		return this.anInt8817;
	}
}
