import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class3_Sub4_Sub11 extends Class3_Sub4 {

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "[Lclient!jc;")
	public Class83[] aClass83Array1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!rn;Lclient!rn;IZ)V")
	public Class3_Sub4_Sub11(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class56 local7 = new Class56();
		@Pc(12) int local12 = arg0.method4131(arg2);
		this.aClass83Array1 = new Class83[local12];
		@Pc(21) int[] local21 = arg0.method4117(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(39) byte[] local39 = arg0.method4121(arg2, local21[local23]);
			@Pc(53) int local53 = local39[1] & 0xFF | (local39[0] & 0xFF) << 8;
			@Pc(55) Class3_Sub6 local55 = null;
			for (@Pc(60) Class3_Sub6 local60 = (Class3_Sub6) local7.method1281(); local60 != null; local60 = (Class3_Sub6) local7.method1278()) {
				if (local60.anInt841 == local53) {
					local55 = local60;
					break;
				}
			}
			if (local55 == null) {
				@Pc(100) byte[] local100 = arg1.method4138(local53, 0);
				local55 = new Class3_Sub6(local53, local100);
				local7.method1282(local55);
			}
			this.aClass83Array1[local21[local23]] = new Class83(local39, local55);
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)Z")
	public boolean method1715(@OriginalArg(0) int arg0) {
		return this.aClass83Array1[arg0].aBoolean187;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)Z")
	public boolean method1716(@OriginalArg(0) int arg0) {
		return this.aClass83Array1[arg0].aBoolean186;
	}
}
