import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	public int anInt6984;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
	public final int anInt6982;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
	public int anInt6987;

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
	public final int anInt6990;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
	public int anInt6983;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	protected final int anInt6981;

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
	public int anInt6988;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6984 = arg0;
		this.anInt6982 = arg6;
		this.anInt6987 = arg5;
		this.anInt6990 = arg3;
		this.anInt6983 = arg4;
		this.anInt6981 = arg1;
		this.anInt6988 = arg2;
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "(I)I")
	public abstract int method6024();

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
	@Override
	public final void method6020() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public final void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		throw new IllegalStateException();
	}
}
