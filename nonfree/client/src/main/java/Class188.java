import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class188 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	public final int anInt4773;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	public final int anInt4771;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public final int anInt4772;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
	public final int anInt4778;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIII)V")
	public Class188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4773 = arg3;
		this.anInt4771 = arg2;
		this.anInt4772 = arg1;
		this.anInt4778 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
