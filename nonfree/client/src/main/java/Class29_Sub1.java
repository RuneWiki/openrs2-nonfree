import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public int anInt7302;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
	public final int anInt7310;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
	public int anInt7307;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public int anInt7304;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
	protected final int anInt7311;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	public int anInt7312;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public final int anInt7305;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7302 = arg0;
		this.anInt7310 = arg6;
		this.anInt7307 = arg2;
		this.anInt7304 = arg4;
		this.anInt7311 = arg1;
		this.anInt7312 = arg5;
		this.anInt7305 = arg3;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
	public abstract int method6070();

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	@Override
	public final void method7537() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public final void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
