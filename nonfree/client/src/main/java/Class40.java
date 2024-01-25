import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class40 {

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
	private int anInt1868 = -1;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[0];

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
	private final int anInt1869;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(IZ)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt1869 = arg0;
		this.aBoolean159 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	private int method1760(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.aStringArray9.length;
		while (local17 <= arg0) {
			if (!this.aBoolean159) {
				local17 += this.anInt1869;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt1869;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method1763() {
		@Pc(17) String[] local17 = new String[this.anInt1868 + 1];
		Static653.method7721(this.aStringArray9, 0, local17, 0, this.anInt1868 + 1);
		return local17;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method1764(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1868 < arg1) {
			this.anInt1868 = arg1;
		}
		if (arg1 >= this.aStringArray9.length) {
			this.method1765(arg1);
		}
		this.aStringArray9[arg1] = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	private void method1765(@OriginalArg(0) int arg0) {
		@Pc(17) String[] local17 = new String[this.method1760(arg0)];
		Static653.method7721(this.aStringArray9, 0, local17, 0, this.aStringArray9.length);
		this.aStringArray9 = local17;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method1766(@OriginalArg(1) String arg0) {
		this.method1764(arg0, this.anInt1868 + 1);
	}

	@OriginalMember(owner = "client!bo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt1868; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray9[local15]);
		}
		local9.append("]");
		return local9.toString();
	}
}
