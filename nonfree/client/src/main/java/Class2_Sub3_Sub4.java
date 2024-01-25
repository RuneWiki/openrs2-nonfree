import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
	private int anInt579 = 0;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
	private int anInt577 = 1;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
	private int anInt582 = 0;

	static {
		new Class140("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt579 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt582 = arg1.method3124();
		} else if (arg0 == 3) {
			this.anInt577 = arg1.method3124();
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		Static224.method5493();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(24) int local24 = Static76.anIntArray121[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static263.anInt5504; local32++) {
				@Pc(38) int local38 = Static269.anIntArray507[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt579 == 0) {
					local71 = this.anInt577 * (local38 - local24);
				} else {
					@Pc(61) int local61 = local44 * local44 + local30 * local30 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (this.anInt577 * local71) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt582 == 0) {
					local71 = Static331.anIntArray498[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt582 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local11[local32] = local71;
			}
		}
		return local11;
	}
}
