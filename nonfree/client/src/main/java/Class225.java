import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class225 {

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
	public final int anInt6030;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
	public final int anInt6024;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
	public final int anInt6023;

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
	public final int anInt6027;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(IIII)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6030 = arg0;
		this.anInt6024 = arg3;
		this.anInt6023 = arg2;
		this.anInt6027 = arg1;
	}

	@OriginalMember(owner = "client!lda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
