import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt1378;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	private int anInt1382;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	private int anInt1385;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	private int anInt1390;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	private final int anInt1389;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "I")
	private final int anInt1388;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private final int anInt1380;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	private int anInt1386;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1389 = (int) (arg7 * 4096.0F);
		this.anInt1388 = (int) (arg6 * 4096.0F);
		this.anInt1386 = this.anInt1380 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBI)V")
	protected void method1164(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray24[arg1] = arg0;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	@Override
	protected final void method4060() {
		this.anInt1390 = 0;
		this.anInt1382 = 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	@Override
	protected final void method4058() {
		this.anInt1390 >>= 0x4;
		this.anInt1386 = this.anInt1380;
		if (this.anInt1390 < 0) {
			this.anInt1390 = 0;
		} else if (this.anInt1390 > 255) {
			this.anInt1390 = 255;
		}
		this.method1164((byte) this.anInt1390, this.anInt1382++);
		this.anInt1390 = 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1385 = this.anInt1388 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt1378 = 4096;
			this.anInt1385 = this.anInt1385 * this.anInt1385 >> 12;
			this.anInt1390 = this.anInt1385;
			return;
		}
		this.anInt1378 = this.anInt1385 * this.anInt1389 >> 12;
		this.anInt1385 = this.anInt1388 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt1378 < 0) {
			this.anInt1378 = 0;
		} else if (this.anInt1378 > 4096) {
			this.anInt1378 = 4096;
		}
		this.anInt1385 = this.anInt1385 * this.anInt1385 >> 12;
		this.anInt1385 = this.anInt1378 * this.anInt1385 >> 12;
		this.anInt1390 += this.anInt1385 * this.anInt1386 >> 12;
		this.anInt1386 = this.anInt1386 * this.anInt1380 >> 12;
	}
}
