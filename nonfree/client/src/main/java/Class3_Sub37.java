import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
	public final int anInt8014;

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
	public final int anInt8018;

	@OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
	public final int anInt8017;

	@OriginalMember(owner = "client!oga", name = "s", descriptor = "I")
	public final int anInt8020;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
	public final int anInt8015;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "Z")
	public final boolean aBoolean613;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8014 = arg0;
		this.anInt8018 = arg1;
		this.anInt8017 = arg4;
		this.anInt8020 = arg2;
		this.anInt8015 = arg3;
		this.aBoolean613 = arg5;
	}
}
