import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[0];

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
	private int anInt32 = -1;

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
	private final int anInt30;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IZ)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean1 = arg1;
		this.anInt30 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I")
	private int method41(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.aStringArray1.length;
		while (arg0 >= local15) {
			if (!this.aBoolean1) {
				local15 += this.anInt30;
			} else if (local15 == 0) {
				local15 = 1;
			} else {
				local15 *= this.anInt30;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method42(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.anInt32 < arg1) {
			this.anInt32 = arg1;
		}
		if (arg1 >= this.aStringArray1.length) {
			this.method47(arg1);
		}
		this.aStringArray1[arg1] = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method43(@OriginalArg(0) String arg0) {
		this.method42(arg0, this.anInt32 + 1);
	}

	@OriginalMember(owner = "client!aba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt32; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray1[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method45() {
		@Pc(17) String[] local17 = new String[this.anInt32 + 1];
		Static689.method8053(this.aStringArray1, 0, local17, 0, this.anInt32 + 1);
		return local17;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V")
	private void method47(@OriginalArg(1) int arg0) {
		@Pc(13) String[] local13 = new String[this.method41(arg0)];
		Static689.method8053(this.aStringArray1, 0, local13, 0, this.aStringArray1.length);
		this.aStringArray1 = local13;
	}
}
