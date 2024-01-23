import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub8_Sub6 extends Class2_Sub8 {

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "[Lclient!n;")
	public Class117[] aClass117Array1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!ek;Lclient!ek;IZ)V")
	public Class2_Sub8_Sub6(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class44 local7 = new Class44();
		@Pc(12) int local12 = arg0.method1269(arg2);
		this.aClass117Array1 = new Class117[local12];
		@Pc(21) int[] local21 = arg0.method1265(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) Class2_Sub9 local33 = null;
			@Pc(41) byte[] local41 = arg0.method1256(arg2, local21[local23]);
			@Pc(55) int local55 = local41[1] & 0xFF | (local41[0] & 0xFF) << 8;
			for (@Pc(60) Class2_Sub9 local60 = (Class2_Sub9) local7.method1352(); local60 != null; local60 = (Class2_Sub9) local7.method1360()) {
				if (local60.anInt873 == local55) {
					local33 = local60;
					break;
				}
			}
			if (local33 == null) {
				@Pc(92) byte[] local92 = arg1.method1278(0, local55);
				local33 = new Class2_Sub9(local55, local92);
				local7.method1358(local33);
			}
			this.aClass117Array1[local21[local23]] = new Class117(local41, local33);
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Z")
	public boolean method1160(@OriginalArg(1) int arg0) {
		return this.aClass117Array1[arg0].aBoolean265;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)Z")
	public boolean method1163(@OriginalArg(0) int arg0) {
		return this.aClass117Array1[arg0].aBoolean266;
	}
}
