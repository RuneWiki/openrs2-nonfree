import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class243 {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
	private int anInt6802 = -1;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray25 = new String[0];

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
	private final int anInt6806;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IZ)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt6806 = arg0;
		this.aBoolean490 = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)[Ljava/lang/String;")
	public String[] method5724() {
		@Pc(17) String[] local17 = new String[this.anInt6802 + 1];
		Static685.method8331(this.aStringArray25, 0, local17, 0, this.anInt6802 + 1);
		return local17;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method5725(@OriginalArg(0) String arg0) {
		this.method5731(this.anInt6802 + 1, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
	private void method5726(@OriginalArg(1) int arg0) {
		@Pc(9) String[] local9 = new String[this.method5732(arg0)];
		Static685.method8331(this.aStringArray25, 0, local9, 0, this.aStringArray25.length);
		this.aStringArray25 = local9;
	}

	@OriginalMember(owner = "client!nh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		local9.append("[");
		for (@Pc(15) int local15 = 0; local15 < this.anInt6802; local15++) {
			if (local15 != 0) {
				local9.append(", ");
			}
			local9.append(this.aStringArray25[local15]);
		}
		local9.append("]");
		return local9.toString();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZLjava/lang/String;)V")
	private void method5731(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.anInt6802 < arg0) {
			this.anInt6802 = arg0;
		}
		if (this.aStringArray25.length <= arg0) {
			this.method5726(arg0);
		}
		this.aStringArray25[arg0] = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)I")
	private int method5732(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.aStringArray25.length;
		while (arg0 >= local17) {
			if (!this.aBoolean490) {
				local17 += this.anInt6806;
			} else if (local17 == 0) {
				local17 = 1;
			} else {
				local17 *= this.anInt6806;
			}
		}
		return local17;
	}
}
