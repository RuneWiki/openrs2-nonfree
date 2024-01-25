import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
	private int anInt9090 = 4096;

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
	private int anInt9089 = 4096;

	@OriginalMember(owner = "client!uv", name = "C", descriptor = "I")
	private int anInt9092 = 409;

	@OriginalMember(owner = "client!uv", name = "I", descriptor = "[I")
	private final int[] anIntArray571 = new int[3];

	@OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
	private int anInt9097 = 4096;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt9092 = arg1.method7945();
		} else if (arg0 == 1) {
			this.anInt9090 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt9097 = arg1.method7945();
		} else if (arg0 == 3) {
			this.anInt9089 = arg1.method7945();
		} else if (arg0 == 4) {
			@Pc(57) int local57 = arg1.method7919();
			this.anIntArray571[1] = local57 >> 4 & 0xFF0;
			this.anIntArray571[0] = (local57 & 0xFF0000) << 4;
			this.anIntArray571[2] = local57 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(27) int[][] local27 = this.method7833(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static501.anInt8748; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray571[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (local67 > this.anInt9092) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(102) int local102 = local35[local53];
					local67 = local102 - this.anIntArray571[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt9092) {
						local43[local53] = local59;
						local47[local53] = local102;
						local51[local53] = local39[local53];
					} else {
						@Pc(146) int local146 = local39[local53];
						local67 = local146 - this.anIntArray571[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt9092 < local67) {
							local43[local53] = local59;
							local47[local53] = local102;
							local51[local53] = local146;
						} else {
							local43[local53] = local59 * this.anInt9089 >> 12;
							local47[local53] = local102 * this.anInt9097 >> 12;
							local51[local53] = this.anInt9090 * local146 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
