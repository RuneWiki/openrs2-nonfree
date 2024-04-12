import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!o;")
	public static Class40 aClass40_157 = Static12.method257("No response from server");

	@OriginalMember(owner = "client!ec", name = "db", descriptor = "[I")
	public static int[] anIntArray103 = new int[4000];

	@OriginalMember(owner = "client!ec", name = "ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_160 = Static12.method257("M");

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
	public static int anInt583 = 0;

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "Lclient!o;")
	public static Class40 aClass40_159 = Static12.method257("Enter object name");

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_158 = Static12.method257("Drop @lre@");

	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[104][104];

	@OriginalMember(owner = "client!ec", name = "ib", descriptor = "Lclient!o;")
	public static Class40 aClass40_161 = Static12.method257("Take");

	@OriginalMember(owner = "client!ec", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_163 = aClass40_161;

	@OriginalMember(owner = "client!ec", name = "qb", descriptor = "Lclient!o;")
	public static Class40 aClass40_164 = Static12.method257("::");

	@OriginalMember(owner = "client!ec", name = "kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_162 = Static12.method257("No reply from loginserver)3");

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!ec", name = "ob", descriptor = "I")
	public int anInt591;

	@OriginalMember(owner = "client!ec", name = "tb", descriptor = "I")
	public int anInt594;

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
	public int anInt582 = -1;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
	public int anInt581 = 0;

	@OriginalMember(owner = "client!ec", name = "sb", descriptor = "I")
	public int anInt593 = -1;

	@OriginalMember(owner = "client!ec", name = "rb", descriptor = "Z")
	public boolean aBoolean45 = true;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILclient!eb;I)V", line = 29)
	private void method475(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt581 = arg1.method1718();
		} else if (arg0 == 2) {
			this.anInt582 = arg1.method1708();
		} else if (arg0 == 5) {
			this.aBoolean45 = false;
		} else if (arg0 == 7) {
			this.anInt593 = arg1.method1718();
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V", line = 66)
	public void method476() {
		if (this.anInt593 != -1) {
			this.method479(this.anInt593);
			this.anInt591 = this.anInt585;
			this.anInt578 = this.anInt594;
			this.anInt586 = this.anInt588;
		}
		this.method479(this.anInt581);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!eb;BI)V", line = 212)
	public void method478(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method1708();
			if (local14 == 0) {
				return;
			}
			this.method475(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V", line = 234)
	private void method479(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local31;
		if (local10 < local31) {
			local40 = local10;
		}
		if (local40 > local38) {
			local40 = local38;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = local31;
		if (local31 < local10) {
			local56 = local10;
		}
		if (local56 < local38) {
			local56 = local38;
		}
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local56 + local40) / 2.0D;
		this.anInt594 = (int) (local76 * 256.0D);
		if (this.anInt594 < 0) {
			this.anInt594 = 0;
		} else if (this.anInt594 > 255) {
			this.anInt594 = 255;
		}
		if (local40 != local56) {
			if (local76 < 0.5D) {
				local70 = (local56 - local40) / (local56 + local40);
			}
			if (local76 >= 0.5D) {
				local70 = (local56 - local40) / (2.0D - local56 - local40);
			}
			if (local31 == local56) {
				local54 = (local10 - local38) / (local56 - local40);
			} else if (local56 == local10) {
				local54 = (local38 - local31) / (local56 - local40) + 2.0D;
			} else if (local56 == local38) {
				local54 = (local31 - local10) / (local56 - local40) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt585 = (int) (local70 * 256.0D);
		this.anInt588 = (int) (local54 * 256.0D);
		if (this.anInt585 < 0) {
			this.anInt585 = 0;
		} else if (this.anInt585 > 255) {
			this.anInt585 = 255;
			return;
		}
	}
}
