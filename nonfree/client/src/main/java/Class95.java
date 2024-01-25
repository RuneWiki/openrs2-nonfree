import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class95 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "Lclient!da;")
	public Class62 aClass62_2 = null;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Lclient!qt;")
	public Class282 aClass282_2 = null;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class95(@OriginalArg(0) Class62 arg0) {
		this.aClass62_2 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!da;Lclient!qt;)V")
	public Class95(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class282 arg1) {
		this.aClass62_2 = arg0;
		this.aClass282_2 = arg1;
	}
}
