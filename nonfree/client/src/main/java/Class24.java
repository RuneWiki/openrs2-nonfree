import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class24 {

	@OriginalMember(owner = "client!au", name = "i", descriptor = "Lclient!ri;")
	private final Class284 aClass284_9;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "[Z")
	private final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	private final int anInt234;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "[[I")
	private final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class24(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_9 = arg2;
		this.aClass284_9.method6354(1);
		@Pc(22) Class3_Sub26 local22 = new Class3_Sub26(this.aClass284_9.method6331(0, 0));
		@Pc(26) int local26 = local22.method6814();
		if (local26 > 3) {
			this.anInt234 = -1;
			this.aBooleanArray1 = new boolean[0];
			this.anIntArrayArray4 = new int[0][];
		} else {
			@Pc(33) int local33 = local22.method6814();
			@Pc(36) Class95[] local36 = Static389.method6681();
			@Pc(38) boolean local38 = true;
			@Pc(48) int local48;
			@Pc(54) int local54;
			if (local36.length == local33) {
				for (local48 = 0; local48 < local36.length; local48++) {
					local54 = local22.method6814();
					if (local54 != local36[local48].anInt3203) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local48 = local22.method6814();
				local54 = local22.method6814();
				if (local26 <= 2) {
					this.anInt234 = -1;
				} else {
					this.anInt234 = local22.method6789();
				}
				this.aBooleanArray1 = new boolean[local54 + 1];
				this.anIntArrayArray4 = new int[local54 + 1][];
				@Pc(132) int local132;
				for (@Pc(126) int local126 = 0; local126 < local48; local126++) {
					local132 = local22.method6814();
					this.aBooleanArray1[local132] = local22.method6814() == 1;
					@Pc(148) int local148 = local22.method6811();
					@Pc(171) int local171;
					if (this.anInt234 == -1) {
						this.anIntArrayArray4[local132] = new int[local148];
						for (local171 = 0; local171 < local148; local171++) {
							this.anIntArrayArray4[local132][local171] = local22.method6811();
						}
					} else {
						this.anIntArrayArray4[local132] = new int[local148 + 1];
						this.anIntArrayArray4[local132][0] = this.anInt234;
						for (local171 = 0; local171 < local148; local171++) {
							this.anIntArrayArray4[local132][local171 + 1] = local22.method6811();
						}
					}
				}
				for (local132 = 0; local132 < local54 + 1; local132++) {
					if (this.anIntArrayArray4[local132] == null) {
						if (this.anInt234 == -1) {
							this.anIntArrayArray4[local132] = new int[0];
						} else {
							this.anIntArrayArray4[local132] = new int[] { this.anInt234 };
						}
					}
				}
			} else {
				this.aBooleanArray1 = new boolean[0];
				this.anInt234 = -1;
				this.anIntArrayArray4 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)[I")
	public int[] method240(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray4.length <= arg0) {
			return this.anInt234 == -1 ? new int[0] : new int[] { this.anInt234 };
		} else if (this.aBooleanArray1[arg0] && this.anIntArrayArray4[arg0].length > 1) {
			@Pc(56) int local56 = this.anInt234 == -1 ? 0 : 1;
			@Pc(60) Random local60 = new Random();
			@Pc(67) int[] local67 = new int[this.anIntArrayArray4[arg0].length];
			Static604.method6224(this.anIntArrayArray4[arg0], 0, local67, 0, local67.length);
			for (@Pc(85) int local85 = local56; local85 < local67.length; local85++) {
				@Pc(98) int local98 = local56 + Static120.method2330(local60, local67.length - local56);
				@Pc(102) int local102 = local67[local85];
				local67[local85] = local67[local98];
				local67[local98] = local102;
			}
			return local67;
		} else {
			return this.anIntArrayArray4[arg0];
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lclient!ab;")
	public Class4 method242(@OriginalArg(1) int arg0) {
		@Pc(15) byte[] local15 = this.aClass284_9.method6331(1, arg0);
		@Pc(19) Class4 local19 = new Class4();
		local19.method42(new Class3_Sub26(local15));
		return local19;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Z")
	public boolean method246() {
		return this.anInt234 != -1;
	}
}
