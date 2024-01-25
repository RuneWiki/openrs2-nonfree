import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class15_Sub5_Sub1 extends Class15_Sub5 {

	@OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
	public int anInt6435;

	@OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
	public int anInt6437;

	@OriginalMember(owner = "client!nca", name = "v", descriptor = "I")
	public int anInt6440;

	@OriginalMember(owner = "client!nca", name = "x", descriptor = "I")
	public int anInt6442;

	@OriginalMember(owner = "client!nca", name = "z", descriptor = "I")
	public int anInt6443 = -1;

	@OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
	public int anInt6448 = -1;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class93 local6 = arg1.method7455();
		local6.GA(super.anInt6431, super.anInt6428, super.anInt6433);
		@Pc(31) Class24 local31 = Static119.aClass244_4.method5726(this.anInt6442).method5488(0, this.anInt6435, -1, arg1, null, 131072, null, 0);
		if (local31 != null && local31.method7386(arg0, arg2, local6, true)) {
			return true;
		}
		if (this.anInt6448 != -1) {
			local31 = Static119.aClass244_4.method5726(this.anInt6448).method5488(0, this.anInt6440, -1, arg1, null, 131072, null, 0);
			if (local31 != null && local31.method7386(arg0, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt6443 != -1) {
			local31 = Static119.aClass244_4.method5726(this.anInt6443).method5488(0, this.anInt6437, -1, arg1, null, 131072, null, 0);
			if (local31 != null && local31.method7386(arg0, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		@Pc(6) Class93 local6 = arg0.method7455();
		local6.GA(super.anInt6431, super.anInt6428 - 10, super.anInt6433);
		@Pc(20) Class60_Sub8 local20 = Static191.method3243(3);
		@Pc(43) Class24 local43;
		if (this.anInt6443 != -1) {
			local43 = Static119.aClass244_4.method5726(this.anInt6443).method5488(0, this.anInt6437, -1, arg0, null, 2048, null, 0);
			if (local43 != null) {
				local43.method7393(local6, local20.aClass60_Sub6Array1[2], 0);
			}
		}
		if (this.anInt6448 != -1) {
			local43 = Static119.aClass244_4.method5726(this.anInt6448).method5488(0, this.anInt6440, -1, arg0, null, 2048, null, 0);
			if (local43 != null) {
				local43.method7393(local6, local20.aClass60_Sub6Array1[1], 0);
			}
		}
		local43 = Static119.aClass244_4.method5726(this.anInt6442).method5488(0, this.anInt6435, -1, arg0, null, 2048, null, 0);
		if (local43 != null) {
			local43.method7393(local6, local20.aClass60_Sub6Array1[0], 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}
}
