import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class3_Sub4_Sub37 extends Class3_Sub4 {

	@OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
	private int anInt7300;

	@OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
	private int anInt7302;

	@OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
	private int anInt7304;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub37() {
		this(0);
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V")
	private Class3_Sub4_Sub37(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5909(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method5909(arg0.method4099());
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V")
	private void method5909(@OriginalArg(1) int arg0) {
		this.anInt7304 = arg0 >> 4 & 0xFF0;
		this.anInt7300 = arg0 >> 12 & 0xFF0;
		this.anInt7302 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static148.anInt2687; local37++) {
				local27[local37] = this.anInt7300;
				local31[local37] = this.anInt7304;
				local35[local37] = this.anInt7302;
			}
		}
		return local11;
	}
}
