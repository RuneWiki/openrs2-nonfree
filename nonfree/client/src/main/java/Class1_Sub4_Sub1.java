import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
	private int anInt157 = -1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	@Override
	public void method5954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5954(arg0, arg1);
		if (this.anInt157 >= 0 && Static124.anInterface4_15 != null) {
			@Pc(27) int local27 = Static124.anInterface4_15.method2450(this.anInt157).aBoolean331 ? 64 : 128;
			this.anIntArray15 = Static124.anInterface4_15.method2451(local27, local27, this.anInt157, 1.0F, false);
			this.anInt161 = local27;
			this.anInt160 = local27;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt157 = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
	@Override
	public int method5952() {
		return this.anInt157;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(39) int local39 = (Static61.anInt1456 == this.anInt160 ? arg0 : this.anInt160 * arg0 / Static61.anInt1456) * this.anInt161;
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (this.anInt161 == Static66.anInt1511) {
				for (local61 = 0; local61 < Static66.anInt1511; local61++) {
					local70 = this.anIntArray15[local39++];
					local51[local61] = (local70 & 0xFF) << 4;
					local47[local61] = local70 >> 4 & 0xFF0;
					local43[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static66.anInt1511; local61++) {
					local70 = this.anInt161 * local61 / Static66.anInt1511;
					@Pc(78) int local78 = this.anIntArray15[local39 + local70];
					local51[local61] = (local78 & 0xFF) << 4;
					local47[local61] = local78 >> 4 & 0xFF0;
					local43[local61] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public void method5953() {
		super.method5953();
		this.anIntArray15 = null;
	}
}
