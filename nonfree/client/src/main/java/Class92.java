import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class92 {

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	private int anInt2750 = -1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[0];

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	private final int anInt2749;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IZ)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt2749 = arg0;
		this.aBoolean225 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	private void method2393(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method2399(arg0)];
		Static735.method9183(this.aStringArray8, 0, local9, 0, this.aStringArray8.length);
		this.aStringArray8 = local9;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method2395() {
		@Pc(9) String[] local9 = new String[this.anInt2750 + 1];
		Static735.method9183(this.aStringArray8, 0, local9, 0, this.anInt2750 + 1);
		return local9;
	}

	@OriginalMember(owner = "client!ei", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt2750; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray8[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method2398(@OriginalArg(0) String arg0) {
		this.method2400(this.anInt2750 + 1, arg0);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)I")
	private int method2399(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aStringArray8.length;
		while (local9 <= arg0) {
			if (!this.aBoolean225) {
				local9 += this.anInt2749;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt2749;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method2400(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 > this.anInt2750) {
			this.anInt2750 = arg0;
		}
		if (arg0 >= this.aStringArray8.length) {
			this.method2393(arg0);
		}
		this.aStringArray8[arg0] = arg1;
	}
}
