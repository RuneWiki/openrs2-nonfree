import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class228 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
	public int anInt6210;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
	public int anInt6212;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	public int anInt6213;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	public int anInt6214;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public int anInt6215;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
	public int anInt6216;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public int anInt6217;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	private int anInt6220;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public int anInt6222;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
	public int anInt6228;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "J")
	public long aLong192;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	public int anInt6223 = 0;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public int anInt6219 = 0;

	static {
		new Class134("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!sv;)V")
	public void method4850(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3580();
			if (local9 == 0) {
				return;
			}
			this.method4854(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	public void method4853() {
		this.anInt6210 = Class155.anIntArray341[this.anInt6220 << 3];
		this.anInt6212 = (int) Math.sqrt((double) (this.anInt6216 * this.anInt6216 + this.anInt6214 * this.anInt6214 + this.anInt6217 * this.anInt6217));
		if (this.anInt6213 == 0) {
			this.anInt6213 = 1;
		}
		if (this.anInt6228 == 0) {
			this.aLong192 = 2147483647L;
		} else if (this.anInt6228 == 1) {
			this.aLong192 = this.anInt6212 * 8 / this.anInt6213;
			this.aLong192 *= this.aLong192;
		} else if (this.anInt6228 == 2) {
			this.aLong192 = this.anInt6212 * 8 / this.anInt6213;
		}
		if (this.aBoolean447) {
			this.anInt6212 *= -1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!sv;II)V")
	private void method4854(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6220 = arg0.method3555();
		} else if (arg1 == 2) {
			arg0.method3580();
		} else if (arg1 == 3) {
			this.anInt6214 = arg0.method3574();
			this.anInt6217 = arg0.method3574();
			this.anInt6216 = arg0.method3574();
		} else if (arg1 == 4) {
			this.anInt6228 = arg0.method3580();
			this.anInt6213 = arg0.method3574();
		} else if (arg1 == 6) {
			this.anInt6215 = arg0.method3580();
		} else if (arg1 == 8) {
			this.anInt6219 = 1;
		} else if (arg1 == 9) {
			this.anInt6223 = 1;
		} else if (arg1 == 10) {
			this.aBoolean447 = true;
			return;
		}
	}
}
