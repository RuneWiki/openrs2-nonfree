import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class343 {

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray61 = new String[0];

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
	private int anInt9584 = -1;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "Z")
	private boolean aBoolean687 = false;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
	private final int anInt9579;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IZ)V")
	public Class343(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean687 = arg1;
		this.anInt9579 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt9584; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray61[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
	private void method8070(@OriginalArg(1) int arg0) {
		@Pc(11) String[] local11 = new String[this.method8075(arg0)];
		Static679.method1568(this.aStringArray61, 0, local11, 0, this.aStringArray61.length);
		this.aStringArray61 = local11;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method8071() {
		@Pc(14) String[] local14 = new String[this.anInt9584 + 1];
		Static679.method1568(this.aStringArray61, 0, local14, 0, this.anInt9584 + 1);
		return local14;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method8072(@OriginalArg(1) String arg0) {
		this.method8073(this.anInt9584 + 1, arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method8073(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 > this.anInt9584) {
			this.anInt9584 = arg0;
		}
		if (this.aStringArray61.length <= arg0) {
			this.method8070(arg0);
		}
		this.aStringArray61[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)I")
	private int method8075(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.aStringArray61.length;
		while (local14 <= arg0) {
			if (!this.aBoolean687) {
				local14 += this.anInt9579;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt9579;
			}
		}
		return local14;
	}
}
