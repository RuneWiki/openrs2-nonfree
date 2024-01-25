import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "J")
	private final long aLong73;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
	private final int anInt1535;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!rba;Z)V")
	public Class10_Sub4(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
		@Pc(6) int local6 = arg0.method5272();
		if (arg1) {
			this.aLong73 = (long) local6 | 0x100000000L;
		} else {
			this.aLong73 = (long) local6;
		}
		this.anInt1535 = arg0.method5312();
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		@Pc(10) Class3_Sub42 local10 = (Class3_Sub42) Static658.aClass136_48.method3503(this.aLong73);
		if (local10 == null) {
			Static658.aClass136_48.method3508(this.aLong73, new Class3_Sub42(this.anInt1535));
		} else {
			local10.anInt8429 = this.anInt1535;
		}
	}
}
