import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class6_Sub5_Sub4 extends Class6_Sub5 {

	@OriginalMember(owner = "client!cl", name = "O", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
	private int anInt1315;

	@OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
	private int anInt1316;

	@OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
	private int anInt1310 = -1;

	static {
		new Class267("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
	@Override
	public void method6541() {
		super.method6541();
		this.anIntArray83 = null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt1310 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)I")
	@Override
	public int method6535() {
		return this.anInt1310;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(III)V")
	@Override
	public void method6547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method6547(arg0, arg1);
		if (this.anInt1310 >= 0 && Static402.anInterface8_7 != null) {
			@Pc(31) int local31 = Static402.anInterface8_7.method5566(this.anInt1310).aBoolean325 ? 64 : 128;
			this.anIntArray83 = Static402.anInterface8_7.method5563(this.anInt1310, local31, false, 1.0F, local31);
			this.anInt1315 = local31;
			this.anInt1316 = local31;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(40) int local40 = (this.anInt1315 == Static235.anInt4304 ? arg0 : this.anInt1315 * arg0 / Static235.anInt4304) * this.anInt1316;
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (this.anInt1316 == Static240.anInt4386) {
				for (local58 = 0; local58 < Static240.anInt4386; local58++) {
					local67 = this.anIntArray83[local40++];
					local52[local58] = (local67 & 0xFF) << 4;
					local48[local58] = local67 >> 4 & 0xFF0;
					local44[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static240.anInt4386; local58++) {
					local67 = this.anInt1316 * local58 / Static240.anInt4386;
					@Pc(74) int local74 = this.anIntArray83[local67 + local40];
					local52[local58] = (local74 & 0xFF) << 4;
					local48[local58] = local74 >> 4 & 0xFF0;
					local44[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
