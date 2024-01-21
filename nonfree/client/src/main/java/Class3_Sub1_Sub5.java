import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "[Lclient!pe;")
	public final Class61[] aClass61Array1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!tb;Lclient!tb;IZ)V")
	public Class3_Sub1_Sub5(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class37 local7 = new Class37();
		@Pc(12) int local12 = arg0.method1151(arg2);
		this.aClass61Array1 = new Class61[local12];
		@Pc(21) int[] local21 = arg0.method1149(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1146(arg2, local21[local23]);
			@Pc(47) int local47 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			@Pc(52) Class3_Sub13 local52 = (Class3_Sub13) local7.method989();
			@Pc(54) Class3_Sub13 local54 = null;
			while (local52 != null) {
				if (local52.anInt2109 == local47) {
					local54 = local52;
					break;
				}
				local52 = (Class3_Sub13) local7.method990();
			}
			if (local54 == null) {
				@Pc(92) byte[] local92 = arg1.method1147(local47, 0);
				local54 = new Class3_Sub13(local47, local92);
				local7.method985(local54);
			}
			this.aClass61Array1[local21[local23]] = new Class61(local33, local54);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
	public boolean method669(@OriginalArg(0) int arg0) {
		return this.aClass61Array1[arg0].aBoolean110;
	}
}
