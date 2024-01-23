import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class171 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Z")
	public boolean aBoolean485 = true;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public int anInt5130;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public int anInt5127;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	public int anInt5128;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
	public int anInt5129;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	public int anInt5124;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public int anInt5122;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt5130 = arg2;
		this.aBoolean485 = arg6;
		this.anInt5127 = arg3;
		this.anInt5128 = arg1;
		this.anInt5129 = arg0;
		this.anInt5124 = arg4;
		this.anInt5122 = arg5;
	}
}
