import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
	public final int anInt6446;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	public final int anInt6443;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Z")
	public final boolean aBoolean440;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
	public final int anInt6448;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
	public final int anInt6449;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
	public final int anInt6444;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6446 = arg0;
		this.anInt6443 = arg4;
		this.aBoolean440 = arg5;
		this.anInt6448 = arg1;
		this.anInt6449 = arg3;
		this.anInt6444 = arg2;
	}
}
