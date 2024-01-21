import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub3_Sub10 extends Class3_Sub3 {

	@OriginalMember(owner = "client!od", name = "T", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
	public int anInt2123;

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
	public int anInt2128;

	@OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
	public int anInt2130;

	@OriginalMember(owner = "client!od", name = "wb", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!od", name = "W", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
	public int anInt2119 = 0;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
	public int anInt2121 = -1;

	@OriginalMember(owner = "client!od", name = "ob", descriptor = "I")
	public int anInt2129 = -1;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBLclient!wd;I)V")
	private void method1500(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2119 = arg1.method1424();
		} else if (arg0 == 2) {
			this.anInt2129 = arg1.method1421();
		} else if (arg0 == 5) {
			this.aBoolean99 = false;
		} else if (arg0 == 7) {
			this.anInt2121 = arg1.method1424();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	private void method1501(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local14;
		if (local23 < local14) {
			local37 = local23;
		}
		if (local30 < local37) {
			local37 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local23 > local14) {
			local51 = local23;
		}
		if (local30 > local51) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local37 + local51) / 2.0D;
		if (local37 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local37) / (local37 + local51);
			}
			if (local51 == local14) {
				local65 = (local23 - local30) / (local51 - local37);
			} else if (local23 == local51) {
				local65 = (local30 - local14) / (-local37 + local51) + 2.0D;
			} else if (local51 == local30) {
				local65 = (local14 - local23) / (-local37 + local51) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local37) / (2.0D - local51 - local37);
			}
		}
		this.anInt2130 = (int) (local67 * 256.0D);
		if (this.anInt2130 < 0) {
			this.anInt2130 = 0;
		} else if (this.anInt2130 > 255) {
			this.anInt2130 = 255;
		}
		this.anInt2123 = (int) (local73 * 256.0D);
		if (this.anInt2123 < 0) {
			this.anInt2123 = 0;
		} else if (this.anInt2123 > 255) {
			this.anInt2123 = 255;
		}
		local65 /= 6.0D;
		this.anInt2115 = (int) (local65 * 256.0D);
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V")
	public void method1504() {
		if (this.anInt2121 != -1) {
			this.method1501(this.anInt2121);
			this.anInt2128 = this.anInt2123;
			this.anInt2117 = this.anInt2115;
			this.anInt2131 = this.anInt2130;
		}
		this.method1501(this.anInt2119);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!wd;I)V")
	public void method1505(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method1421();
			if (local14 == 0) {
				return;
			}
			this.method1500(local14, arg0, arg1);
		}
	}
}
