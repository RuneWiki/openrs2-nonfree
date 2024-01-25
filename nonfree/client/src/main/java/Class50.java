import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class50 {

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
	private int anInt1151 = -1;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7 = new String[0];

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
	private final int anInt1145;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IZ)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean130 = arg1;
		this.anInt1145 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)I")
	private int method995(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = this.aStringArray7.length;
		while (local19 <= arg0) {
			if (!this.aBoolean130) {
				local19 += this.anInt1145;
			} else if (local19 == 0) {
				local19 = 1;
			} else {
				local19 *= this.anInt1145;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method996(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.anInt1151 < arg0) {
			this.anInt1151 = arg0;
		}
		if (this.aStringArray7.length <= arg0) {
			this.method1003(arg0);
		}
		this.aStringArray7[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt1151; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray7[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method1000() {
		@Pc(16) String[] local16 = new String[this.anInt1151 + 1];
		Static728.method269(this.aStringArray7, 0, local16, 0, this.anInt1151 + 1);
		return local16;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method1002(@OriginalArg(0) String arg0) {
		this.method996(this.anInt1151 + 1, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)V")
	private void method1003(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method995(arg0)];
		Static728.method269(this.aStringArray7, 0, local9, 0, this.aStringArray7.length);
		this.aStringArray7 = local9;
	}
}
