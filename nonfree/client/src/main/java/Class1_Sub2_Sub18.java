import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tk", name = "H", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28;

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "[I")
	private int[] anIntArray608;

	@OriginalMember(owner = "client!tk", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!tk", name = "V", descriptor = "[I")
	public int[] anIntArray609;

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method3996() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray28 == null) {
			return "";
		}
		local10.append(this.aStringArray28[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray28.length; local32++) {
			local10.append("...");
			local10.append(this.aStringArray28[local32]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!jj;)Ljava/lang/String;")
	public String method3997(@OriginalArg(1) Class1_Sub18 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray608 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray608.length; local22++) {
				local16.append(this.aStringArray28[local22]);
				local16.append(Static187.method2826(this.anIntArrayArray43[local22], this.anIntArray608[local22], arg0.method3078(Static267.anIntArray623[this.anIntArray608[local22]])));
			}
		}
		local16.append(this.aStringArray28[this.aStringArray28.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([ILclient!jj;B)V")
	public void method3998(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		if (this.anIntArray608 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; this.anIntArray608.length > local18 && local18 < arg0.length; local18++) {
			@Pc(42) int local42 = Static113.anIntArray274[this.method4001(local18)];
			if (local42 > 0) {
				arg1.method3113((long) arg0[local18], local42);
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)I")
	public int method3999() {
		return this.anIntArray608 == null ? 0 : this.anIntArray608.length;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
	public int method4001(@OriginalArg(0) int arg0) {
		return this.anIntArray608 == null || arg0 < 0 || arg0 > this.anIntArray608.length ? -1 : this.anIntArray608[arg0];
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)V")
	public void method4002() {
		if (this.anIntArray609 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray609.length; local8++) {
				this.anIntArray609[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(ILclient!jj;)V")
	public void method4003(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3122();
			if (local5 == 0) {
				return;
			}
			this.method4006(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBI)I")
	public int method4005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray608 == null || arg0 < 0 || this.anIntArray608.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray43[arg0] == null || arg1 < 0 || this.anIntArrayArray43[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray43[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!jj;BI)V")
	private void method4006(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray28 = Static80.method1358(arg0.method3101(), '<');
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg1 == 2) {
			local26 = arg0.method3122();
			this.anIntArray609 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray609[local36] = arg0.method3107();
			}
		} else if (arg1 == 3) {
			local26 = arg0.method3122();
			this.anIntArray608 = new int[local26];
			this.anIntArrayArray43 = new int[local26][];
			for (local36 = 0; local36 < local26; local36++) {
				@Pc(45) int local45 = arg0.method3107();
				this.anIntArray608[local36] = local45;
				this.anIntArrayArray43[local36] = new int[Static137.anIntArray452[local45]];
				for (@Pc(60) int local60 = 0; local60 < Static137.anIntArray452[local45]; local60++) {
					this.anIntArrayArray43[local36][local60] = arg0.method3107();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean399 = false;
		}
	}
}
