import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class29_Sub4_Sub1 extends Class29_Sub4 {

	@OriginalMember(owner = "client!nu", name = "G", descriptor = "[I")
	public static final int[] anIntArray531 = new int[128];

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
	public int anInt6120;

	@OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
	public int anInt6124;

	@OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
	public int anInt6127;

	@OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
	public int anInt6130;

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
	public int anInt6121 = -1;

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
	public int anInt6131 = -1;

	static {
		for (@Pc(9) int local9 = 0; local9 < anIntArray531.length; local9++) {
			anIntArray531[local9] = -1;
		}
		for (@Pc(21) int local21 = 65; local21 <= 90; local21++) {
			anIntArray531[local21] = local21 - 65;
		}
		for (@Pc(36) int local36 = 97; local36 <= 122; local36++) {
			anIntArray531[local36] = local36 - 71;
		}
		for (@Pc(49) int local49 = 48; local49 <= 57; local49++) {
			anIntArray531[local49] = local49 + 4;
		}
		anIntArray531[45] = anIntArray531[47] = 63;
		anIntArray531[42] = anIntArray531[43] = 62;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		@Pc(6) Class34 local6 = arg0.method7096();
		local6.GA(super.anInt6111, super.anInt6110 - 10, super.anInt6117);
		@Pc(20) Class102_Sub2 local20 = Static228.method3369(3);
		@Pc(42) Class22 local42;
		if (this.anInt6121 != -1) {
			local42 = Static295.aClass256_2.method5924(this.anInt6121).method2196(2048, arg0, this.anInt6127, 0, -1, 0, null, null);
			if (local42 != null) {
				local42.method4689(local6, local20.aClass102_Sub5Array1[2], 0);
			}
		}
		if (this.anInt6131 != -1) {
			local42 = Static295.aClass256_2.method5924(this.anInt6131).method2196(2048, arg0, this.anInt6130, 0, -1, 0, null, null);
			if (local42 != null) {
				local42.method4689(local6, local20.aClass102_Sub5Array1[1], 0);
			}
		}
		local42 = Static295.aClass256_2.method5924(this.anInt6124).method2196(2048, arg0, this.anInt6120, 0, -1, 0, null, null);
		if (local42 != null) {
			local42.method4689(local6, local20.aClass102_Sub5Array1[0], 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(6) Class34 local6 = arg2.method7096();
		local6.GA(super.anInt6111, super.anInt6110, super.anInt6117);
		@Pc(36) Class22 local36 = Static295.aClass256_2.method5924(this.anInt6124).method2196(131072, arg2, this.anInt6120, 0, -1, 0, null, null);
		if (local36 != null && local36.method4698(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt6131 != -1) {
			local36 = Static295.aClass256_2.method5924(this.anInt6131).method2196(131072, arg2, this.anInt6130, 0, -1, 0, null, null);
			if (local36 != null && local36.method4698(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt6121 != -1) {
			local36 = Static295.aClass256_2.method5924(this.anInt6121).method2196(131072, arg2, this.anInt6127, 0, -1, 0, null, null);
			if (local36 != null && local36.method4698(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
