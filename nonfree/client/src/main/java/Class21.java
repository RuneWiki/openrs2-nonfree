import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class21 {

	@OriginalMember(owner = "client!av", name = "e", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[0];

	@OriginalMember(owner = "client!av", name = "a", descriptor = "I")
	private int anInt893 = -1;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	private final int anInt895;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IZ)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt895 = arg0;
		this.aBoolean77 = arg1;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
	private void method865(@OriginalArg(0) int arg0) {
		@Pc(17) String[] local17 = new String[this.method870(arg0)];
		Static589.method5380(this.aStringArray4, 0, local17, 0, this.aStringArray4.length);
		this.aStringArray4 = local17;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method866(@OriginalArg(0) String arg0) {
		this.method869(arg0, this.anInt893 + 1);
	}

	@OriginalMember(owner = "client!av", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt893; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray4[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method869(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt893) {
			this.anInt893 = arg1;
		}
		if (arg1 >= this.aStringArray4.length) {
			this.method865(arg1);
		}
		this.aStringArray4[arg1] = arg0;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(II)I")
	private int method870(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.aStringArray4.length;
		while (arg0 >= local9) {
			if (!this.aBoolean77) {
				local9 += this.anInt895;
			} else if (local9 == 0) {
				local9 = 1;
			} else {
				local9 *= this.anInt895;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)[Ljava/lang/String;")
	public String[] method873() {
		@Pc(14) String[] local14 = new String[this.anInt893 + 1];
		Static589.method5380(this.aStringArray4, 0, local14, 0, this.anInt893 + 1);
		return local14;
	}
}
