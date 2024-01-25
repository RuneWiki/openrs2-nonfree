import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class137 {

	@OriginalMember(owner = "client!hea", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray15 = new String[0];

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
	private int anInt3739 = -1;

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
	private final int anInt3731;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(IZ)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt3731 = arg0;
		this.aBoolean289 = arg1;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)V")
	private void method3275(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method3281(arg0)];
		Static602.method4664(this.aStringArray15, 0, local9, 0, this.aStringArray15.length);
		this.aStringArray15 = local9;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method3276(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt3739) {
			this.anInt3739 = arg1;
		}
		if (this.aStringArray15.length <= arg1) {
			this.method3275(arg1);
		}
		this.aStringArray15[arg1] = arg0;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method3277() {
		@Pc(14) String[] local14 = new String[this.anInt3739 + 1];
		Static602.method4664(this.aStringArray15, 0, local14, 0, this.anInt3739 + 1);
		return local14;
	}

	@OriginalMember(owner = "client!hea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt3739; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray15[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method3279(@OriginalArg(1) String arg0) {
		this.method3276(arg0, this.anInt3739 + 1);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)I")
	private int method3281(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.aStringArray15.length;
		while (arg0 >= local14) {
			if (!this.aBoolean289) {
				local14 += this.anInt3731;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt3731;
			}
		}
		return local14;
	}
}
