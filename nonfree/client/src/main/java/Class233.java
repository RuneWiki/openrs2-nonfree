import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class233 {

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
	public int anInt6332;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!rq;")
	public Class218 aClass218_7;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Z")
	public boolean aBoolean452 = false;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	public int anInt6330 = -1;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public int anInt6333 = 127;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	public int anInt6328 = -1;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	public int anInt6336 = 8;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public int anInt6331 = 0;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public int anInt6338 = 16;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public int anInt6339 = 1190717;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
	public int anInt6337 = -1;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
	public boolean aBoolean453 = true;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Z")
	public boolean aBoolean454 = true;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
	public int anInt6341 = 128;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!sv;I)V")
	public void method4935(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3580();
			if (local11 == 0) {
				return;
			}
			this.method4936(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!sv;I)V")
	private void method4936(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6331 = Static297.method3935(arg0.method3563());
		} else if (arg1 == 2) {
			this.anInt6328 = arg0.method3580();
		} else if (arg1 == 3) {
			this.anInt6328 = arg0.method3555();
			if (this.anInt6328 == 65535) {
				this.anInt6328 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean453 = false;
		} else if (arg1 == 7) {
			this.anInt6330 = Static297.method3935(arg0.method3563());
		} else if (arg1 == 8) {
			this.aClass218_7.anInt5994 = this.anInt6332;
		} else if (arg1 == 9) {
			this.anInt6341 = arg0.method3555() << 0;
		} else if (arg1 == 10) {
			this.aBoolean454 = false;
		} else if (arg1 == 11) {
			this.anInt6336 = arg0.method3580();
		} else if (arg1 == 12) {
			this.aBoolean452 = true;
		} else if (arg1 == 13) {
			this.anInt6339 = arg0.method3563();
		} else if (arg1 == 14) {
			this.anInt6338 = arg0.method3580() << 0;
		} else if (arg1 == 15) {
			this.anInt6337 = arg0.method3555();
			if (this.anInt6337 == 65535) {
				this.anInt6337 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt6333 = arg0.method3580();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public void method4937() {
		if (this.anInt6337 == -1) {
			this.anInt6337 = this.anInt6328;
		}
		this.anInt6336 = this.anInt6336 << 8 | this.anInt6332;
	}
}
