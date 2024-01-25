import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class157 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	public int anInt4288;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public int anInt4289;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public int anInt4291;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	public int anInt4292;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	public int anInt4293;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "Lclient!oo;")
	public Class157 aClass157_2;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
	public int anInt4301;

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
	public int anInt4305;

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
	public int anInt4307;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
	public final int anInt4306;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
	public final int anInt4299;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "B")
	public final byte aByte58;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	public final int anInt4295;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	public final int anInt4290;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIB)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4306 = arg3;
		this.anInt4299 = arg1;
		this.aByte58 = arg4;
		this.anInt4295 = arg2;
		this.anInt4290 = arg0;
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!oo;I)V")
	public Class157(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1) {
		this.aClass157_2 = arg0;
		this.aByte58 = this.aClass157_2.aByte58;
		this.anInt4295 = arg1 + this.aClass157_2.anInt4295;
		this.anInt4299 = this.aClass157_2.anInt4299 + arg1;
		this.anInt4290 = this.aClass157_2.anInt4290;
		this.anInt4306 = this.aClass157_2.anInt4306 + arg1;
	}
}
