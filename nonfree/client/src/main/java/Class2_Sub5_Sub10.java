import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class2_Sub5_Sub10 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!ni", name = "M", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "Lclient!es;")
	public Class71 aClass71_2;

	@OriginalMember(owner = "client!ni", name = "S", descriptor = "[I")
	public int[] anIntArray403;

	@OriginalMember(owner = "client!ni", name = "V", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!ni", name = "W", descriptor = "Z")
	public boolean aBoolean349 = true;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!si;I)V")
	public void method3913(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5495();
			if (local5 == 0) {
				return;
			}
			this.method3920(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)I")
	public int method3914() {
		return this.anIntArray402 == null ? 0 : this.anIntArray402.length;
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method3915() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray33 == null) {
			return "";
		}
		local10.append(this.aStringArray33[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray33.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray33[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
	public void method3917() {
		if (this.anIntArray403 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray403.length; local12++) {
				this.anIntArray403[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!si;II)V")
	private void method3920(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray33 = Static455.method4448('<', arg0.method5494());
			return;
		}
		@Pc(38) int local38;
		@Pc(48) int local48;
		if (arg1 == 2) {
			local38 = arg0.method5495();
			this.anIntArray403 = new int[local38];
			for (local48 = 0; local48 < local38; local48++) {
				this.anIntArray403[local48] = arg0.method5500();
			}
		} else if (arg1 == 3) {
			local38 = arg0.method5495();
			this.anIntArray402 = new int[local38];
			this.anIntArrayArray49 = new int[local38][];
			for (local48 = 0; local48 < local38; local48++) {
				@Pc(54) int local54 = arg0.method5500();
				@Pc(58) Class142 local58 = Static95.method1831(local54);
				if (local58 != null) {
					this.anIntArray402[local48] = local54;
					this.anIntArrayArray49[local48] = new int[local58.anInt3979];
					for (@Pc(74) int local74 = 0; local74 < local58.anInt3979; local74++) {
						this.anIntArrayArray49[local48][local74] = arg0.method5500();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean349 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)Lclient!kl;")
	public Class142 method3921(@OriginalArg(1) int arg0) {
		return this.anIntArray402 == null || arg0 < 0 || this.anIntArray402.length < arg0 ? null : Static95.method1831(this.anIntArray402[arg0]);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!si;B)Ljava/lang/String;")
	public String method3922(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray402 != null) {
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray402.length; local24++) {
				local10.append(this.aStringArray33[local24]);
				local10.append(this.aClass71_2.method1829(arg0.method5483(Static95.method1831(this.anIntArray402[local24]).anInt3976), this.anIntArrayArray49[local24], this.method3921(local24)));
			}
		}
		local10.append(this.aStringArray33[this.aStringArray33.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!si;I[I)V")
	public void method3923(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray402 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray402.length; local15++) {
			if (arg1.length <= local15) {
				return;
			}
			@Pc(23) int local23 = this.method3921(local15).anInt3978;
			if (local23 > 0) {
				arg0.method5490((long) arg1[local15], local23);
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)I")
	public int method3926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray402 == null || arg1 < 0 || arg1 > this.anIntArray402.length) {
			return -1;
		} else if (this.anIntArrayArray49[arg1] == null || arg0 < 0 || this.anIntArrayArray49[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray49[arg1][arg0];
		}
	}
}
