import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class1_Sub8_Sub36 extends Class1_Sub8 {

	@OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
	private int anInt7296;

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "[I")
	private int[] anIntArray695;

	@OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
	private int anInt7301;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	private int anInt7297 = -1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub36() {
		super(0, false);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)I")
	@Override
	public int method6039() {
		return this.anInt7297;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7297 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
	@Override
	public void method6036() {
		super.method6036();
		this.anIntArray695 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BII)V")
	@Override
	public void method6034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method6034(arg0, arg1);
		if (this.anInt7297 >= 0 && Static138.anInterface7_2 != null) {
			@Pc(24) int local24 = Static138.anInterface7_2.method78(this.anInt7297).aBoolean272 ? 64 : 128;
			this.anIntArray695 = Static138.anInterface7_2.method76(this.anInt7297, 1.0F, local24, local24, false);
			this.anInt7296 = local24;
			this.anInt7301 = local24;
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(39) int local39 = this.anInt7301 * (this.anInt7296 == Static217.anInt4363 ? arg0 : arg0 * this.anInt7296 / Static217.anInt4363);
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (this.anInt7301 == Static18.anInt439) {
				for (local61 = 0; local61 < Static18.anInt439; local61++) {
					local70 = this.anIntArray695[local39++];
					local51[local61] = (local70 & 0xFF) << 4;
					local47[local61] = local70 >> 4 & 0xFF0;
					local43[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static18.anInt439; local61++) {
					local70 = this.anInt7301 * local61 / Static18.anInt439;
					@Pc(77) int local77 = this.anIntArray695[local70 + local39];
					local51[local61] = (local77 & 0xFF) << 4;
					local47[local61] = local77 >> 4 & 0xFF0;
					local43[local61] = local77 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
