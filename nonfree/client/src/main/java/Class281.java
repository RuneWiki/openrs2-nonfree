import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class281 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	private int anInt7380 = -1;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33 = new String[0];

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	private final int anInt7388;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IZ)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean527 = arg1;
		this.anInt7388 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method6120(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7380 < arg1) {
			this.anInt7380 = arg1;
		}
		if (this.aStringArray33.length <= arg1) {
			this.method6121(arg1);
		}
		this.aStringArray33[arg1] = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
	private void method6121(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method6125(arg0)];
		Static602.method1585(this.aStringArray33, 0, local9, 0, this.aStringArray33.length);
		this.aStringArray33 = local9;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method6123() {
		@Pc(14) String[] local14 = new String[this.anInt7380 + 1];
		Static602.method1585(this.aStringArray33, 0, local14, 0, this.anInt7380 + 1);
		return local14;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method6124(@OriginalArg(0) String arg0) {
		this.method6120(arg0, this.anInt7380 + 1);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I")
	private int method6125(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.aStringArray33.length;
		while (arg0 >= local14) {
			if (!this.aBoolean527) {
				local14 += this.anInt7388;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt7388;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt7380; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray33[local15]);
		}
		local9.append("]");
		return local9.toString();
	}
}
