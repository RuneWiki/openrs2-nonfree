import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class218 {

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "[I")
	public int[] anIntArray341;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "[I")
	public int[] anIntArray342;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
	public int anInt5929 = -1;

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
	public int anInt5930 = -1;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class218(@OriginalArg(0) Class221 arg0) {
		@Pc(12) byte[] local12 = arg0.method5077(6);
		this.method5049(new Class3_Sub28(local12));
		if (this.anIntArray341 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "()V")
	private Class218() {
		this.anIntArray341 = new int[0];
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BLclient!rba;)V")
	private void method5049(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5322(-8);
			if (local7 == 0) {
				return;
			}
			@Pc(71) int local71;
			if (local7 == 1) {
				local71 = arg0.method5322(-71);
				this.anIntArray341 = new int[local71];
				for (@Pc(143) int local143 = 0; local143 < this.anIntArray341.length; local143++) {
					this.anIntArray341[local143] = arg0.method5322(-90);
				}
			} else if (local7 == 3) {
				this.anInt5929 = arg0.method5322(-115);
			} else if (local7 == 4) {
				this.anInt5930 = arg0.method5322(-92);
			} else if (local7 == 5) {
				this.anIntArray343 = new int[arg0.method5322(-20)];
				for (local71 = 0; local71 < this.anIntArray343.length; local71++) {
					this.anIntArray343[local71] = arg0.method5322(-86);
				}
			} else if (local7 == 6) {
				this.anIntArray342 = new int[arg0.method5322(-13)];
				for (local71 = 0; local71 < this.anIntArray342.length; local71++) {
					this.anIntArray342[local71] = arg0.method5322(-15);
				}
			}
		}
	}
}
