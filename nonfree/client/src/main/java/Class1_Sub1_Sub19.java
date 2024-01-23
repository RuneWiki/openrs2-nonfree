import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mk", name = "ab", descriptor = "I")
	private int anInt3091;

	@OriginalMember(owner = "client!mk", name = "cb", descriptor = "I")
	private int anInt3093;

	@OriginalMember(owner = "client!mk", name = "kb", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!mk", name = "qb", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!mk", name = "rb", descriptor = "I")
	private int anInt3103;

	@OriginalMember(owner = "client!mk", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
	private int anInt3087 = 0;

	@OriginalMember(owner = "client!mk", name = "Y", descriptor = "I")
	private int anInt3089 = 1024;

	@OriginalMember(owner = "client!mk", name = "db", descriptor = "I")
	private int anInt3094 = 409;

	@OriginalMember(owner = "client!mk", name = "X", descriptor = "I")
	private int anInt3088 = 1024;

	@OriginalMember(owner = "client!mk", name = "Z", descriptor = "I")
	private int anInt3090 = 204;

	@OriginalMember(owner = "client!mk", name = "mb", descriptor = "I")
	private int anInt3099 = 8;

	@OriginalMember(owner = "client!mk", name = "ib", descriptor = "I")
	private int anInt3097 = 81;

	@OriginalMember(owner = "client!mk", name = "ob", descriptor = "I")
	private int anInt3101 = 4;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		this.method2339();
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)V")
	private void method2339() {
		@Pc(12) Random local12 = new Random((long) this.anInt3099);
		this.anIntArray262 = new int[this.anInt3099 + 1];
		this.anInt3103 = 4096 / this.anInt3099;
		this.anIntArrayArray30 = new int[this.anInt3099][this.anInt3101];
		this.anIntArray262[0] = 0;
		this.anIntArrayArray31 = new int[this.anInt3099][this.anInt3101 + 1];
		@Pc(55) int local55 = this.anInt3103 / 2;
		this.anInt3093 = 4096 / this.anInt3101;
		this.anInt3091 = this.anInt3097 / 2;
		@Pc(72) int local72 = this.anInt3093 / 2;
		for (@Pc(74) int local74 = 0; local74 < this.anInt3099; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt3103;
				local96 = (Static206.method3285(local12, 4096) - 2048) * this.anInt3090 >> 12;
				@Pc(104) int local104 = local84 + (local55 * local96 >> 12);
				this.anIntArray262[local74] = this.anIntArray262[local74 - 1] + local104;
			}
			this.anIntArrayArray31[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt3101; local84++) {
				if (local84 > 0) {
					local96 = this.anInt3093;
					@Pc(145) int local145 = (Static206.method3285(local12, 4096) - 2048) * this.anInt3094 >> 12;
					local96 += local145 * local72 >> 12;
					this.anIntArrayArray31[local74][local84] = local96 + this.anIntArrayArray31[local74][local84 - 1];
				}
				this.anIntArrayArray30[local74][local84] = this.anInt3089 <= 0 ? 4096 : 4096 - Static206.method3285(local12, this.anInt3089);
			}
			this.anIntArrayArray31[local74][this.anInt3101] = 4096;
		}
		this.anIntArray262[this.anInt3099] = 4096;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3101 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt3099 = arg0.method2945();
		} else if (arg1 == 2) {
			this.anInt3094 = arg0.method2964();
		} else if (arg1 == 3) {
			this.anInt3090 = arg0.method2964();
		} else if (arg1 == 4) {
			this.anInt3088 = arg0.method2964();
		} else if (arg1 == 5) {
			this.anInt3087 = arg0.method2964();
		} else if (arg1 == 6) {
			this.anInt3097 = arg0.method2964();
		} else if (arg1 == 7) {
			this.anInt3089 = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(23) int local23 = 0;
			@Pc(31) int local31;
			for (local31 = Static187.anIntArray345[arg0] + this.anInt3087; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (this.anInt3099 > local23 && this.anIntArray262[local23] <= local31) {
				local23++;
			}
			@Pc(67) int local67 = local23 - 1;
			@Pc(75) boolean local75 = (local23 & 0x1) == 0;
			@Pc(80) int local80 = this.anIntArray262[local23];
			@Pc(87) int local87 = this.anIntArray262[local23 - 1];
			if (local87 + this.anInt3091 < local31 && local80 - this.anInt3091 > local31) {
				for (@Pc(113) int local113 = 0; local113 < Static11.anInt294; local113++) {
					@Pc(117) int local117 = 0;
					@Pc(126) int local126 = local75 ? this.anInt3088 : -this.anInt3088;
					@Pc(137) int local137;
					for (local137 = Static36.anIntArray81[local113] + (this.anInt3093 * local126 >> 12); local137 < 0; local137 += 4096) {
					}
					while (local137 > 4096) {
						local137 -= 4096;
					}
					while (local117 < this.anInt3101 && this.anIntArrayArray31[local67][local117] <= local137) {
						local117++;
					}
					@Pc(170) int local170 = this.anIntArrayArray31[local67][local117];
					@Pc(174) int local174 = local117 - 1;
					@Pc(181) int local181 = this.anIntArrayArray31[local67][local174];
					if (local137 > local181 + this.anInt3091 && local137 < local170 - this.anInt3091) {
						local7[local113] = this.anIntArrayArray30[local67][local174];
					} else {
						local7[local113] = 0;
					}
				}
			} else {
				Static236.method301(local7, 0, Static11.anInt294, 0);
			}
		}
		return local7;
	}
}
