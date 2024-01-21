import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class2_Sub3_Sub16 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "[Lclient!jh;")
	public final Class42[] aClass42Array1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!c;Lclient!c;IZ)V")
	public Class2_Sub3_Sub16(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class84 local7 = new Class84();
		@Pc(12) int local12 = arg0.method1588(arg2);
		this.aClass42Array1 = new Class42[local12];
		@Pc(21) int[] local21 = arg0.method1597(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(27) Class2_Sub20 local27 = null;
			@Pc(35) byte[] local35 = arg0.method1605(local21[local23], arg2);
			@Pc(49) int local49 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(54) Class2_Sub20 local54 = (Class2_Sub20) local7.method2694(); local54 != null; local54 = (Class2_Sub20) local7.method2697()) {
				if (local49 == local54.anInt3471) {
					local27 = local54;
					break;
				}
			}
			if (local27 == null) {
				@Pc(88) byte[] local88 = arg1.method1593(0, local49);
				local27 = new Class2_Sub20(local49, local88);
				local7.method2701(local27);
			}
			this.aClass42Array1[local21[local23]] = new Class42(local35, local27);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Z")
	public boolean method2620(@OriginalArg(0) int arg0) {
		return this.aClass42Array1[arg0].aBoolean73;
	}
}
