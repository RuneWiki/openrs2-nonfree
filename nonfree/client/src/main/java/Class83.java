import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dja")
public final class Class83 {

	@OriginalMember(owner = "client!dja", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7 = new String[0];

	@OriginalMember(owner = "client!dja", name = "e", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!dja", name = "m", descriptor = "I")
	private int anInt1642 = -1;

	@OriginalMember(owner = "client!dja", name = "j", descriptor = "I")
	private final int anInt1640;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(IZ)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt1640 = arg0;
		this.aBoolean133 = arg1;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	private void method1528(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 > this.anInt1642) {
			this.anInt1642 = arg0;
		}
		if (this.aStringArray7.length <= arg0) {
			this.method1533(arg0);
		}
		this.aStringArray7[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(II)I")
	private int method1529(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.aStringArray7.length;
		while (arg0 >= local15) {
			if (!this.aBoolean133) {
				local15 += this.anInt1640;
			} else if (local15 == 0) {
				local15 = 1;
			} else {
				local15 *= this.anInt1640;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt1642; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray7[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method1530(@OriginalArg(1) String arg0) {
		this.method1528(this.anInt1642 + 1, arg0);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method1531() {
		@Pc(17) String[] local17 = new String[this.anInt1642 + 1];
		Static693.method8316(this.aStringArray7, 0, local17, 0, this.anInt1642 + 1);
		return local17;
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(II)V")
	private void method1533(@OriginalArg(0) int arg0) {
		@Pc(14) String[] local14 = new String[this.method1529(arg0)];
		Static693.method8316(this.aStringArray7, 0, local14, 0, this.aStringArray7.length);
		this.aStringArray7 = local14;
	}
}
