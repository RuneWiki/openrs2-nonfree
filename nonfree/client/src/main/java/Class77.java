import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class77 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
	private final int[] anIntArray348;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "[I")
	private final int[] anIntArray349;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!pf;")
	private final Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!pf;")
	private final Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[Lclient!pf;")
	private final Class2_Sub1[] aClass2_Sub1Array34;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class77() {
		this.anIntArray348 = new int[0];
		this.anIntArray349 = new int[0];
		this.aClass2_Sub1_2 = new Class2_Sub1_Sub10();
		this.aClass2_Sub1_1 = new Class2_Sub1_Sub10();
		this.aClass2_Sub1Array34 = new Class2_Sub1[] { this.aClass2_Sub1_2, this.aClass2_Sub1_1 };
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!me;)V")
	public Class77(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method1402();
		@Pc(12) Class16 local12 = new Class16(64);
		@Pc(15) int[][] local15 = new int[local7][];
		@Pc(20) Class16 local20 = new Class16(64);
		@Pc(25) Class16 local25 = new Class16(64);
		this.aClass2_Sub1Array34 = new Class2_Sub1[local7];
		@Pc(45) int local45;
		@Pc(94) int local94;
		@Pc(101) int local101;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class2_Sub1 local37 = Static137.method2125(arg0);
			@Pc(41) int local41 = local37.method2800();
			local45 = local37.method2788();
			if (local41 >= 0 && local41 >= 0 && local20.method479((long) local41) == null) {
				local20.method480(new Class2_Sub8(local41), (long) local41);
			}
			if (local45 >= 0 && local45 >= 0 && local25.method479((long) local45) == null) {
				local25.method480(new Class2_Sub8(local45), (long) local45);
			}
			local94 = local37.aClass2_Sub1Array40.length;
			local15[local31] = new int[local94];
			for (local101 = 0; local101 < local94; local101++) {
				local15[local31][local101] = arg0.method1402();
			}
			local12.method480(local37, (long) local37.anInt4154);
			this.aClass2_Sub1Array34[local31] = local37;
		}
		for (@Pc(141) int local141 = 0; local141 < local7; local141++) {
			@Pc(148) Class2_Sub1 local148 = this.aClass2_Sub1Array34[local141];
			local45 = local148.aClass2_Sub1Array40.length;
			for (local94 = 0; local94 < local45; local94++) {
				@Pc(167) Class2_Sub1 local167 = (Class2_Sub1) local12.method479((long) local15[local141][local94]);
				local148.aClass2_Sub1Array40[local94] = local167;
			}
			local15[local141] = null;
		}
		this.aClass2_Sub1_2 = (Class2_Sub1) local12.method479((long) arg0.method1402());
		this.aClass2_Sub1_1 = (Class2_Sub1) local12.method479((long) arg0.method1402());
		this.anIntArray348 = new int[local20.method482()];
		this.anIntArray349 = new int[local25.method482()];
		@Pc(229) Class2[] local229 = new Class2[local20.method482()];
		@Pc(234) Class2[] local234 = new Class2[local25.method482()];
		local20.method475(local229);
		local25.method475(local234);
		for (local94 = 0; local94 < local229.length; local94++) {
			this.anIntArray348[local94] = ((Class2_Sub8) local229[local94]).anInt554;
		}
		for (local101 = 0; local101 < local234.length; local101++) {
			this.anIntArray349[local101] = ((Class2_Sub8) local234[local101]).anInt554;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!da;IZIDLclient!c;)[I")
	public int[] method2331(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) double arg4, @OriginalArg(6) Class10 arg5) {
		Static2.anInterface1_1 = arg1;
		@Pc(12) int[] local12 = new int[arg0 * arg2];
		Static49.aClass10_51 = arg5;
		Static77.method1229(arg0, arg2);
		for (@Pc(20) int local20 = 0; local20 < this.aClass2_Sub1Array34.length; local20++) {
			this.aClass2_Sub1Array34[local20].method2793(arg0, arg2);
		}
		@Pc(48) int local48;
		@Pc(46) int local46;
		@Pc(44) byte local44;
		if (arg3) {
			local44 = -1;
			local48 = arg2 - 1;
			local46 = -1;
		} else {
			local44 = 1;
			local46 = arg2;
			local48 = 0;
		}
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < arg0; local62++) {
			@Pc(82) int[] local82;
			@Pc(78) int[] local78;
			@Pc(86) int[] local86;
			if (this.aClass2_Sub1_2.aBoolean175) {
				@Pc(94) int[] local94 = this.aClass2_Sub1_2.method2801(local62);
				local82 = local94;
				local86 = local94;
				local78 = local94;
			} else {
				@Pc(74) int[][] local74 = this.aClass2_Sub1_2.method2792(local62);
				local78 = local74[1];
				local82 = local74[0];
				local86 = local74[2];
			}
			for (@Pc(102) int local102 = local48; local102 != local46; local102 += local44) {
				@Pc(113) double local113 = Math.pow((double) local82[local102] / 4096.0D, arg4);
				@Pc(118) int local118 = (int) (local113 * 256.0D);
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(141) double local141 = Math.pow((double) local78[local102] / 4096.0D, arg4);
				@Pc(150) double local150 = Math.pow((double) local86[local102] / 4096.0D, arg4);
				@Pc(155) int local155 = (int) (local141 * 256.0D);
				if (local155 > 255) {
					local155 = 255;
				}
				if (local155 < 0) {
					local155 = 0;
				}
				@Pc(172) int local172 = (int) (local150 * 256.0D);
				if (local172 > 255) {
					local172 = 255;
				}
				if (local172 < 0) {
					local172 = 0;
				}
				local12[local60++] = local172 + (local118 << 16) + (local155 << 8);
			}
		}
		for (@Pc(214) int local214 = 0; local214 < this.aClass2_Sub1Array34.length; local214++) {
			this.aClass2_Sub1Array34[local214].method2798();
		}
		return local12;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!c;ZLclient!da;)Z")
	public boolean method2333(@OriginalArg(0) Class10 arg0, @OriginalArg(2) Interface1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray348.length; local7++) {
			if (!arg0.method1584(this.anIntArray348[local7])) {
				return false;
			}
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray349.length; local31++) {
			if (!arg1.method1718(this.anIntArray349[local31])) {
				return false;
			}
		}
		return true;
	}
}
