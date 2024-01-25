import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public class Class148_Sub2 extends Class148 {

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
	private int anInt9362;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
	private int anInt9364;

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "[I")
	private final int[] anIntArray608 = new int[this.anInt9349];

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class148_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt9349 > local15; local15++) {
			this.anIntArray608[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method7944() {
		this.anInt9364 = 0;
		this.anInt9362 = 0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9362 += this.anIntArray608[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BIB)V")
	protected void method7953(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray103[this.anInt9364++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method7946() {
		this.anInt9362 = Math.abs(this.anInt9362);
		if (this.anInt9362 >= 4096) {
			this.anInt9362 = 4095;
		}
		this.method7953(this.anInt9364++, (byte) (this.anInt9362 >> 4));
		this.anInt9362 = 0;
	}
}
