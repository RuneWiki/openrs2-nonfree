import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class6_Sub5_Sub7 extends Class6_Sub5 {

	@OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
	private int anInt1911 = 4096;

	@OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
	private int anInt1912 = 4096;

	@OriginalMember(owner = "client!dn", name = "R", descriptor = "I")
	private int anInt1914 = 4096;

	@OriginalMember(owner = "client!dn", name = "M", descriptor = "[I")
	private final int[] anIntArray111 = new int[3];

	@OriginalMember(owner = "client!dn", name = "Q", descriptor = "I")
	private int anInt1913 = 409;

	static {
		new Class267("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt1913 = arg1.method6485();
		} else if (arg0 == 1) {
			this.anInt1912 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt1914 = arg1.method6485();
		} else if (arg0 == 3) {
			this.anInt1911 = arg1.method6485();
		} else if (arg0 == 4) {
			@Pc(63) int local63 = arg1.method6435();
			this.anIntArray111[1] = local63 >> 4 & 0xFF0;
			this.anIntArray111[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray111[2] = local63 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(27) int[][] local27 = this.method6544(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static240.anInt4386; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray111[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (local67 > this.anInt1913) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(98) int local98 = local35[local53];
					local67 = local98 - this.anIntArray111[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt1913) {
						local43[local53] = local59;
						local47[local53] = local98;
						local51[local53] = local39[local53];
					} else {
						@Pc(141) int local141 = local39[local53];
						local67 = local141 - this.anIntArray111[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (local67 > this.anInt1913) {
							local43[local53] = local59;
							local47[local53] = local98;
							local51[local53] = local141;
						} else {
							local43[local53] = this.anInt1911 * local59 >> 12;
							local47[local53] = local98 * this.anInt1914 >> 12;
							local51[local53] = local141 * this.anInt1912 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
