import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class182 {

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public int anInt5764;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public int anInt5766;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Z")
	public boolean aBoolean411 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZBI)Lclient!kk;")
	public Class81_Sub2 method4741(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(29) Class81_Sub2 local29 = (Class81_Sub2) Static304.aClass98_46.method2570((long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt5766));
		if (local29 != null) {
			return local29;
		}
		Static233.aClass155_96.method4133(this.anInt5766);
		local29 = Static195.method3237(this.anInt5766, Static233.aClass155_96);
		if (local29 != null) {
			local29.method2513(Static227.anInt2803, Static217.anInt4262, Static232.anInt4516);
			local29.anInt2802 = local29.anInt2797;
			local29.anInt2795 = local29.anInt2796;
			if (arg0) {
				local29.method2505();
			}
			for (@Pc(69) int local69 = 0; local69 < arg1; local69++) {
				local29.method2504();
			}
			Static304.aClass98_46.method2568(local29, (long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt5766));
		}
		return local29;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!ug;I)V")
	public void method4742(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method3915();
			if (local17 == 0) {
				return;
			}
			this.method4746(arg0, local17, arg1);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!ug;II)V")
	private void method4746(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5766 = arg0.method3948();
		} else if (arg1 == 2) {
			this.anInt5764 = arg0.method3899();
		} else if (arg1 == 3) {
			this.aBoolean411 = true;
		} else if (arg1 == 4) {
			this.anInt5766 = -1;
		}
	}
}
