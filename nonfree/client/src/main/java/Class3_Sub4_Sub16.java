import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class3_Sub4_Sub16 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "[I")
	private int[] anIntArray290;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "[I")
	public int[] anIntArray291;

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "Lclient!fm;")
	public Class113 aClass113_1;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "Z")
	public boolean aBoolean361 = true;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)I")
	public int method4821() {
		return this.anIntArray290 == null ? 0 : this.anIntArray290.length;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIB)I")
	public int method4822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray290 == null || arg0 < 0 || this.anIntArray290.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray36[arg0] == null || arg1 < 0 || this.anIntArrayArray36[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray36[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method4823(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray19 = Static33.method1210('<', arg0.method4233());
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg1 == 2) {
			local26 = arg0.method4225();
			this.anIntArray291 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray291[local36] = arg0.method4221();
			}
		} else if (arg1 == 3) {
			local26 = arg0.method4225();
			this.anIntArray290 = new int[local26];
			this.anIntArrayArray36 = new int[local26][];
			for (local36 = 0; local36 < local26; local36++) {
				@Pc(42) int local42 = arg0.method4221();
				@Pc(46) Class74 local46 = Static192.method3265(local42);
				if (local46 != null) {
					this.anIntArray290[local36] = local42;
					this.anIntArrayArray36[local36] = new int[local46.anInt2259];
					for (@Pc(62) int local62 = 0; local62 < local46.anInt2259; local62++) {
						this.anIntArrayArray36[local36][local62] = arg0.method4221();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean361 = false;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([IBLclient!sl;)V")
	public void method4824(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (this.anIntArray290 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray290.length && arg0.length > local11; local11++) {
			@Pc(19) int local19 = this.method4825(local11).anInt2261;
			if (local19 > 0) {
				arg1.method4242((long) arg0[local11], local19);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)Lclient!dj;")
	public Class74 method4825(@OriginalArg(0) int arg0) {
		return this.anIntArray290 == null || arg0 < 0 || this.anIntArray290.length < arg0 ? null : Static192.method3265(this.anIntArray290[arg0]);
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method4827() {
		@Pc(18) StringBuffer local18 = new StringBuffer(80);
		if (this.aStringArray19 == null) {
			return "";
		}
		local18.append(this.aStringArray19[0]);
		for (@Pc(32) int local32 = 1; local32 < this.aStringArray19.length; local32++) {
			local18.append("...");
			local18.append(this.aStringArray19[local32]);
		}
		return local18.toString();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!sl;I)Ljava/lang/String;")
	public String method4828(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray290 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray290.length; local15++) {
				local10.append(this.aStringArray19[local15]);
				local10.append(this.aClass113_1.method2866(this.method4825(local15), this.anIntArrayArray36[local15], arg0.method4255(Static192.method3265(this.anIntArray290[local15]).anInt2257)));
			}
		}
		local10.append(this.aStringArray19[this.aStringArray19.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!sl;)V")
	public void method4830(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4225();
			if (local9 == 0) {
				return;
			}
			this.method4823(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(B)V")
	public void method4831() {
		if (this.anIntArray291 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray291.length; local15++) {
				this.anIntArray291[local15] |= 0x8000;
			}
		}
	}
}
