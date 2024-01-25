import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class94 {

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40 = new String[0];

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
	private int anInt2368 = -1;

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
	private final int anInt2365;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(IZ)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean205 = arg1;
		this.anInt2365 = arg0;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method1769(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt2368) {
			this.anInt2368 = arg1;
		}
		if (this.aStringArray40.length <= arg1) {
			this.method1772(arg1);
		}
		this.aStringArray40[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)I")
	private int method1770(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.aStringArray40.length;
		while (local9 <= arg0) {
			if (!this.aBoolean205) {
				local9 += this.anInt2365;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt2365;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ega", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt2368; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray40[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IB)V")
	private void method1772(@OriginalArg(0) int arg0) {
		@Pc(13) String[] local13 = new String[this.method1770(arg0)];
		Static598.method1131(this.aStringArray40, 0, local13, 0, this.aStringArray40.length);
		this.aStringArray40 = local13;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method1774(@OriginalArg(0) String arg0) {
		this.method1769(arg0, this.anInt2368 + 1);
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)[Ljava/lang/String;")
	public String[] method1775() {
		@Pc(9) String[] local9 = new String[this.anInt2368 + 1];
		Static598.method1131(this.aStringArray40, 0, local9, 0, this.anInt2368 + 1);
		return local9;
	}
}
