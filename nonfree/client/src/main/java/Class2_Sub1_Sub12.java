import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "[Lclient!db;")
	public final Class15[] aClass15Array1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;IZ)V")
	public Class2_Sub1_Sub12(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class67 local7 = new Class67();
		@Pc(12) int local12 = arg0.method513(arg2);
		this.aClass15Array1 = new Class15[local12];
		@Pc(21) int[] local21 = arg0.method512(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method521(local21[local23], arg2);
			@Pc(35) Class2_Sub11 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub11 local54 = (Class2_Sub11) local7.method2848(); local54 != null; local54 = (Class2_Sub11) local7.method2851()) {
				if (local54.anInt2400 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(92) byte[] local92 = arg1.method526(0, local49);
				local35 = new Class2_Sub11(local49, local92);
				local7.method2843(local35);
			}
			this.aClass15Array1[local21[local23]] = new Class15(local33, local35);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Z")
	public boolean method1657(@OriginalArg(1) int arg0) {
		return this.aClass15Array1[arg0].aBoolean42;
	}
}
