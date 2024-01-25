import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class3_Sub4_Sub7 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "[Lclient!cr;")
	public static final Class40[] aClass40Array1 = new Class40[5];

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "[Lclient!jk;")
	private Class82[] aClass82Array1;

	static {
		for (@Pc(12) int local12 = 0; local12 < aClass40Array1.length; local12++) {
			aClass40Array1[local12] = new Class40();
		}
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z[[I)V")
	private void method1543(@OriginalArg(1) int[][] arg0) {
		@Pc(13) int local13 = Static106.anInt2356;
		@Pc(15) int local15 = Static340.anInt6286;
		Static406.method5482(arg0);
		Static10.method251(Static311.anInt5681, Static396.anInt6840);
		if (this.aClass82Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass82Array1.length; local29++) {
			@Pc(36) Class82 local36 = this.aClass82Array1[local29];
			@Pc(39) int local39 = local36.anInt6499;
			@Pc(42) int local42 = local36.anInt6503;
			if (local39 < 0) {
				if (local42 >= 0) {
					local36.method5119(local15, local13);
				}
			} else if (local42 >= 0) {
				local36.method5120(local15, local13);
			} else {
				local36.method5121(local15, local13);
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			this.method1543(super.aClass146_41.method3701());
		}
		return local14;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(22) int local22 = Static106.anInt2356;
			@Pc(24) int local24 = Static340.anInt6286;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass214_41.method5171();
			this.method1543(local28);
			for (@Pc(39) int local39 = 0; local39 < Static340.anInt6286; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static106.anInt2356; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.aClass82Array1 = new Class82[arg1.method6053()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass82Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method6053();
				if (local20 == 0) {
					this.aClass82Array1[local14] = Static141.method2536(arg1);
				} else if (local20 == 1) {
					this.aClass82Array1[local14] = Static36.method854(arg1);
				} else if (local20 == 2) {
					this.aClass82Array1[local14] = Static141.method2537(arg1);
				} else if (local20 == 3) {
					this.aClass82Array1[local14] = Static9.method240(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}
}
