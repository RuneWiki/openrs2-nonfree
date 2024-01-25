import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt7728;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public final int anInt7730;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	protected final int anInt7732;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public int anInt7737;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public final int anInt7727;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	public int anInt7739;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	public int anInt7724;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7728 = arg2;
		this.anInt7730 = arg3;
		this.anInt7732 = arg1;
		this.anInt7737 = arg4;
		this.anInt7727 = arg6;
		this.anInt7739 = arg5;
		this.anInt7724 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	@Override
	public final void method6244() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)I")
	public abstract int method6252();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public final void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method6247() {
		return false;
	}
}
