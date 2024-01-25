import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!uja", name = "t", descriptor = "I")
	private int anInt9844;

	@OriginalMember(owner = "client!uja", name = "u", descriptor = "I")
	private int anInt9845;

	@OriginalMember(owner = "client!uja", name = "z", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "I")
	private int anInt9848;

	@OriginalMember(owner = "client!uja", name = "A", descriptor = "I")
	private int anInt9851;

	@OriginalMember(owner = "client!uja", name = "B", descriptor = "I")
	private final int anInt9839;

	@OriginalMember(owner = "client!uja", name = "x", descriptor = "I")
	private final int anInt9841;

	@OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
	private final int anInt9840;

	@OriginalMember(owner = "client!uja", name = "C", descriptor = "I")
	private int anInt9837;

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class40_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9839 = (int) (arg6 * 4096.0F);
		this.anInt9841 = (int) (arg7 * 4096.0F);
		this.anInt9837 = this.anInt9840 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method8832() {
		this.anInt9848 = 0;
		this.anInt9844 = 0;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IBB)V")
	protected void method8455(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray100[arg0] = arg1;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9851 = this.anInt9839 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt9851 = this.anInt9851 * this.anInt9851 >> 12;
			this.anInt9845 = 4096;
			this.anInt9848 = this.anInt9851;
			return;
		}
		this.anInt9845 = this.anInt9851 * this.anInt9841 >> 12;
		this.anInt9851 = this.anInt9839 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt9845 < 0) {
			this.anInt9845 = 0;
		} else if (this.anInt9845 > 4096) {
			this.anInt9845 = 4096;
		}
		this.anInt9851 = this.anInt9851 * this.anInt9851 >> 12;
		this.anInt9851 = this.anInt9851 * this.anInt9845 >> 12;
		this.anInt9848 += this.anInt9837 * this.anInt9851 >> 12;
		this.anInt9837 = this.anInt9840 * this.anInt9837 >> 12;
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(B)V")
	@Override
	protected final void method8833() {
		this.anInt9848 >>= 0x4;
		this.anInt9837 = this.anInt9840;
		if (this.anInt9848 < 0) {
			this.anInt9848 = 0;
		} else if (this.anInt9848 > 255) {
			this.anInt9848 = 255;
		}
		this.method8455(this.anInt9844++, (byte) this.anInt9848);
		this.anInt9848 = 0;
	}
}
