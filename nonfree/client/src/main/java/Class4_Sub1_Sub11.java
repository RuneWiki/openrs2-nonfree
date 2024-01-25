import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class4_Sub1_Sub11 extends Class4_Sub1 {

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "J")
	private long aLong278;

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
	private int anInt9705;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5955(this.anInt9705, this.aLong278);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt9705 = arg0.method8850();
		this.aLong278 = arg0.method8830();
	}
}
