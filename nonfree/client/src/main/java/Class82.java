import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class82 {

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[0];

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	private int anInt2142 = -1;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
	private final int anInt2141;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IZ)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean146 = arg1;
		this.anInt2141 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method2082() {
		@Pc(15) String[] local15 = new String[this.anInt2142 + 1];
		Static679.method4131(this.aStringArray9, 0, local15, 0, this.anInt2142 + 1);
		return local15;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method2083(@OriginalArg(0) String arg0) {
		this.method2084(arg0, this.anInt2142 + 1);
	}

	@OriginalMember(owner = "client!dw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt2142; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray9[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method2084(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2142 < arg1) {
			this.anInt2142 = arg1;
		}
		if (arg1 >= this.aStringArray9.length) {
			this.method2086(arg1);
		}
		this.aStringArray9[arg1] = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)I")
	private int method2085(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.aStringArray9.length;
		while (arg0 >= local15) {
			if (!this.aBoolean146) {
				local15 += this.anInt2141;
			} else if (local15 == 0) {
				local15 = 1;
			} else {
				local15 *= this.anInt2141;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)V")
	private void method2086(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method2085(arg0)];
		Static679.method4131(this.aStringArray9, 0, local9, 0, this.aStringArray9.length);
		this.aStringArray9 = local9;
	}
}
