import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	private int anInt35;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	public int anInt38;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "J")
	public long aLong3;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	public int anInt46;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
	private boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	public int anInt42 = 0;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
	public int anInt52 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public void method30() {
		this.anInt45 = Class135.anIntArray338[this.anInt35];
		this.anInt39 = (int) Math.sqrt((double) (this.anInt40 * this.anInt40 + this.anInt46 * this.anInt46 + this.anInt47 * this.anInt47));
		if (this.anInt37 == 0) {
			this.anInt37 = 1;
		}
		if (this.anInt50 == 0) {
			this.aLong3 = 2147483647L;
		} else if (this.anInt50 == 1) {
			this.aLong3 = this.anInt39 * 8 / this.anInt37;
			this.aLong3 *= this.aLong3;
		} else if (this.anInt50 == 2) {
			this.aLong3 = this.anInt39 * 8 / this.anInt37;
		}
		if (this.aBoolean3) {
			this.anInt39 *= -1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLclient!lf;)V")
	private void method31(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt35 = arg1.method1386();
		} else if (arg0 == 2) {
			arg1.method1378();
		} else if (arg0 == 3) {
			this.anInt46 = arg1.method1392();
			this.anInt47 = arg1.method1392();
			this.anInt40 = arg1.method1392();
		} else if (arg0 == 4) {
			this.anInt50 = arg1.method1378();
			this.anInt37 = arg1.method1392();
		} else if (arg0 == 6) {
			this.anInt38 = arg1.method1378();
		} else if (arg0 == 8) {
			this.anInt42 = 1;
		} else if (arg0 == 9) {
			this.anInt52 = 1;
		} else if (arg0 == 10) {
			this.aBoolean3 = true;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!lf;Z)V")
	public void method33(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1378();
			if (local9 == 0) {
				return;
			}
			this.method31(local9, arg0);
		}
	}
}
