import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!t", name = "P", descriptor = "[Lclient!qd;")
	public final Class62[] aClass62Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!dd;Lclient!dd;IZ)V")
	public Class1_Sub1_Sub16(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class59 local7 = new Class59();
		@Pc(12) int local12 = arg0.method2252(arg2);
		this.aClass62Array1 = new Class62[local12];
		@Pc(21) int[] local21 = arg0.method2242(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method2254(local21[local23], arg2);
			@Pc(47) int local47 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			@Pc(49) Class1_Sub25 local49 = null;
			for (@Pc(54) Class1_Sub25 local54 = (Class1_Sub25) local7.method2417(); local54 != null; local54 = (Class1_Sub25) local7.method2424()) {
				if (local54.anInt4732 == local47) {
					local49 = local54;
					break;
				}
			}
			if (local49 == null) {
				@Pc(84) byte[] local84 = arg1.method2233(0, local47);
				local49 = new Class1_Sub25(local47, local84);
				local7.method2411(local49);
			}
			this.aClass62Array1[local21[local23]] = new Class62(local33, local49);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)Z")
	public boolean method2828(@OriginalArg(1) int arg0) {
		return this.aClass62Array1[arg0].aBoolean157;
	}
}
