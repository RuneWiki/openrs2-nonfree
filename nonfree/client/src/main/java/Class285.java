import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class285 {

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	private int anInt8365 = -1;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Z")
	private boolean aBoolean584 = false;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray31 = new String[0];

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	private final int anInt8374;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IZ)V")
	public Class285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean584 = arg1;
		this.anInt8374 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
	private void method7170(@OriginalArg(0) int arg0) {
		@Pc(14) String[] local14 = new String[this.method7171(arg0)];
		Static653.method6855(this.aStringArray31, 0, local14, 0, this.aStringArray31.length);
		this.aStringArray31 = local14;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	private int method7171(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.aStringArray31.length;
		while (arg0 >= local15) {
			if (!this.aBoolean584) {
				local15 += this.anInt8374;
			} else if (local15 == 0) {
				local15 = 1;
			} else {
				local15 *= this.anInt8374;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)[Ljava/lang/String;")
	public String[] method7174() {
		@Pc(9) String[] local9 = new String[this.anInt8365 + 1];
		Static653.method6855(this.aStringArray31, 0, local9, 0, this.anInt8365 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method7177(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.anInt8365 < arg0) {
			this.anInt8365 = arg0;
		}
		if (this.aStringArray31.length <= arg0) {
			this.method7170(arg0);
		}
		this.aStringArray31[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt8365; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray31[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method7179(@OriginalArg(1) String arg0) {
		this.method7177(this.anInt8365 + 1, arg0);
	}
}
