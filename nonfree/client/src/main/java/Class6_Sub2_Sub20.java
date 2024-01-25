import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class6_Sub2_Sub20 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray38;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "[I")
	private int[] anIntArray623;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "Lclient!pc;")
	public Class276 aClass276_2;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "[I")
	public int[] anIntArray625;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "Z")
	public boolean aBoolean713 = true;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)V")
	public void method8370() {
		if (this.anIntArray625 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray625.length; local21++) {
				this.anIntArray625[local21] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!jc;)V")
	private void method8371(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.aStringArray38 = Static26.method332('<', arg1.method3046());
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (arg0 == 2) {
			local49 = arg1.method3030();
			this.anIntArray625 = new int[local49];
			for (local59 = 0; local59 < local49; local59++) {
				this.anIntArray625[local59] = arg1.method3018();
			}
		} else if (arg0 == 3) {
			local49 = arg1.method3030();
			this.anIntArray623 = new int[local49];
			this.anIntArrayArray52 = new int[local49][];
			for (local59 = 0; local59 < local49; local59++) {
				@Pc(65) int local65 = arg1.method3018();
				@Pc(69) Class158 local69 = Static343.method5269(local65);
				if (local69 != null) {
					this.anIntArray623[local59] = local65;
					this.anIntArrayArray52[local59] = new int[local69.anInt4417];
					for (@Pc(85) int local85 = 0; local85 < local69.anInt4417; local85++) {
						this.anIntArrayArray52[local59][local85] = arg1.method3018();
					}
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean713 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!jc;B)Ljava/lang/String;")
	public String method8372(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer(80);
		if (this.anIntArray623 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray623.length; local21++) {
				local16.append(this.aStringArray38[local21]);
				local16.append(this.aClass276_2.method6932(arg0.method2997(Static343.method5269(this.anIntArray623[local21]).anInt4412), this.anIntArrayArray52[local21], this.method8382(local21)));
			}
		}
		local16.append(this.aStringArray38[this.aStringArray38.length - 1]);
		return local16.toString();
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method8375() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray38 == null) {
			return "";
		}
		local10.append(this.aStringArray38[0]);
		for (@Pc(31) int local31 = 1; local31 < this.aStringArray38.length; local31++) {
			local10.append("...");
			local10.append(this.aStringArray38[local31]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
	public int method8377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray623 == null || arg1 < 0 || arg1 > this.anIntArray623.length) {
			return -1;
		} else if (this.anIntArrayArray52[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray52[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray52[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B[ILclient!jc;)V")
	public void method8378(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (this.anIntArray623 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray623.length; local17++) {
			if (arg0.length <= local17) {
				return;
			}
			@Pc(25) int local25 = this.method8382(local17).anInt4415;
			if (local25 > 0) {
				arg1.method2995((long) arg0[local17], local25);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!jc;)V")
	public void method8379(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3030();
			if (local10 == 0) {
				return;
			}
			this.method8371(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)I")
	public int method8381() {
		return this.anIntArray623 == null ? 0 : this.anIntArray623.length;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lclient!hj;")
	public Class158 method8382(@OriginalArg(0) int arg0) {
		return this.anIntArray623 == null || arg0 < 0 || arg0 > this.anIntArray623.length ? null : Static343.method5269(this.anIntArray623[arg0]);
	}
}
