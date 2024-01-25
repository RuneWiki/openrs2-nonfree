import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class Class49_Sub3 extends Class49 {

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public int anInt9068;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
	public int anInt9071;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
	public int anInt9077;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
	public int anInt9076;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	public final int anInt9069;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	public final int anInt9072;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
	protected final int anInt9070;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class49_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9068 = arg5;
		this.anInt9071 = arg2;
		this.anInt9077 = arg0;
		this.anInt9076 = arg4;
		this.anInt9069 = arg6;
		this.anInt9072 = arg3;
		this.anInt9070 = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)I")
	public abstract int method7462();

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
	@Override
	public final void method7457() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public final void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method7451() {
		return false;
	}
}
