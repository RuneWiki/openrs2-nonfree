import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class302 {

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!jn;")
	private final Class176 aClass176_115;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
	private final int anInt8788;

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "[[I")
	private final int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class302(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_115 = arg2;
		this.aClass176_115.method3999(1);
		@Pc(22) Class4_Sub11 local22 = new Class4_Sub11(this.aClass176_115.method3994(0, 0));
		@Pc(26) int local26 = local22.method4905();
		if (local26 > 3) {
			this.anInt8788 = -1;
			this.anIntArrayArray52 = new int[0][];
			this.aBooleanArray25 = new boolean[0];
		} else {
			@Pc(47) int local47 = local22.method4905();
			@Pc(50) Class307[] local50 = Static6.method138();
			@Pc(52) boolean local52 = true;
			@Pc(66) int local66;
			@Pc(72) int local72;
			if (local50.length == local47) {
				for (local66 = 0; local66 < local50.length; local66++) {
					local72 = local22.method4905();
					if (local72 != local50[local66].anInt8870) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local66 = local22.method4905();
				local72 = local22.method4905();
				if (local26 > 2) {
					this.anInt8788 = local22.method4946();
				} else {
					this.anInt8788 = -1;
				}
				this.aBooleanArray25 = new boolean[local72 + 1];
				this.anIntArrayArray52 = new int[local72 + 1][];
				@Pc(132) int local132;
				for (@Pc(126) int local126 = 0; local126 < local66; local126++) {
					local132 = local22.method4905();
					this.aBooleanArray25[local132] = local22.method4905() == 1;
					@Pc(150) int local150 = local22.method4936();
					@Pc(173) int local173;
					if (this.anInt8788 == -1) {
						this.anIntArrayArray52[local132] = new int[local150];
						for (local173 = 0; local173 < local150; local173++) {
							this.anIntArrayArray52[local132][local173] = local22.method4936();
						}
					} else {
						this.anIntArrayArray52[local132] = new int[local150 + 1];
						this.anIntArrayArray52[local132][0] = this.anInt8788;
						for (local173 = 0; local173 < local150; local173++) {
							this.anIntArrayArray52[local132][local173 + 1] = local22.method4936();
						}
					}
				}
				for (local132 = 0; local132 < local72 + 1; local132++) {
					if (this.anIntArrayArray52[local132] == null) {
						if (this.anInt8788 == -1) {
							this.anIntArrayArray52[local132] = new int[0];
						} else {
							this.anIntArrayArray52[local132] = new int[] { this.anInt8788 };
						}
					}
				}
			} else {
				this.anInt8788 = -1;
				this.aBooleanArray25 = new boolean[0];
				this.anIntArrayArray52 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)[I")
	public int[] method7167(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray52.length) {
			return this.anInt8788 == -1 ? new int[0] : new int[] { this.anInt8788 };
		} else if (this.aBooleanArray25[arg0] && this.anIntArrayArray52[arg0].length > 1) {
			@Pc(59) int local59 = this.anInt8788 == -1 ? 0 : 1;
			@Pc(63) Random local63 = new Random();
			@Pc(70) int[] local70 = new int[this.anIntArrayArray52[arg0].length];
			Static597.method3729(this.anIntArrayArray52[arg0], 0, local70, 0, local70.length);
			for (@Pc(87) int local87 = local59; local87 < local70.length; local87++) {
				@Pc(99) int local99 = Static406.method6391(local63, local70.length - local59) + local59;
				@Pc(103) int local103 = local70[local87];
				local70[local87] = local70[local99];
				local70[local99] = local103;
			}
			return local70;
		} else {
			return this.anIntArrayArray52[arg0];
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Lclient!ne;")
	public Class230 method7168(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass176_115.method3994(arg0, 1);
		@Pc(14) Class230 local14 = new Class230();
		local14.method5584(new Class4_Sub11(local10));
		return local14;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
	public boolean method7171() {
		return this.anInt8788 != -1;
	}
}
