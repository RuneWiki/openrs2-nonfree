import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class227 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28 = new String[0];

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	private int anInt5513 = -1;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	private final int anInt5511;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IZ)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean414 = arg1;
		this.anInt5511 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
	private void method4843(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method4846(arg0)];
		Static685.method6469(this.aStringArray28, 0, local9, 0, this.aStringArray28.length);
		this.aStringArray28 = local9;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method4844() {
		@Pc(9) String[] local9 = new String[this.anInt5513 + 1];
		Static685.method6469(this.aStringArray28, 0, local9, 0, this.anInt5513 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method4845(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5513 < arg1) {
			this.anInt5513 = arg1;
		}
		if (arg1 >= this.aStringArray28.length) {
			this.method4843(arg1);
		}
		this.aStringArray28[arg1] = arg0;
	}

	@OriginalMember(owner = "client!md", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt5513; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray28[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)I")
	private int method4846(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.aStringArray28.length;
		while (arg0 >= local9) {
			if (!this.aBoolean414) {
				local9 += this.anInt5511;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt5511;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method4848(@OriginalArg(1) String arg0) {
		this.method4845(arg0, this.anInt5513 + 1);
	}
}
