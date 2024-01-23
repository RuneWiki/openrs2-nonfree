import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class72 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public int anInt2003;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	public int anInt2009;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Z")
	public boolean aBoolean158 = true;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public int anInt2004 = -1;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	private int anInt2000 = 0;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	public int anInt2008 = 128;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V")
	private void method1765(@OriginalArg(0) int arg0) {
		@Pc(18) double local18 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(34) double local34 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local34;
		@Pc(38) double local38 = 0.0D;
		@Pc(40) double local40 = 0.0D;
		if (local18 < local34) {
			local36 = local18;
		}
		if (local25 < local36) {
			local36 = local25;
		}
		@Pc(54) double local54 = local34;
		if (local18 > local34) {
			local54 = local18;
		}
		if (local25 > local54) {
			local54 = local25;
		}
		@Pc(73) double local73 = (local54 + local36) / 2.0D;
		if (local54 != local36) {
			if (local73 < 0.5D) {
				local38 = (local54 - local36) / (local36 + local54);
			}
			if (local34 == local54) {
				local40 = (local18 - local25) / (local54 - local36);
			} else if (local54 == local18) {
				local40 = (local25 - local34) / (local54 - local36) + 2.0D;
			} else if (local25 == local54) {
				local40 = (local34 - local18) / (-local36 + local54) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local38 = (local54 - local36) / ((2.0D - local54) - local36);
			}
		}
		this.anInt2009 = (int) (local73 * 256.0D);
		local40 /= 6.0D;
		if (this.anInt2009 < 0) {
			this.anInt2009 = 0;
		} else if (this.anInt2009 > 255) {
			this.anInt2009 = 255;
		}
		this.anInt2002 = (int) (local38 * 256.0D);
		if (this.anInt2002 < 0) {
			this.anInt2002 = 0;
		} else if (this.anInt2002 > 255) {
			this.anInt2002 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt2001 = (int) ((1.0D - local73) * 512.0D * local38);
		} else {
			this.anInt2001 = (int) (local73 * 512.0D * local38);
		}
		if (this.anInt2001 < 1) {
			this.anInt2001 = 1;
		}
		this.anInt2003 = (int) (local40 * (double) this.anInt2001);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILclient!ug;)V")
	public void method1767(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method3915();
			if (local9 == 0) {
				return;
			}
			this.method1769(arg1, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ug;III)V")
	private void method1769(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2000 = arg0.method3899();
			this.method1765(this.anInt2000);
		} else if (arg2 == 2) {
			this.anInt2004 = arg0.method3948();
			if (this.anInt2004 == 65535) {
				this.anInt2004 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt2008 = arg0.method3948();
		} else if (arg2 == 4) {
			this.aBoolean158 = false;
		}
	}
}
