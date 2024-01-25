import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class Class129_Sub2 extends Class129 {

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
	private int anInt5976;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
	private int anInt5978;

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
	private int anInt5981;

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "[B")
	private byte[] aByteArray93;

	@OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
	private int anInt5986;

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
	private final int anInt5983;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
	private final int anInt5979;

	@OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
	private final int anInt5984;

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
	private int anInt5989;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class129_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5983 = (int) (arg7 * 4096.0F);
		this.anInt5979 = (int) (arg6 * 4096.0F);
		this.anInt5989 = this.anInt5984 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5187() {
		this.anInt5989 = this.anInt5984;
		this.anInt5978 >>= 0x4;
		if (this.anInt5978 < 0) {
			this.anInt5978 = 0;
		} else if (this.anInt5978 > 255) {
			this.anInt5978 = 255;
		}
		this.method5197(this.anInt5986++, (byte) this.anInt5978);
		this.anInt5978 = 0;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V")
	@Override
	protected final void method5193() {
		this.anInt5978 = 0;
		this.anInt5986 = 0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5976 = this.anInt5979 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt5976 = this.anInt5976 * this.anInt5976 >> 12;
			this.anInt5981 = 4096;
			this.anInt5978 = this.anInt5976;
			return;
		}
		this.anInt5981 = this.anInt5983 * this.anInt5976 >> 12;
		this.anInt5976 = this.anInt5979 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt5981 < 0) {
			this.anInt5981 = 0;
		} else if (this.anInt5981 > 4096) {
			this.anInt5981 = 4096;
		}
		this.anInt5976 = this.anInt5976 * this.anInt5976 >> 12;
		this.anInt5976 = this.anInt5981 * this.anInt5976 >> 12;
		this.anInt5978 += this.anInt5976 * this.anInt5989 >> 12;
		this.anInt5989 = this.anInt5984 * this.anInt5989 >> 12;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	protected void method5197(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray93[arg0] = arg1;
	}
}
