import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub3_Sub30 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
	private int anInt8143 = 4096;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
	private int anInt8146 = 4096;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
	private int anInt8147 = 4096;

	static {
		new Class114("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8146 = arg0.method3056();
		} else if (arg1 == 1) {
			this.anInt8147 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt8143 = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(27) int[][] local27 = this.method7910(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static236.anInt4609; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local59 == local63 && local67 == local63) {
					local43[local53] = local59 * this.anInt8146 >> 12;
					local47[local53] = this.anInt8147 * local63 >> 12;
					local51[local53] = this.anInt8143 * local67 >> 12;
				} else {
					local43[local53] = this.anInt8146;
					local47[local53] = this.anInt8147;
					local51[local53] = this.anInt8143;
				}
			}
		}
		return local17;
	}
}
