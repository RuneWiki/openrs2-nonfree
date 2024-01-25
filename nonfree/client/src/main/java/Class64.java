import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class64 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "I")
	private int anInt1408 = -1;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[0];

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	private final int anInt1407;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IZ)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt1407 = arg0;
		this.aBoolean96 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method1313() {
		@Pc(9) String[] local9 = new String[this.anInt1408 + 1];
		Static585.method3081(this.aStringArray4, 0, local9, 0, this.anInt1408 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 > this.anInt1408) {
			this.anInt1408 = arg0;
		}
		if (arg0 >= this.aStringArray4.length) {
			this.method1320(arg0);
		}
		this.aStringArray4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)I")
	private int method1318(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.aStringArray4.length;
		while (local14 <= arg0) {
			if (!this.aBoolean96) {
				local14 += this.anInt1407;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt1407;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!df", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt1408; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray4[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method1319(@OriginalArg(0) String arg0) {
		this.method1315(this.anInt1408 + 1, arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)V")
	private void method1320(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method1318(arg0)];
		Static585.method3081(this.aStringArray4, 0, local9, 0, this.aStringArray4.length);
		this.aStringArray4 = local9;
	}
}
