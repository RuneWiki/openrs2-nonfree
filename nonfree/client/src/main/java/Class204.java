import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class204 {

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
	private final int anInt5414;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "Lclient!kt;")
	public final Class198 aClass198_65;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "Z")
	public final boolean aBoolean427;

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "Z")
	public final boolean aBoolean428;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "Lclient!kt;")
	public final Class198 aClass198_66;

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
	public final int anInt5420;

	@OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
	public final int anInt5422;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(ILclient!kt;I)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(ILclient!kt;Lclient!kt;II)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) Class198 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(ILclient!kt;Lclient!kt;IIZZ)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) Class198 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt5420 = arg4;
		this.anInt5422 = arg3;
		this.anInt5414 = arg0;
		this.aClass198_65 = arg2;
		this.aBoolean427 = arg6;
		this.aBoolean428 = arg5;
		this.aClass198_66 = arg1;
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(B)I")
	public int method4549() {
		return this.anInt5414;
	}

	@OriginalMember(owner = "client!lda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
