import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class166 {

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "Lclient!bi;")
	private final Class31 aClass31_53;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "[[I")
	private final int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
	private final int anInt4711;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class166(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_53 = arg2;
		this.aClass31_53.method657(1);
		@Pc(22) Class4_Sub9 local22 = new Class4_Sub9(this.aClass31_53.method667(0, 0));
		@Pc(26) int local26 = local22.method6015();
		if (local26 > 3) {
			this.aBooleanArray18 = new boolean[0];
			this.anIntArrayArray53 = new int[0][];
			this.anInt4711 = -1;
		} else {
			@Pc(33) int local33 = local22.method6015();
			@Pc(36) Class258[] local36 = Static267.method4356();
			@Pc(38) boolean local38 = true;
			@Pc(48) int local48;
			@Pc(54) int local54;
			if (local33 == local36.length) {
				for (local48 = 0; local48 < local36.length; local48++) {
					local54 = local22.method6015();
					if (local36[local48].anInt6855 != local54) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local48 = local22.method6015();
				local54 = local22.method6015();
				if (local26 <= 2) {
					this.anInt4711 = -1;
				} else {
					this.anInt4711 = local22.method6003();
				}
				this.aBooleanArray18 = new boolean[local54 + 1];
				this.anIntArrayArray53 = new int[local54 + 1][];
				@Pc(138) int local138;
				for (@Pc(132) int local132 = 0; local132 < local48; local132++) {
					local138 = local22.method6015();
					this.aBooleanArray18[local138] = local22.method6015() == 1;
					@Pc(154) int local154 = local22.method5982();
					@Pc(176) int local176;
					if (this.anInt4711 == -1) {
						this.anIntArrayArray53[local138] = new int[local154];
						for (local176 = 0; local176 < local154; local176++) {
							this.anIntArrayArray53[local138][local176] = local22.method5982();
						}
					} else {
						this.anIntArrayArray53[local138] = new int[local154 + 1];
						this.anIntArrayArray53[local138][0] = this.anInt4711;
						for (local176 = 0; local176 < local154; local176++) {
							this.anIntArrayArray53[local138][local176 + 1] = local22.method5982();
						}
					}
				}
				for (local138 = 0; local138 < local54 + 1; local138++) {
					if (this.anIntArrayArray53[local138] == null) {
						if (this.anInt4711 == -1) {
							this.anIntArrayArray53[local138] = new int[0];
						} else {
							this.anIntArrayArray53[local138] = new int[] { this.anInt4711 };
						}
					}
				}
			} else {
				this.aBooleanArray18 = new boolean[0];
				this.anIntArrayArray53 = new int[0][];
				this.anInt4711 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)[I")
	public int[] method3993(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray53.length <= arg0) {
			return this.anInt4711 == -1 ? new int[0] : new int[] { this.anInt4711 };
		} else if (this.aBooleanArray18[arg0] && this.anIntArrayArray53[arg0].length > 1) {
			@Pc(54) int local54 = this.anInt4711 == -1 ? 0 : 1;
			@Pc(66) Random local66 = new Random();
			@Pc(73) int[] local73 = new int[this.anIntArrayArray53[arg0].length];
			Static602.method1582(this.anIntArrayArray53[arg0], 0, local73, 0, local73.length);
			for (@Pc(85) int local85 = local54; local85 < local73.length; local85++) {
				@Pc(100) int local100 = Static87.method2047(local73.length - local54, local66) + local54;
				@Pc(104) int local104 = local73[local85];
				local73[local85] = local73[local100];
				local73[local100] = local104;
			}
			return local73;
		} else {
			return this.anIntArrayArray53[arg0];
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lclient!cca;")
	public Class48 method3994(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass31_53.method667(1, arg0);
		@Pc(19) Class48 local19 = new Class48();
		local19.method856(new Class4_Sub9(local10));
		return local19;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)Z")
	public boolean method3995() {
		return this.anInt4711 != -1;
	}
}
