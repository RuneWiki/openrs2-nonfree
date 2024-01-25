import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class335 {

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Z")
	private boolean aBoolean649 = false;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray39 = new String[0];

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	private int anInt8898 = -1;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	private final int anInt8897;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IZ)V")
	public Class335(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt8897 = arg0;
		this.aBoolean649 = arg1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method7310(@OriginalArg(1) String arg0) {
		this.method7313(arg0, this.anInt8898 + 1);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
	private int method7311(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.aStringArray39.length;
		while (local9 <= arg0) {
			if (!this.aBoolean649) {
				local9 += this.anInt8897;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt8897;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!uj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt8898; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray39[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method7313(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8898 < arg1) {
			this.anInt8898 = arg1;
		}
		if (this.aStringArray39.length <= arg1) {
			this.method7315(arg1);
		}
		this.aStringArray39[arg1] = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method7314() {
		@Pc(14) String[] local14 = new String[this.anInt8898 + 1];
		Static601.method2934(this.aStringArray39, 0, local14, 0, this.anInt8898 + 1);
		return local14;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
	private void method7315(@OriginalArg(0) int arg0) {
		@Pc(13) String[] local13 = new String[this.method7311(arg0)];
		Static601.method2934(this.aStringArray39, 0, local13, 0, this.aStringArray39.length);
		this.aStringArray39 = local13;
	}
}
