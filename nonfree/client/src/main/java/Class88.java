import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class88 {

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!tf;")
	private final Class322 aClass322_50;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "[[I")
	private final int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
	private final int anInt2891;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class88(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_50 = arg2;
		this.aClass322_50.method6831(1);
		@Pc(22) Class3_Sub11 local22 = new Class3_Sub11(this.aClass322_50.method6802(0, 0));
		@Pc(26) int local26 = local22.method5175();
		if (local26 > 3) {
			this.anIntArrayArray54 = new int[0][];
			this.aBooleanArray9 = new boolean[0];
			this.anInt2891 = -1;
		} else {
			@Pc(45) int local45 = local22.method5175();
			@Pc(48) Class140[] local48 = Static104.method1889();
			@Pc(50) boolean local50 = true;
			@Pc(64) int local64;
			@Pc(70) int local70;
			if (local48.length == local45) {
				for (local64 = 0; local64 < local48.length; local64++) {
					local70 = local22.method5175();
					if (local70 != local48[local64].anInt3878) {
						local50 = false;
						break;
					}
				}
			} else {
				local50 = false;
			}
			if (local50) {
				local64 = local22.method5175();
				local70 = local22.method5175();
				if (local26 <= 2) {
					this.anInt2891 = -1;
				} else {
					this.anInt2891 = local22.method5231();
				}
				this.aBooleanArray9 = new boolean[local70 + 1];
				this.anIntArrayArray54 = new int[local70 + 1][];
				@Pc(146) int local146;
				for (@Pc(140) int local140 = 0; local140 < local64; local140++) {
					local146 = local22.method5175();
					this.aBooleanArray9[local146] = local22.method5175() == 1;
					@Pc(162) int local162 = local22.method5198();
					@Pc(174) int local174;
					if (this.anInt2891 == -1) {
						this.anIntArrayArray54[local146] = new int[local162];
						for (local174 = 0; local174 < local162; local174++) {
							this.anIntArrayArray54[local146][local174] = local22.method5198();
						}
					} else {
						this.anIntArrayArray54[local146] = new int[local162 + 1];
						this.anIntArrayArray54[local146][0] = this.anInt2891;
						for (local174 = 0; local174 < local162; local174++) {
							this.anIntArrayArray54[local146][local174 + 1] = local22.method5198();
						}
					}
				}
				for (local146 = 0; local146 < local70 + 1; local146++) {
					if (this.anIntArrayArray54[local146] == null) {
						if (this.anInt2891 == -1) {
							this.anIntArrayArray54[local146] = new int[0];
						} else {
							this.anIntArrayArray54[local146] = new int[] { this.anInt2891 };
						}
					}
				}
			} else {
				this.anIntArrayArray54 = new int[0][];
				this.anInt2891 = -1;
				this.aBooleanArray9 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z")
	public boolean method2598() {
		return this.anInt2891 != -1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[I")
	public int[] method2599(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray54.length <= arg0) {
			return this.anInt2891 == -1 ? new int[0] : new int[] { this.anInt2891 };
		} else if (this.aBooleanArray9[arg0] && this.anIntArrayArray54[arg0].length > 1) {
			@Pc(54) int local54 = this.anInt2891 == -1 ? 0 : 1;
			@Pc(58) Random local58 = new Random();
			@Pc(65) int[] local65 = new int[this.anIntArrayArray54[arg0].length];
			Static601.method2818(this.anIntArrayArray54[arg0], 0, local65, 0, local65.length);
			for (@Pc(77) int local77 = local54; local77 < local65.length; local77++) {
				@Pc(89) int local89 = Static164.method2981(local58, local65.length - local54) + local54;
				@Pc(93) int local93 = local65[local77];
				local65[local77] = local65[local89];
				local65[local89] = local93;
			}
			return local65;
		} else {
			return this.anIntArrayArray54[arg0];
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)Lclient!ok;")
	public Class241 method2600(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass322_50.method6802(1, arg0);
		@Pc(14) Class241 local14 = new Class241();
		local14.method5683(new Class3_Sub11(local10));
		return local14;
	}
}
