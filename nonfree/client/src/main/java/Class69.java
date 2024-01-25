import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class69 {

	@OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
	private int anInt1976 = -1;

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17 = new String[0];

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
	private final int anInt1964;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IZ)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt1964 = arg0;
		this.aBoolean155 = arg1;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method1651(@OriginalArg(1) String arg0) {
		this.method1652(arg0, this.anInt1976 + 1);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method1652(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1976 < arg1) {
			this.anInt1976 = arg1;
		}
		if (arg1 >= this.aStringArray17.length) {
			this.method1656(arg1);
		}
		this.aStringArray17[arg1] = arg0;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)I")
	private int method1653(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.aStringArray17.length;
		while (arg0 >= local14) {
			if (!this.aBoolean155) {
				local14 += this.anInt1964;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt1964;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method1655() {
		@Pc(15) String[] local15 = new String[this.anInt1976 + 1];
		Static651.method752(this.aStringArray17, 0, local15, 0, this.anInt1976 + 1);
		return local15;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)V")
	private void method1656(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method1653(arg0)];
		Static651.method752(this.aStringArray17, 0, local9, 0, this.aStringArray17.length);
		this.aStringArray17 = local9;
	}

	@OriginalMember(owner = "client!dga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt1976; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray17[local15]);
		}
		local9.append("]");
		return local9.toString();
	}
}
