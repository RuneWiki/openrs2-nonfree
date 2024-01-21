import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qb", name = "rb", descriptor = "[Lclient!ge;")
	public final Class32[] aClass32Array1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!rd;Lclient!rd;IZ)V")
	public Class3_Sub1_Sub12(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class20 local7 = new Class20();
		@Pc(12) int local12 = arg0.method1637(arg2);
		this.aClass32Array1 = new Class32[local12];
		@Pc(21) int[] local21 = arg0.method1615(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1625(arg2, local21[local23]);
			@Pc(47) int local47 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			@Pc(52) Class3_Sub13 local52 = (Class3_Sub13) local7.method308();
			@Pc(54) Class3_Sub13 local54 = null;
			while (local52 != null) {
				if (local52.anInt2858 == local47) {
					local54 = local52;
					break;
				}
				local52 = (Class3_Sub13) local7.method309();
			}
			if (local54 == null) {
				@Pc(92) byte[] local92 = arg1.method1620(local47, 0);
				local54 = new Class3_Sub13(local47, local92);
				local7.method304(local54);
			}
			this.aClass32Array1[local21[local23]] = new Class32(local33, local54);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Z")
	public boolean method1368(@OriginalArg(1) int arg0) {
		return this.aClass32Array1[arg0].aBoolean71;
	}
}
