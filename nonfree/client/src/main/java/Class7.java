import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class7 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[0];

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	private int anInt167 = -1;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	private final int anInt168;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IZ)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean5 = arg1;
		this.anInt168 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method142() {
		@Pc(15) String[] local15 = new String[this.anInt167 + 1];
		Static597.method3725(this.aStringArray5, 0, local15, 0, this.anInt167 + 1);
		return local15;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method143(@OriginalArg(0) String arg0) {
		this.method145(this.anInt167 + 1, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	private void method144(@OriginalArg(1) int arg0) {
		@Pc(14) String[] local14 = new String[this.method147(arg0)];
		Static597.method3725(this.aStringArray5, 0, local14, 0, this.aStringArray5.length);
		this.aStringArray5 = local14;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method145(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 > this.anInt167) {
			this.anInt167 = arg0;
		}
		if (arg0 >= this.aStringArray5.length) {
			this.method144(arg0);
		}
		this.aStringArray5[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt167; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray5[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(BI)I")
	private int method147(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.aStringArray5.length;
		while (local9 <= arg0) {
			if (!this.aBoolean5) {
				local9 += this.anInt168;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt168;
			}
		}
		return local9;
	}
}
