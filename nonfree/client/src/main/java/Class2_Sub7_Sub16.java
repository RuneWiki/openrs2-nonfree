import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class2_Sub7_Sub16 extends Class2_Sub7 {

	@OriginalMember(owner = "client!qga", name = "v", descriptor = "Lclient!ud;")
	public Class344 aClass344_2;

	@OriginalMember(owner = "client!qga", name = "x", descriptor = "[I")
	private int[] anIntArray519;

	@OriginalMember(owner = "client!qga", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray88;

	@OriginalMember(owner = "client!qga", name = "C", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!qga", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42;

	@OriginalMember(owner = "client!qga", name = "t", descriptor = "Z")
	public boolean aBoolean538 = true;

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)I")
	public int method6598() {
		return this.anIntArray519 == null ? 0 : this.anIntArray519.length;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method6599(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray42 = Static386.method5691('<', arg0.method2833());
			return;
		}
		@Pc(21) int local21;
		@Pc(31) int local31;
		if (arg1 == 2) {
			local21 = arg0.method2859();
			this.anIntArray520 = new int[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray520[local31] = arg0.method2825();
			}
		} else if (arg1 == 3) {
			local21 = arg0.method2859();
			this.anIntArray519 = new int[local21];
			this.anIntArrayArray88 = new int[local21][];
			for (local31 = 0; local31 < local21; local31++) {
				@Pc(38) int local38 = arg0.method2825();
				@Pc(42) Class117 local42 = Static12.method146(local38);
				if (local42 != null) {
					this.anIntArray519[local31] = local38;
					this.anIntArrayArray88[local31] = new int[local42.anInt3283];
					for (@Pc(58) int local58 = 0; local58 < local42.anInt3283; local58++) {
						this.anIntArrayArray88[local31][local58] = arg0.method2825();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean538 = false;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "([IILclient!sl;)V")
	public void method6600(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (this.anIntArray519 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray519.length; local13++) {
			if (arg0.length <= local13) {
				return;
			}
			@Pc(22) int local22 = this.method6606(local13).anInt3286;
			if (local22 > 0) {
				arg1.method2828((long) arg0[local13], local22);
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method6601() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray42 == null) {
			return "";
		}
		local8.append(this.aStringArray42[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray42.length; local30++) {
			local8.append("...");
			local8.append(this.aStringArray42[local30]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method6602(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2859();
			if (local13 == 0) {
				return;
			}
			this.method6599(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZLclient!sl;)Ljava/lang/String;")
	public String method6603(@OriginalArg(1) Class2_Sub17 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray519 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray519.length; local20++) {
				local15.append(this.aStringArray42[local20]);
				local15.append(this.aClass344_2.method7948(this.method6606(local20), this.anIntArrayArray88[local20], arg0.method2829(Static12.method146(this.anIntArray519[local20]).anInt3288)));
			}
		}
		local15.append(this.aStringArray42[this.aStringArray42.length - 1]);
		return local15.toString();
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(III)I")
	public int method6604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray519 == null || arg0 < 0 || this.anIntArray519.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray88[arg0] == null || arg1 < 0 || this.anIntArrayArray88[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray88[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public void method6605() {
		if (this.anIntArray520 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray520.length; local12++) {
				this.anIntArray520[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Lclient!fia;")
	public Class117 method6606(@OriginalArg(1) int arg0) {
		return this.anIntArray519 == null || arg0 < 0 || this.anIntArray519.length < arg0 ? null : Static12.method146(this.anIntArray519[arg0]);
	}
}
