import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
	private final int anInt201;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private final int anInt205;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	private final int anInt207;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt201 = (int) (arg6 * 4096.0F);
		this.anInt205 = (int) (arg7 * 4096.0F);
		this.anInt200 = this.anInt207 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4366() {
		this.anInt202 = 0;
		this.anInt204 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4363() {
		this.anInt200 = this.anInt207;
		this.anInt204 >>= 0x4;
		if (this.anInt204 < 0) {
			this.anInt204 = 0;
		} else if (this.anInt204 > 255) {
			this.anInt204 = 255;
		}
		this.method190((byte) this.anInt204, this.anInt202++);
		this.anInt204 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIZ)V")
	protected void method190(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray5[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt197 = this.anInt201 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt208 = 4096;
			this.anInt197 = this.anInt197 * this.anInt197 >> 12;
			this.anInt204 = this.anInt197;
			return;
		}
		this.anInt208 = this.anInt205 * this.anInt197 >> 12;
		if (this.anInt208 < 0) {
			this.anInt208 = 0;
		} else if (this.anInt208 > 4096) {
			this.anInt208 = 4096;
		}
		this.anInt197 = this.anInt201 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt197 = this.anInt197 * this.anInt197 >> 12;
		this.anInt197 = this.anInt208 * this.anInt197 >> 12;
		this.anInt204 += this.anInt197 * this.anInt200 >> 12;
		this.anInt200 = this.anInt200 * this.anInt207 >> 12;
	}
}
