import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "[I")
	private int[] anIntArray91 = new int[this.anInt3992];

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt3992; local15++) {
			this.anIntArray91[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	@Override
	protected final void method3197() {
		this.anInt995 = 0;
		this.anInt991 = 0;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IB)V")
	protected void method816(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray14[this.anInt991++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	@Override
	protected final void method3201() {
		this.anInt995 = Math.abs(this.anInt995);
		if (this.anInt995 >= 4096) {
			this.anInt995 = 4095;
		}
		this.method816(this.anInt991++, (byte) (this.anInt995 >> 4));
		this.anInt995 = 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method3194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt995 += this.anIntArray91[arg1] * arg0 >> 12;
	}
}
