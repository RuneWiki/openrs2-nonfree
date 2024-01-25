import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class173 {

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray17 = new String[0];

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
	private int anInt4736 = -1;

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
	private final int anInt4735;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IZ)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4735 = arg0;
		this.aBoolean345 = arg1;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method4097() {
		@Pc(16) String[] local16 = new String[this.anInt4736 + 1];
		Static601.method2819(this.aStringArray17, 0, local16, 0, this.anInt4736 + 1);
		return local16;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IB)V")
	private void method4098(@OriginalArg(0) int arg0) {
		@Pc(18) String[] local18 = new String[this.method4103(arg0)];
		Static601.method2819(this.aStringArray17, 0, local18, 0, this.aStringArray17.length);
		this.aStringArray17 = local18;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method4099(@OriginalArg(1) String arg0) {
		this.method4100(arg0, this.anInt4736 + 1);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method4100(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 > this.anInt4736) {
			this.anInt4736 = arg1;
		}
		if (arg1 >= this.aStringArray17.length) {
			this.method4098(arg1);
		}
		this.aStringArray17[arg1] = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)I")
	private int method4103(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.aStringArray17.length;
		while (arg0 >= local15) {
			if (!this.aBoolean345) {
				local15 += this.anInt4735;
			} else if (local15 == 0) {
				local15 = 1;
			} else {
				local15 *= this.anInt4735;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt4736; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray17[local15]);
		}
		local9.append("]");
		return local9.toString();
	}
}
