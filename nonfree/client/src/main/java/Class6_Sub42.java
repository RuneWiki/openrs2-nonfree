import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class6_Sub42 extends Class6 {

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public final int anInt6983;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "I")
	public final int anInt6985;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "Z")
	public final boolean aBoolean489;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "I")
	public final int anInt6982;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	public final int anInt6980;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	public final int anInt6984;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6983 = arg3;
		this.anInt6985 = arg1;
		this.aBoolean489 = arg5;
		this.anInt6982 = arg4;
		this.anInt6980 = arg2;
		this.anInt6984 = arg0;
	}
}
