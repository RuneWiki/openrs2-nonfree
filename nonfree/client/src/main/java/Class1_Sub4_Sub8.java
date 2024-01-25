import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Class1_Sub4_Sub8 extends Class1_Sub4 {

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
	protected int anInt949;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "[I")
	protected int[] anIntArray46;

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
	protected int anInt954;

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
	private int anInt956 = -1;

	static {
		new Class119("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
	@Override
	public final void method5688() {
		super.method5688();
		this.anIntArray46 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131 && this.method912()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(53) int local53 = (Static186.anInt3223 == this.anInt949 ? arg0 : arg0 * this.anInt949 / Static186.anInt3223) * this.anInt954;
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (Static395.anInt6592 == this.anInt954) {
				for (local63 = 0; local63 < Static395.anInt6592; local63++) {
					local71 = this.anIntArray46[local53++];
					local37[local63] = (local71 & 0xFF) << 4;
					local33[local63] = local71 >> 4 & 0xFF0;
					local29[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static395.anInt6592; local63++) {
					local71 = local63 * this.anInt954 / Static395.anInt6592;
					@Pc(124) int local124 = this.anIntArray46[local53 + local71];
					local37[local63] = (local124 & 0xFF) << 4;
					local33[local63] = local124 >> 4 & 0xFF0;
					local29[local63] = local124 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
	protected final boolean method912() {
		if (this.anIntArray46 != null) {
			return true;
		} else if (this.anInt956 >= 0) {
			@Pc(24) Class72 local24 = Static458.anInt6288 < 0 ? Static460.method1566(Static333.aClass82_78, this.anInt956) : Static460.method1572(Static333.aClass82_78, Static458.anInt6288, this.anInt956);
			local24.method1568();
			this.anIntArray46 = local24.method1565();
			this.anInt949 = local24.anInt1851;
			this.anInt954 = local24.anInt1855;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public final void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt956 = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)I")
	@Override
	public final int method5694() {
		return this.anInt956;
	}
}
