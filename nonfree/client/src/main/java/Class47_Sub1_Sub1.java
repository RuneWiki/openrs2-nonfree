import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class47_Sub1_Sub1 extends Class47_Sub1 {

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	public int anInt1867;

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
	public int anInt1868;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
	public int anInt1872;

	@OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
	public int anInt1874;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
	public int anInt1863 = -1;

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	public int anInt1871 = -1;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		@Pc(6) Class22 local6 = arg0.method7642();
		local6.oa(super.anInt1857, super.anInt1858, super.anInt1855);
		@Pc(18) Class2_Sub6 local18 = Static275.method4678(3);
		@Pc(40) Class19 local40;
		if (this.anInt1863 != -1) {
			local40 = Static454.aClass153_2.method4007(this.anInt1863).method5022(arg0, this.anInt1872, null, 0, 0, -1, null, 2048);
			if (local40 != null) {
				local40.method7258(local6, local18.aClass2_Sub7Array1[2], 0);
			}
		}
		if (this.anInt1871 != -1) {
			local40 = Static454.aClass153_2.method4007(this.anInt1871).method5022(arg0, this.anInt1874, null, 0, 0, -1, null, 2048);
			if (local40 != null) {
				local40.method7258(local6, local18.aClass2_Sub7Array1[1], 0);
			}
		}
		local40 = Static454.aClass153_2.method4007(this.anInt1868).method5022(arg0, this.anInt1867, null, 0, 0, -1, null, 2048);
		if (local40 != null) {
			local40.method7258(local6, local18.aClass2_Sub7Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class22 local6 = arg1.method7642();
		local6.oa(super.anInt1857, super.anInt1858, super.anInt1855);
		@Pc(31) Class19 local31 = Static454.aClass153_2.method4007(this.anInt1868).method5022(arg1, this.anInt1867, null, 0, 0, -1, null, 131072);
		if (local31 != null && local31.method7257(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt1871 != -1) {
			local31 = Static454.aClass153_2.method4007(this.anInt1871).method5022(arg1, this.anInt1874, null, 0, 0, -1, null, 131072);
			if (local31 != null && local31.method7257(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt1863 != -1) {
			local31 = Static454.aClass153_2.method4007(this.anInt1863).method5022(arg1, this.anInt1872, null, 0, 0, -1, null, 131072);
			if (local31 != null && local31.method7257(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return null;
	}
}
