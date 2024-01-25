import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class233 implements Interface24 {

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!gi;")
	public final Class122 aClass122_10;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Z")
	public final boolean aBoolean455;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public final int anInt5748;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	public final int anInt5750;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public final int anInt5757;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public final int anInt5754;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	public final int anInt5751;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public final int anInt5749;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!ut;")
	public final Class335 aClass335_12;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public final int anInt5752;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	public final int anInt5755;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(ILclient!ut;Lclient!gi;IIIIIIIZ)V")
	public Class233(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass122_10 = arg2;
		this.aBoolean455 = arg10;
		this.anInt5748 = arg4;
		this.anInt5750 = arg0;
		this.anInt5757 = arg8;
		this.anInt5754 = arg5;
		this.anInt5751 = arg6;
		this.anInt5749 = arg7;
		this.aClass335_12 = arg1;
		this.anInt5752 = arg9;
		this.anInt5755 = arg3;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lclient!rw;")
	@Override
	public Class297 method7306() {
		return Static393.aClass297_12;
	}
}
