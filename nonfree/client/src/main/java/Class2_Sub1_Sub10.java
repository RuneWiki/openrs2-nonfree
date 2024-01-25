import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!md", name = "D", descriptor = "[I")
	public int[] anIntArray488;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray23;

	@OriginalMember(owner = "client!md", name = "V", descriptor = "Z")
	public boolean aBoolean294 = true;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method3614(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4240();
			if (local16 == 0) {
				return;
			}
			this.method3621(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
	public void method3615() {
		if (this.anIntArray488 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray488.length; local13++) {
				this.anIntArray488[local13] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)I")
	public int method3617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray489 == null || arg1 < 0 || this.anIntArray489.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray26[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray26[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray26[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(I)I")
	public int method3618() {
		return this.anIntArray489 == null ? 0 : this.anIntArray489.length;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!lk;)Ljava/lang/String;")
	public String method3619(@OriginalArg(1) Class2_Sub13 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray489 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray489.length; local15++) {
				local10.append(this.aStringArray23[local15]);
				local10.append(Static311.method4817(this.anIntArrayArray26[local15], arg0.method4194(Static38.anIntArray126[this.anIntArray489[local15]]), this.anIntArray489[local15]));
			}
		}
		local10.append(this.aStringArray23[this.aStringArray23.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!lk;I)V")
	private void method3621(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray23 = Static29.method705(arg0.method4201(), '<');
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg1 == 2) {
			local32 = arg0.method4240();
			this.anIntArray488 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray488[local42] = arg0.method4245();
			}
		} else if (arg1 == 3) {
			local32 = arg0.method4240();
			this.anIntArray489 = new int[local32];
			this.anIntArrayArray26 = new int[local32][];
			for (local42 = 0; local42 < local32; local42++) {
				@Pc(48) int local48 = arg0.method4245();
				this.anIntArray489[local42] = local48;
				this.anIntArrayArray26[local42] = new int[Static30.anIntArray106[local48]];
				for (@Pc(63) int local63 = 0; local63 < Static30.anIntArray106[local48]; local63++) {
					this.anIntArrayArray26[local42][local63] = arg0.method4245();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean294 = false;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!lk;[I)V")
	public void method3622(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray489 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray489.length; local11++) {
			if (local11 >= arg1.length) {
				return;
			}
			@Pc(20) int local20 = Static184.anIntArray760[this.method3625(local11)];
			if (local20 > 0) {
				arg0.method4200(local20, (long) arg1[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I")
	public int method3625(@OriginalArg(0) int arg0) {
		return this.anIntArray489 == null || arg0 < 0 || arg0 > this.anIntArray489.length ? -1 : this.anIntArray489[arg0];
	}

	@OriginalMember(owner = "client!md", name = "j", descriptor = "(I)Ljava/lang/String;")
	public String method3626() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray23 == null) {
			return "";
		}
		local10.append(this.aStringArray23[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray23.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray23[local29]);
		}
		return local10.toString();
	}
}
