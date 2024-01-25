import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class32 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!pu;")
	private final Class270 aClass270_11;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	private final int anInt600;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "[Z")
	private final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class32(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_11 = arg2;
		this.aClass270_11.method5685(1);
		@Pc(22) Class1_Sub35 local22 = new Class1_Sub35(this.aClass270_11.method5704(0, 0));
		@Pc(26) int local26 = local22.method5750();
		if (local26 > 3) {
			this.anInt600 = -1;
			this.aBooleanArray1 = new boolean[0];
			this.anIntArrayArray25 = new int[0][];
		} else {
			@Pc(47) int local47 = local22.method5750();
			@Pc(50) Class297[] local50 = Static389.method5352();
			@Pc(52) boolean local52 = true;
			@Pc(62) int local62;
			@Pc(68) int local68;
			if (local47 == local50.length) {
				for (local62 = 0; local62 < local50.length; local62++) {
					local68 = local22.method5750();
					if (local68 != local50[local62].anInt7955) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local62 = local22.method5750();
				local68 = local22.method5750();
				if (local26 > 2) {
					this.anInt600 = local22.method5738();
				} else {
					this.anInt600 = -1;
				}
				this.aBooleanArray1 = new boolean[local68 + 1];
				this.anIntArrayArray25 = new int[local68 + 1][];
				@Pc(150) int local150;
				for (@Pc(144) int local144 = 0; local144 < local62; local144++) {
					local150 = local22.method5750();
					this.aBooleanArray1[local150] = local22.method5750() == 1;
					@Pc(166) int local166 = local22.method5771();
					@Pc(188) int local188;
					if (this.anInt600 == -1) {
						this.anIntArrayArray25[local150] = new int[local166];
						for (local188 = 0; local188 < local166; local188++) {
							this.anIntArrayArray25[local150][local188] = local22.method5771();
						}
					} else {
						this.anIntArrayArray25[local150] = new int[local166 + 1];
						this.anIntArrayArray25[local150][0] = this.anInt600;
						for (local188 = 0; local188 < local166; local188++) {
							this.anIntArrayArray25[local150][local188 + 1] = local22.method5771();
						}
					}
				}
				for (local150 = 0; local150 < local68 + 1; local150++) {
					if (this.anIntArrayArray25[local150] == null) {
						if (this.anInt600 == -1) {
							this.anIntArrayArray25[local150] = new int[0];
						} else {
							this.anIntArrayArray25[local150] = new int[] { this.anInt600 };
						}
					}
				}
			} else {
				this.anIntArrayArray25 = new int[0][];
				this.aBooleanArray1 = new boolean[0];
				this.anInt600 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lclient!lg;")
	public Class207 method539(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass270_11.method5704(1, arg0);
		@Pc(14) Class207 local14 = new Class207();
		local14.method4160(new Class1_Sub35(local10));
		return local14;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z")
	public boolean method543() {
		return this.anInt600 != -1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)[I")
	public int[] method544(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray25.length) {
			return this.anInt600 == -1 ? new int[0] : new int[] { this.anInt600 };
		} else if (this.aBooleanArray1[arg0] && this.anIntArrayArray25[arg0].length > 1) {
			@Pc(58) int local58 = this.anInt600 == -1 ? 0 : 1;
			@Pc(62) Random local62 = new Random();
			@Pc(69) int[] local69 = new int[this.anIntArrayArray25[arg0].length];
			Static598.method1174(this.anIntArrayArray25[arg0], 0, local69, 0, local69.length);
			for (@Pc(81) int local81 = local58; local81 < local69.length; local81++) {
				@Pc(95) int local95 = Static87.method4324(local69.length - local58, local62) + local58;
				@Pc(99) int local99 = local69[local81];
				local69[local81] = local69[local95];
				local69[local95] = local99;
			}
			return local69;
		} else {
			return this.anIntArrayArray25[arg0];
		}
	}
}
