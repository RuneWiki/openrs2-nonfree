import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class6_Sub4_Sub15 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "[Lclient!pf;")
	public Class247[] aClass247Array1;

	@OriginalMember(owner = "client!ro", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
	private final int anInt8206;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(I)V")
	public Class6_Sub4_Sub15(@OriginalArg(0) int arg0) {
		this.anInt8206 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z")
	public boolean method6847(@OriginalArg(1) int arg0) {
		return this.aClass247Array1[arg0].aBoolean537;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)Z")
	public boolean method6848(@OriginalArg(1) int arg0) {
		return this.aClass247Array1[arg0].aBoolean538;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)Z")
	public boolean method6850() {
		if (this.aClass247Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray29 == null) {
			if (!Static447.aClass168_102.method4446(this.anInt8206)) {
				return false;
			}
			@Pc(27) int[] local27 = Static447.aClass168_102.method4424(this.anInt8206);
			this.aByteArrayArray29 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray29[local34] = Static447.aClass168_102.method4435(local27[local34], this.anInt8206);
			}
		}
		@Pc(55) boolean local55 = true;
		for (local34 = 0; local34 < this.aByteArrayArray29.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray29[local34];
			@Pc(69) Class6_Sub26 local69 = new Class6_Sub26(local64);
			local69.anInt5769 = 1;
			@Pc(76) int local76 = local69.method4999();
			local55 &= Static493.aClass168_114.method4427(local76);
		}
		if (!local55) {
			return false;
		}
		@Pc(101) Class211 local101 = new Class211();
		@Pc(107) int local107 = Static447.aClass168_102.method4443(this.anInt8206);
		this.aClass247Array1 = new Class247[local107];
		@Pc(117) int[] local117 = Static447.aClass168_102.method4424(this.anInt8206);
		for (@Pc(119) int local119 = 0; local119 < local117.length; local119++) {
			@Pc(126) byte[] local126 = this.aByteArrayArray29[local119];
			@Pc(131) Class6_Sub26 local131 = new Class6_Sub26(local126);
			local131.anInt5769 = 1;
			@Pc(138) int local138 = local131.method4999();
			@Pc(140) Class6_Sub32 local140 = null;
			for (@Pc(145) Class6_Sub32 local145 = (Class6_Sub32) local101.method5183(); local145 != null; local145 = (Class6_Sub32) local101.method5177()) {
				if (local138 == local145.anInt5220) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class6_Sub32(local138, Static493.aClass168_114.method4438(local138));
				local101.method5173(local140);
			}
			this.aClass247Array1[local117[local119]] = new Class247(local126, local140);
		}
		this.aByteArrayArray29 = null;
		return true;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)Z")
	public boolean method6851(@OriginalArg(0) int arg0) {
		return this.aClass247Array1[arg0].aBoolean539;
	}
}
