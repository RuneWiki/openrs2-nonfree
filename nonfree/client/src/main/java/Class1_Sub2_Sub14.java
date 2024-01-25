import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
	private int anInt2955;

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
	private int anInt2964;

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
	private int anInt2969;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
	private int anInt2958 = 204;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
	private int anInt2961 = 4;

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
	private int anInt2965 = 409;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
	private int anInt2960 = 81;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
	private int anInt2957 = 1024;

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
	private int anInt2962 = 0;

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
	private int anInt2967 = 8;

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
	private int anInt2971 = 1024;

	static {
		new Class96("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2961 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt2967 = arg0.method4548();
		} else if (arg1 == 2) {
			this.anInt2965 = arg0.method4498();
		} else if (arg1 == 3) {
			this.anInt2958 = arg0.method4498();
		} else if (arg1 == 4) {
			this.anInt2971 = arg0.method4498();
		} else if (arg1 == 5) {
			this.anInt2962 = arg0.method4498();
		} else if (arg1 == 6) {
			this.anInt2960 = arg0.method4498();
		} else if (arg1 == 7) {
			this.anInt2957 = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt2962 + Static285.anIntArray17[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt2967 > local23 && this.anIntArray225[local23] <= local30) {
				local23++;
			}
			@Pc(65) int local65 = local23 - 1;
			@Pc(73) boolean local73 = (local23 & 0x1) == 0;
			@Pc(78) int local78 = this.anIntArray225[local23];
			@Pc(85) int local85 = this.anIntArray225[local23 - 1];
			if (local85 + this.anInt2955 < local30 && local30 < local78 - this.anInt2955) {
				for (@Pc(105) int local105 = 0; local105 < Static410.anInt7198; local105++) {
					@Pc(116) int local116 = local73 ? this.anInt2971 : -this.anInt2971;
					@Pc(118) int local118 = 0;
					@Pc(129) int local129;
					for (local129 = (local116 * this.anInt2964 >> 12) + Static400.anIntArray525[local105]; local129 < 0; local129 += 4096) {
					}
					while (local129 > 4096) {
						local129 -= 4096;
					}
					while (local118 < this.anInt2961 && this.anIntArrayArray19[local65][local118] <= local129) {
						local118++;
					}
					@Pc(163) int local163 = local118 - 1;
					@Pc(170) int local170 = this.anIntArrayArray19[local65][local118];
					@Pc(177) int local177 = this.anIntArrayArray19[local65][local163];
					if (local129 > local177 + this.anInt2955 && local170 - this.anInt2955 > local129) {
						local17[local105] = this.anIntArrayArray18[local65][local163];
					} else {
						local17[local105] = 0;
					}
				}
			} else {
				Static459.method1547(local17, 0, Static410.anInt7198, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
	private void method2595() {
		@Pc(12) Random local12 = new Random((long) this.anInt2967);
		this.anInt2955 = this.anInt2960 / 2;
		this.anInt2964 = 4096 / this.anInt2961;
		this.anInt2969 = 4096 / this.anInt2967;
		@Pc(35) int local35 = this.anInt2964 / 2;
		this.anIntArrayArray19 = new int[this.anInt2967][this.anInt2961 + 1];
		this.anIntArrayArray18 = new int[this.anInt2967][this.anInt2961];
		this.anIntArray225 = new int[this.anInt2967 + 1];
		@Pc(69) int local69 = this.anInt2969 / 2;
		this.anIntArray225[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt2967; local76++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local76 > 0) {
				local86 = this.anInt2969;
				local98 = (Static19.method243(4096, local12) - 2048) * this.anInt2958 >> 12;
				@Pc(106) int local106 = local86 + (local69 * local98 >> 12);
				this.anIntArray225[local76] = this.anIntArray225[local76 - 1] + local106;
			}
			this.anIntArrayArray19[local76][0] = 0;
			for (local86 = 0; local86 < this.anInt2961; local86++) {
				if (local86 > 0) {
					local98 = this.anInt2964;
					@Pc(149) int local149 = (Static19.method243(4096, local12) - 2048) * this.anInt2965 >> 12;
					local98 += local35 * local149 >> 12;
					this.anIntArrayArray19[local76][local86] = this.anIntArrayArray19[local76][local86 - 1] + local98;
				}
				this.anIntArrayArray18[local76][local86] = this.anInt2957 <= 0 ? 4096 : 4096 - Static19.method243(this.anInt2957, local12);
			}
			this.anIntArrayArray19[local76][this.anInt2961] = 4096;
		}
		this.anIntArray225[this.anInt2967] = 4096;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		this.method2595();
	}
}
