import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class305 {

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "Lclient!al;")
	public Class17 aClass17_7;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
	public int anInt8114;

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
	public int anInt8115;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
	public int anInt8120;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "Lclient!rea;")
	public Class305 aClass305_1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
	public final int anInt8112;

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
	public final int anInt8121;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(II)V")
	public Class305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8112 = arg0;
		this.anInt8121 = arg1;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)Lclient!rea;")
	public Class305 method6718(@OriginalArg(0) int arg0) {
		return new Class305(this.anInt8112, arg0);
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)Lclient!qf;")
	public Class293 method6722() {
		return Static674.method8986(this.anInt8112);
	}
}
