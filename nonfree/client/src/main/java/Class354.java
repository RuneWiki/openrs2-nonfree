import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class354 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public final int anInt10297;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!dr;")
	private final Class79 aClass79_18;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	private final int anInt10299;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	public final int anInt10300;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IILclient!dr;)V")
	public Class354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class79 arg2) {
		this.anInt10297 = arg0;
		this.aClass79_18 = arg2;
		this.anInt10299 = arg1;
		this.anInt10300 = this.aClass79_18.anInt2048 * this.anInt10299;
		if (this.anInt10297 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
