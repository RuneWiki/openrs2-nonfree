import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class126 {

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	private int anInt2918 = -1;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17 = new String[0];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	private final int anInt2919;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IZ)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt2919 = arg0;
		this.aBoolean204 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	private void method2637(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method2638(arg0)];
		Static691.method86(this.aStringArray17, 0, local9, 0, this.aStringArray17.length);
		this.aStringArray17 = local9;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)I")
	private int method2638(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.aStringArray17.length;
		while (arg0 >= local9) {
			if (!this.aBoolean204) {
				local9 += this.anInt2919;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt2919;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt2918; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray17[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method2639(@OriginalArg(0) String arg0) {
		this.method2640(arg0, this.anInt2918 + 1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method2640(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 > this.anInt2918) {
			this.anInt2918 = arg1;
		}
		if (arg1 >= this.aStringArray17.length) {
			this.method2637(arg1);
		}
		this.aStringArray17[arg1] = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method2641() {
		@Pc(9) String[] local9 = new String[this.anInt2918 + 1];
		Static691.method86(this.aStringArray17, 0, local9, 0, this.anInt2918 + 1);
		return local9;
	}
}
