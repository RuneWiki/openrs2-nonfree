import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	protected final int anInt4368;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	public int anInt4377;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	public int anInt4371;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public final int anInt4370;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public int anInt4364;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public int anInt4365;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	public final int anInt4375;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class10_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4368 = arg1;
		this.anInt4377 = arg4;
		this.anInt4371 = arg5;
		this.anInt4370 = arg3;
		this.anInt4364 = arg2;
		this.anInt4365 = arg0;
		this.anInt4375 = arg6;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	@Override
	public final void method5340() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I")
	public abstract int method3921();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public final void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method5339() {
		return false;
	}
}
