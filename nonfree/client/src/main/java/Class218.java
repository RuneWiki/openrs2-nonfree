import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class218 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public int anInt5827;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!ta;")
	public Class218 aClass218_2;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!dr;")
	public Class54 aClass54_4;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public final int anInt5829;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	public final int anInt5832;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(II)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5829 = arg1;
		this.anInt5832 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!ta;I)V")
	public Class218(@OriginalArg(0) Class218 arg0, @OriginalArg(1) int arg1) {
		this.aClass218_2 = arg0;
		this.aClass54_4 = this.aClass218_2.aClass54_4;
		this.anInt5829 = arg1 + this.aClass218_2.anInt5829;
		this.anInt5832 = this.aClass218_2.anInt5832;
	}
}
