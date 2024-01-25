import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class281 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28 = new String[0];

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
	private int anInt8357 = -1;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "Z")
	private boolean aBoolean667 = false;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	private final int anInt8358;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IZ)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt8358 = arg0;
		this.aBoolean667 = arg1;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
	private int method6998(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.aStringArray28.length;
		while (local17 <= arg0) {
			if (!this.aBoolean667) {
				local17 += this.anInt8358;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt8358;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt8357; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray28[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	private void method6999(@OriginalArg(1) int arg0) {
		@Pc(15) String[] local15 = new String[this.method6998(arg0)];
		Static653.method6535(this.aStringArray28, 0, local15, 0, this.aStringArray28.length);
		this.aStringArray28 = local15;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)[Ljava/lang/String;")
	public String[] method7001() {
		@Pc(9) String[] local9 = new String[this.anInt8357 + 1];
		Static653.method6535(this.aStringArray28, 0, local9, 0, this.anInt8357 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method7002(@OriginalArg(0) String arg0) {
		this.method7003(arg0, this.anInt8357 + 1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method7003(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 > this.anInt8357) {
			this.anInt8357 = arg1;
		}
		if (arg1 >= this.aStringArray28.length) {
			this.method6999(arg1);
		}
		this.aStringArray28[arg1] = arg0;
	}
}
