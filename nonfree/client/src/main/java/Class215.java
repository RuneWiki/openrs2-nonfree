import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class215 {

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray38 = new String[0];

	@OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
	private int anInt6326 = -1;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "Z")
	private boolean aBoolean559 = false;

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "I")
	private final int anInt6324;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(IZ)V")
	public Class215(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean559 = arg1;
		this.anInt6324 = arg0;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BI)V")
	private void method5274(@OriginalArg(1) int arg0) {
		@Pc(15) String[] local15 = new String[this.method5277(arg0)];
		Static686.method4966(this.aStringArray38, 0, local15, 0, this.aStringArray38.length);
		this.aStringArray38 = local15;
	}

	@OriginalMember(owner = "client!lia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt6326; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray38[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method5275(@OriginalArg(1) String arg0) {
		this.method5276(this.anInt6326 + 1, arg0);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5276(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.anInt6326 < arg0) {
			this.anInt6326 = arg0;
		}
		if (arg0 >= this.aStringArray38.length) {
			this.method5274(arg0);
		}
		this.aStringArray38[arg0] = arg1;
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(BI)I")
	private int method5277(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.aStringArray38.length;
		while (local17 <= arg0) {
			if (!this.aBoolean559) {
				local17 += this.anInt6324;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt6324;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)[Ljava/lang/String;")
	public String[] method5279() {
		@Pc(14) String[] local14 = new String[this.anInt6326 + 1];
		Static686.method4966(this.aStringArray38, 0, local14, 0, this.anInt6326 + 1);
		return local14;
	}
}
