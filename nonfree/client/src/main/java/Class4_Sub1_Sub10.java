import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class4_Sub1_Sub10 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!mq", name = "J", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!mq", name = "M", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray29;

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "Lclient!sp;")
	public Class221 aClass221_1;

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "Z")
	public boolean aBoolean336 = true;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!tl;)V")
	public void method3457(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4864();
			if (local9 == 0) {
				return;
			}
			this.method3458(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!tl;II)V")
	private void method3458(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray29 = Static220.method4275('<', arg0.method4867());
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg1 == 2) {
			local28 = arg0.method4864();
			this.anIntArray381 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray381[local38] = arg0.method4877();
			}
		} else if (arg1 == 3) {
			local28 = arg0.method4864();
			this.anIntArrayArray40 = new int[local28][];
			this.anIntArray380 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(44) int local44 = arg0.method4877();
				@Pc(48) Class263 local48 = Static274.method3703(local44);
				if (local48 != null) {
					this.anIntArray380[local38] = local44;
					this.anIntArrayArray40[local38] = new int[local48.anInt7388];
					for (@Pc(64) int local64 = 0; local64 < local48.anInt7388; local64++) {
						this.anIntArrayArray40[local38][local64] = arg0.method4877();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean336 = false;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)I")
	public int method3459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray380 == null || arg1 < 0 || arg1 > this.anIntArray380.length) {
			return -1;
		} else if (this.anIntArrayArray40[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray40[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray40[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
	public void method3460() {
		if (this.anIntArray381 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray381.length; local17++) {
				this.anIntArray381[local17] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)I")
	public int method3461() {
		return this.anIntArray380 == null ? 0 : this.anIntArray380.length;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lclient!wi;")
	public Class263 method3462(@OriginalArg(0) int arg0) {
		return this.anIntArray380 == null || arg0 < 0 || this.anIntArray380.length < arg0 ? null : Static274.method3703(this.anIntArray380[arg0]);
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method3463() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray29 == null) {
			return "";
		}
		local10.append(this.aStringArray29[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray29.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray29[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLclient!tl;)Ljava/lang/String;")
	public String method3464(@OriginalArg(1) Class4_Sub30 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray380 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray380.length; local20++) {
				local15.append(this.aStringArray29[local20]);
				local15.append(this.aClass221_1.method5055(arg0.method4858(Static274.method3703(this.anIntArray380[local20]).anInt7389), this.method3462(local20), this.anIntArrayArray40[local20]));
			}
		}
		local15.append(this.aStringArray29[this.aStringArray29.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!tl;[II)V")
	public void method3466(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray380 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray380.length; local18++) {
			if (arg1.length <= local18) {
				return;
			}
			@Pc(26) int local26 = this.method3462(local18).anInt7387;
			if (local26 > 0) {
				arg0.method4855(local26, (long) arg1[local18]);
			}
		}
	}
}
