import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class244 {

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28 = new String[0];

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
	private int anInt7153 = -1;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "Z")
	private boolean aBoolean511 = false;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
	private final int anInt7151;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(IZ)V")
	public Class244(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt7151 = arg0;
		this.aBoolean511 = arg1;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5569(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt7153) {
			this.anInt7153 = arg1;
		}
		if (arg1 >= this.aStringArray28.length) {
			this.method5574(arg1);
		}
		this.aStringArray28[arg1] = arg0;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)I")
	private int method5570(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.aStringArray28.length;
		while (arg0 >= local14) {
			if (!this.aBoolean511) {
				local14 += this.anInt7151;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt7151;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method5571(@OriginalArg(0) String arg0) {
		this.method5569(arg0, this.anInt7153 + 1);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method5573() {
		@Pc(9) String[] local9 = new String[this.anInt7153 + 1];
		Static599.method3061(this.aStringArray28, 0, local9, 0, this.anInt7153 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!oda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt7153; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray28[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(II)V")
	private void method5574(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method5570(arg0)];
		Static599.method3061(this.aStringArray28, 0, local9, 0, this.aStringArray28.length);
		this.aStringArray28 = local9;
	}
}
