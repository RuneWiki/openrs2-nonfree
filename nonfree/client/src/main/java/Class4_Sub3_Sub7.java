import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class4_Sub3_Sub7 extends Class4_Sub3 {

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!fd", name = "lb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
	public int anInt1007 = -1;

	@OriginalMember(owner = "client!fd", name = "nb", descriptor = "[I")
	private final int[] anIntArray99 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
	public boolean method554() {
		if (this.anIntArray98 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray98.length; local21++) {
			if (!Static24.aClass10_9.method1778(this.anIntArray98[local21], 0)) {
				local19 = false;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method555() {
		if (this.anIntArray98 == null) {
			return null;
		}
		@Pc(15) Class4_Sub3_Sub1_Sub5[] local15 = new Class4_Sub3_Sub1_Sub5[this.anIntArray98.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray98.length; local17++) {
			local15[local17] = Static89.method1445(Static24.aClass10_9, this.anIntArray98[local17]);
		}
		@Pc(53) Class4_Sub3_Sub1_Sub5 local53;
		if (local15.length == 1) {
			local53 = local15[0];
		} else {
			local53 = new Class4_Sub3_Sub1_Sub5(local15, local15.length);
		}
		@Pc(64) int local64;
		if (this.aShortArray13 != null) {
			for (local64 = 0; local64 < this.aShortArray13.length; local64++) {
				local53.method1433(this.aShortArray13[local64], this.aShortArray12[local64]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local64 = 0; local64 < this.aShortArray14.length; local64++) {
				local53.method1439(this.aShortArray14[local64], this.aShortArray11[local64]);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!tf;B)V")
	public void method556(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method773();
			if (local12 == 0) {
				return;
			}
			this.method561(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method557() {
		@Pc(12) int local12 = 0;
		@Pc(15) Class4_Sub3_Sub1_Sub5[] local15 = new Class4_Sub3_Sub1_Sub5[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray99[local17] != -1) {
				local15[local12++] = Static89.method1445(Static24.aClass10_9, this.anIntArray99[local17]);
			}
		}
		@Pc(47) Class4_Sub3_Sub1_Sub5 local47 = new Class4_Sub3_Sub1_Sub5(local15, local12);
		@Pc(52) int local52;
		if (this.aShortArray13 != null) {
			for (local52 = 0; local52 < this.aShortArray13.length; local52++) {
				local47.method1433(this.aShortArray13[local52], this.aShortArray12[local52]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local52 = 0; local52 < this.aShortArray14.length; local52++) {
				local47.method1439(this.aShortArray14[local52], this.aShortArray11[local52]);
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!tf;II)V")
	private void method561(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1007 = arg0.method773();
			return;
		}
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (arg1 == 2) {
			local13 = arg0.method773();
			this.anIntArray98 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.anIntArray98[local19] = arg0.method816();
			}
		} else if (arg1 == 3) {
			this.aBoolean39 = true;
		} else if (arg1 == 40) {
			local13 = arg0.method773();
			this.aShortArray12 = new short[local13];
			this.aShortArray13 = new short[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.aShortArray13[local19] = (short) arg0.method816();
				this.aShortArray12[local19] = (short) arg0.method816();
			}
		} else if (arg1 == 41) {
			local13 = arg0.method773();
			this.aShortArray14 = new short[local13];
			this.aShortArray11 = new short[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.aShortArray14[local19] = (short) arg0.method816();
				this.aShortArray11[local19] = (short) arg0.method816();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray99[arg1 - 60] = arg0.method816();
		}
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)Z")
	public boolean method563() {
		@Pc(7) boolean local7 = true;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray99[local17] != -1 && !Static24.aClass10_9.method1778(this.anIntArray99[local17], 0)) {
				local7 = false;
			}
		}
		return local7;
	}
}
