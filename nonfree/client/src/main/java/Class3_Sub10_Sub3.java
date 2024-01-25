import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class3_Sub10_Sub3 extends Class3_Sub10 {

	@OriginalMember(owner = "client!co", name = "p", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!pc;")
	public Class227 aClass227_1;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!co", name = "C", descriptor = "[I")
	public int[] anIntArray180;

	@OriginalMember(owner = "client!co", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "Z")
	public boolean aBoolean118 = true;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method1323() {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.aStringArray12 == null) {
			return "";
		}
		local18.append(this.aStringArray12[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray12.length; local32++) {
			local18.append("...");
			local18.append(this.aStringArray12[local32]);
		}
		return local18.toString();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!rt;)V")
	private void method1324(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.aStringArray12 = Static439.method6626('<', arg1.method7589());
			return;
		}
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (arg0 == 2) {
			local34 = arg1.method7548();
			this.anIntArray180 = new int[local34];
			for (local40 = 0; local40 < local34; local40++) {
				this.anIntArray180[local40] = arg1.method7591();
			}
		} else if (arg0 == 3) {
			local34 = arg1.method7548();
			this.anIntArray179 = new int[local34];
			this.anIntArrayArray21 = new int[local34][];
			for (local40 = 0; local40 < local34; local40++) {
				@Pc(83) int local83 = arg1.method7591();
				@Pc(87) Class57 local87 = Static369.method5828(local83);
				if (local87 != null) {
					this.anIntArray179[local40] = local83;
					this.anIntArrayArray21[local40] = new int[local87.anInt1626];
					for (@Pc(103) int local103 = 0; local103 < local87.anInt1626; local103++) {
						this.anIntArrayArray21[local40][local103] = arg1.method7591();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean118 = false;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!rt;)Ljava/lang/String;")
	public String method1325(@OriginalArg(1) Class3_Sub27 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray179 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray179.length; local20++) {
				local15.append(this.aStringArray12[local20]);
				local15.append(this.aClass227_1.method5729(arg0.method7560(Static369.method5828(this.anIntArray179[local20]).anInt1628), this.method1334(local20), this.anIntArrayArray21[local20]));
			}
		}
		local15.append(this.aStringArray12[this.aStringArray12.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I")
	public int method1326() {
		return this.anIntArray179 == null ? 0 : this.anIntArray179.length;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([ILclient!rt;I)V")
	public void method1328(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		if (this.anIntArray179 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray179.length; local11++) {
			if (local11 >= arg0.length) {
				return;
			}
			@Pc(19) int local19 = this.method1334(local11).anInt1623;
			if (local19 > 0) {
				arg1.method7581(local19, (long) arg0[local11]);
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(ILclient!rt;)V")
	public void method1329(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7548();
			if (local12 == 0) {
				return;
			}
			this.method1324(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(II)Lclient!db;")
	public Class57 method1334(@OriginalArg(0) int arg0) {
		return this.anIntArray179 == null || arg0 < 0 || arg0 > this.anIntArray179.length ? null : Static369.method5828(this.anIntArray179[arg0]);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V")
	public void method1335() {
		if (this.anIntArray180 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray180.length; local11++) {
				this.anIntArray180[local11] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZI)I")
	public int method1337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray179 == null || arg1 < 0 || arg1 > this.anIntArray179.length) {
			return -1;
		} else if (this.anIntArrayArray21[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray21[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray21[arg1][arg0];
		}
	}
}
