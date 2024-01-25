import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class3_Sub7_Sub8 extends Class3_Sub7 {

	@OriginalMember(owner = "client!gg", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!gg", name = "G", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "Lclient!rw;")
	public Class294 aClass294_1;

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "Z")
	public boolean aBoolean265 = true;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public void method3045() {
		if (this.anIntArray153 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray153.length; local16++) {
				this.anIntArray153[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ie;Z)V")
	public void method3046(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6814();
			if (local17 == 0) {
				return;
			}
			this.method3053(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lclient!ui;")
	public Class329 method3047(@OriginalArg(0) int arg0) {
		return this.anIntArray154 == null || arg0 < 0 || arg0 > this.anIntArray154.length ? null : Static293.method4411(this.anIntArray154[arg0]);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I")
	public int method3049() {
		return this.anIntArray154 == null ? 0 : this.anIntArray154.length;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method3050() {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.aStringArray13 == null) {
			return "";
		}
		local15.append(this.aStringArray13[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray13.length; local29++) {
			local15.append("...");
			local15.append(this.aStringArray13[local29]);
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ie;I)Ljava/lang/String;")
	public String method3051(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.anIntArray154 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray154.length; local23++) {
				local18.append(this.aStringArray13[local23]);
				local18.append(this.aClass294_1.method6452(arg0.method6805(Static293.method4411(this.anIntArray154[local23]).anInt9452), this.anIntArrayArray31[local23], this.method3047(local23)));
			}
		}
		local18.append(this.aStringArray13[this.aStringArray13.length - 1]);
		return local18.toString();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ie;IB)V")
	private void method3053(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray13 = Static317.method4706('<', arg0.method6786());
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg1 == 2) {
			local26 = arg0.method6814();
			this.anIntArray153 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray153[local36] = arg0.method6811();
			}
		} else if (arg1 == 3) {
			local26 = arg0.method6814();
			this.anIntArrayArray31 = new int[local26][];
			this.anIntArray154 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				@Pc(42) int local42 = arg0.method6811();
				@Pc(46) Class329 local46 = Static293.method4411(local42);
				if (local46 != null) {
					this.anIntArray154[local36] = local42;
					this.anIntArrayArray31[local36] = new int[local46.anInt9457];
					for (@Pc(62) int local62 = 0; local62 < local46.anInt9457; local62++) {
						this.anIntArrayArray31[local36][local62] = arg0.method6811();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean265 = false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ie;Z[I)V")
	public void method3055(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray154 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray154.length && local11 < arg1.length; local11++) {
			@Pc(19) int local19 = this.method3047(local11).anInt9455;
			if (local19 > 0) {
				arg0.method6817((long) arg1[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(III)I")
	public int method3056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray154 == null || arg0 < 0 || this.anIntArray154.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray31[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray31[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray31[arg0][arg1];
		}
	}
}
