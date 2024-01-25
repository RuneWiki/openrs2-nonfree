import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!we", name = "t", descriptor = "I")
	public final int anInt5728;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "I")
	public int anInt5727;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "I")
	public final int anInt5723;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	public int anInt5721;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public int anInt5725;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	protected final int anInt5724;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public int anInt5726;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class12_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5728 = arg3;
		this.anInt5727 = arg0;
		this.anInt5723 = arg6;
		this.anInt5721 = arg2;
		this.anInt5725 = arg4;
		this.anInt5724 = arg1;
		this.anInt5726 = arg5;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public final void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)I")
	public abstract int method5019();

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	@Override
	public final void method5456() {
		throw new IllegalStateException();
	}
}
