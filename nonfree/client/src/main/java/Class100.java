import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class100 {

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[0];

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Z")
	private boolean aBoolean324 = false;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
	private int anInt3786 = -1;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
	private final int anInt3781;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IZ)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean324 = arg1;
		this.anInt3781 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method3331(@OriginalArg(1) String arg0) {
		this.method3333(arg0, this.anInt3786 + 1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)I")
	private int method3332(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.aStringArray12.length;
		while (local17 <= arg0) {
			if (!this.aBoolean324) {
				local17 += this.anInt3781;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt3781;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method3333(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3786 < arg1) {
			this.anInt3786 = arg1;
		}
		if (this.aStringArray12.length <= arg1) {
			this.method3336(arg1);
		}
		this.aStringArray12[arg1] = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method3334() {
		@Pc(15) String[] local15 = new String[this.anInt3786 + 1];
		Static655.method6407(this.aStringArray12, 0, local15, 0, this.anInt3786 + 1);
		return local15;
	}

	@OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt3786; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray12[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V")
	private void method3336(@OriginalArg(1) int arg0) {
		@Pc(15) String[] local15 = new String[this.method3332(arg0)];
		Static655.method6407(this.aStringArray12, 0, local15, 0, this.aStringArray12.length);
		this.aStringArray12 = local15;
	}
}
