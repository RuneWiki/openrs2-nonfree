import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public int anInt116;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public int anInt119;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!cg;)V")
	public void method139(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2690();
			if (local5 == 0) {
				return;
			}
			this.method142(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILclient!cg;)V")
	private void method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt119 = arg2.method2691();
		} else if (arg1 == 2) {
			this.anInt116 = arg2.method2681();
		} else if (arg1 == 3) {
			this.aBoolean7 = true;
		} else if (arg1 == 4) {
			this.anInt119 = -1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZI)Lclient!tj;")
	public Class12_Sub2 method144(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(29) Class12_Sub2 local29 = (Class12_Sub2) Static115.aClass135_12.method3316((long) ((arg0 ? 262144 : 0) | this.anInt119 | arg1 << 16));
		if (local29 != null) {
			return local29;
		}
		Static200.aClass91_153.method2501(this.anInt119);
		local29 = Static8.method240(Static200.aClass91_153, this.anInt119);
		if (local29 != null) {
			local29.method3936(Static133.anInt2904, Static222.anInt4393, Static103.anInt2429);
			local29.anInt5020 = local29.anInt5026;
			local29.anInt5021 = local29.anInt5018;
			if (arg0) {
				local29.method3937();
			}
			for (@Pc(71) int local71 = 0; local71 < arg1; local71++) {
				local29.method3932();
			}
			Static115.aClass135_12.method3321((long) ((arg0 ? 262144 : 0) | this.anInt119 | arg1 << 16), local29);
		}
		return local29;
	}
}
