import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class3_Sub11_Sub12 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	private int anInt10273;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "J")
	private long aLong354;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5841(this.aLong354, this.anInt10273);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt10273 = arg0.method5312();
		this.aLong354 = arg0.method5287();
	}
}
