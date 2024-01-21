import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(27) int[] local27 = local15[0];
			@Pc(31) int[] local31 = local15[1];
			@Pc(35) int[] local35 = local15[2];
			for (@Pc(37) int local37 = 0; local37 < Static141.anInt3261; local37++) {
				local27[local37] = this.anInt307;
				local31[local37] = this.anInt316;
				local35[local37] = this.anInt310;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(IB)V")
	private void method253(@OriginalArg(0) int arg0) {
		this.anInt316 = arg0 >> 4 & 0xFF0;
		this.anInt310 = (arg0 & 0xFF) << 4;
		this.anInt307 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.method253(arg1.method197());
		}
	}
}
