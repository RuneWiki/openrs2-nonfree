import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class210 {

	@OriginalMember(owner = "client!kka", name = "e", descriptor = "Z")
	private boolean aBoolean410 = false;

	@OriginalMember(owner = "client!kka", name = "n", descriptor = "I")
	private int anInt5481 = -1;

	@OriginalMember(owner = "client!kka", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray23 = new String[0];

	@OriginalMember(owner = "client!kka", name = "m", descriptor = "I")
	private final int anInt5483;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(IZ)V")
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt5483 = arg0;
		this.aBoolean410 = arg1;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(II)V")
	private void method5003(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method5007(arg0)];
		Static695.method5647(this.aStringArray23, 0, local9, 0, this.aStringArray23.length);
		this.aStringArray23 = local9;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method5004() {
		@Pc(9) String[] local9 = new String[this.anInt5481 + 1];
		Static695.method5647(this.aStringArray23, 0, local9, 0, this.anInt5481 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method5005(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt5481) {
			this.anInt5481 = arg1;
		}
		if (this.aStringArray23.length <= arg1) {
			this.method5003(arg1);
		}
		this.aStringArray23[arg1] = arg0;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method5006(@OriginalArg(1) String arg0) {
		this.method5005(arg0, this.anInt5481 + 1);
	}

	@OriginalMember(owner = "client!kka", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt5481; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray23[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "(II)I")
	private int method5007(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = this.aStringArray23.length;
		while (local19 <= arg0) {
			if (!this.aBoolean410) {
				local19 += this.anInt5483;
			} else if (local19 == 0) {
				local19 = 1;
			} else {
				local19 *= this.anInt5483;
			}
		}
		return local19;
	}
}
