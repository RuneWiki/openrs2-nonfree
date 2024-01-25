import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class285 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray35 = new String[0];

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
	private int anInt8074 = -1;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	private final int anInt8075;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(IZ)V")
	public Class285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt8075 = arg0;
		this.aBoolean521 = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method6415(@OriginalArg(1) String arg0) {
		this.method6418(this.anInt8074 + 1, arg0);
	}

	@OriginalMember(owner = "client!rv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt8074; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray35[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)[Ljava/lang/String;")
	public String[] method6417() {
		@Pc(9) String[] local9 = new String[this.anInt8074 + 1];
		Static596.method7721(this.aStringArray35, 0, local9, 0, this.anInt8074 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZILjava/lang/String;)V")
	private void method6418(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 > this.anInt8074) {
			this.anInt8074 = arg0;
		}
		if (arg0 >= this.aStringArray35.length) {
			this.method6420(arg0);
		}
		this.aStringArray35[arg0] = arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)I")
	private int method6419(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aStringArray35.length;
		while (local9 <= arg0) {
			if (!this.aBoolean521) {
				local9 += this.anInt8075;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt8075;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V")
	private void method6420(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method6419(arg0)];
		Static596.method7721(this.aStringArray35, 0, local9, 0, this.aStringArray35.length);
		this.aStringArray35 = local9;
	}
}
