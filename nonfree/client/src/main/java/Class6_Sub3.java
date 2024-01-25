import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	protected final int anInt7308;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public int anInt7310;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	public final int anInt7312;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
	public int anInt7309;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
	public int anInt7302;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	public int anInt7307;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	public final int anInt7303;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7308 = arg1;
		this.anInt7310 = arg0;
		this.anInt7312 = arg3;
		this.anInt7309 = arg2;
		this.anInt7302 = arg5;
		this.anInt7307 = arg4;
		this.anInt7303 = arg6;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method5633() {
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public final void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)I")
	public abstract int method5641();

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
	@Override
	public final void method5634() {
		throw new IllegalStateException();
	}
}
