import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class133 {

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7 = new String[0];

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
	private int anInt3754 = -1;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	private final int anInt3762;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IZ)V")
	public Class133(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt3762 = arg0;
		this.aBoolean271 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	private void method3054(@OriginalArg(1) int arg0) {
		@Pc(16) String[] local16 = new String[this.method3061(arg0)];
		Static598.method773(this.aStringArray7, 0, local16, 0, this.aStringArray7.length);
		this.aStringArray7 = local16;
	}

	@OriginalMember(owner = "client!hg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt3754; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray7[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method3056(@OriginalArg(0) String arg0) {
		this.method3058(this.anInt3754 + 1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method3057() {
		@Pc(14) String[] local14 = new String[this.anInt3754 + 1];
		Static598.method773(this.aStringArray7, 0, local14, 0, this.anInt3754 + 1);
		return local14;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method3058(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 > this.anInt3754) {
			this.anInt3754 = arg0;
		}
		if (this.aStringArray7.length <= arg0) {
			this.method3054(arg0);
		}
		this.aStringArray7[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)I")
	private int method3061(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.aStringArray7.length;
		while (arg0 >= local17) {
			if (!this.aBoolean271) {
				local17 += this.anInt3762;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt3762;
			}
		}
		return local17;
	}
}
