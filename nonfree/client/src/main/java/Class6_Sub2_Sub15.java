import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class6_Sub2_Sub15 extends Class6_Sub2 {

	@OriginalMember(owner = "client!im", name = "E", descriptor = "I")
	private int anInt2967 = 3216;

	@OriginalMember(owner = "client!im", name = "F", descriptor = "[I")
	private final int[] anIntArray271 = new int[3];

	@OriginalMember(owner = "client!im", name = "H", descriptor = "I")
	private int anInt2969 = 3216;

	@OriginalMember(owner = "client!im", name = "I", descriptor = "I")
	private int anInt2970 = 4096;

	static {
		new Class231("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		this.method2711();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(27) int local27 = this.anInt2970 * Static319.anInt5200 >> 12;
			@Pc(37) int[] local37 = this.method5858(0, Static296.anInt4928 & arg0 - 1);
			@Pc(43) int[] local43 = this.method5858(0, arg0);
			@Pc(53) int[] local53 = this.method5858(0, arg0 + 1 & Static296.anInt4928);
			for (@Pc(55) int local55 = 0; local55 < Static185.anInt4925; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(91) int local91 = (local43[local55 - 1 & Static64.anInt1348] - local43[local55 + 1 & Static64.anInt1348]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(104) int local104 = local70 >> 4;
				if (local95 > 255) {
					local95 = 255;
				}
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(141) int local141 = Class6_Sub2_Sub32.aByteArray74[local95 + ((local104 + 1) * local104 >> 1)] & 0xFF;
				@Pc(147) int local147 = local141 * 4096 >> 8;
				@Pc(153) int local153 = local91 * local141 >> 8;
				@Pc(159) int local159 = local70 * local141 >> 8;
				@Pc(168) int local168 = local159 * this.anIntArray271[1] >> 12;
				@Pc(177) int local177 = local153 * this.anIntArray271[0] >> 12;
				@Pc(186) int local186 = local147 * this.anIntArray271[2] >> 12;
				local16[local55] = local177 + local168 + local186;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2970 = arg0.method3108();
		} else if (arg1 == 1) {
			this.anInt2969 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt2967 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
	private void method2711() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2967 / 4096.0F));
		this.anIntArray271[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt2969 / 4096.0F)));
		this.anIntArray271[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt2969 / 4096.0F)));
		this.anIntArray271[2] = (int) (Math.sin((double) ((float) this.anInt2967 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray271[0] * this.anIntArray271[0] >> 12;
		@Pc(86) int local86 = this.anIntArray271[1] * this.anIntArray271[1] >> 12;
		@Pc(98) int local98 = this.anIntArray271[2] * this.anIntArray271[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local86 + local74 + local98 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray271[1] = (this.anIntArray271[1] << 12) / local111;
			this.anIntArray271[2] = (this.anIntArray271[2] << 12) / local111;
			this.anIntArray271[0] = (this.anIntArray271[0] << 12) / local111;
		}
	}
}
