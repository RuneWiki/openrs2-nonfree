import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class207 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	private int anInt6533 = -1;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray50 = new String[0];

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	private final int anInt6532;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IZ)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean430 = arg1;
		this.anInt6532 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
	private void method5613(@OriginalArg(0) int arg0) {
		@Pc(9) String[] local9 = new String[this.method5620(arg0)];
		Static655.method5831(this.aStringArray50, 0, local9, 0, this.aStringArray50.length);
		this.aStringArray50 = local9;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method5614(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 > this.anInt6533) {
			this.anInt6533 = arg0;
		}
		if (arg0 >= this.aStringArray50.length) {
			this.method5613(arg0);
		}
		this.aStringArray50[arg0] = arg1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method5615() {
		@Pc(9) String[] local9 = new String[this.anInt6533 + 1];
		Static655.method5831(this.aStringArray50, 0, local9, 0, this.anInt6533 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method5617(@OriginalArg(1) String arg0) {
		this.method5614(this.anInt6533 + 1, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
	private int method5620(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = this.aStringArray50.length;
		while (local18 <= arg0) {
			if (!this.aBoolean430) {
				local18 += this.anInt6532;
			} else if (local18 == 0) {
				local18 = 1;
			} else {
				local18 *= this.anInt6532;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!mi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt6533; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray50[local15]);
		}
		local9.append("]");
		return local9.toString();
	}
}
