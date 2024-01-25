import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!o", name = "L", descriptor = "I")
	protected int anInt7523;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "[I")
	protected int[] anIntArray565;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "I")
	protected int anInt7529;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "I")
	private int anInt7522 = -1;

	static {
		new Class96("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub23() {
		super(0, false);
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)I")
	@Override
	public final int method5870() {
		return this.anInt7522;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	@Override
	public final void method5860() {
		super.method5860();
		this.anIntArray565 = null;
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Z")
	protected final boolean method5799() {
		if (this.anIntArray565 != null) {
			return true;
		} else if (this.anInt7522 >= 0) {
			@Pc(27) Class63 local27 = Static238.anInt4205 < 0 ? Static457.method1171(Static20.aClass109_6, this.anInt7522) : Static457.method1163(Static20.aClass109_6, Static238.anInt4205, this.anInt7522);
			local27.method1165();
			this.anIntArray565 = local27.method1170();
			this.anInt7529 = local27.anInt1470;
			this.anInt7523 = local27.anInt1472;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public final void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7522 = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401 && this.method5799()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(53) int local53 = this.anInt7523 * (Static214.anInt6457 == this.anInt7529 ? arg0 : this.anInt7529 * arg0 / Static214.anInt6457);
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (this.anInt7523 == Static410.anInt7198) {
				for (local63 = 0; local63 < Static410.anInt7198; local63++) {
					local71 = this.anIntArray565[local53++];
					local37[local63] = (local71 & 0xFF) << 4;
					local33[local63] = local71 >> 4 & 0xFF0;
					local29[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static410.anInt7198; local63++) {
					local71 = this.anInt7523 * local63 / Static410.anInt7198;
					@Pc(120) int local120 = this.anIntArray565[local53 + local71];
					local37[local63] = (local120 & 0xFF) << 4;
					local33[local63] = local120 >> 4 & 0xFF0;
					local29[local63] = local120 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
