import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class47_Sub3_Sub1 extends Class47_Sub3 {

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	public int anInt6178;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public int anInt6181;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	public int anInt6182;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	public int anInt6186;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	public int anInt6184 = -1;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
	public int anInt6188 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		@Pc(12) Class43 local12 = arg0.method4588();
		local12.R(super.anInt6172, super.anInt6168, super.anInt6169);
		@Pc(24) Class36_Sub1 local24 = Static309.method4241(3);
		@Pc(47) Class37 local47;
		if (this.anInt6184 != -1) {
			local47 = Static388.aClass193_3.method4249(this.anInt6184).method4969(this.anInt6186, 0, 2048, -1, arg0, null, 0, null);
			if (local47 != null) {
				local47.method4167(local12, local24.aClass36_Sub8Array1[2], 0);
			}
		}
		if (this.anInt6188 != -1) {
			local47 = Static388.aClass193_3.method4249(this.anInt6188).method4969(this.anInt6181, 0, 2048, -1, arg0, null, 0, null);
			if (local47 != null) {
				local47.method4167(local12, local24.aClass36_Sub8Array1[1], 0);
			}
		}
		local47 = Static388.aClass193_3.method4249(this.anInt6182).method4969(this.anInt6178, 0, 2048, -1, arg0, null, 0, null);
		if (local47 != null) {
			local47.method4167(local12, local24.aClass36_Sub8Array1[0], 0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(6) Class43 local6 = arg2.method4588();
		local6.R(super.anInt6172, super.anInt6168, super.anInt6169);
		@Pc(31) Class37 local31 = Static388.aClass193_3.method4249(this.anInt6182).method4969(this.anInt6178, 0, 131072, -1, arg2, null, 0, null);
		if (local31 != null && local31.method4166(arg1, arg0, local6, true)) {
			return true;
		}
		if (this.anInt6188 != -1) {
			local31 = Static388.aClass193_3.method4249(this.anInt6188).method4969(this.anInt6181, 0, 131072, -1, arg2, null, 0, null);
			if (local31 != null && local31.method4166(arg1, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt6184 != -1) {
			local31 = Static388.aClass193_3.method4249(this.anInt6184).method4969(this.anInt6186, 0, 131072, -1, arg2, null, 0, null);
			if (local31 != null && local31.method4166(arg1, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
