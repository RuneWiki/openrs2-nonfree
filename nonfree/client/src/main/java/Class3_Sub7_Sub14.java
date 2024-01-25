import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class3_Sub7_Sub14 extends Class3_Sub7 {

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!os;")
	public Class257 aClass257_2;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "Z")
	public boolean aBoolean365 = true;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!dc;B)V")
	public void method4297(@OriginalArg(0) Class3_Sub9 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5633();
			if (local12 == 0) {
				return;
			}
			this.method4308(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method4299() {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.aStringArray36 == null) {
			return "";
		}
		local18.append(this.aStringArray36[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray36.length; local32++) {
			local18.append("...");
			local18.append(this.aStringArray36[local32]);
		}
		return local18.toString();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IZLclient!dc;)V")
	public void method4300(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		if (this.anIntArray275 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray275.length; local20++) {
			if (arg0.length <= local20) {
				return;
			}
			@Pc(28) int local28 = this.method4304(local20).anInt5302;
			if (local28 > 0) {
				arg1.method5573(local28, (long) arg0[local20]);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)I")
	public int method4301() {
		return this.anIntArray275 == null ? 0 : this.anIntArray275.length;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
	public void method4302() {
		if (this.anIntArray276 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray276.length; local10++) {
				this.anIntArray276[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!jn;")
	public Class178 method4304(@OriginalArg(0) int arg0) {
		return this.anIntArray275 == null || arg0 < 0 || this.anIntArray275.length < arg0 ? null : Static177.method2936(this.anIntArray275[arg0]);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)I")
	public int method4307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray275 == null || arg1 < 0 || arg1 > this.anIntArray275.length) {
			return -1;
		} else if (this.anIntArrayArray21[arg1] == null || arg0 < 0 || this.anIntArrayArray21[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray21[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!dc;Z)V")
	private void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.aStringArray36 = Static557.method7916('<', arg1.method5607());
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg0 == 2) {
			local30 = arg1.method5633();
			this.anIntArray276 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray276[local40] = arg1.method5610();
			}
		} else if (arg0 == 3) {
			local30 = arg1.method5633();
			this.anIntArray275 = new int[local30];
			this.anIntArrayArray21 = new int[local30][];
			for (local40 = 0; local40 < local30; local40++) {
				@Pc(46) int local46 = arg1.method5610();
				@Pc(50) Class178 local50 = Static177.method2936(local46);
				if (local50 != null) {
					this.anIntArray275[local40] = local46;
					this.anIntArrayArray21[local40] = new int[local50.anInt5307];
					for (@Pc(66) int local66 = 0; local66 < local50.anInt5307; local66++) {
						this.anIntArrayArray21[local40][local66] = arg1.method5610();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean365 = false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Lclient!dc;B)Ljava/lang/String;")
	public String method4309(@OriginalArg(0) Class3_Sub9 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray275 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray275.length; local20++) {
				local15.append(this.aStringArray36[local20]);
				local15.append(this.aClass257_2.method6446(this.method4304(local20), this.anIntArrayArray21[local20], arg0.method5588(Static177.method2936(this.anIntArray275[local20]).anInt5301)));
			}
		}
		local15.append(this.aStringArray36[this.aStringArray36.length - 1]);
		return local15.toString();
	}
}
