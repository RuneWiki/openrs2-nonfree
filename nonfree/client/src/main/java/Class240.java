import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class240 {

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
	private int anInt6003 = -1;

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "client!naa", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray44 = new String[0];

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
	private final int anInt6009;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(IZ)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt6009 = arg0;
		this.aBoolean435 = arg1;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method5336() {
		@Pc(9) String[] local9 = new String[this.anInt6003 + 1];
		Static652.method4545(this.aStringArray44, 0, local9, 0, this.anInt6003 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method5337(@OriginalArg(1) String arg0) {
		this.method5338(this.anInt6003 + 1, arg0);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method5338(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 > this.anInt6003) {
			this.anInt6003 = arg0;
		}
		if (arg0 >= this.aStringArray44.length) {
			this.method5340(arg0);
		}
		this.aStringArray44[arg0] = arg1;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IZ)V")
	private void method5340(@OriginalArg(0) int arg0) {
		@Pc(13) String[] local13 = new String[this.method5341(arg0)];
		Static652.method4545(this.aStringArray44, 0, local13, 0, this.aStringArray44.length);
		this.aStringArray44 = local13;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)I")
	private int method5341(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aStringArray44.length;
		while (local9 <= arg0) {
			if (!this.aBoolean435) {
				local9 += this.anInt6009;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt6009;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt6003; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray44[local15]);
		}
		local9.append("]");
		return local9.toString();
	}
}
