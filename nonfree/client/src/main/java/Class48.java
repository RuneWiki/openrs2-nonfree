import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class48 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
	public boolean aBoolean133 = true;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public final int anInt1898;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public final int anInt1899;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	public final int anInt1910;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public final int anInt1897;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "I")
	public final int anInt1909;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	public final int anInt1906;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1898 = arg3;
		this.anInt1899 = arg2;
		this.anInt1910 = arg0;
		this.anInt1897 = arg4;
		this.anInt1909 = arg1;
		this.anInt1906 = arg5;
		this.aBoolean133 = arg6;
	}
}
