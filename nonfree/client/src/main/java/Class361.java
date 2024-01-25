import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class361 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
	private boolean aBoolean762 = false;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36 = new String[0];

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	private int anInt10021 = -1;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	private final int anInt10023;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IZ)V")
	public Class361(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean762 = arg1;
		this.anInt10023 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method8774(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 > this.anInt10021) {
			this.anInt10021 = arg1;
		}
		if (arg1 >= this.aStringArray36.length) {
			this.method8780(arg1);
		}
		this.aStringArray36[arg1] = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)[Ljava/lang/String;")
	public String[] method8776() {
		@Pc(14) String[] local14 = new String[this.anInt10021 + 1];
		Static684.method5327(this.aStringArray36, 0, local14, 0, this.anInt10021 + 1);
		return local14;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method8778(@OriginalArg(0) String arg0) {
		this.method8774(arg0, this.anInt10021 + 1);
	}

	@OriginalMember(owner = "client!vc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt10021; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray36[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
	private int method8779(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.aStringArray36.length;
		while (arg0 >= local9) {
			if (!this.aBoolean762) {
				local9 += this.anInt10023;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt10023;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
	private void method8780(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method8779(arg0)];
		Static684.method5327(this.aStringArray36, 0, local9, 0, this.aStringArray36.length);
		this.aStringArray36 = local9;
	}
}
