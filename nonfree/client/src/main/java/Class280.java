import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class280 {

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray34 = new String[0];

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	private int anInt8029 = -1;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Z")
	private boolean aBoolean603 = false;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	private final int anInt8024;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IZ)V")
	public Class280(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt8024 = arg0;
		this.aBoolean603 = arg1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I")
	private int method6721(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aStringArray34.length;
		while (arg0 >= local9) {
			if (!this.aBoolean603) {
				local9 += this.anInt8024;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt8024;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method6722() {
		@Pc(15) String[] local15 = new String[this.anInt8029 + 1];
		Static649.method4860(this.aStringArray34, 0, local15, 0, this.anInt8029 + 1);
		return local15;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	private void method6723(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method6721(arg0)];
		Static649.method4860(this.aStringArray34, 0, local9, 0, this.aStringArray34.length);
		this.aStringArray34 = local9;
	}

	@OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt8029; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray34[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method6725(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8029 < arg1) {
			this.anInt8029 = arg1;
		}
		if (arg1 >= this.aStringArray34.length) {
			this.method6723(arg1);
		}
		this.aStringArray34[arg1] = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method6726(@OriginalArg(1) String arg0) {
		this.method6725(arg0, this.anInt8029 + 1);
	}
}
