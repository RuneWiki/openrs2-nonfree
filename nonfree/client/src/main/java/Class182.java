import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class182 {

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "Z")
	public boolean aBoolean451 = true;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public int anInt5910 = 0;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "Z")
	public boolean aBoolean452 = true;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
	public int anInt5920 = 1190717;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
	public int anInt5915 = 16;

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
	public int anInt5918 = -1;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
	public int anInt5921 = 128;

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
	public int anInt5922 = -1;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
	public int anInt5919 = 8;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLclient!jj;)V")
	public void method4555(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method3122();
			if (local14 == 0) {
				return;
			}
			this.method4556(arg0, arg1, local14);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!jj;II)V")
	private void method4556(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5910 = Static81.method1389(arg1.method3109());
		} else if (arg2 == 2) {
			this.anInt5922 = arg1.method3122();
		} else if (arg2 == 3) {
			this.anInt5922 = arg1.method3107();
			if (this.anInt5922 == 65535) {
				this.anInt5922 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean452 = false;
		} else if (arg2 == 7) {
			this.anInt5918 = Static81.method1389(arg1.method3109());
		} else if (arg2 == 8) {
			Static95.anInt1822 = arg0;
		} else if (arg2 == 9) {
			this.anInt5921 = arg1.method3107();
		} else if (arg2 == 10) {
			this.aBoolean451 = false;
		} else if (arg2 == 11) {
			this.anInt5919 = arg1.method3122();
		} else if (arg2 == 12) {
			this.aBoolean453 = true;
		} else if (arg2 == 13) {
			this.anInt5920 = arg1.method3109();
		} else if (arg2 == 14) {
			this.anInt5915 = arg1.method3122();
		}
	}
}
