import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class5_Sub3_Sub9 extends Class5_Sub3 {

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
	private int anInt1786;

	@OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
	private int anInt1791;

	@OriginalMember(owner = "client!fm", name = "Y", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
	private int anInt1798 = -1;

	static {
		new Class85("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(31) int local31 = this.anInt1786 * (this.anInt1791 == Static227.anInt4557 ? arg0 : arg0 * this.anInt1791 / Static227.anInt4557);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(49) int local49;
			@Pc(58) int local58;
			if (this.anInt1786 == Static7.anInt129) {
				for (local49 = 0; local49 < Static7.anInt129; local49++) {
					local58 = this.anIntArray159[local31++];
					local43[local49] = (local58 & 0xFF) << 4;
					local39[local49] = local58 >> 4 & 0xFF0;
					local35[local49] = local58 >> 12 & 0xFF0;
				}
			} else {
				for (local49 = 0; local49 < Static7.anInt129; local49++) {
					local58 = this.anInt1786 * local49 / Static7.anInt129;
					@Pc(65) int local65 = this.anIntArray159[local58 + local31];
					local43[local49] = (local65 & 0xFF) << 4;
					local39[local49] = local65 >> 4 & 0xFF0;
					local35[local49] = local65 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1798 = arg0.method5106();
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	@Override
	public void method6014() {
		super.method6014();
		this.anIntArray159 = null;
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)I")
	@Override
	public int method6012() {
		return this.anInt1798;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V")
	@Override
	public void method6013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6013(arg0, arg1);
		if (this.anInt1798 >= 0 && Static216.anInterface3_5 != null) {
			@Pc(24) int local24 = Static216.anInterface3_5.method1511(this.anInt1798).aBoolean539 ? 64 : 128;
			this.anIntArray159 = Static216.anInterface3_5.method1508(local24, local24, this.anInt1798, false, 1.0F);
			this.anInt1791 = local24;
			this.anInt1786 = local24;
		}
	}
}
