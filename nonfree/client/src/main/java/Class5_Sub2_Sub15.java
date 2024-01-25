import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class5_Sub2_Sub15 extends Class5_Sub2 {

	@OriginalMember(owner = "client!rt", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!rt", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!rt", name = "I", descriptor = "Lclient!be;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!rt", name = "J", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!rt", name = "Q", descriptor = "[I")
	private int[] anIntArray423;

	@OriginalMember(owner = "client!rt", name = "O", descriptor = "Z")
	public boolean aBoolean397 = true;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZLclient!fh;)V")
	private void method4694(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aStringArray41 = Static73.method1083('<', arg1.method5549());
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method5539();
			this.anIntArray421 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray421[local27] = arg1.method5598();
			}
		} else if (arg0 == 3) {
			local21 = arg1.method5539();
			this.anIntArray423 = new int[local21];
			this.anIntArrayArray53 = new int[local21][];
			for (local27 = 0; local27 < local21; local27++) {
				@Pc(69) int local69 = arg1.method5598();
				@Pc(73) Class220 local73 = Static57.method936(local69);
				if (local73 != null) {
					this.anIntArray423[local27] = local69;
					this.anIntArrayArray53[local27] = new int[local73.anInt5966];
					for (@Pc(89) int local89 = 0; local89 < local73.anInt5966; local89++) {
						this.anIntArrayArray53[local27][local89] = arg1.method5598();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean397 = false;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public void method4696() {
		if (this.anIntArray421 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray421.length; local6++) {
				this.anIntArray421[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!fh;[I)V")
	public void method4697(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray423 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray423.length; local18++) {
			if (local18 >= arg1.length) {
				return;
			}
			@Pc(26) int local26 = this.method4701(local18).anInt5967;
			if (local26 > 0) {
				arg0.method5569((long) arg1[local18], local26);
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!fh;)V")
	public void method4698(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5539();
			if (local13 == 0) {
				return;
			}
			this.method4694(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!fh;)Ljava/lang/String;")
	public String method4699(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray423 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray423.length; local20++) {
				local15.append(this.aStringArray41[local20]);
				local15.append(this.aClass20_1.method461(this.anIntArrayArray53[local20], arg0.method5590(Static57.method936(this.anIntArray423[local20]).anInt5968), this.method4701(local20)));
			}
		}
		local15.append(this.aStringArray41[this.aStringArray41.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)I")
	public int method4700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray423 == null || arg0 < 0 || this.anIntArray423.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray53[arg0] == null || arg1 < 0 || this.anIntArrayArray53[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray53[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(BI)Lclient!sc;")
	public Class220 method4701(@OriginalArg(1) int arg0) {
		return this.anIntArray423 == null || arg0 < 0 || arg0 > this.anIntArray423.length ? null : Static57.method936(this.anIntArray423[arg0]);
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method4702() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray41 == null) {
			return "";
		}
		local10.append(this.aStringArray41[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray41.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray41[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)I")
	public int method4704() {
		return this.anIntArray423 == null ? 0 : this.anIntArray423.length;
	}
}
