import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class2_Sub2_Sub30 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qp", name = "L", descriptor = "I")
	private int anInt6045;

	@OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
	private int anInt6047;

	@OriginalMember(owner = "client!qp", name = "S", descriptor = "I")
	private int anInt6051;

	@OriginalMember(owner = "client!qp", name = "U", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!qp", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray149;

	@OriginalMember(owner = "client!qp", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray150;

	@OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
	private int anInt6044 = 409;

	@OriginalMember(owner = "client!qp", name = "P", descriptor = "I")
	private int anInt6049 = 1024;

	@OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
	private int anInt6050 = 1024;

	@OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
	private int anInt6043 = 204;

	@OriginalMember(owner = "client!qp", name = "X", descriptor = "I")
	private int anInt6055 = 81;

	@OriginalMember(owner = "client!qp", name = "W", descriptor = "I")
	private int anInt6054 = 0;

	@OriginalMember(owner = "client!qp", name = "Y", descriptor = "I")
	private int anInt6056 = 4;

	@OriginalMember(owner = "client!qp", name = "O", descriptor = "I")
	private int anInt6048 = 8;

	static {
		new Class231("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
	private void method4813() {
		@Pc(12) Random local12 = new Random((long) this.anInt6048);
		this.anInt6045 = 4096 / this.anInt6048;
		this.anInt6051 = 4096 / this.anInt6056;
		this.anInt6047 = this.anInt6055 / 2;
		@Pc(35) int local35 = this.anInt6051 / 2;
		this.anIntArrayArray149 = new int[this.anInt6048][this.anInt6056 + 1];
		this.anIntArrayArray150 = new int[this.anInt6048][this.anInt6056];
		this.anIntArray505 = new int[this.anInt6048 + 1];
		@Pc(63) int local63 = this.anInt6045 / 2;
		this.anIntArray505[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt6048; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt6045;
				local98 = (Static408.method1356(local12, 4096) - 2048) * this.anInt6043 >> 12;
				@Pc(106) int local106 = local86 + (local63 * local98 >> 12);
				this.anIntArray505[local76] = this.anIntArray505[local76 - 1] + local106;
			}
			this.anIntArrayArray149[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt6056; local86++) {
				if (local86 > 0) {
					local98 = this.anInt6051;
					@Pc(150) int local150 = (Static408.method1356(local12, 4096) - 2048) * this.anInt6044 >> 12;
					local98 += local35 * local150 >> 12;
					this.anIntArrayArray149[local76][local86] = this.anIntArrayArray149[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray150[local76][local86] = this.anInt6049 <= 0 ? 4096 : 4096 - Static408.method1356(local12, this.anInt6049);
			}
			this.anIntArrayArray149[local76][this.anInt6056] = 4096;
		}
		this.anIntArray505[this.anInt6048] = 4096;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		this.method4813();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt6054 + Static168.anIntArray524[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt6048 > local23 && this.anIntArray505[local23] <= local30) {
				local23++;
			}
			@Pc(62) int local62 = local23 - 1;
			@Pc(70) boolean local70 = (local23 & 0x1) == 0;
			@Pc(75) int local75 = this.anIntArray505[local23];
			@Pc(82) int local82 = this.anIntArray505[local23 - 1];
			if (local30 > this.anInt6047 + local82 && local30 < local75 - this.anInt6047) {
				for (@Pc(112) int local112 = 0; local112 < Static398.anInt6955; local112++) {
					@Pc(116) int local116 = 0;
					@Pc(125) int local125 = local70 ? this.anInt6050 : -this.anInt6050;
					@Pc(136) int local136;
					for (local136 = (this.anInt6051 * local125 >> 12) + Static427.anIntArray587[local112]; local136 < 0; local136 += 4096) {
					}
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (local116 < this.anInt6056 && local136 >= this.anIntArrayArray149[local62][local116]) {
						local116++;
					}
					@Pc(176) int local176 = local116 - 1;
					@Pc(183) int local183 = this.anIntArrayArray149[local62][local116];
					@Pc(190) int local190 = this.anIntArrayArray149[local62][local176];
					if (local190 + this.anInt6047 < local136 && local183 - this.anInt6047 > local136) {
						local17[local112] = this.anIntArrayArray150[local62][local176];
					} else {
						local17[local112] = 0;
					}
				}
			} else {
				Static472.method5023(local17, 0, Static398.anInt6955, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6056 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt6048 = arg0.method6138();
		} else if (arg1 == 2) {
			this.anInt6044 = arg0.method6148();
		} else if (arg1 == 3) {
			this.anInt6043 = arg0.method6148();
		} else if (arg1 == 4) {
			this.anInt6050 = arg0.method6148();
		} else if (arg1 == 5) {
			this.anInt6054 = arg0.method6148();
		} else if (arg1 == 6) {
			this.anInt6055 = arg0.method6148();
		} else if (arg1 == 7) {
			this.anInt6049 = arg0.method6148();
		}
	}
}
