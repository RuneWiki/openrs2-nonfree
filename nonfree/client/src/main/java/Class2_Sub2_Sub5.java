import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!df", name = "qb", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!df", name = "tb", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!df", name = "wb", descriptor = "I")
	public int anInt646;

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
	private int anInt640 = 0;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public void method479() {
		this.method482(this.anInt640);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ic;IZI)V")
	private void method480(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt640 = arg0.method1489();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!ic;I)V")
	public void method481(@OriginalArg(1) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method1514();
			if (local17 == 0) {
				return;
			}
			this.method480(arg0, arg1, local17);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
	private void method482(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local35;
		if (local35 > local10) {
			local37 = local10;
		}
		@Pc(45) double local45 = local35;
		@Pc(47) double local47 = 0.0D;
		if (local37 > local17) {
			local37 = local17;
		}
		@Pc(55) double local55 = 0.0D;
		if (local10 > local35) {
			local45 = local10;
		}
		if (local45 < local17) {
			local45 = local17;
		}
		@Pc(73) double local73 = (local37 + local45) / 2.0D;
		this.anInt635 = (int) (local73 * 256.0D);
		if (local37 != local45) {
			if (local73 < 0.5D) {
				local47 = (local45 - local37) / (local45 + local37);
			}
			if (local35 == local45) {
				local55 = (local10 - local17) / (local45 - local37);
			} else if (local10 == local45) {
				local55 = (local17 - local35) / (local45 - local37) + 2.0D;
			} else if (local45 == local17) {
				local55 = (local35 - local10) / (-local37 + local45) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local47 = (local45 - local37) / (2.0D - local37 - local45);
			}
		}
		this.anInt646 = (int) (local47 * 256.0D);
		if (this.anInt635 < 0) {
			this.anInt635 = 0;
		} else if (this.anInt635 > 255) {
			this.anInt635 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt643 = (int) ((1.0D - local73) * local47 * 512.0D);
		} else {
			this.anInt643 = (int) (local73 * 512.0D * local47);
		}
		if (this.anInt646 < 0) {
			this.anInt646 = 0;
		} else if (this.anInt646 > 255) {
			this.anInt646 = 255;
		}
		local55 /= 6.0D;
		if (this.anInt643 < 1) {
			this.anInt643 = 1;
		}
		this.anInt644 = (int) (local55 * (double) this.anInt643);
	}
}
