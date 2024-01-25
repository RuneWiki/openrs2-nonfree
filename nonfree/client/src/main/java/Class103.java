import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class103 {

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray18 = new String[0];

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
	private int anInt3139 = -1;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	private final int anInt3138;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IZ)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt3138 = arg0;
		this.aBoolean255 = arg1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)[Ljava/lang/String;")
	public String[] method2801() {
		@Pc(15) String[] local15 = new String[this.anInt3139 + 1];
		Static604.method5912(this.aStringArray18, 0, local15, 0, this.anInt3139 + 1);
		return local15;
	}

	@OriginalMember(owner = "client!fq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt3139; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray18[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
	private void method2803(@OriginalArg(1) int arg0) {
		@Pc(17) String[] local17 = new String[this.method2804(arg0)];
		Static604.method5912(this.aStringArray18, 0, local17, 0, this.aStringArray18.length);
		this.aStringArray18 = local17;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)I")
	private int method2804(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = this.aStringArray18.length;
		while (local16 <= arg0) {
			if (!this.aBoolean255) {
				local16 += this.anInt3138;
			} else if (local16 == 0) {
				local16 = 1;
			} else {
				local16 *= this.anInt3138;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method2805(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3139 < arg1) {
			this.anInt3139 = arg1;
		}
		if (this.aStringArray18.length <= arg1) {
			this.method2803(arg1);
		}
		this.aStringArray18[arg1] = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public void method2806(@OriginalArg(1) String arg0) {
		this.method2805(arg0, this.anInt3139 + 1);
	}
}
