import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class50 {

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	public final int anInt1938;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public final int anInt1937;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	public final int anInt1950;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	public final int anInt1943;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	public final int anInt1945;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	public final int anInt1941;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1938 = arg3;
		this.anInt1937 = arg2;
		this.anInt1950 = arg0;
		this.anInt1943 = arg1;
		this.anInt1945 = arg4;
		this.anInt1941 = arg5;
		this.aBoolean156 = arg6;
	}
}
