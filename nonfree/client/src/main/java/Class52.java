import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class52 {

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
	private int anInt1443 = -1;

	@OriginalMember(owner = "client!cfa", name = "k", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!cfa", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[0];

	@OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
	private final int anInt1453;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(IZ)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean103 = arg1;
		this.anInt1453 = arg0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method1274(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 > this.anInt1443) {
			this.anInt1443 = arg0;
		}
		if (arg0 >= this.aStringArray14.length) {
			this.method1280(arg0);
		}
		this.aStringArray14[arg0] = arg1;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZI)I")
	private int method1275(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = this.aStringArray14.length;
		while (local14 <= arg0) {
			if (!this.aBoolean103) {
				local14 += this.anInt1453;
			} else if (local14 == 0) {
				local14 = 1;
			} else {
				local14 *= this.anInt1453;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method1276() {
		@Pc(9) String[] local9 = new String[this.anInt1443 + 1];
		Static681.method4033(this.aStringArray14, 0, local9, 0, this.anInt1443 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!cfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt1443; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray14[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)V")
	private void method1280(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method1275(arg0)];
		Static681.method4033(this.aStringArray14, 0, local9, 0, this.aStringArray14.length);
		this.aStringArray14 = local9;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method1281(@OriginalArg(1) String arg0) {
		this.method1274(this.anInt1443 + 1, arg0);
	}
}
