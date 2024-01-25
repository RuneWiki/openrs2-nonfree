import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class6_Sub4_Sub13 extends Class6_Sub4 {

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "[I")
	private int[] anIntArray510;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "Lclient!vo;")
	public Class377 aClass377_2;

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "[I")
	public int[] anIntArray511;

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray48;

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "Z")
	public boolean aBoolean508 = true;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I")
	public int method6579() {
		return this.anIntArray510 == null ? 0 : this.anIntArray510.length;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method6582() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray48 == null) {
			return "";
		}
		local10.append(this.aStringArray48[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray48.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray48[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)I")
	public int method6583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray510 == null || arg0 < 0 || arg0 > this.anIntArray510.length) {
			return -1;
		} else if (this.anIntArrayArray44[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray44[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray44[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)V")
	public void method6584() {
		if (this.anIntArray511 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray511.length; local10++) {
				this.anIntArray511[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!gga;)V")
	private void method6585(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.aStringArray48 = Static635.method8720(arg1.method8354(), '<');
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg0 == 2) {
			local26 = arg1.method8374();
			this.anIntArray511 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray511[local36] = arg1.method8363();
			}
		} else if (arg0 == 3) {
			local26 = arg1.method8374();
			this.anIntArrayArray44 = new int[local26][];
			this.anIntArray510 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				@Pc(42) int local42 = arg1.method8363();
				@Pc(46) Class246 local46 = Static492.method5183(local42);
				if (local46 != null) {
					this.anIntArray510[local36] = local42;
					this.anIntArrayArray44[local36] = new int[local46.anInt6827];
					for (@Pc(62) int local62 = 0; local62 < local46.anInt6827; local62++) {
						this.anIntArrayArray44[local36][local62] = arg1.method8363();
					}
				}
			}
			return;
		} else if (arg0 == 4) {
			this.aBoolean508 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([ILclient!gga;I)V")
	public void method6586(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class6_Sub23 arg1) {
		if (this.anIntArray510 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray510.length; local11++) {
			if (local11 >= arg0.length) {
				return;
			}
			@Pc(19) int local19 = this.method6588(local11).anInt6829;
			if (local19 > 0) {
				arg1.method8389((long) arg0[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!gga;)V")
	public void method6587(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8374();
			if (local13 == 0) {
				return;
			}
			this.method6585(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lclient!o;")
	public Class246 method6588(@OriginalArg(0) int arg0) {
		return this.anIntArray510 == null || arg0 < 0 || this.anIntArray510.length < arg0 ? null : Static492.method5183(this.anIntArray510[arg0]);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!gga;)Ljava/lang/String;")
	public String method6589(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.anIntArray510 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray510.length; local20++) {
				local15.append(this.aStringArray48[local20]);
				local15.append(this.aClass377_2.method8765(this.anIntArrayArray44[local20], arg0.method8351(Static492.method5183(this.anIntArray510[local20]).anInt6831), this.method6588(local20)));
			}
		}
		local15.append(this.aStringArray48[this.aStringArray48.length - 1]);
		return local15.toString();
	}
}
