import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class3_Sub4_Sub16 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rca", name = "w", descriptor = "[I")
	private int[] anIntArray516;

	@OriginalMember(owner = "client!rca", name = "z", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray29;

	@OriginalMember(owner = "client!rca", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!rca", name = "G", descriptor = "[I")
	public int[] anIntArray517;

	@OriginalMember(owner = "client!rca", name = "M", descriptor = "Lclient!kw;")
	public Class189 aClass189_2;

	@OriginalMember(owner = "client!rca", name = "u", descriptor = "Z")
	public boolean aBoolean697 = true;

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(BII)I")
	public int method6941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray516 == null || arg0 < 0 || arg0 > this.anIntArray516.length) {
			return -1;
		} else if (this.anIntArrayArray62[arg0] == null || arg1 < 0 || this.anIntArrayArray62[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray62[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!fd;)V")
	public void method6942(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6538();
			if (local5 == 0) {
				return;
			}
			this.method6947(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IB)Lclient!mv;")
	public Class219 method6943(@OriginalArg(0) int arg0) {
		return this.anIntArray516 == null || arg0 < 0 || arg0 > this.anIntArray516.length ? null : Static591.method8340(this.anIntArray516[arg0]);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!fd;[I)V")
	public void method6945(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray516 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray516.length; local15++) {
			if (local15 >= arg1.length) {
				return;
			}
			@Pc(22) int local22 = this.method6943(local15).anInt6952;
			if (local22 > 0) {
				arg0.method6552((long) arg1[local15], local22);
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(ILclient!fd;)Ljava/lang/String;")
	public String method6946(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(13) StringBuffer local13 = new StringBuffer(80);
		if (this.anIntArray516 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray516.length; local18++) {
				local13.append(this.aStringArray29[local18]);
				local13.append(this.aClass189_2.method4917(this.method6943(local18), arg0.method6513(Static591.method8340(this.anIntArray516[local18]).anInt6954), this.anIntArrayArray62[local18]));
			}
		}
		local13.append(this.aStringArray29[this.aStringArray29.length - 1]);
		return local13.toString();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method6947(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray29 = Static335.method5785('<', arg0.method6536());
			return;
		}
		@Pc(39) int local39;
		@Pc(49) int local49;
		if (arg1 == 2) {
			local39 = arg0.method6538();
			this.anIntArray517 = new int[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.anIntArray517[local49] = arg0.method6535();
			}
		} else if (arg1 == 3) {
			local39 = arg0.method6538();
			this.anIntArray516 = new int[local39];
			this.anIntArrayArray62 = new int[local39][];
			for (local49 = 0; local49 < local39; local49++) {
				@Pc(54) int local54 = arg0.method6535();
				@Pc(58) Class219 local58 = Static591.method8340(local54);
				if (local58 != null) {
					this.anIntArray516[local49] = local54;
					this.anIntArrayArray62[local49] = new int[local58.anInt6951];
					for (@Pc(74) int local74 = 0; local74 < local58.anInt6951; local74++) {
						this.anIntArrayArray62[local49][local74] = arg0.method6535();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean697 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "(I)I")
	public int method6948() {
		return this.anIntArray516 == null ? 0 : this.anIntArray516.length;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
	public void method6949() {
		if (this.anIntArray517 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray517.length; local4++) {
				this.anIntArray517[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method6953() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray29 == null) {
			return "";
		}
		local8.append(this.aStringArray29[0]);
		for (@Pc(22) int local22 = 1; local22 < this.aStringArray29.length; local22++) {
			local8.append("...");
			local8.append(this.aStringArray29[local22]);
		}
		return local8.toString();
	}
}
