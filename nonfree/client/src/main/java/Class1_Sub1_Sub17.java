import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qaa", name = "t", descriptor = "[I")
	private int[] anIntArray501;

	@OriginalMember(owner = "client!qaa", name = "u", descriptor = "Lclient!gp;")
	public Class109 aClass109_2;

	@OriginalMember(owner = "client!qaa", name = "y", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!qaa", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!qaa", name = "E", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!qaa", name = "B", descriptor = "Z")
	public boolean aBoolean443 = true;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)I")
	public int method5803() {
		return this.anIntArray501 == null ? 0 : this.anIntArray501.length;
	}

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)V")
	public void method5804() {
		if (this.anIntArray502 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray502.length; local16++) {
				this.anIntArray502[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method5805() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray33 == null) {
			return "";
		}
		local8.append(this.aStringArray33[0]);
		for (@Pc(22) int local22 = 1; local22 < this.aStringArray33.length; local22++) {
			local8.append("...");
			local8.append(this.aStringArray33[local22]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(IB)Lclient!tda;")
	public Class273 method5807(@OriginalArg(0) int arg0) {
		return this.anIntArray501 == null || arg0 < 0 || arg0 > this.anIntArray501.length ? null : Static271.method1806(this.anIntArray501[arg0]);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIB)I")
	public int method5810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray501 == null || arg0 < 0 || arg0 > this.anIntArray501.length) {
			return -1;
		} else if (this.anIntArrayArray55[arg0] == null || arg1 < 0 || this.anIntArrayArray55[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray55[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!gw;I)V")
	public void method5811(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3043();
			if (local7 == 0) {
				return;
			}
			this.method5814(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!gw;I[I)V")
	public void method5812(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray501 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray501.length; local17++) {
			if (arg1.length <= local17) {
				return;
			}
			@Pc(24) int local24 = this.method5807(local17).anInt7665;
			if (local24 > 0) {
				arg0.method3055((long) arg1[local17], local24);
			}
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILclient!gw;)V")
	private void method5814(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.aStringArray33 = Static12.method678('<', arg1.method3034());
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg0 == 2) {
			local25 = arg1.method3043();
			this.anIntArray502 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray502[local31] = arg1.method3056();
			}
			return;
		}
		if (arg0 == 3) {
			local25 = arg1.method3043();
			this.anIntArray501 = new int[local25];
			this.anIntArrayArray55 = new int[local25][];
			for (local31 = 0; local31 < local25; local31++) {
				@Pc(70) int local70 = arg1.method3056();
				@Pc(74) Class273 local74 = Static271.method1806(local70);
				if (local74 != null) {
					this.anIntArray501[local31] = local70;
					this.anIntArrayArray55[local31] = new int[local74.anInt7668];
					for (@Pc(90) int local90 = 0; local90 < local74.anInt7668; local90++) {
						this.anIntArrayArray55[local31][local90] = arg1.method3056();
					}
				}
			}
			return;
		}
		if (arg0 == 4) {
			this.aBoolean443 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLclient!gw;)Ljava/lang/String;")
	public String method5816(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.anIntArray501 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray501.length; local13++) {
				local8.append(this.aStringArray33[local13]);
				local8.append(this.aClass109_2.method3267(arg0.method3033(Static271.method1806(this.anIntArray501[local13]).anInt7667), this.method5807(local13), this.anIntArrayArray55[local13]));
			}
		}
		local8.append(this.aStringArray33[this.aStringArray33.length - 1]);
		return local8.toString();
	}
}
