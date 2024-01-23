import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class8_Sub1_Sub12 extends Class8_Sub1 {

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!pi", name = "L", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray62;

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "Z")
	public boolean aBoolean336 = true;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!aj;Z)V")
	public void method3128(@OriginalArg(0) Class8_Sub2 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2334();
			if (local12 == 0) {
				return;
			}
			this.method3133(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method3129() {
		@Pc(17) StringBuffer local17 = new StringBuffer(80);
		if (this.aStringArray62 == null) {
			return "";
		}
		local17.append(this.aStringArray62[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray62.length; local31++) {
			local17.append("...");
			local17.append(this.aStringArray62[local31]);
		}
		return local17.toString();
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Lclient!aj;I)Ljava/lang/String;")
	public String method3130(@OriginalArg(0) Class8_Sub2 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray315 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray315.length; local16++) {
				local10.append(this.aStringArray62[local16]);
				local10.append(Static228.method3521(this.anIntArrayArray23[local16], this.anIntArray315[local16], arg0.method2341(Static187.anIntArray281[this.anIntArray315[local16]])));
			}
		}
		local10.append(this.aStringArray62[this.aStringArray62.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
	public int method3131() {
		return this.anIntArray315 == null ? 0 : this.anIntArray315.length;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
	public int method3132(@OriginalArg(1) int arg0) {
		return this.anIntArray315 == null || arg0 < 0 || arg0 > this.anIntArray315.length ? -1 : this.anIntArray315[arg0];
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!aj;II)V")
	private void method3133(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray62 = Static225.method3496('<', arg0.method2372());
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method2334();
			this.anIntArray314 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray314[local24] = arg0.method2375();
			}
		} else if (arg1 == 3) {
			local18 = arg0.method2334();
			this.anIntArrayArray23 = new int[local18][];
			this.anIntArray315 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(80) int local80 = arg0.method2375();
				this.anIntArray315[local24] = local80;
				this.anIntArrayArray23[local24] = new int[Static250.anIntArray373[local80]];
				for (@Pc(95) int local95 = 0; local95 < Static250.anIntArray373[local80]; local95++) {
					this.anIntArrayArray23[local24][local95] = arg0.method2375();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean336 = false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)I")
	public int method3136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray315 == null || arg0 < 0 || arg0 > this.anIntArray315.length) {
			return -1;
		} else if (this.anIntArrayArray23[arg0] == null || arg1 < 0 || this.anIntArrayArray23[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray23[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([IZLclient!aj;)V")
	public void method3137(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (this.anIntArray315 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray315.length && local19 < arg0.length; local19++) {
			@Pc(39) int local39 = Static20.anIntArray40[this.method3132(local19)];
			if (local39 > 0) {
				arg1.method2359(local39, (long) arg0[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V")
	public void method3138() {
		if (this.anIntArray314 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray314.length; local11++) {
				this.anIntArray314[local11] |= 0x8000;
			}
		}
	}
}
