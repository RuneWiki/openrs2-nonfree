import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class279 {

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
	private int anInt7937 = -1;

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "Z")
	private boolean aBoolean551 = false;

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray38 = new String[0];

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
	private final int anInt7934;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(IZ)V")
	public Class279(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt7934 = arg0;
		this.aBoolean551 = arg1;
	}

	@OriginalMember(owner = "client!rda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt7937; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray38[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)V")
	private void method6257(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method6258(arg0)];
		Static604.method6223(this.aStringArray38, 0, local9, 0, this.aStringArray38.length);
		this.aStringArray38 = local9;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)I")
	private int method6258(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.aStringArray38.length;
		while (arg0 >= local9) {
			if (!this.aBoolean551) {
				local9 += this.anInt7934;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt7934;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method6259(@OriginalArg(1) String arg0) {
		this.method6262(this.anInt7937 + 1, arg0);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)[Ljava/lang/String;")
	public String[] method6261() {
		@Pc(9) String[] local9 = new String[this.anInt7937 + 1];
		Static604.method6223(this.aStringArray38, 0, local9, 0, this.anInt7937 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	private void method6262(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.anInt7937 < arg0) {
			this.anInt7937 = arg0;
		}
		if (arg0 >= this.aStringArray38.length) {
			this.method6257(arg0);
		}
		this.aStringArray38[arg0] = arg1;
	}
}
