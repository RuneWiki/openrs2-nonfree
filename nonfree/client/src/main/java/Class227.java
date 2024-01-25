import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class227 {

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25 = new String[0];

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
	private int anInt5995 = -1;

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
	private final int anInt5999;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IZ)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean500 = arg1;
		this.anInt5999 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt5995; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray25[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)V")
	private void method5299(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method5301(arg0)];
		Static655.method4106(this.aStringArray25, 0, local9, 0, this.aStringArray25.length);
		this.aStringArray25 = local9;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method5300(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5995 < arg1) {
			this.anInt5995 = arg1;
		}
		if (this.aStringArray25.length <= arg1) {
			this.method5299(arg1);
		}
		this.aStringArray25[arg1] = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(II)I")
	private int method5301(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.aStringArray25.length;
		while (arg0 >= local17) {
			if (!this.aBoolean500) {
				local17 += this.anInt5999;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt5999;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method5302(@OriginalArg(1) String arg0) {
		this.method5300(arg0, this.anInt5995 + 1);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method5304() {
		@Pc(14) String[] local14 = new String[this.anInt5995 + 1];
		Static655.method4106(this.aStringArray25, 0, local14, 0, this.anInt5995 + 1);
		return local14;
	}
}
