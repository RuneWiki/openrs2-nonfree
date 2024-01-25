import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	public int anInt4929;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
	public int anInt4931;

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
	public int anInt4932;

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
	public int anInt4935;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
	public int anInt4930 = -1;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
	public int anInt4934 = -1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		@Pc(11) Class35 local11 = arg0.method5398();
		local11.j(super.anInt4921, super.anInt4917, super.anInt4916);
		@Pc(23) Class20_Sub5 local23 = Static371.method4760(3);
		@Pc(45) Class116 local45;
		if (this.anInt4930 != -1) {
			local45 = Static416.aClass64_2.method1372(this.anInt4930).method1589(arg0, 0, 2048, -1, null, 0, null, this.anInt4932);
			if (local45 != null) {
				local45.method3117(local11, local23.aClass20_Sub8Array1[2], 0);
			}
		}
		if (this.anInt4934 != -1) {
			local45 = Static416.aClass64_2.method1372(this.anInt4934).method1589(arg0, 0, 2048, -1, null, 0, null, this.anInt4931);
			if (local45 != null) {
				local45.method3117(local11, local23.aClass20_Sub8Array1[1], 0);
			}
		}
		local45 = Static416.aClass64_2.method1372(this.anInt4935).method1589(arg0, 0, 2048, -1, null, 0, null, this.anInt4929);
		if (local45 != null) {
			local45.method3117(local11, local23.aClass20_Sub8Array1[0], 0);
		}
		return local23;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class35 local6 = arg0.method5398();
		local6.j(super.anInt4921, super.anInt4917, super.anInt4916);
		@Pc(31) Class116 local31 = Static416.aClass64_2.method1372(this.anInt4935).method1589(arg0, 0, 131072, -1, null, 0, null, this.anInt4929);
		if (local31 != null && local31.method3107(arg1, arg2, local6, true)) {
			return true;
		}
		if (this.anInt4934 != -1) {
			local31 = Static416.aClass64_2.method1372(this.anInt4934).method1589(arg0, 0, 131072, -1, null, 0, null, this.anInt4931);
			if (local31 != null && local31.method3107(arg1, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt4930 != -1) {
			local31 = Static416.aClass64_2.method1372(this.anInt4930).method1589(arg0, 0, 131072, -1, null, 0, null, this.anInt4932);
			if (local31 != null && local31.method3107(arg1, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
