import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class364 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
	private boolean aBoolean752 = false;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
	private int anInt9627 = -1;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray42 = new String[0];

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	private final int anInt9624;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(IZ)V")
	public Class364(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean752 = arg1;
		this.anInt9624 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	private void method7848(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method7850(arg0)];
		Static598.method1175(this.aStringArray42, 0, local9, 0, this.aStringArray42.length);
		this.aStringArray42 = local9;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)I")
	private int method7850(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.aStringArray42.length;
		while (arg0 >= local14) {
			if (!this.aBoolean752) {
				local14 += this.anInt9624;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt9624;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/String;B)V")
	private void method7851(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.anInt9627 < arg0) {
			this.anInt9627 = arg0;
		}
		if (this.aStringArray42.length <= arg0) {
			this.method7848(arg0);
		}
		this.aStringArray42[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method7853() {
		@Pc(9) String[] local9 = new String[this.anInt9627 + 1];
		Static598.method1175(this.aStringArray42, 0, local9, 0, this.anInt9627 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method7855(@OriginalArg(1) String arg0) {
		this.method7851(this.anInt9627 + 1, arg0);
	}

	@OriginalMember(owner = "client!ws", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt9627; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray42[local15]);
		}
		local9.append("]");
		return local9.toString();
	}
}
