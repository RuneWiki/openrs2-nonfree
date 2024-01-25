import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class1_Sub5_Sub16 extends Class1_Sub5 {

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "[I")
	public int[] anIntArray419;

	@OriginalMember(owner = "client!sk", name = "D", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!sk", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!sk", name = "L", descriptor = "Lclient!ak;")
	public Class9 aClass9_1;

	@OriginalMember(owner = "client!sk", name = "Q", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "Z")
	public boolean aBoolean697 = true;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method4897() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray43 == null) {
			return "";
		}
		local10.append(this.aStringArray43[0]);
		for (@Pc(34) int local34 = 1; local34 < this.aStringArray43.length; local34++) {
			local10.append("...");
			local10.append(this.aStringArray43[local34]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ug;I)Ljava/lang/String;")
	public String method4898(@OriginalArg(0) Class1_Sub28 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray420 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray420.length; local15++) {
				local10.append(this.aStringArray43[local15]);
				local10.append(this.aClass9_1.method146(this.anIntArrayArray56[local15], this.method4908(local15), arg0.method5356(Static18.method279(this.anIntArray420[local15]).anInt6163)));
			}
		}
		local10.append(this.aStringArray43[this.aStringArray43.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!ug;)V")
	public void method4901(@OriginalArg(1) Class1_Sub28 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5337();
			if (local9 == 0) {
				return;
			}
			this.method4906(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	public void method4902() {
		if (this.anIntArray419 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray419.length; local10++) {
				this.anIntArray419[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!ug;I)V")
	private void method4906(@OriginalArg(1) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray43 = Static192.method2761('<', arg0.method5381());
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg1 == 2) {
			local19 = arg0.method5337();
			this.anIntArray419 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray419[local25] = arg0.method5335();
			}
		} else if (arg1 == 3) {
			local19 = arg0.method5337();
			this.anIntArray420 = new int[local19];
			this.anIntArrayArray56 = new int[local19][];
			for (local25 = 0; local25 < local19; local25++) {
				@Pc(73) int local73 = arg0.method5335();
				@Pc(77) Class220 local77 = Static18.method279(local73);
				if (local77 != null) {
					this.anIntArray420[local25] = local73;
					this.anIntArrayArray56[local25] = new int[local77.anInt6165];
					for (@Pc(93) int local93 = 0; local93 < local77.anInt6165; local93++) {
						this.anIntArrayArray56[local25][local93] = arg0.method5335();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean697 = false;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lclient!sd;")
	public Class220 method4908(@OriginalArg(0) int arg0) {
		return this.anIntArray420 == null || arg0 < 0 || this.anIntArray420.length < arg0 ? null : Static18.method279(this.anIntArray420[arg0]);
	}

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)I")
	public int method4909() {
		return this.anIntArray420 == null ? 0 : this.anIntArray420.length;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "([ILclient!ug;B)V")
	public void method4910(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		if (this.anIntArray420 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray420.length; local11++) {
			if (local11 >= arg0.length) {
				return;
			}
			@Pc(24) int local24 = this.method4908(local11).anInt6169;
			if (local24 > 0) {
				arg1.method5339((long) arg0[local11], local24);
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BII)I")
	public int method4911(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray420 == null || arg1 < 0 || arg1 > this.anIntArray420.length) {
			return -1;
		} else if (this.anIntArrayArray56[arg1] == null || arg0 < 0 || this.anIntArrayArray56[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray56[arg1][arg0];
		}
	}
}
