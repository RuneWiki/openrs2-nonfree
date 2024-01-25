import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public final class Class5_Sub1_Sub11 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
	private int anInt8067;

	@OriginalMember(owner = "client!qha", name = "p", descriptor = "J")
	private long aLong225;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt8067 = arg0.method7804();
		this.aLong225 = arg0.method7823();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4109(this.anInt8067, this.aLong225);
	}
}
