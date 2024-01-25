import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!en", name = "D", descriptor = "[B")
	private byte[] aByteArray165;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "I")
	private int anInt5344;

	@OriginalMember(owner = "client!en", name = "R", descriptor = "I")
	private int anInt5353;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "[I")
	private final int[] anIntArray482 = new int[this.anInt5334];

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class53_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt5334; local15++) {
			this.anIntArray482[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)V")
	protected void method4763(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray165[this.anInt5353++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4750() {
		this.anInt5344 = 0;
		this.anInt5353 = 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4747() {
		this.anInt5344 = Math.abs(this.anInt5344);
		if (this.anInt5344 >= 4096) {
			this.anInt5344 = 4095;
		}
		this.method4763(this.anInt5353++, (byte) (this.anInt5344 >> 4));
		this.anInt5344 = 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method4758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5344 += this.anIntArray482[arg0] * arg1 >> 12;
	}
}
