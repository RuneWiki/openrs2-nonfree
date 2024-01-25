import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class197 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
	private int anInt4855 = -1;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "Z")
	private boolean aBoolean371 = false;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25 = new String[0];

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
	private final int anInt4858;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IZ)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean371 = arg1;
		this.anInt4858 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method4069(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 > this.anInt4855) {
			this.anInt4855 = arg1;
		}
		if (arg1 >= this.aStringArray25.length) {
			this.method4070(arg1);
		}
		this.aStringArray25[arg1] = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	private void method4070(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method4074(arg0)];
		Static598.method4266(this.aStringArray25, 0, local9, 0, this.aStringArray25.length);
		this.aStringArray25 = local9;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method4071(@OriginalArg(0) String arg0) {
		this.method4069(arg0, this.anInt4855 + 1);
	}

	@OriginalMember(owner = "client!kp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt4855; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray25[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method4072() {
		@Pc(9) String[] local9 = new String[this.anInt4855 + 1];
		Static598.method4266(this.aStringArray25, 0, local9, 0, this.anInt4855 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)I")
	private int method4074(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aStringArray25.length;
		while (arg0 >= local9) {
			if (!this.aBoolean371) {
				local9 += this.anInt4858;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt4858;
			}
		}
		return local9;
	}
}
