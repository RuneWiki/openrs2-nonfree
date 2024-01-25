import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class10 {

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
	public final int anInt357;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public final int anInt356;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
	public final int anInt355;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	public final int anInt353;

	static {
		new Class267(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IIII)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt357 = arg0;
		this.anInt356 = arg1;
		this.anInt355 = arg3;
		this.anInt353 = arg2;
	}

	@OriginalMember(owner = "client!ak", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
