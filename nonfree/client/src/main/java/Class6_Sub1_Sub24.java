import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class6_Sub1_Sub24 extends Class6_Sub1 {

	@OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
	private int anInt6715;

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
	private int anInt6719;

	@OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
	private int anInt6722;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub24() {
		this(0);
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V")
	private Class6_Sub1_Sub24(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5764(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method5764(arg0.method8344());
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
	private void method5764(@OriginalArg(0) int arg0) {
		this.anInt6722 = (arg0 & 0xFF) << 4;
		this.anInt6719 = arg0 >> 12 & 0xFF0;
		this.anInt6715 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(23) int[] local23 = local15[0];
			@Pc(27) int[] local27 = local15[1];
			@Pc(31) int[] local31 = local15[2];
			for (@Pc(33) int local33 = 0; local33 < Static479.anInt8231; local33++) {
				local23[local33] = this.anInt6719;
				local27[local33] = this.anInt6715;
				local31[local33] = this.anInt6722;
			}
		}
		return local15;
	}
}
