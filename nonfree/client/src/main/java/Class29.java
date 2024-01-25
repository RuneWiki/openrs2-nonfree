import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class29 {

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[0];

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
	private int anInt986 = -1;

	@OriginalMember(owner = "client!bea", name = "n", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
	private final int anInt982;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(IZ)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt982 = arg0;
		this.aBoolean74 = arg1;
	}

	@OriginalMember(owner = "client!bea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt986; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray3[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method840() {
		@Pc(9) String[] local9 = new String[this.anInt986 + 1];
		Static681.method2481(this.aStringArray3, 0, local9, 0, this.anInt986 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method842(@OriginalArg(0) String arg0) {
		this.method843(arg0, this.anInt986 + 1);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method843(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt986) {
			this.anInt986 = arg1;
		}
		if (arg1 >= this.aStringArray3.length) {
			this.method844(arg1);
		}
		this.aStringArray3[arg1] = arg0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)V")
	private void method844(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method845(arg0)];
		Static681.method2481(this.aStringArray3, 0, local9, 0, this.aStringArray3.length);
		this.aStringArray3 = local9;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BI)I")
	private int method845(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.aStringArray3.length;
		while (arg0 >= local17) {
			if (!this.aBoolean74) {
				local17 += this.anInt982;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt982;
			}
		}
		return local17;
	}
}
