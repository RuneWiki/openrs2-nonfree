import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!gia", name = "s", descriptor = "I")
	private int anInt5113;

	@OriginalMember(owner = "client!gia", name = "t", descriptor = "I")
	private int anInt5114;

	@OriginalMember(owner = "client!gia", name = "u", descriptor = "[I")
	private final int[] anIntArray353 = new int[this.anInt6443];

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class38_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt6443; local15++) {
			this.anIntArray353[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "(I)V")
	@Override
	protected final void method5560() {
		this.anInt5114 = 0;
		this.anInt5113 = 0;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5555() {
		this.anInt5114 = Math.abs(this.anInt5114);
		if (this.anInt5114 >= 4096) {
			this.anInt5114 = 4095;
		}
		this.method4311(this.anInt5113++, (byte) (this.anInt5114 >> 4));
		this.anInt5114 = 0;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5114 += this.anIntArray353[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIB)V")
	protected void method4311(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray62[this.anInt5113++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
