import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class11 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
	private final int[] anIntArray66;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
	private final int[] anIntArray65;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Lclient!fc;")
	private final Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!fc;")
	private final Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[Lclient!fc;")
	private final Class1_Sub2[] aClass1_Sub2Array4;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class11() {
		this.anIntArray66 = new int[0];
		this.anIntArray65 = new int[0];
		this.aClass1_Sub2_1 = new Class1_Sub2_Sub12();
		this.aClass1_Sub2_2 = new Class1_Sub2_Sub12();
		this.aClass1_Sub2Array4 = new Class1_Sub2[] { this.aClass1_Sub2_1, this.aClass1_Sub2_2 };
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class11(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method861();
		@Pc(10) int[][] local10 = new int[local7][];
		@Pc(15) Class10 local15 = new Class10(64);
		@Pc(20) Class10 local20 = new Class10(64);
		@Pc(25) Class10 local25 = new Class10(64);
		this.aClass1_Sub2Array4 = new Class1_Sub2[local7];
		@Pc(45) int local45;
		@Pc(103) int local103;
		@Pc(110) int local110;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class1_Sub2 local37 = Static86.method1522(arg0);
			@Pc(41) int local41 = local37.method3119();
			local45 = local37.method3122();
			if (local41 >= 0 && local41 >= 0 && local20.method256((long) local41) == null) {
				local20.method263(new Class1_Sub7(local41), (long) local41);
			}
			if (local45 >= 0 && local45 >= 0 && local25.method256((long) local45) == null) {
				local25.method263(new Class1_Sub7(local45), (long) local45);
			}
			local103 = local37.aClass1_Sub2Array40.length;
			local10[local31] = new int[local103];
			for (local110 = 0; local110 < local103; local110++) {
				local10[local31][local110] = arg0.method861();
			}
			local15.method263(local37, (long) local37.anInt4328);
			this.aClass1_Sub2Array4[local31] = local37;
		}
		for (@Pc(146) int local146 = 0; local146 < local7; local146++) {
			@Pc(153) Class1_Sub2 local153 = this.aClass1_Sub2Array4[local146];
			local45 = local153.aClass1_Sub2Array40.length;
			for (local103 = 0; local103 < local45; local103++) {
				@Pc(172) Class1_Sub2 local172 = (Class1_Sub2) local15.method256((long) local10[local146][local103]);
				local153.aClass1_Sub2Array40[local103] = local172;
			}
			local10[local146] = null;
		}
		this.aClass1_Sub2_1 = (Class1_Sub2) local15.method256((long) arg0.method861());
		this.aClass1_Sub2_2 = (Class1_Sub2) local15.method256((long) arg0.method861());
		this.anIntArray65 = new int[local20.method264()];
		this.anIntArray66 = new int[local25.method264()];
		@Pc(230) Class1[] local230 = new Class1[local20.method264()];
		@Pc(235) Class1[] local235 = new Class1[local25.method264()];
		local20.method259(local230);
		local25.method259(local235);
		for (local103 = 0; local103 < local230.length; local103++) {
			this.anIntArray65[local103] = ((Class1_Sub7) local230[local103]).anInt859;
		}
		for (local110 = 0; local110 < local235.length; local110++) {
			this.anIntArray66[local110] = ((Class1_Sub7) local235[local110]).anInt859;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!ai;Lclient!ga;)Z")
	public boolean method266(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class30 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray65.length; local7++) {
			if (!arg1.method1286(this.anIntArray65[local7])) {
				return false;
			}
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray66.length; local31++) {
			if (!arg0.method106(this.anIntArray66[local31])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!ga;ILclient!ai;ZDB)[I")
	public int[] method271(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface1 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) double arg5) {
		Static135.anInterface1_2 = arg3;
		Static169.aClass30_60 = arg1;
		Static55.method1000(arg0, arg2);
		@Pc(26) int[] local26 = new int[arg0 * arg2];
		for (@Pc(28) int local28 = 0; local28 < this.aClass1_Sub2Array4.length; local28++) {
			this.aClass1_Sub2Array4[local28].method3127(arg2, arg0);
		}
		@Pc(54) int local54;
		@Pc(56) int local56;
		@Pc(58) byte local58;
		if (arg4) {
			local54 = arg2 - 1;
			local56 = -1;
			local58 = -1;
		} else {
			local54 = 0;
			local56 = arg2;
			local58 = 1;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg0; local70++) {
			@Pc(86) int[] local86;
			@Pc(94) int[] local94;
			@Pc(90) int[] local90;
			if (this.aClass1_Sub2_1.aBoolean215) {
				@Pc(102) int[] local102 = this.aClass1_Sub2_1.method3126(local70);
				local90 = local102;
				local94 = local102;
				local86 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass1_Sub2_1.method3129(local70);
				local86 = local82[0];
				local90 = local82[2];
				local94 = local82[1];
			}
			for (@Pc(110) int local110 = local54; local110 != local56; local110 += local58) {
				@Pc(121) double local121 = Math.pow((double) local86[local110] / 4096.0D, arg5);
				@Pc(130) double local130 = Math.pow((double) local94[local110] / 4096.0D, arg5);
				@Pc(139) double local139 = Math.pow((double) local90[local110] / 4096.0D, arg5);
				@Pc(144) int local144 = (int) (local121 * 256.0D);
				if (local144 > 255) {
					local144 = 255;
				}
				@Pc(156) int local156 = (int) (local130 * 256.0D);
				if (local144 < 0) {
					local144 = 0;
				}
				if (local156 > 255) {
					local156 = 255;
				}
				if (local156 < 0) {
					local156 = 0;
				}
				@Pc(177) int local177 = (int) (local139 * 256.0D);
				if (local177 > 255) {
					local177 = 255;
				}
				if (local177 < 0) {
					local177 = 0;
				}
				local26[local68++] = (local144 << 16) + (local156 << 8) + local177;
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass1_Sub2Array4.length; local224++) {
			this.aClass1_Sub2Array4[local224].method3128();
		}
		return local26;
	}
}
