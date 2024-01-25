import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class27 {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[0];

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	private int anInt765 = -1;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "I")
	private final int anInt762;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IZ)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt762 = arg0;
		this.aBoolean63 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method604(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt765) {
			this.anInt765 = arg1;
		}
		if (arg1 >= this.aStringArray2.length) {
			this.method605(arg1);
		}
		this.aStringArray2[arg1] = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	private void method605(@OriginalArg(1) int arg0) {
		@Pc(15) String[] local15 = new String[this.method607(arg0)];
		Static653.method5395(this.aStringArray2, 0, local15, 0, this.aStringArray2.length);
		this.aStringArray2 = local15;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
	private int method607(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.aStringArray2.length;
		while (local15 <= arg0) {
			if (!this.aBoolean63) {
				local15 += this.anInt762;
			} else if (local15 == 0) {
				local15 = 1;
			} else {
				local15 *= this.anInt762;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt765; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray2[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method609() {
		@Pc(9) String[] local9 = new String[this.anInt765 + 1];
		Static653.method5395(this.aStringArray2, 0, local9, 0, this.anInt765 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method610(@OriginalArg(1) String arg0) {
		this.method604(arg0, this.anInt765 + 1);
	}
}
