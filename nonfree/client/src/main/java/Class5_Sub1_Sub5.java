import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class5_Sub1_Sub5 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gr", name = "Q", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!gr", name = "H", descriptor = "Lclient!qt;")
	public Class308 aClass308_2;

	@OriginalMember(owner = "client!gr", name = "J", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray18;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "Z")
	public boolean aBoolean257 = true;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!wq;B)Ljava/lang/String;")
	public String method3284(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray170 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray170.length; local15++) {
				local10.append(this.aStringArray18[local15]);
				local10.append(this.aClass308_2.method6955(arg0.method7328(Static333.method5036(this.anIntArray170[local15]).anInt7329), this.method3294(local15), this.anIntArrayArray25[local15]));
			}
		}
		local10.append(this.aStringArray18[this.aStringArray18.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method3285() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray18 == null) {
			return "";
		}
		local10.append(this.aStringArray18[0]);
		for (@Pc(34) int local34 = 1; local34 < this.aStringArray18.length; local34++) {
			local10.append("...");
			local10.append(this.aStringArray18[local34]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!wq;[I)V")
	public void method3286(@OriginalArg(0) byte arg0, @OriginalArg(1) Class5_Sub36 arg1, @OriginalArg(2) int[] arg2) {
		if (this.anIntArray170 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray170.length && local12 < arg2.length; local12++) {
			@Pc(20) int local20 = this.method3294(local12).anInt7327;
			if (local20 > 0) {
				arg1.method7266((long) arg2[local12], local20);
			}
		}
		if (arg0 != -119) {
			this.method3286((byte) -99, (Class5_Sub36) null, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)I")
	public int method3287() {
		return this.anIntArray170 == null ? 0 : this.anIntArray170.length;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)I")
	public int method3288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray170 == null || arg0 < 0 || this.anIntArray170.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray25[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray25[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray25[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!wq;Z)V")
	public void method3290(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7291();
			if (local14 == 0) {
				return;
			}
			this.method3292(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public void method3291() {
		if (this.anIntArray169 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray169.length; local20++) {
				this.anIntArray169[local20] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!wq;II)V")
	private void method3292(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray18 = Static350.method5156('<', arg0.method7281());
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg1 == 2) {
			local22 = arg0.method7291();
			this.anIntArray169 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray169[local28] = arg0.method7333();
			}
		} else if (arg1 == 3) {
			local22 = arg0.method7291();
			this.anIntArray170 = new int[local22];
			this.anIntArrayArray25 = new int[local22][];
			for (local28 = 0; local28 < local22; local28++) {
				@Pc(76) int local76 = arg0.method7333();
				@Pc(80) Class282 local80 = Static333.method5036(local76);
				if (local80 != null) {
					this.anIntArray170[local28] = local76;
					this.anIntArrayArray25[local28] = new int[local80.anInt7330];
					for (@Pc(96) int local96 = 0; local96 < local80.anInt7330; local96++) {
						this.anIntArrayArray25[local28][local96] = arg0.method7333();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean257 = false;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Lclient!pe;")
	public Class282 method3294(@OriginalArg(1) int arg0) {
		return this.anIntArray170 == null || arg0 < 0 || arg0 > this.anIntArray170.length ? null : Static333.method5036(this.anIntArray170[arg0]);
	}
}
