import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class183 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!kq;")
	private final Class176 aClass176_13;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	private final int anInt6310;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public final int anInt6312;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public final int anInt6309;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IILclient!kq;)V")
	public Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_13 = arg2;
		this.anInt6310 = arg1;
		this.anInt6312 = arg0;
		this.anInt6309 = this.aClass176_13.anInt6139 * this.anInt6310;
		if (this.anInt6312 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
