import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
	public int anInt5893;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	protected final int anInt5897;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	public final int anInt5896;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public final int anInt5891;

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	public int anInt5894;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
	public int anInt5892;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	public int anInt5898;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class8_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5893 = arg4;
		this.anInt5897 = arg1;
		this.anInt5896 = arg6;
		this.anInt5891 = arg3;
		this.anInt5894 = arg5;
		this.anInt5892 = arg2;
		this.anInt5898 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	@Override
	public final void method5625() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5622() {
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public final void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)I")
	public abstract int method5020();
}
