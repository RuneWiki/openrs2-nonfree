import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public final class Class226 {

	@OriginalMember(owner = "client!mia", name = "k", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!mia", name = "l", descriptor = "I")
	private int anInt6188 = -1;

	@OriginalMember(owner = "client!mia", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray37 = new String[0];

	@OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
	private final int anInt6181;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(IZ)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean449 = arg1;
		this.anInt6181 = arg0;
	}

	@OriginalMember(owner = "client!mia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt6188; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray37[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method5327(@OriginalArg(1) String arg0) {
		this.method5328(arg0, this.anInt6188 + 1);
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5328(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt6188) {
			this.anInt6188 = arg1;
		}
		if (arg1 >= this.aStringArray37.length) {
			this.method5332(arg1);
		}
		this.aStringArray37[arg1] = arg0;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(II)I")
	private int method5330(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.aStringArray37.length;
		while (local14 <= arg0) {
			if (!this.aBoolean449) {
				local14 += this.anInt6181;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt6181;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(II)V")
	private void method5332(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method5330(arg0)];
		Static650.method2268(this.aStringArray37, 0, local9, 0, this.aStringArray37.length);
		this.aStringArray37 = local9;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method5333() {
		@Pc(16) String[] local16 = new String[this.anInt6188 + 1];
		Static650.method2268(this.aStringArray37, 0, local16, 0, this.anInt6188 + 1);
		return local16;
	}
}
