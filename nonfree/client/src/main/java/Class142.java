import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class142 {

	@OriginalMember(owner = "client!go", name = "l", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	private int anInt3594 = -1;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray18 = new String[0];

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	private final int anInt3597;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IZ)V")
	public Class142(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt3597 = arg0;
		this.aBoolean225 = arg1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	private void method3255(@OriginalArg(1) int arg0) {
		@Pc(17) String[] local17 = new String[this.method3259(arg0)];
		Static732.method6316(this.aStringArray18, 0, local17, 0, this.aStringArray18.length);
		this.aStringArray18 = local17;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method3257(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.anInt3594 < arg0) {
			this.anInt3594 = arg0;
		}
		if (this.aStringArray18.length <= arg0) {
			this.method3255(arg0);
		}
		this.aStringArray18[arg0] = arg1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method3258(@OriginalArg(1) String arg0) {
		this.method3257(this.anInt3594 + 1, arg0);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)I")
	private int method3259(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.aStringArray18.length;
		while (arg0 >= local17) {
			if (!this.aBoolean225) {
				local17 += this.anInt3597;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt3597;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt3594; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray18[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method3260() {
		@Pc(9) String[] local9 = new String[this.anInt3594 + 1];
		Static732.method6316(this.aStringArray18, 0, local9, 0, this.anInt3594 + 1);
		return local9;
	}
}
