import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class178 {

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17 = new String[0];

	@OriginalMember(owner = "client!kia", name = "m", descriptor = "I")
	private int anInt5889 = -1;

	@OriginalMember(owner = "client!kia", name = "h", descriptor = "Z")
	private boolean aBoolean424 = false;

	@OriginalMember(owner = "client!kia", name = "n", descriptor = "I")
	private final int anInt5890;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(IZ)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt5890 = arg0;
		this.aBoolean424 = arg1;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)I")
	private int method4802(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aStringArray17.length;
		while (local9 <= arg0) {
			if (!this.aBoolean424) {
				local9 += this.anInt5890;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt5890;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)V")
	private void method4803(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method4802(arg0)];
		Static649.method5530(this.aStringArray17, 0, local9, 0, this.aStringArray17.length);
		this.aStringArray17 = local9;
	}

	@OriginalMember(owner = "client!kia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt5889; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray17[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method4807(@OriginalArg(0) String arg0) {
		this.method4808(this.anInt5889 + 1, arg0);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.anInt5889 < arg0) {
			this.anInt5889 = arg0;
		}
		if (arg0 >= this.aStringArray17.length) {
			this.method4803(arg0);
		}
		this.aStringArray17[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)[Ljava/lang/String;")
	public String[] method4809() {
		@Pc(14) String[] local14 = new String[this.anInt5889 + 1];
		Static649.method5530(this.aStringArray17, 0, local14, 0, this.anInt5889 + 1);
		return local14;
	}
}
