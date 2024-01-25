import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class121 {

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21 = new String[0];

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	private int anInt2511 = -1;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
	private final int anInt2515;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IZ)V")
	public Class121(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt2515 = arg0;
		this.aBoolean203 = arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method2198(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt2511) {
			this.anInt2511 = arg1;
		}
		if (arg1 >= this.aStringArray21.length) {
			this.method2200(arg1);
		}
		this.aStringArray21[arg1] = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt2511; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray21[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	private void method2200(@OriginalArg(0) int arg0) {
		@Pc(14) String[] local14 = new String[this.method2204(arg0)];
		Static682.method797(this.aStringArray21, 0, local14, 0, this.aStringArray21.length);
		this.aStringArray21 = local14;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method2201(@OriginalArg(0) String arg0) {
		this.method2198(arg0, this.anInt2511 + 1);
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)[Ljava/lang/String;")
	public String[] method2203() {
		@Pc(16) String[] local16 = new String[this.anInt2511 + 1];
		Static682.method797(this.aStringArray21, 0, local16, 0, this.anInt2511 + 1);
		return local16;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)I")
	private int method2204(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aStringArray21.length;
		while (local9 <= arg0) {
			if (!this.aBoolean203) {
				local9 += this.anInt2515;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt2515;
			}
		}
		return local9;
	}
}
