import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class109 {

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
	private int anInt2885 = -1;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17 = new String[0];

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
	private final int anInt2882;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IZ)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt2882 = arg0;
		this.aBoolean208 = arg1;
	}

	@OriginalMember(owner = "client!fw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt2885; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray17[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method2426(@OriginalArg(0) String arg0) {
		this.method2430(this.anInt2885 + 1, arg0);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)I")
	private int method2427(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.aStringArray17.length;
		while (local15 <= arg0) {
			if (!this.aBoolean208) {
				local15 += this.anInt2882;
			} else if (local15 == 0) {
				local15 = 1;
			} else {
				local15 *= this.anInt2882;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)[Ljava/lang/String;")
	public String[] method2428() {
		@Pc(9) String[] local9 = new String[this.anInt2885 + 1];
		Static600.method3766(this.aStringArray17, 0, local9, 0, this.anInt2885 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method2430(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 > this.anInt2885) {
			this.anInt2885 = arg0;
		}
		if (arg0 >= this.aStringArray17.length) {
			this.method2432(arg0);
		}
		this.aStringArray17[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)V")
	private void method2432(@OriginalArg(1) int arg0) {
		@Pc(15) String[] local15 = new String[this.method2427(arg0)];
		Static600.method3766(this.aStringArray17, 0, local15, 0, this.aStringArray17.length);
		this.aStringArray17 = local15;
	}
}
